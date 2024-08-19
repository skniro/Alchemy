package com.skniro.alchemy;

import com.skniro.alchemy.fluid.AlchemyFluidBlocks;
import com.skniro.alchemy.fluid.AlchemyFluidItems;
import com.skniro.alchemy.fluid.AlchemyFluids;
import com.skniro.alchemy.recipe.AlchemyRecipeType;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;


public class Alchemy implements ModInitializer, TerraBlenderApi {
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
        AlchemyContent.registerFluid();
    }


    @Override
    public void onTerraBlenderInitialized() {
    }


    public static Identifier asResource(String path) {
        return new Identifier(MOD_ID, path);
    }
}
