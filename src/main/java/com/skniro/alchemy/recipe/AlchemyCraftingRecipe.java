package com.skniro.alchemy.recipe;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.*;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.world.World;

public class AlchemyCraftingRecipe implements Recipe<SimpleInventory> {
    private final Identifier id;
    private final ItemStack output;
    private final DefaultedList<Ingredient> recipeItems;


    public AlchemyCraftingRecipe(Identifier id, ItemStack output, DefaultedList<Ingredient> recipeItems) {
        this.id = id;
        this.output = output;
        this.recipeItems = recipeItems;
    }


    @Override
    public boolean matches(SimpleInventory inventory, World world) {
        if(recipeItems.get(0).test(inventory.getStack(0))) {
            return recipeItems.get(1).test(inventory.getStack(1)) && recipeItems.get(2).test(inventory.getStack(2));
        }
        return false;
    }

    @Override
    public ItemStack craft(SimpleInventory inventory, DynamicRegistryManager registryManager) {
        return output;
    }

    @Override
    public boolean fits(int width, int height) {
        return true;
    }


    @Override
    public ItemStack getOutput(DynamicRegistryManager registryManager) {
        return output.copy();
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<AlchemyCraftingRecipe> {
        private Type() {
        }

        public static final Type INSTANCE = new Type();
        public static final String ID = "crafting_alchemy";
    }

    public static class Serializer implements RecipeSerializer<AlchemyCraftingRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "crafting_alchemy";


        @Override
        public AlchemyCraftingRecipe read(Identifier id, JsonObject json) {
            ItemStack output = ShapedRecipe.outputFromJson(JsonHelper.getObject(json, "output"));

            JsonArray red_ingredients = JsonHelper.getArray(json, "red");
            JsonArray blue_ingredients = JsonHelper.getArray(json, "blue");
            JsonArray green_ingredients = JsonHelper.getArray(json, "green");
            JsonArray yellow_ingredients = JsonHelper.getArray(json, "yellow");
            JsonArray purple_ingredients = JsonHelper.getArray(json, "purple");
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(5, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                try {
                    switch (i) {
                        case 0 -> {
                            if (red_ingredients.size() > i) {
                                inputs.set(i, Ingredient.fromJson(red_ingredients.get(i)));
                            }
                        }
                        case 1 -> {
                            if (blue_ingredients.size() > i) {
                                inputs.set(i, Ingredient.fromJson(blue_ingredients.get(i)));
                            }
                        }
                        case 2 -> {
                            if (green_ingredients.size() > i) {
                                inputs.set(i, Ingredient.fromJson(green_ingredients.get(i)));
                            }
                        }
                        case 3 -> {
                            if (yellow_ingredients.size() > i) {
                                inputs.set(i, Ingredient.fromJson(yellow_ingredients.get(i)));
                            }
                        }
                        case 4 -> {
                            if (purple_ingredients.size() > i) {
                                inputs.set(i, Ingredient.fromJson(purple_ingredients.get(i)));
                            }
                        }
                    }
                } catch (Exception e) {
                    throw new JsonSyntaxException("Error parsing ingredient at index " + i + ": " + e.getMessage(), e);
                }
            }
            System.out.println("Reading recipe: " + id);
            System.out.println("Inputs: " + inputs);
            System.out.println("Output: " + output);
            return new AlchemyCraftingRecipe(id, output, inputs);
        }

        @Override
        public AlchemyCraftingRecipe read(Identifier id, PacketByteBuf buf) {
            DefaultedList<Ingredient> inputs = DefaultedList.ofSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromPacket(buf));
            }

            ItemStack output = buf.readItemStack();
            return new AlchemyCraftingRecipe(id, output, inputs);
        }

        @Override
        public void write(PacketByteBuf buf, AlchemyCraftingRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());
            for (Ingredient ing : recipe.getIngredients()) {
                ing.write(buf);
            }
            buf.writeItemStack(recipe.getOutput(null));
        }
    }
}




