package com.skniro.alchemy.block;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.entity.AlchemySignTypes;
import com.skniro.alchemy.block.init.AlchemyBlockSetType;
import com.skniro.alchemy.block.init.AlchemyCarpetBlock;
import com.skniro.alchemy.block.init.LeafCropBlock;
import com.skniro.alchemy.item.AlchemyFoodComponents;
import com.skniro.alchemy.item.AlchemyItems;
import com.skniro.alchemy.world.Tree.PalmaSaplingGenerator;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.CHERRY_PLANKS;

public class AlchemyPalmaBlocks {
    public static final Block PALMA_LOG = registerBlock("palma_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block STRIPPED_PALMA_LOG = registerBlock("stripped_palma_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block STRIPPED_PALMA_WOOD = registerBlock("stripped_palma_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block PALMA_WOOD = registerBlock("palma_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block PALMA_SAPLING = registerBlock("red_palma_sapling",new SaplingBlock(new PalmaSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Alchemy.Alchemy_Group);
    public static final Block PALMA_LEAVES = registerBlock("red_palma_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.RED)), Alchemy.Alchemy_Group);
    public static final Block PALMA_FRUIT_LEAVES = registerBlock("palma_fruit_leaves",
            new LeafCropBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.RED), AlchemyFoodComponents.PALMA_FRUIT), Alchemy.Alchemy_Group);
    public static final Block PALMA_PLANKS = registerBlock("palma_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block POTTED_RED_PALMA_SAPLING = registerBlockWithoutItem("potted_red_palma_sapling",
            new FlowerPotBlock(PALMA_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final Block PALMA_BUTTON = registerBlock("palma_button",
            Blocks.createWoodenButtonBlock(AlchemyBlockSetType.PALMA), Alchemy.Alchemy_Group);
    public static final Block PALMA_STAIRS = registerBlock("palma_stairs",
            new StairsBlock(CHERRY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(CHERRY_PLANKS)), Alchemy.Alchemy_Group);
    public static final Block PALMA_SLAB = registerBlock("palma_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Alchemy.Alchemy_Group);
    public static final Block PALMA_FENCE_GATE = registerBlock("palma_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.create().mapColor(PALMA_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F), AlchemySignTypes.PALMA), Alchemy.Alchemy_Group);
    public static final Block PALMA_FENCE = registerBlock("palma_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(PALMA_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Alchemy.Alchemy_Group);
    public static final Block PALMA_DOOR = registerBlockWithoutItem("palma_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(PALMA_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque(),BlockSetType.CHERRY));
    public static final Block PALMA_TRAPDOOR = registerBlock("palma_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(3.0F).nonOpaque(), AlchemyBlockSetType.PALMA), Alchemy.Alchemy_Group);
    public static final Block PALMA_PRESSURE_PLATE = registerBlock("palma_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create().mapColor(PALMA_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F), AlchemyBlockSetType.PALMA), Alchemy.Alchemy_Group);
    public static final Block RED_PALMA_CARPET = registerBlock("red_palma_carpet",new AlchemyCarpetBlock(AbstractBlock.Settings.copy(Blocks.PINK_PETALS).mapColor(MapColor.RED)),Alchemy.Alchemy_Group);

    public static final BlockFamily PALMA_FAMILY = BlockFamilies.register(AlchemyPalmaBlocks.PALMA_PLANKS)
            .button(PALMA_BUTTON)
            .fence(PALMA_FENCE)
            .fenceGate(PALMA_FENCE_GATE)
            .door(PALMA_DOOR)
            .trapdoor(PALMA_TRAPDOOR)
            .slab(PALMA_SLAB)
            .stairs(PALMA_STAIRS)
            .pressurePlate(PALMA_PRESSURE_PLATE)
            .group("wooden").unlockCriterionName("has_planks").build();

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

    public static void registerAlchemyPalmaTreeBlocks() {
        Alchemy.LOGGER.info("Registering Alchemy Palma Tree Blocks for " + Alchemy.MOD_ID);
    }
}
