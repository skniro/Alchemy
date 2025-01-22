package com.skniro.alchemy.compat.rei;

import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.client.gui.screen.ingame.AlchemyBlockScreen;
import com.skniro.alchemy.recipe.AlchemyCraftingRecipe;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;

public class AlchemyREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new AlchemyCraftingCategory());
        registry.addWorkstations(AlchemyCraftingCategory.UID, EntryStacks.of(AlchemyBlocks.Alchemy_Block));
    }
    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(AlchemyCraftingRecipe.class, AlchemyCraftingRecipe.Type.INSTANCE,
                AlchemyCraftingDisplay::new);
    }
    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(75, 30, 20, 30), AlchemyBlockScreen.class,
                AlchemyCraftingCategory.UID);
    }
}