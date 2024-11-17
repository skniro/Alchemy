package com.skniro.alchemy;


import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.block.AlchemySignBlocks;
import com.skniro.alchemy.block.entity.AlchemyBlockEntityType;
import com.skniro.alchemy.client.gui.screen.ingame.AlchemyBlockScreen;
import com.skniro.alchemy.entity.customnpc.AlchemyCustomNPCEntity;
import com.skniro.alchemy.entity.client.render.entity.AlchemyCustomNPCRenderer;
import com.skniro.alchemy.entity.AlchemyEntityType;
import com.skniro.alchemy.entity.village.AlchemyVillagers;
import com.skniro.alchemy.fluid.AlchemyFluidBlocks;
import com.skniro.alchemy.fluid.AlchemyFluidItems;
import com.skniro.alchemy.fluid.AlchemyFluids;
import com.skniro.alchemy.item.*;
import com.skniro.alchemy.recipe.AlchemyRecipeType;
import com.skniro.alchemy.screen.AlchemyScreenHandlerType;
import com.skniro.alchemy.util.AlchemyFlammableBlocks;
import com.skniro.alchemy.util.AlchemyStrippableBlocks;
import com.skniro.alchemy.world.gen.MapleTreeGeneration;
import com.skniro.alchemy.world.gen.ModOreGeneration;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.skniro.alchemy.Alchemy.Alchemy_Group;


public class AlchemyContent {


    public static void registerItem(){
        AlchemyItems.registerModItems();
        AlchemyFoodComponents.registerMapleFoodItems();
        AlchemySignItems.registerAlchemySignItems();
        AlchemyDoorItems.registerAlchemyDoorItems();
        AlchemyBoatItems.registerAlchemyBoatItems();
    }
    public static void registerBlock(){
        AlchemyFlammableBlocks.registerFlammableBlocks();
        AlchemyStrippableBlocks.registerStrippables();
        AlchemyBlocks.registerAlchemyBlocks();
        AlchemyMapleBlocks.registerAlchemyMapleTreeBlocks();
        AlchemyOreBlocks.registerAlchemyExperienceDroppingBlocks();
        AlchemySignBlocks.registerAlchemySignBlocks();
    }

    public static void registerFluid(){
        AlchemyFluids.registerFluids();
        AlchemyFluidBlocks.registerFluidBlocks();
        AlchemyFluidItems.registerFluidsItems();
    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        ModOreGeneration.generateOres();
    }

    public static void registerType() {
        AlchemyRecipeType.registerRecipeType();
        AlchemyScreenHandlerType.registeralchemyscreenhandlertype();
        AlchemyBlockEntityType.registerMapleBlockEntityType();
        AlchemyVillagers.registerVillagerType();
    }

    public static void registerItemGroup() {
        Registry.register(Registries.ITEM_GROUP, Alchemy_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(Items.STONE))
                .displayName(Text.translatable("itemGroup.alchemy.alchemy_group"))
                .build()); // build() no longer registers by itself

