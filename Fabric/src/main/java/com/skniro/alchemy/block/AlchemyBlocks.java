package com.skniro.alchemy.block;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.init.Alchemyblock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class AlchemyBlocks {
    public static final Block Alchemy_Block =registerBlock("alchemy_block",new Alchemyblock(AbstractBlock.Settings.create().requiresTool().strength(3.0F, 3.0F)),Alchemy.Alchemy_Group);

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Alchemy.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, RegistryKey<ItemGroup> tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(Alchemy.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, RegistryKey<ItemGroup> tab) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerAlchemyBlocks() {
        Alchemy.LOGGER.info("Registering Alchemy Blocks for " + Alchemy.MOD_ID);
    }
}
