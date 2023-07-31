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



public class AlchemyPlacedFeatures {
    public static final RegistryKey<PlacedFeature> Arknite_ORE_PLACED = registerKey("ore_arknite_overworld");
    public static final RegistryKey<PlacedFeature> SALT_ORE_PLACED = registerKey("ore_salt_overworld");
    public static final RegistryKey<PlacedFeature> Deepslate_SALT_ORE_PLACED = registerKey("deepslate_ore_salt_overworld");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


        register(context, Arknite_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyConfiguredFeatures.Arknite_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, SALT_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyConfiguredFeatures.SALT_ORE_KEY),
                modifiersWithCount(5, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(30), YOffset.fixed(0))));

        register(context, Deepslate_SALT_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyConfiguredFeatures.Deepslate_SALT_ORE_KEY),
                modifiersWithCount(5, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));


    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Alchemy.MOD_ID, name));
    }
    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }
    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }


}
