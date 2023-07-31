package com.skniro.alchemy.world;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;


public class AlchemyConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>>  Arknite_ORE_KEY = registerKey("arknite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  SALT_ORE_KEY = registerKey("salt_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>>  Deepslate_SALT_ORE_KEY = registerKey("deepslate_salt_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest netherstoneReplaceables = new BlockMatchRuleTest(Blocks.NETHERRACK);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endstoneReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);


        List<OreFeatureConfig.Target> deepslate_arknite_Ores =
                List.of(OreFeatureConfig.createTarget(deepslateReplaceables, AlchemyOreBlocks.Deepslate_arknite_Ore.getDefaultState()));

        List<OreFeatureConfig.Target> salt_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.Salt_Ore.getDefaultState()));

        List<OreFeatureConfig.Target> deepslate_salt_Ores =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, AlchemyOreBlocks.DEEPSLATE_Salt_Ore.getDefaultState()));



        register(context, Arknite_ORE_KEY, Feature.ORE, new OreFeatureConfig(deepslate_arknite_Ores, 2));
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
