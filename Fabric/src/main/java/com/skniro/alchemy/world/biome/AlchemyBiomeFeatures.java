package com.skniro.alchemy.world.biome;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.world.feature.AlchemyPlacedFeatures;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;

public class AlchemyBiomeFeatures {
    public static void addMapleGroveFeatures(GenerationSettings.LookupBackedBuilder builder) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, AlchemyPlacedFeatures.Red_Maple_TREE_PLACED);
    }

    public static void registerBiomesFeatures() {
        Alchemy.LOGGER.debug("Registering the ModBiomesFeatures for " + Alchemy.MOD_ID);
    }
}
