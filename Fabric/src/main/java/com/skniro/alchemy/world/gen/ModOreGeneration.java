package com.skniro.alchemy.world.gen;

import com.skniro.alchemy.world.feature.AlchemyPlacedFeatures;
import com.skniro.alchemy.world.feature.ore.AlchemyOrePlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.SALT_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.Arknite_ORE_PLACED);

    }
}