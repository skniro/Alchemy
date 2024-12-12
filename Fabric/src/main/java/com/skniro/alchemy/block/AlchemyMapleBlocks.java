package com.skniro.alchemy.block;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.entity.AlchemySignTypes;
import com.skniro.alchemy.block.init.AlchemyCarpetBlock;
import com.skniro.alchemy.block.init.AlchemyBlockSetType;
import com.skniro.alchemy.world.Tree.RedMapleSaplingGenerator;
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

public class AlchemyMapleBlocks {
    public static final Block MAPLE_LOG = registerBlock("maple_log",new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block RED_MAPLE_SAPLING = registerBlock("red_maple_sapling",new SaplingBlock(new RedMapleSaplingGenerator(),FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)), Alchemy.Alchemy_Group);
    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.RED)), Alchemy.Alchemy_Group);
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).mapColor(MapColor.BROWN)), Alchemy.Alchemy_Group);
    public static final Block POTTED_RED_MAPLE_SAPLING = registerBlockWithoutItem("potted_red_maple_sapling",
            new FlowerPotBlock(RED_MAPLE_SAPLING, AbstractBlock.Settings.create().breakInstantly().nonOpaque()));
    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            Blocks.createWoodenButtonBlock(AlchemyBlockSetType.MAPLE), Alchemy.Alchemy_Group);
    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(CHERRY_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(CHERRY_PLANKS)), Alchemy.Alchemy_Group);
    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Alchemy.Alchemy_Group);
    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(AbstractBlock.Settings.create().mapColor(MAPLE_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F), AlchemySignTypes.MAPLE), Alchemy.Alchemy_Group);
    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(MAPLE_PLANKS.getDefaultMapColor()).strength(2.0F, 3.0F).sounds(BlockSoundGroup.WOOD)), Alchemy.Alchemy_Group);
    public static final Block MAPLE_DOOR = registerBlockWithoutItem("maple_door",
            new DoorBlock(AbstractBlock.Settings.create().mapColor(MAPLE_PLANKS.getDefaultMapColor()).strength(3.0f).sounds(BlockSoundGroup.WOOD).nonOpaque(),BlockSetType.CHERRY));
    public static final Block MAPLE_TRAPDOOR = registerBlock("maple_trapdoor",
            new TrapdoorBlock(AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN).strength(3.0F).nonOpaque(), AlchemyBlockSetType.MAPLE), Alchemy.Alchemy_Group);
    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, AbstractBlock.Settings.create().mapColor(MAPLE_PLANKS.getDefaultMapColor()).noCollision().strength(0.5F), AlchemyBlockSetType.MAPLE), Alchemy.Alchemy_Group);
    public static final Block RED_MAPLE_CARPET = registerBlock("red_maple_carpet",new AlchemyCarpetBlock(AbstractBlock.Settings.copy(Blocks.PINK_PETALS).mapColor(MapColor.RED)),Alchemy.Alchemy_Group);

    public static final BlockFamily MAPLE_FAMILY = BlockFamilies.register(AlchemyMapleBlocks.MAPLE_PLANKS)
            .button(MAPLE_BUTTON)
            .fence(MAPLE_FENCE)
            .fenceGate(MAPLE_FENCE_GATE)
            .door(MAPLE_DOOR)
            .trapdoor(MAPLE_TRAPDOOR)
            .slab(MAPLE_SLAB)
            .stairs(MAPLE_STAIRS)
            .pressurePlate(MAPLE_PRESSURE_PLATE)
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

    public static void registerAlchemyMapleTreeBlocks() {
        Alchemy.LOGGER.info("Registering Alchemy Maple Tree Blocks for " + Alchemy.MOD_ID);
    }
}
