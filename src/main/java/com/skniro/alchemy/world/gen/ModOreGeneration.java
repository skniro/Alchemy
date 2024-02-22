package com.skniro.alchemy.world.gen;

import com.skniro.alchemy.world.AlchemyPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyPlacedFeatures.SALT_ORE_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyPlacedFeatures.Arknite_ORE_PLACED.getKey().get());

    }
}