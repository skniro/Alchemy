package com.skniro.alchemy.world.Tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class RedMapleSaplingGenerator extends SaplingGenerator {
        @Override
        protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
            return null;
                    //MapleConfiguredFeatures.Red_Maple_TREE;
        }
    }