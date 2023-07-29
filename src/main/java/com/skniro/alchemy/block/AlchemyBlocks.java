package com.skniro.alchemy.block;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.init.Alchemyblock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlchemyBlocks {
    public static final Block Alchemy_Block =registerBlock("alchemy_block",new Alchemyblock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F)),Alchemy.Alchemy_Group);

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Alchemy.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Alchemy.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Alchemy.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }
}
