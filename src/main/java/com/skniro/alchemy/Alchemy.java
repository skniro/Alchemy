package com.skniro.alchemy;

import com.skniro.alchemy.fluid.ModFluids;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import terrablender.api.TerraBlenderApi;


public class Alchemy implements ModInitializer, TerraBlenderApi {
    public static final String MOD_ID = "alchemy";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final ItemGroup Alchemy_Group = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "alchemy_group"),() -> new ItemStack(Items.STONE));

    public static final ItemGroup Alchemy_Group_Food = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "alchemy_group_food"),() -> new ItemStack(Items.STONE));
    @Override
    public void onInitialize() {
        AlchemyContent.registerItem();
        AlchemyContent.registerBlock();
        AlchemyContent.CreativeTab();
        AlchemyContent.generateWorldGen();
        AlchemyContent.registerMapleConfigured();
        AlchemyContent.registerType();
        ModFluids.registerFluids();

    }

    public void onTerraBlenderInitialized() {
    }

    public static Identifier asResource(String path) {
        return new Identifier(MOD_ID, path);
    }
}