        ItemGroupEvents.modifyEntriesEvent(Alchemy_Group).register(content -> {
            //Entity Block
            content.add(AlchemyBlocks.Alchemy_Block);

            //Ore
            content.add(AlchemyOreBlocks.Crimson_ore);
            content.add(AlchemyItems.Crimson);
            content.add(AlchemyItems.Hematite);

            //Items
            content.add(AlchemyItems.Salt);
            content.add(AlchemyItems.Arknite);
            content.add(AlchemyItems.Septrin);
            content.add(AlchemyItems.Test_Tool_Type1_Level1);

            //Fluids
            content.add(AlchemyFluidItems.EmeraldBand_BUCKET);

            content.add(AlchemyItems.PlantEssence);
            content.add(AlchemyItems.NamelessGrass);
            content.add(AlchemyItems.EtherAqua);
            content.add(AlchemyItems.ScorchedGrass);
            content.add(AlchemyItems.LuckyClover);
            content.add(AlchemyItems.PoisonEater);
            content.add(AlchemyItems.WasserWheat);
            content.add(AlchemyItems.MapleLeaf);
            content.add(AlchemyItems.SweetLeaf);
            content.add(AlchemyItems.RoseLeaf);
            content.add(AlchemyItems.AncientBranch);


            // Sea Urchins
            content.add(AlchemyItems.SeaUrchin);
            content.add(AlchemyItems.SILVER_SEA_URCHIN);
            content.add(AlchemyItems.GOLDEN_SEA_URCHIN);

            // Flowers
            content.add(AlchemyItems.FORGET_ME_NOT);
            content.add(AlchemyItems.NORTH_WIND_FLOWER);
            content.add(AlchemyItems.NIGHTGLOW_FLOWER);
            content.add(AlchemyItems.Sun_Nectar_Flower);
            content.add(AlchemyItems.Blessed_Clear_Flower);
            content.add(AlchemyItems.Reminiscence_Mist_Flower);
            content.add(AlchemyItems.Silent_Moonflower);
            content.add(AlchemyItems.Tranquil_Flower);
            content.add(AlchemyItems.Clear_Water_White_Princess);
            content.add(AlchemyItems.DOLPHIN_ROSE);

            // Grass, Herbs, and Leaves
            content.add(AlchemyItems.LANTERN_GRASS);
            content.add(AlchemyItems.SOAP_GRASS);
            content.add(AlchemyItems.Aether_Grass);

            content.add(AlchemyItems.HERB);
            content.add(AlchemyItems.LONG_NECK_GRASS);
            content.add(AlchemyItems.MUTANT_PLANT);
            content.add(AlchemyItems.THREE_SEED_GRASS);
            content.add(AlchemyItems.RED_GRASS);
            content.add(AlchemyItems.BITTER_ROOT);
            content.add(AlchemyItems.SAPLING_BRANCHES);
            content.add(AlchemyItems.MOSS_STONE);
            content.add(AlchemyItems.RICH_SOIL);
            content.add(AlchemyItems.MEDICINE_BONE);
            content.add(AlchemyItems.KARMINE_FRUIT);
            content.add(AlchemyItems.KARMINE_VENOM);
            content.add(AlchemyItems.DECAYED_BARK);
            content.add(AlchemyItems.WAILING_GROANS);
            content.add(AlchemyItems.MUSHROOM_SPORES);
            content.add(AlchemyItems.DEATHS_SIGH);
            content.add(AlchemyItems.FOREST_WISDOM_GRASS);
            content.add(AlchemyItems.NIGHT_FLOWER);
            content.add(AlchemyItems.SOFT_SAND);
            content.add(AlchemyItems.FLAMMABLE_SAND);
            content.add(AlchemyItems.WHITE_ASH_SAND);
            content.add(AlchemyItems.POLLUTED_DEAD_LEAF_SOIL);;
            content.add(AlchemyItems.EMERALD_GLASS);
            content.add(AlchemyItems.SANDSTONE);
            content.add(AlchemyItems.WEATHERED_STONE);
            content.add(AlchemyItems.ANCIENT_PILLAR);
            content.add(AlchemyItems.CORAL_STONE);
            content.add(AlchemyItems.CAVE_CORAL);
            content.add(AlchemyItems.RIVER_STONE);
            content.add(AlchemyItems.RIVER_STONE_BLAZE);
            content.add(AlchemyItems.STALACTITE_FRAGMENT);
            content.add(AlchemyItems.SPIRIT_WHITE_ROCK);
            content.add(AlchemyItems.KOBOLD_NIGHTSTONE);
            content.add(AlchemyItems.PAINT_NIGHTSTONE);
            content.add(AlchemyItems.MOLDY_NIGHTSTONE);
            content.add(AlchemyItems.GORDY_NIGHTSTONE);
            content.add(AlchemyItems.COMET_ROCK);
            content.add(AlchemyItems.CREATION_REVERSE_STONE);
            content.add(AlchemyItems.SMALL_CRYSTAL);
            content.add(AlchemyItems.UNKNOWN_ORE);
            content.add(AlchemyItems.GREAT_WHITE_PEARL);
            content.add(AlchemyItems.STRIPED_STONE);;
            content.add(AlchemyItems.AMBER_FRAGMENT);
            content.add(AlchemyItems.AMBER_CRYSTAL);
            content.add(AlchemyItems.MAGNETIC_MARBLE);
            content.add(AlchemyItems.HOLY_TREE_CRYSTAL);
            content.add(AlchemyItems.DRIED_WOOD_CHIP);
            content.add(AlchemyItems.BLACK_FLAME_SAND);
            content.add(AlchemyItems.MAGMA_POWDER);
            content.add(AlchemyItems.PAPER_SCRAP);
            content.add(AlchemyItems.FLAMMABLE_BARK);
            content.add(AlchemyItems.PALM_BARK);
            content.add(AlchemyItems.NATURAL_OIL);
            content.add(AlchemyItems.WHITE_SMOKE_CHARCOAL);
            content.add(AlchemyItems.PALM_BLACK_CHARCOAL);
            content.add(AlchemyItems.WILD_POTATO);
            content.add(AlchemyItems.BEAST_MEAT);
            content.add(AlchemyItems.FRESH_MEAT);
            content.add(AlchemyItems.KUKEN_FRUIT);
            content.add(AlchemyItems.UNKNOWN_EGG);
            content.add(AlchemyItems.SEVEN_COLORED_GRAPE);
            content.add(AlchemyItems.PALMA_FRUIT);
            content.add(AlchemyItems.BERRY);
            content.add(AlchemyItems.OIL_TREE_FRUIT);
            content.add(AlchemyItems.DEW_FRUIT);
            content.add(AlchemyItems.OAK_MUSHROOM);
            content.add(AlchemyItems.DREAM_MUSHROOM);
            content.add(AlchemyItems.CLUSTER_MUSHROOM);
            content.add(AlchemyItems.JUPITER_TOOTH_MUSHROOM);
            content.add(AlchemyItems.GOLDEN_CROWN);
            content.add(AlchemyItems.BEAUTIFUL_SHELL);
            content.add(AlchemyItems.SARDINE);
            content.add(AlchemyItems.JIANG_LONG_FISH);
            content.add(AlchemyItems.SPIKY_FISH);;
            content.add(AlchemyItems.YELLOW_TAIL_FISH);
            content.add(AlchemyItems.SHRUB_CRAB);
            content.add(AlchemyItems.CAP_CRAB);
            content.add(AlchemyItems.SHARP_NOSE_FISH);
            content.add(AlchemyItems.HAMMERFISH);
            content.add(AlchemyItems.ANCIENT_FISH);
            content.add(AlchemyItems.LAKE_MASTER);
            content.add(AlchemyItems.OTHERWORLD_MASTER);
            content.add(AlchemyItems.SEVEN_STAR_BUG );
            content.add(AlchemyItems.HONEY_ANT);
            content.add(AlchemyItems.LANTERN_FIREFLY);
            content.add(AlchemyItems.ROSE_BEE);
            content.add(AlchemyItems.BEETLE);
            content.add(AlchemyItems.BLAZING_DRAGONFLY);
            content.add(AlchemyItems.SPEAR_WORM);
            content.add(AlchemyItems.AMBER_FLY);
            content.add(AlchemyItems.NAPIS_BUTTERFLY);
            content.add(AlchemyItems.YOUNG_RAINBOW_WORM);
            content.add(AlchemyItems.TRIANGLE_BEETLE);
            content.add(AlchemyItems.HARDENED_SPIDER_SILK);
            content.add(AlchemyItems.STRONG_VINE);
            content.add(AlchemyItems.WOOLLY_GRASS);
            content.add(AlchemyItems.GIANT_IVY);
            content.add(AlchemyItems.OAK_WOOD);
            content.add(AlchemyItems.STURDY_LOG);
            content.add(AlchemyItems.MOSSY_DRIFTWOOD);
            content.add(AlchemyItems.PALMA_WOOD);
            content.add(AlchemyItems.FOSSIL_TREE);
            content.add(AlchemyItems.HONEY_WOOD);
            content.add(AlchemyItems.OTHERWORLD_ROTTEN_WOOD);
            content.add(AlchemyItems.HOLY_TREE_BIG_BRANCH);
            content.add(AlchemyItems.WINGED_LEAF_GRASS);
            content.add(AlchemyItems.SKY_BUBBLE);
            content.add(AlchemyItems.SCORCH_MUSHROOM);
            content.add(AlchemyItems.ROTTEN_WOOD_POISON_MIST);
            content.add(AlchemyItems.PUNI_PUNI_BALL_BLUE);
            content.add(AlchemyItems.PUNI_PUNI_BALL_GREEN);
            content.add(AlchemyItems.PUNI_PUNI_BALL_RED);
            content.add(AlchemyItems.PUNI_PUNI_BALL_BLACK);
            content.add(AlchemyItems.PUNI_PUNI_BALL_SILVER);
            content.add(AlchemyItems.PUNI_PUNI_BALL_GOLD);
            content.add(AlchemyItems.LARGE_FEATHER);
            content.add(AlchemyItems.ANIMAL_FUR);
            content.add(AlchemyItems.FANTASY_BEAST_FUR);
            content.add(AlchemyItems.LARGE_BONE);
            content.add(AlchemyItems.SNAKE_SHEATH);
            content.add(AlchemyItems.GIANT_BEAST_FOSSIL);
            content.add(AlchemyItems.MAGIC_STONE_FRAGMENT);
            content.add(AlchemyItems.DARK_CRYSTAL_FRAGMENT);
            content.add(AlchemyItems.HOLY_STONE_FRAGMENT);
            content.add(AlchemyItems.MAGIC_BOOK_PAGE);
            content.add(AlchemyItems.OLD_MAGIC_BOOK);
            content.add(AlchemyItems.OTHERWORLD_CORE);
            content.add(AlchemyItems.HOLY_TREE_LEAF);
            content.add(AlchemyItems.MAPLE_BARK);
            content.add(AlchemyItems.HONEY_WOOD_BRANCH);
            content.add(AlchemyItems.SPIRIT_FLOWER);
            content.add(AlchemyItems.SPIRIT_FEATHER);
            content.add(AlchemyItems.RUSTED_SWORD);
            content.add(AlchemyItems.AZURITE_ORE);
            content.add(AlchemyMapleBlocks.MAPLE_LOG);
            content.add(AlchemyMapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(AlchemyMapleBlocks.MAPLE_WOOD);
            content.add(AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD);
            content.add(AlchemyMapleBlocks.STRIPPED_MAPLE_LOG);
            content.add(AlchemyMapleBlocks.RED_MAPLE_SAPLING);
            content.add(AlchemyMapleBlocks.MAPLE_PLANKS);
            content.add(AlchemyMapleBlocks.RED_MAPLE_LEAVES);
            content.add(AlchemyMapleBlocks.RED_MAPLE_CARPET);
            content.add(AlchemyMapleBlocks.MAPLE_BUTTON);
            content.add(AlchemyMapleBlocks.MAPLE_STAIRS);
            content.add(AlchemyMapleBlocks.MAPLE_SLAB);
            content.add(AlchemyMapleBlocks.MAPLE_FENCE);
            content.add(AlchemyMapleBlocks.MAPLE_FENCE_GATE);
            content.add(AlchemyMapleBlocks.MAPLE_TRAPDOOR);
            content.add(AlchemyMapleBlocks.MAPLE_PRESSURE_PLATE);
            content.add(AlchemySignItems.MAPLE_SIGN);
            content.add(AlchemySignItems.Maple_HANGING_SIGN);
            content.add(AlchemyDoorItems.MAPLE_DOOR);
            content.add(AlchemyBoatItems.MAPLE_BOAT);
            content.add(AlchemyBoatItems.MAPLE_CHEST_BOAT);

            // Other Materials
            content.add(AlchemyItems.BEE_HIVE);
            content.add(AlchemyItems.GOLDEN_BEE_HIVE);
        });
    }
    public static void registerEntityAttribute() {
        FabricDefaultAttributeRegistry.register(AlchemyEntityType.HimegiAgeha, AlchemyCustomNPCEntity.createMobAttributes());
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerForClient() {
        registerFluidRenderForClient();
        registerBlockRenderForClient();
        registerEntityForClient();
        registerScreenForClient();
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerFluidRenderForClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(AlchemyFluids.STILL_EmeraldBand_WATER, AlchemyFluids.FLOWING_EmeraldBand_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA59EE261
                ));
        FluidRenderHandlerRegistry.INSTANCE.register(AlchemyFluids.STILL_RotwaterMineral_WATER, AlchemyFluids.FLOWING_RotwaterMineral_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA59EE261
                ));
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerBlockRenderForClient() {
        RenderLayer renderLayer1 = RenderLayer.getCutout();
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.MAPLE_DOOR, renderLayer1);
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.MAPLE_TRAPDOOR, renderLayer1);

        RenderLayer renderLayer2 = RenderLayer.getCutoutMipped();
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.RED_MAPLE_CARPET,renderLayer2);


        RenderLayer renderLayer3 = RenderLayer.getCutout();
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.RED_MAPLE_LEAVES, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.RED_MAPLE_SAPLING , renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.POTTED_RED_MAPLE_SAPLING, renderLayer3);


        RenderLayer renderLayer4 = RenderLayer.getTranslucent();
        BlockRenderLayerMap.INSTANCE.putFluids(renderLayer4, AlchemyFluids.STILL_EmeraldBand_WATER, AlchemyFluids.FLOWING_EmeraldBand_WATER);
        BlockRenderLayerMap.INSTANCE.putFluids(renderLayer4, AlchemyFluids.FLOWING_RotwaterMineral_WATER, AlchemyFluids.FLOWING_RotwaterMineral_WATER);

    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerScreenForClient() {
        HandledScreens.register(AlchemyScreenHandlerType.ALCHEMY, AlchemyBlockScreen::new);
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerEntityForClient() {
        EntityRendererRegistry.register(AlchemyEntityType.HimegiAgeha, AlchemyCustomNPCRenderer::new);
    }

}

