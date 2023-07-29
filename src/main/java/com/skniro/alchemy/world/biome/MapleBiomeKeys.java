package com.skniro.alchemy.world.biome;

import com.skniro.alchemy.Alchemy;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

import static net.minecraft.util.registry.Registry.BIOME_KEY;

public class MapleBiomeKeys {
    public static final RegistryKey<Biome> CHERRY_GROVE = register("cherry_grove");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(BIOME_KEY, new Identifier(Alchemy.MOD_ID,name));
    }


    public static void registerBiome() {
        Alchemy.LOGGER.debug("Registering the MapleBiomeKeysFeatures for " + Alchemy.MOD_ID);
        registerBuiltinBiome(CHERRY_GROVE, MapleOverworldBiomes.createCherryGrove());
    }

    private static void registerBuiltinBiome(RegistryKey<Biome> key, Biome biome) {
        BuiltinRegistries.add(BuiltinRegistries.BIOME, key, biome);
    }
}
