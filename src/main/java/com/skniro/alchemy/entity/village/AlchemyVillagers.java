package com.skniro.alchemy.entity.village;

import com.google.common.collect.Maps;
import com.skniro.alchemy.Alchemy;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerTypeHelper;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.village.VillagerType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;

import java.util.Map;

public class AlchemyVillagers {

    public static final VillagerType Cherry = registerProfession("cherry");

    private static VillagerType registerProfession(String name) {
        return Registry.register(Registries.VILLAGER_TYPE, new Identifier(Alchemy.MOD_ID, name),
                new VillagerType(name));
    }
    public static void registerVillagerType() {
        VillagerTypeHelper.addVillagerTypeToBiome(BiomeKeys.CHERRY_GROVE, Cherry);
        Alchemy.LOGGER.info("Registering Villagers " + Alchemy.MOD_ID);
    }
}