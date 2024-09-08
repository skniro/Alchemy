package com.skniro.alchemy.world.Tree;

import com.skniro.alchemy.world.feature.AlchemyConfiguredFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class RedMapleSaplingGenerator extends SaplingGenerator {
        @Override
        protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
            return AlchemyConfiguredFeatures.Red_Maple_TREE;
        }
    }