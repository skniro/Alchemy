package com.skniro.alchemy;

import com.skniro.alchemy.util.AlchemyLootTableModifiers;
import com.skniro.alchemy.util.AlchemyStrippableBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.TerraBlenderApi;


public class Alchemy implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "alchemy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final RegistryKey<ItemGroup> Alchemy_Group = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "alchemy_group"));

    @Override
    public void onInitialize() {
        AlchemyContent.registerItem();
        AlchemyContent.registerBlock();
        AlchemyContent.registerPotion();
        AlchemyContent.registerRecipe();
        AlchemyContent.generateWorldGen();
        AlchemyContent.registerItemGroup();
        AlchemyContent.registerType();
        AlchemyContent.registerFluid();
        //AlchemyContent.registerEvent();
        AlchemyContent.registerCommand();
        AlchemyLootTableModifiers.modifyLootTables();
        AlchemyContent.registerEntityAttribute();
        AlchemyContent.registerNetworkServer();
    }


    @Override
    public void onTerraBlenderInitialized() {
        //AlchemyContent.BiomeWorldgen();
    }


    public static Identifier asResource(String path) {
        return new Identifier(MOD_ID, path);
    }
}
