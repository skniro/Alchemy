package com.skniro.alchemy.world;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;



public class AlchemyPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> Arknite_ORE_PLACED;
    public static final RegistryEntry<PlacedFeature> SALT_ORE_PLACED;
    static{
        SALT_ORE_PLACED = PlacedFeatures.register("ore_salt_overworld",
                AlchemyConfiguredFeatures.SALT_ORE, modifiersWithCount(5,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(30))));
        Arknite_ORE_PLACED = PlacedFeatures.register("ore_arknite_overworld",
                AlchemyConfiguredFeatures.Arknite_ORE, modifiersWithCount(3,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(0))));

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
