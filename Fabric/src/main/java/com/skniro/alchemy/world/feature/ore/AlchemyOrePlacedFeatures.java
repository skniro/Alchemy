package com.skniro.alchemy.world.feature.ore;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.block.AlchemyPalmaBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;



public class AlchemyOrePlacedFeatures {
    public static final RegistryKey<PlacedFeature> Arknite_ORE_PLACED = registerKey("ore_arknite_overworld");
    public static final RegistryKey<PlacedFeature> Hematite_ORE_PLACED = registerKey("ore_hematite_overworld");
    public static final RegistryKey<PlacedFeature> lightning_ORE_PLACED = registerKey("ore_lightning_overworld");
    public static final RegistryKey<PlacedFeature> Crimson_ORE_PLACED = registerKey("ore_crimson_overworld");
    public static final RegistryKey<PlacedFeature> End_Septrin_ORE_PLACED = registerKey("ore_septrin_end");
    public static final RegistryKey<PlacedFeature> Azurite_ORE_PLACED = registerKey("ore_azurite_overworld");
    public static final RegistryKey<PlacedFeature> Paint_Nightstone_PLACED = registerKey("ore_paint_nightstone_overworld");
    public static final RegistryKey<PlacedFeature> MOLDY_nightstone_PLACED = registerKey("ore_moldy_nightstone_overworld");
    public static final RegistryKey<PlacedFeature> GORDY_nightstone_PLACED = registerKey("ore_gordy_nightstone_overworld");
    public static final RegistryKey<PlacedFeature> CREATION_REVERSE_PLACED = registerKey("ore_creation_reverse_overworld");
    public static final RegistryKey<PlacedFeature> SALT_ORE_PLACED = registerKey("ore_salt_overworld");
    public static final RegistryKey<PlacedFeature> Deepslate_SALT_ORE_PLACED = registerKey("deepslate_ore_salt_overworld");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


        register(context, Arknite_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.Arknite_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, Hematite_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.Hematite_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, lightning_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.lightning_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, Crimson_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.Crimson_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, Azurite_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.AZURITE_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, End_Septrin_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.End_Septrin_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, Paint_Nightstone_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.PAINT_NIGHTSTONE_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, MOLDY_nightstone_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.MOLDY_NIGHTSTONE_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, GORDY_nightstone_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.GORDY_NIGHTSTONE_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, CREATION_REVERSE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.CREATION_REVERSE_ORE_KEY),
                modifiersWithCount(7, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(-80))));

        register(context, SALT_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.SALT_ORE_KEY),
                modifiersWithCount(5, // Veins per Chunk
                        HeightRangePlacementModifier.uniform(YOffset.fixed(30), YOffset.fixed(0))));

        register(context, Deepslate_SALT_ORE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyOreConfiguredFeatures.Deepslate_SALT_ORE_KEY),
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
