package com.skniro.alchemy.world.feature.ore;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.block.AlchemyPalmaBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

import java.util.List;


public class AlchemyOreConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>>  Arknite_ORE_KEY = registerKey("arknite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  Hematite_ORE_KEY = registerKey("hematite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  lightning_ORE_KEY = registerKey("lightning_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  Crimson_ORE_KEY = registerKey("crimson_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  End_Septrin_ORE_KEY = registerKey("end_septrin_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  AZURITE_ORE_KEY = registerKey("azurite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  PAINT_NIGHTSTONE_ORE_KEY = registerKey("paint_nightstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  MOLDY_NIGHTSTONE_ORE_KEY = registerKey("moldy_nightstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  GORDY_NIGHTSTONE_ORE_KEY = registerKey("gordy_nightstone_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  CREATION_REVERSE_ORE_KEY = registerKey("creation_reverse_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  SALT_ORE_KEY = registerKey("salt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  Deepslate_SALT_ORE_KEY = registerKey("deepslate_salt_ore");

    private static TreeFeatureConfig.Builder builder(Block log, Block leaves, int baseHeight, int firstRandomHeight, int secondRandomHeight, int radius) {
        return new TreeFeatureConfig.Builder(BlockStateProvider.of(log), new StraightTrunkPlacer(baseHeight, firstRandomHeight, secondRandomHeight), BlockStateProvider.of(leaves), new BlobFoliagePlacer(ConstantIntProvider.create(radius), ConstantIntProvider.create(0), 3), new TwoLayersFeatureSize(1, 0, 1));
    }


    static DataPool.Builder<BlockState> pool() {
        return DataPool.builder();
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest netherstoneReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endstoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);


        List<OreFeatureConfig.Target> deepslate_arknite_Ores =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, AlchemyOreBlocks.Deepslate_arknite_Ore.getDefaultState()));

        List<OreFeatureConfig.Target> hematite_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.Hematite_Ore.getDefaultState()));

        List<OreFeatureConfig.Target> lightning_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.lightning_Ore.getDefaultState()));

        List<OreFeatureConfig.Target> Crimson_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.Crimson_ore.getDefaultState()));

        List<OreFeatureConfig.Target> end_septrin_Ores =
                List.of(OreFeatureConfig.createTarget(endstoneReplaceables, AlchemyOreBlocks.End_Septrin_Ore.getDefaultState()));

        List<OreFeatureConfig.Target> azurite_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.AZURITE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> paint_nightstone_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.PAINT_NIGHTSTONE.getDefaultState()));

        List<OreFeatureConfig.Target> moldy_nightstone_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.MOLDY_NIGHTSTONE.getDefaultState()));

        List<OreFeatureConfig.Target> gordy_nightstone_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.GORDY_NIGHTSTONE.getDefaultState()));

        List<OreFeatureConfig.Target> creation_reverse_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.CREATION_REVERSE_Ore.getDefaultState()));

        List<OreFeatureConfig.Target> salt_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.Salt_Ore.getDefaultState()));

        List<OreFeatureConfig.Target> deepslate_salt_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.DEEPSLATE_Salt_Ore.getDefaultState()));

        register(context, Arknite_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslate_arknite_Ores, 2));
        register(context, Hematite_ORE_KEY, Feature.ORE, new OreFeatureConfig(hematite_Ores, 2));
        register(context, lightning_ORE_KEY, Feature.ORE, new OreFeatureConfig(lightning_Ores, 2));
        register(context, Crimson_ORE_KEY, Feature.ORE, new OreFeatureConfig(Crimson_Ores, 2));
        register(context, End_Septrin_ORE_KEY, Feature.ORE, new OreFeatureConfig(end_septrin_Ores, 2));
        register(context, AZURITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(azurite_Ores, 2));
        register(context, PAINT_NIGHTSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(paint_nightstone_Ores, 2));
        register(context, MOLDY_NIGHTSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(moldy_nightstone_Ores, 2));
        register(context, GORDY_NIGHTSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(gordy_nightstone_Ores, 2));
        register(context, CREATION_REVERSE_ORE_KEY, Feature.ORE, new OreFeatureConfig(creation_reverse_Ores, 2));
        register(context, SALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(salt_Ores, 1));
        register(context, Deepslate_SALT_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslate_salt_Ores, 2));
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(Alchemy.MOD_ID, name));
    }
    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
