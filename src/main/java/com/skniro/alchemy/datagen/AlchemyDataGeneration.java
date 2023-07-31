package com.skniro.alchemy.datagen;

import com.skniro.alchemy.world.AlchemyConfiguredFeatures;
import com.skniro.alchemy.world.AlchemyPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class AlchemyDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(AlchemyModelProvider::new);
        pack.addProvider(MapleSimplifiedChineseLanguageProvider::new);
        pack.addProvider(MapleTraditionalChineseLanguageProvider::new);
        pack.addProvider(MapleEnglishLanguageProvider::new);
        pack.addProvider(AlchemyLootTableGenerator::new);
        pack.addProvider(AlchemyWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AlchemyConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AlchemyPlacedFeatures::bootstrap);
    }
}
