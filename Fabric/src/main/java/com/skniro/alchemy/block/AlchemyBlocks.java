package com.skniro.alchemy.block;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.init.AlchemyBerryBushBlock;
import com.skniro.alchemy.block.init.Alchemyblock;
import com.skniro.alchemy.item.AlchemyFoodComponents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class AlchemyBlocks {
    public static final Block Alchemy_Block =registerBlock("alchemy_block",new Alchemyblock(AbstractBlock.Settings.create().requiresTool().strength(3.0F, 3.0F)),Alchemy.Alchemy_Group);

    //berry
    public static final Block BERRY_BUSH = registerBlock("berry_bush", new AlchemyBerryBushBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().nonOpaque().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)), Alchemy.Alchemy_Group);

    //SlimeBlock
    public static final Block BLUE_SLIME_BLOCK = registerBlock("blue_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()), Alchemy.Alchemy_Group);
    public static final Block PINK_SLIME_BLOCK = registerBlock("pink_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()), Alchemy.Alchemy_Group);
    public static final Block RED_SLIME_BLOCK = registerBlock("red_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()), Alchemy.Alchemy_Group);
    public static final Block BLACK_SLIME_BLOCK = registerBlock("block_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()), Alchemy.Alchemy_Group);
    public static final Block Sliver_SLIME_BLOCK = registerBlock("sliver_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()), Alchemy.Alchemy_Group);
    public static final Block GOLD_SLIME_BLOCK = registerBlock("gold_slime_block", new SlimeBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_GREEN).slipperiness(0.8F).sounds(BlockSoundGroup.SLIME).nonOpaque()), Alchemy.Alchemy_Group);
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
