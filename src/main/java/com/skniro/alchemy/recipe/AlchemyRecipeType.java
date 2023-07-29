package com.skniro.alchemy.recipe;

import com.skniro.alchemy.Alchemy;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public interface AlchemyRecipeType<T extends Recipe<?>> {


    public static void registerRecipeType() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Alchemy.MOD_ID, AlchemyCraftingRecipe.Serializer.ID),
                AlchemyCraftingRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Alchemy.MOD_ID, AlchemyCraftingRecipe.Type.ID),
                AlchemyCraftingRecipe.Type.INSTANCE);
    }
}

