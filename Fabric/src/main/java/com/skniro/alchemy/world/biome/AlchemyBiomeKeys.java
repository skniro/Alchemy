package com.skniro.alchemy.world.biome;

import com.skniro.alchemy.Alchemy;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.PlacedFeature;


public class AlchemyBiomeKeys {
    public static final RegistryKey<Biome> Maple_Grove = register("maple_grove");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(RegistryKeys.BIOME, new Identifier(Alchemy.MOD_ID,name));
    }


   public static void bootstrap(Registerable<Biome> biomeRegisterable) {
        RegistryEntryLookup<PlacedFeature> registryEntryLookup = biomeRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        RegistryEntryLookup<ConfiguredCarver<?>> registryEntryLookup2 = biomeRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER);
        biomeRegisterable.register(Maple_Grove, AlchemyOverworldBiomes.createMapleGrove(registryEntryLookup,registryEntryLookup2));
    }

    public static void registerAlchemyBiome() {
        Alchemy.LOGGER.debug("Registering the MapleBiomeKeysFeatures for " + Alchemy.MOD_ID);
    }
}
