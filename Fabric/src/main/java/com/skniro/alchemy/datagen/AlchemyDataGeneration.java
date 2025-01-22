package com.skniro.alchemy.datagen;

import com.skniro.alchemy.world.biome.AlchemyBiomeKeys;
import com.skniro.alchemy.world.feature.AlchemyConfiguredFeatures;
import com.skniro.alchemy.world.feature.AlchemyPlacedFeatures;
import com.skniro.alchemy.world.feature.ore.AlchemyOreConfiguredFeatures;
import com.skniro.alchemy.world.feature.ore.AlchemyOrePlacedFeatures;
import com.skniro.alchemy.world.feature.tree.AlchemyTreeConfiguredFeatures;
import com.skniro.alchemy.world.feature.tree.AlchemyTreePlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class AlchemyDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(AlchemyModelProvider::new);
        pack.addProvider(AlchemySimplifiedChineseLanguageProvider::new);
        pack.addProvider(AlchemyTraditionalChineseLanguageProvider::new);
        pack.addProvider(AlchemyEnglishLanguageProvider::new);
        pack.addProvider(AlchemyLootTableGenerator::new);
        pack.addProvider(AlchemyWorldGenerator::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AlchemyConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AlchemyPlacedFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AlchemyTreeConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AlchemyTreePlacedFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, AlchemyOreConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, AlchemyOrePlacedFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.BIOME, AlchemyBiomeKeys::bootstrap);
    }
}
