package com.skniro.alchemy.datagen;

import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.block.AlchemyPalmaBlocks;
import com.skniro.alchemy.fluid.AlchemyFluidItems;
import com.skniro.alchemy.fluid.AlchemyFluids;
import com.skniro.alchemy.item.AlchemyBoatItems;
import com.skniro.alchemy.item.AlchemyFoodComponents;
import com.skniro.alchemy.item.AlchemyItems;
import com.skniro.alchemy.item.AlchemySignItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;

public class AlchemyModelProvider extends FabricModelProvider {
    public AlchemyModelProvider(FabricDataOutput dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        //Cube Block

        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.Salt_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.DEEPSLATE_Salt_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.Deepslate_arknite_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.Hematite_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.lightning_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.Crimson_ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.End_Septrin_Ore);

        //LOG Block
        blockStateModelGenerator.registerLog(AlchemyMapleBlocks.MAPLE_LOG).log(AlchemyMapleBlocks.MAPLE_LOG).wood(AlchemyMapleBlocks.MAPLE_WOOD);
        blockStateModelGenerator.registerLog(AlchemyMapleBlocks.STRIPPED_MAPLE_LOG).log(AlchemyMapleBlocks.STRIPPED_MAPLE_LOG).wood(AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD);
        blockStateModelGenerator.registerLog(AlchemyPalmaBlocks.PALMA_LOG).log(AlchemyPalmaBlocks.PALMA_LOG).wood(AlchemyPalmaBlocks.PALMA_WOOD);
        blockStateModelGenerator.registerLog(AlchemyPalmaBlocks.STRIPPED_PALMA_LOG).log(AlchemyPalmaBlocks.STRIPPED_PALMA_LOG).wood(AlchemyPalmaBlocks.STRIPPED_PALMA_WOOD);

