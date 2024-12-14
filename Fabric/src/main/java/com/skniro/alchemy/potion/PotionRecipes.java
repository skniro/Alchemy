package com.skniro.alchemy.potion;

import com.skniro.alchemy.item.AlchemyFoodComponents;
import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.BrewingRecipeRegistry;
import net.minecraft.registry.Registries;

public class PotionRecipes {
    public static void registerPotionRecipes() {
        BrewingRecipeRegistry.registerPotionRecipe(Potions.WATER, AlchemyFoodComponents.KARMINE_FRUIT, AlchemyPotions.KARMINE_VENOM);
    }
}
