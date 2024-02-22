package com.skniro.alchemy.block;

import com.skniro.alchemy.Alchemy;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class AlchemyOreBlocks {
    public static final Block Salt_Ore =registerBlock("salt_ore",new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)), Alchemy.Alchemy_Group);
    public static final Block DEEPSLATE_Salt_Ore =registerBlock("deepslate_salt_ore",new OreBlock(AbstractBlock.Settings.copy(Salt_Ore).mapColor(MapColor.DEEPSLATE_GRAY).strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE), UniformIntProvider.create(3, 7)), Alchemy.Alchemy_Group);
    //赤铁矿
    public static final Block Hematite_Ore =registerBlock("hematite_ore",new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)), Alchemy.Alchemy_Group);
    //方舟夜石矿
    public static final Block Deepslate_arknite_Ore =registerBlock("deepslate_arknite_ore",new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)), Alchemy.Alchemy_Group);
    //闪电矿
    public static final Block lightning_Ore =registerBlock("lightning_ore",new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)), Alchemy.Alchemy_Group);
    //赤热矿
    public static final Block Crimson_ore =registerBlock("crimson_ore",new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)), Alchemy.Alchemy_Group);
    //圣石矿
    public static final Block End_Septrin_Ore =registerBlock("end_septrin_ore",new OreBlock(AbstractBlock.Settings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F), UniformIntProvider.create(3, 7)), Alchemy.Alchemy_Group);

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