        //Maple
        BlockStateModelGenerator.BlockTexturePool maple_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyMapleBlocks.MAPLE_PLANKS);
        maple_pool.family(AlchemyMapleBlocks.MAPLE_FAMILY);
        blockStateModelGenerator.registerWoolAndCarpet(AlchemyMapleBlocks.RED_MAPLE_LEAVES,AlchemyMapleBlocks.RED_MAPLE_CARPET);

        //PALMA
        BlockStateModelGenerator.BlockTexturePool palma_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyPalmaBlocks.PALMA_PLANKS);
        maple_pool.family(AlchemyPalmaBlocks.PALMA_FAMILY);
        //blockStateModelGenerator.registerWoolAndCarpet(AlchemyPalmaBlocks.PALMA_LEAVES,AlchemyPalmaBlocks.PALMA_CARPET);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AlchemyItems.Salt, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Arknite, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Septrin, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Crimson, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Hematite, Models.GENERATED);

        itemModelGenerator.register(AlchemyFluidItems.EmeraldBand_BUCKET, Models.GENERATED);

        itemModelGenerator.register(AlchemyItems.PlantEssence, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.NamelessGrass, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.EtherAqua, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.ScorchedGrass, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.LuckyClover, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PoisonEater, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.WasserWheat, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MapleLeaf, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SweetLeaf, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.RoseLeaf, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.AncientBranch, Models.GENERATED);


        // Sea Urchins
        itemModelGenerator.register(AlchemyItems.SeaUrchin, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SILVER_SEA_URCHIN, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.GOLDEN_SEA_URCHIN, Models.GENERATED);

        // Flowers
        itemModelGenerator.register(AlchemyItems.FORGET_ME_NOT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.NORTH_WIND_FLOWER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.NIGHTGLOW_FLOWER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Sun_Nectar_Flower, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Blessed_Clear_Flower, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Reminiscence_Mist_Flower, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Silent_Moonflower, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Tranquil_Flower, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Clear_Water_White_Princess, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.DOLPHIN_ROSE, Models.GENERATED);

        // Grass, Herbs, and Leaves
        itemModelGenerator.register(AlchemyItems.LANTERN_GRASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SOAP_GRASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.Aether_Grass, Models.GENERATED);

        itemModelGenerator.register(AlchemyItems.HERB, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.LONG_NECK_GRASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MUTANT_PLANT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.THREE_SEED_GRASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.RED_GRASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.BITTER_ROOT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SAPLING_BRANCHES, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MOSS_STONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.RICH_SOIL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MEDICINE_BONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.KARMINE_FRUIT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.DECAYED_BARK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.WAILING_GROANS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MUSHROOM_SPORES, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.DEATHS_SIGH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.FOREST_WISDOM_GRASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.NIGHT_FLOWER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SOFT_SAND, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.FLAMMABLE_SAND, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.WHITE_ASH_SAND, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.POLLUTED_DEAD_LEAF_SOIL, Models.GENERATED);;
        itemModelGenerator.register(AlchemyItems.EMERALD_GLASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SANDSTONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.WEATHERED_STONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.ANCIENT_PILLAR, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.CORAL_STONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.CAVE_CORAL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.RIVER_STONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.RIVER_STONE_BLAZE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.STALACTITE_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SPIRIT_WHITE_ROCK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.KOBOLD_NIGHTSTONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PAINT_NIGHTSTONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MOLDY_NIGHTSTONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.GORDY_NIGHTSTONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.COMET_ROCK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.CREATION_REVERSE_STONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SMALL_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.UNKNOWN_ORE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.GREAT_WHITE_PEARL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.STRIPED_STONE, Models.GENERATED);;
        itemModelGenerator.register(AlchemyItems.AMBER_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.AMBER_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MAGNETIC_MARBLE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HOLY_TREE_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.DRIED_WOOD_CHIP, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.BLACK_FLAME_SAND, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MAGMA_POWDER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PAPER_SCRAP, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.FLAMMABLE_BARK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PALM_BARK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.NATURAL_OIL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.WHITE_SMOKE_CHARCOAL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PALM_BLACK_CHARCOAL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.WILD_POTATO, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.BEAST_MEAT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.FRESH_MEAT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.KUKEN_FRUIT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.UNKNOWN_EGG, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SEVEN_COLORED_GRAPE, Models.GENERATED);
        itemModelGenerator.register(AlchemyFoodComponents.PALMA_FRUIT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.BERRY, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.OIL_TREE_FRUIT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.DEW_FRUIT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.OAK_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.DREAM_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.CLUSTER_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.JUPITER_TOOTH_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.GOLDEN_CROWN, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.BEAUTIFUL_SHELL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SARDINE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.JIANG_LONG_FISH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SPIKY_FISH, Models.GENERATED);;
        itemModelGenerator.register(AlchemyItems.YELLOW_TAIL_FISH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SHRUB_CRAB, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.CAP_CRAB, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SHARP_NOSE_FISH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HAMMERFISH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.ANCIENT_FISH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.LAKE_MASTER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.OTHERWORLD_MASTER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SEVEN_STAR_BUG , Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HONEY_ANT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.LANTERN_FIREFLY, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.ROSE_BEE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.BEETLE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.BLAZING_DRAGONFLY, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SPEAR_WORM, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.AMBER_FLY, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.NAPIS_BUTTERFLY, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.YOUNG_RAINBOW_WORM, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.TRIANGLE_BEETLE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HARDENED_SPIDER_SILK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.STRONG_VINE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.WOOLLY_GRASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.GIANT_IVY, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.STURDY_LOG, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MOSSY_DRIFTWOOD, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.FOSSIL_TREE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HONEY_WOOD, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.OTHERWORLD_ROTTEN_WOOD, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HOLY_TREE_BIG_BRANCH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.WINGED_LEAF_GRASS, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SKY_BUBBLE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SCORCH_MUSHROOM, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.ROTTEN_WOOD_POISON_MIST, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PUNI_PUNI_BALL_BLUE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PUNI_PUNI_BALL_GREEN, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PUNI_PUNI_BALL_RED, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PUNI_PUNI_BALL_BLACK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PUNI_PUNI_BALL_SILVER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.PUNI_PUNI_BALL_GOLD, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.LARGE_FEATHER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.ANIMAL_FUR, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.FANTASY_BEAST_FUR, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.LARGE_BONE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SNAKE_SHEATH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.GIANT_BEAST_FOSSIL, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MAGIC_STONE_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.DARK_CRYSTAL_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HOLY_STONE_FRAGMENT, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MAGIC_BOOK_PAGE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.OLD_MAGIC_BOOK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.OTHERWORLD_CORE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HOLY_TREE_LEAF, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.MAPLE_BARK, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.HONEY_WOOD_BRANCH, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SPIRIT_FLOWER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.SPIRIT_FEATHER, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.RUSTED_SWORD, Models.GENERATED);

        itemModelGenerator.register(AlchemyItems.AZURITE_ORE, Models.GENERATED);

        //Sign
        itemModelGenerator.register(AlchemySignItems.Maple_HANGING_SIGN, Models.GENERATED);

        //Boat
        itemModelGenerator.register(AlchemyBoatItems.MAPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(AlchemyBoatItems.MAPLE_CHEST_BOAT, Models.GENERATED);


        // Other Materials
        itemModelGenerator.register(AlchemyItems.BEE_HIVE, Models.GENERATED);
        itemModelGenerator.register(AlchemyItems.GOLDEN_BEE_HIVE, Models.GENERATED);


    }
}
