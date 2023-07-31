package com.skniro.alchemy;

import com.skniro.alchemy.fluid.ModFluids;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Alchemy implements ModInitializer {
    public static final String MOD_ID = "alchemy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final RegistryKey<ItemGroup> Alchemy_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "alchemy_group"));

    @Override
    public void onInitialize() {
        AlchemyContent.registerItem();
        AlchemyContent.registerBlock();
        AlchemyContent.generateWorldGen();
        AlchemyContent.registerItemGroup();
        AlchemyContent.registerType();
        ModFluids.registerFluids();

    }


    public static Identifier asResource(String path) {
        return new Identifier(MOD_ID, path);
    }
}
