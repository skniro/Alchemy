package com.skniro.alchemy.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AlchemyDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        fabricDataGenerator.addProvider(AlchemyModelProvider::new);
        fabricDataGenerator.addProvider(MapleSimplifiedChineseLanguageProvider::new);
        fabricDataGenerator.addProvider(MapleTraditionalChineseLanguageProvider::new);
        fabricDataGenerator.addProvider(MapleEnglishLanguageProvider::new);
        fabricDataGenerator.addProvider(MapleItemTagGeneration::new);
        fabricDataGenerator.addProvider(AlchemyBlockTagGeneration::new);
        fabricDataGenerator.addProvider(AlchemyLootTableGenerator::new);
        fabricDataGenerator.addProvider(MapleRecipeGeneration::new);
    }
}
