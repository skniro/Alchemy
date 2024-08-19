package com.skniro.alchemy.recipe;

import com.skniro.alchemy.Alchemy;
import net.minecraft.recipe.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public interface AlchemyRecipeType<T extends Recipe<?>> {


    public static void registerRecipeType() {
        Registry.register(Registries.RECIPE_SERIALIZER, new Identifier(Alchemy.MOD_ID, AlchemyCraftingRecipe.Serializer.ID),
                AlchemyCraftingRecipe.Serializer.INSTANCE);
        Registry.register(Registries.RECIPE_TYPE, new Identifier(Alchemy.MOD_ID, AlchemyCraftingRecipe.Type.ID),
                AlchemyCraftingRecipe.Type.INSTANCE);
    }
}

