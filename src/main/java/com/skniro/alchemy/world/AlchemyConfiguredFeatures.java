package com.skniro.alchemy.world;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import net.minecraft.block.Block;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;


public class AlchemyConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_SALT_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, AlchemyOreBlocks.Salt_Ore.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, AlchemyOreBlocks.DEEPSLATE_Salt_Ore.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> SALT_ORE;
    public static final List<OreFeatureConfig.Target> OVERWORLD_Arknite_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, AlchemyOreBlocks.Deepslate_arknite_Ore.getDefaultState()));
    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> Arknite_ORE;


    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }

    static{
        SALT_ORE = ConfiguredFeatures.register("salt_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_SALT_ORES, 9));
        Arknite_ORE = ConfiguredFeatures.register("arknite_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_Arknite_ORES, 3));

    }

    public static void registerConfiguredFeatures() {
        Alchemy.LOGGER.debug("Registering the ModConfiguredFeatures for " + Alchemy.MOD_ID);
    }

}
