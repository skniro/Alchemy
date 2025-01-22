package com.skniro.alchemy.util;

import com.skniro.alchemy.api.registry.AlchemyStrippableDropRegistry;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.block.AlchemyPalmaBlocks;
import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.item.ItemStack;

public class AlchemyStrippableBlocks {
    public static void registerStrippables() {
        AlchemyStrippableDropRegistry.register(AlchemyMapleBlocks.MAPLE_LOG, AlchemyMapleBlocks.STRIPPED_MAPLE_LOG, new ItemStack(AlchemyItems.MAPLE_BARK, 2));
        AlchemyStrippableDropRegistry.register(AlchemyMapleBlocks.MAPLE_WOOD, AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD, new ItemStack(AlchemyItems.MAPLE_BARK, 2));
        AlchemyStrippableDropRegistry.register(AlchemyPalmaBlocks.PALMA_LOG, AlchemyMapleBlocks.STRIPPED_MAPLE_LOG, new ItemStack(AlchemyItems.PALM_BARK, 2));
        AlchemyStrippableDropRegistry.register(AlchemyPalmaBlocks.PALMA_WOOD, AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD, new ItemStack(AlchemyItems.PALM_BARK, 2));
    }
}
