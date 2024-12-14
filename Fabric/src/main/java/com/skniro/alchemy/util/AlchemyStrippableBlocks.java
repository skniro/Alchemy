package com.skniro.alchemy.util;

import com.skniro.alchemy.block.AlchemyMapleBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class AlchemyStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(AlchemyMapleBlocks.MAPLE_LOG, AlchemyMapleBlocks.STRIPPED_MAPLE_LOG);
        StrippableBlockRegistry.register(AlchemyMapleBlocks.MAPLE_WOOD, AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD);
    }
}
