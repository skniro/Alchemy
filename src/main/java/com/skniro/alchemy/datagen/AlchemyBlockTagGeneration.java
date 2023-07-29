package com.skniro.alchemy.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AlchemyBlockTagGeneration extends FabricTagProvider<Block> {
    public AlchemyBlockTagGeneration(FabricDataGenerator dataGenerator) {
        super(dataGenerator, Registry.BLOCK);
    }

    public class ModBlockTags {
        public static final TagKey<Block> C_SAPLING = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "saplings"));
        public static final TagKey<Block> C_MAPLE_LOGS = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "maple_logs"));
        public static final TagKey<Block> C_CHERRY_LOGS = TagKey.of(Registry.BLOCK_KEY, new Identifier("c", "cherry_logs"));

    }

    @Override
    protected void generateTags() {

    }
}
