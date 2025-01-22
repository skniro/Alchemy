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
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.End_Septrin_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.Hematite_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.lightning_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.Crimson_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.Azurite_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.Paint_Nightstone_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.MOLDY_nightstone_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.GORDY_nightstone_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_ORES, AlchemyOrePlacedFeatures.CREATION_REVERSE_PLACED);

    }
}