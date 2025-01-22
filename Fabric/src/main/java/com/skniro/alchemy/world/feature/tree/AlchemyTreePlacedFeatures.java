package com.skniro.alchemy.world.feature.tree;

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



public class AlchemyTreePlacedFeatures {
    public static final RegistryKey<PlacedFeature> Red_Maple_TREE_PLACED = registerKey("red_maple_tree_placed");
    public static final RegistryKey<PlacedFeature> Palma_TREE_PLACED = registerKey("palma_tree_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(context, Red_Maple_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyTreeConfiguredFeatures.Red_Maple_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(3, 0.1f, 1), AlchemyMapleBlocks.RED_MAPLE_SAPLING));

        register(context, Palma_TREE_PLACED, configuredFeatureRegistryEntryLookup.getOrThrow(AlchemyTreeConfiguredFeatures.Palma_TREE),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(3, 0.1f, 1), AlchemyPalmaBlocks.PALMA_SAPLING));

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
