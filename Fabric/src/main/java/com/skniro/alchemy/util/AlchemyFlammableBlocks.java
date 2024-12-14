package com.skniro.alchemy.util;

import com.skniro.alchemy.block.AlchemyMapleBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class AlchemyFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(AlchemyMapleBlocks.MAPLE_LOG, 5, 5);
        registry.add(AlchemyMapleBlocks.MAPLE_WOOD, 5, 5);
        registry.add(AlchemyMapleBlocks.STRIPPED_MAPLE_LOG, 5, 5);
        registry.add(AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD, 5, 5);

        registry.add(AlchemyMapleBlocks.MAPLE_PLANKS, 5, 20);
        registry.add(AlchemyMapleBlocks.RED_MAPLE_LEAVES, 30, 60);

    }
}
