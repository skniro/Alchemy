package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.item.init.AlchemyTestItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemyItems {
    //矿物
    public static final Item Salt = registerItem("salt",new Item(new Item.Settings()));
    public static final Item Arknite = registerItem("arknite",new Item(new Item.Settings()));
    public static final Item Crimson = registerItem("crimson",new Item(new Item.Settings()));
    public static final Item Hematite = registerItem("hematite",new Item(new Item.Settings()));
       //圣石
    public static final Item Septrin = registerItem("septrin",new Item(new Item.Settings()));

    //其他合成材料
    public static final Item PlantEssence = registerItem("plantessence",new Item(new Item.Settings()));
    public static final Item NamelessGrass = registerItem("nameless_grass",new Item(new Item.Settings()));
    public static final Item EtherAqua = registerItem("ether_aqua",new Item(new Item.Settings()));
    public static final Item ScorchedGrass = registerItem("scorched_grass",new Item(new Item.Settings()));
    public static final Item LuckyClover = registerItem("luckyclover",new Item(new Item.Settings()));
    public static final Item PoisonEater = registerItem("poison_eater",new Item(new Item.Settings()));
    public static final Item WasserWheat = registerItem("wasser_wheat",new Item(new Item.Settings()));
    public static final Item MapleLeaf = registerItem("maple_leaf",new Item(new Item.Settings()));
    public static final Item SweetLeaf = registerItem("sweet_leaf",new Item(new Item.Settings()));
    public static final Item RoseLeaf = registerItem("rose_leaf",new Item(new Item.Settings()));
    public static final Item AncientBranch = registerItem("ancient_branch",new Item(new Item.Settings()));


    // Sea Urchins
    public static final Item SeaUrchin = registerItem("sea_urchin",new Item(new Item.Settings()));
    public static final Item SILVER_SEA_URCHIN = registerItem("silver_sea_urchin", new Item(new Item.Settings()));
    public static final Item GOLDEN_SEA_URCHIN = registerItem("golden_sea_urchin", new Item(new Item.Settings()));

    // Flowers
    public static final Item FORGET_ME_NOT = registerItem("forget_me_not", new Item(new Item.Settings()));
    public static final Item NORTH_WIND_FLOWER = registerItem("north_wind_flower", new Item(new Item.Settings()));
    public static final Item NIGHTGLOW_FLOWER = registerItem("nightglow_flower", new Item(new Item.Settings()));
    public static final Item Sun_Nectar_Flower = registerItem("sun_nectar_flower", new Item(new Item.Settings()));
    public static final Item Blessed_Clear_Flower = registerItem("blessed_clear_flower", new Item(new Item.Settings()));
    public static final Item Reminiscence_Mist_Flower = registerItem("reminiscence_mist_flower", new Item(new Item.Settings()));
    public static final Item Silent_Moonflower = registerItem("silent_moonflower", new Item(new Item.Settings()));
    public static final Item Tranquil_Flower = registerItem("tranquil_flower", new Item(new Item.Settings()));
    public static final Item Clear_Water_White_Princess = registerItem("clear_water_white_princess", new Item(new Item.Settings()));
    public static final Item DOLPHIN_ROSE = registerItem("dolphin_rose", new Item(new Item.Settings()));

    // Grass, Herbs, and Leaves
    public static final Item LANTERN_GRASS = registerItem("lantern_grass", new Item(new Item.Settings()));
    public static final Item SOAP_GRASS = registerItem("soap_grass", new Item(new Item.Settings()));
    public static final Item Aether_Grass = registerItem("aether_grass", new Item(new Item.Settings()));

    public static final Item HERB = registerItem("herb", new Item(new Item.Settings()));
    public static final Item LONG_NECK_GRASS = registerItem("long_neck_grass", new Item(new Item.Settings()));
    public static final Item MUTANT_PLANT = registerItem("mutant_plant", new Item(new Item.Settings()));
    public static final Item THREE_SEED_GRASS = registerItem("three_seed_grass", new Item(new Item.Settings()));
    public static final Item RED_GRASS = registerItem("red_grass", new Item(new Item.Settings()));
    public static final Item BITTER_ROOT = registerItem("bitter_root", new Item(new Item.Settings()));
    public static final Item SAPLING_BRANCHES = registerItem("sapling_branches", new Item(new Item.Settings()));
    public static final Item MOSS_STONE = registerItem("moss_stone", new Item(new Item.Settings()));
    public static final Item RICH_SOIL = registerItem("rich_soil", new Item(new Item.Settings()));
    public static final Item MEDICINE_BONE = registerItem("medicine_bone", new Item(new Item.Settings()));
    public static final Item KARMINE_FRUIT = registerItem("karmine_fruit", new Item(new Item.Settings()));
    public static final Item KARMINE_VENOM = registerItem("karmine_venom", new Item(new Item.Settings()));
    public static final Item DECAYED_BARK = registerItem("decayed_bark", new Item(new Item.Settings()));
    public static final Item WAILING_GROANS = registerItem("wailing_groans", new Item(new Item.Settings()));
    public static final Item MUSHROOM_SPORES = registerItem("mushroom_spores", new Item(new Item.Settings()));
    public static final Item DEATHS_SIGH = registerItem("deaths_sigh", new Item(new Item.Settings()));
    public static final Item FOREST_WISDOM_GRASS = registerItem("forest_wisdom_grass", new Item(new Item.Settings()));
    public static final Item NIGHT_FLOWER = registerItem("night_flower", new Item(new Item.Settings()));
    public static final Item SOFT_SAND = registerItem("soft_sand", new Item(new Item.Settings()));
    public static final Item FLAMMABLE_SAND = registerItem("flammable_sand", new Item(new Item.Settings()));
    public static final Item WHITE_ASH_SAND = registerItem("white_ash_sand", new Item(new Item.Settings()));
    public static final Item POLLUTED_DEAD_LEAF_SOIL = registerItem("polluted_dead_leaf_soil", new Item(new Item.Settings()));
    public static final Item EMERALD_GLASS = registerItem("emerald_glass", new Item(new Item.Settings()));
    public static final Item SANDSTONE = registerItem("sandstone", new Item(new Item.Settings()));
    public static final Item WEATHERED_STONE = registerItem("weathered_stone", new Item(new Item.Settings()));
    public static final Item ANCIENT_PILLAR = registerItem("ancient_pillar", new Item(new Item.Settings()));
    public static final Item CORAL_STONE = registerItem("coral_stone", new Item(new Item.Settings()));
    public static final Item CAVE_CORAL = registerItem("cave_coral", new Item(new Item.Settings()));
    public static final Item RIVER_STONE = registerItem("river_stone", new Item(new Item.Settings()));
    public static final Item RIVER_STONE_BLAZE = registerItem("river_stone_blaze", new Item(new Item.Settings()));
    public static final Item STALACTITE_FRAGMENT = registerItem("stalactite_fragment", new Item(new Item.Settings()));
    public static final Item SPIRIT_WHITE_ROCK = registerItem("spirit_white_rock", new Item(new Item.Settings()));
    public static final Item AZURITE_ORE = registerItem("azurite_ore", new Item(new Item.Settings()));
    public static final Item KOBOLD_NIGHTSTONE = registerItem("kobold_nightstone", new Item(new Item.Settings()));
    public static final Item PAINT_NIGHTSTONE = registerItem("paint_nightstone", new Item(new Item.Settings()));
    public static final Item MOLDY_NIGHTSTONE = registerItem("moldy_nightstone", new Item(new Item.Settings()));
    public static final Item GORDY_NIGHTSTONE = registerItem("gordy_nightstone", new Item(new Item.Settings()));
    public static final Item COMET_ROCK = registerItem("comet_rock", new Item(new Item.Settings()));
    public static final Item CREATION_REVERSE_STONE = registerItem("creation_reverse_stone", new Item(new Item.Settings()));
    public static final Item SMALL_CRYSTAL = registerItem("small_crystal", new Item(new Item.Settings()));
    public static final Item UNKNOWN_ORE = registerItem("unknown_ore", new Item(new Item.Settings()));
    public static final Item GREAT_WHITE_PEARL = registerItem("great_white_pearl", new Item(new Item.Settings()));
    public static final Item STRIPED_STONE = registerItem("striped_stone", new Item(new Item.Settings()));
    public static final Item AMBER_FRAGMENT = registerItem("amber_fragment", new Item(new Item.Settings()));
    public static final Item AMBER_CRYSTAL = registerItem("amber_crystal", new Item(new Item.Settings()));
    public static final Item MAGNETIC_MARBLE = registerItem("magnetic_marble", new Item(new Item.Settings()));
    public static final Item HOLY_TREE_CRYSTAL = registerItem("holy_tree_crystal", new Item(new Item.Settings()));
    public static final Item DRIED_WOOD_CHIP = registerItem("dried_wood_chip", new Item(new Item.Settings()));
    public static final Item BLACK_FLAME_SAND = registerItem("black_flame_sand", new Item(new Item.Settings()));
    public static final Item MAGMA_POWDER = registerItem("magma_powder", new Item(new Item.Settings()));
    public static final Item PAPER_SCRAP = registerItem("paper_scrap", new Item(new Item.Settings()));
    public static final Item FLAMMABLE_BARK = registerItem("flammable_bark", new Item(new Item.Settings()));
    public static final Item PALM_BARK = registerItem("palm_bark", new Item(new Item.Settings()));
    public static final Item NATURAL_OIL = registerItem("natural_oil", new Item(new Item.Settings()));
    public static final Item WHITE_SMOKE_CHARCOAL = registerItem("white_smoke_charcoal", new Item(new Item.Settings()));
    public static final Item PALM_BLACK_CHARCOAL = registerItem("palm_black_charcoal", new Item(new Item.Settings()));
    public static final Item WILD_POTATO = registerItem("wild_potato", new Item(new Item.Settings()));
    public static final Item BEAST_MEAT = registerItem("beast_meat", new Item(new Item.Settings()));
    public static final Item FRESH_MEAT = registerItem("fresh_meat", new Item(new Item.Settings()));
    public static final Item KUKEN_FRUIT = registerItem("kuken_fruit", new Item(new Item.Settings()));
    public static final Item UNKNOWN_EGG = registerItem("unknown_egg", new Item(new Item.Settings()));
    public static final Item SEVEN_COLORED_GRAPE = registerItem("seven_colored_grape", new Item(new Item.Settings()));
    public static final Item PALMA_FRUIT = registerItem("palma_fruit", new Item(new Item.Settings()));
    public static final Item BERRY = registerItem("berry", new Item(new Item.Settings()));
    public static final Item OIL_TREE_FRUIT = registerItem("oil_tree_fruit", new Item(new Item.Settings()));
    public static final Item DEW_FRUIT = registerItem("dew_fruit", new Item(new Item.Settings()));
    public static final Item OAK_MUSHROOM = registerItem("oak_mushroom", new Item(new Item.Settings()));
    public static final Item DREAM_MUSHROOM = registerItem("dream_mushroom", new Item(new Item.Settings()));
    public static final Item CLUSTER_MUSHROOM = registerItem("cluster_mushroom", new Item(new Item.Settings()));
    public static final Item JUPITER_TOOTH_MUSHROOM = registerItem("jupiter_tooth_mushroom", new Item(new Item.Settings()));
    public static final Item GOLDEN_CROWN = registerItem("golden_crown", new Item(new Item.Settings()));
    public static final Item BEAUTIFUL_SHELL = registerItem("beautiful_shell", new Item(new Item.Settings()));
    public static final Item SARDINE = registerItem("sardine", new Item(new Item.Settings()));
    public static final Item JIANG_LONG_FISH = registerItem("jiang_long_fish", new Item(new Item.Settings()));
    public static final Item SPIKY_FISH = registerItem("spiky_fish", new Item(new Item.Settings()));
    public static final Item YELLOW_TAIL_FISH = registerItem("yellow_tail_fish", new Item(new Item.Settings()));
    public static final Item SHRUB_CRAB = registerItem("shrub_crab", new Item(new Item.Settings()));
    public static final Item CAP_CRAB = registerItem("cap_crab", new Item(new Item.Settings()));
    public static final Item SHARP_NOSE_FISH = registerItem("sharp_nose_fish", new Item(new Item.Settings()));
    public static final Item HAMMERFISH = registerItem("hammerfish", new Item(new Item.Settings()));
    public static final Item ANCIENT_FISH = registerItem("ancient_fish", new Item(new Item.Settings()));
    public static final Item LAKE_MASTER = registerItem("lake_master", new Item(new Item.Settings()));
    public static final Item OTHERWORLD_MASTER = registerItem("otherworld_master", new Item(new Item.Settings()));
    public static final Item SEVEN_STAR_BUG = registerItem("seven_star_bug", new Item(new Item.Settings()));
    public static final Item HONEY_ANT = registerItem("honey_ant", new Item(new Item.Settings()));
    public static final Item LANTERN_FIREFLY = registerItem("lantern_firefly", new Item(new Item.Settings()));
    public static final Item ROSE_BEE = registerItem("rose_bee", new Item(new Item.Settings()));
    public static final Item BEETLE = registerItem("beetle", new Item(new Item.Settings()));
    public static final Item BLAZING_DRAGONFLY = registerItem("blazing_dragonfly", new Item(new Item.Settings()));
    public static final Item SPEAR_WORM = registerItem("spear_worm", new Item(new Item.Settings()));
    public static final Item AMBER_FLY = registerItem("amber_fly", new Item(new Item.Settings()));
    public static final Item NAPIS_BUTTERFLY = registerItem("napis_butterfly", new Item(new Item.Settings()));
    public static final Item YOUNG_RAINBOW_WORM = registerItem("young_rainbow_worm", new Item(new Item.Settings()));
    public static final Item TRIANGLE_BEETLE = registerItem("triangle_beetle", new Item(new Item.Settings()));
    public static final Item HARDENED_SPIDER_SILK = registerItem("hardened_spider_silk", new Item(new Item.Settings()));
    public static final Item STRONG_VINE = registerItem("strong_vine", new Item(new Item.Settings()));
    public static final Item WOOLLY_GRASS = registerItem("woolly_grass", new Item(new Item.Settings()));
    public static final Item GIANT_IVY = registerItem("giant_ivy", new Item(new Item.Settings()));
    public static final Item OAK_WOOD = registerItem("oak_wood", new Item(new Item.Settings()));
    public static final Item STURDY_LOG = registerItem("sturdy_log", new Item(new Item.Settings()));
    public static final Item MOSSY_DRIFTWOOD = registerItem("mossy_driftwood", new Item(new Item.Settings()));
    public static final Item PALMA_WOOD = registerItem("palma_wood", new Item(new Item.Settings()));
    public static final Item FOSSIL_TREE = registerItem("fossil_tree", new Item(new Item.Settings()));
    public static final Item HONEY_WOOD = registerItem("honey_wood", new Item(new Item.Settings()));
    public static final Item OTHERWORLD_ROTTEN_WOOD = registerItem("otherworld_rotten_wood", new Item(new Item.Settings()));
    public static final Item HOLY_TREE_BIG_BRANCH = registerItem("holy_tree_big_branch", new Item(new Item.Settings()));
    public static final Item WINGED_LEAF_GRASS = registerItem("winged_leaf_grass", new Item(new Item.Settings()));
    public static final Item SKY_BUBBLE = registerItem("sky_bubble", new Item(new Item.Settings()));
    public static final Item SCORCH_MUSHROOM = registerItem("scorch_mushroom", new Item(new Item.Settings()));
    public static final Item ROTTEN_WOOD_POISON_MIST = registerItem("rotten_wood_poison_mist", new Item(new Item.Settings()));
    public static final Item PUNI_PUNI_BALL_BLUE = registerItem("puni_puni_ball_blue", new Item(new Item.Settings()));
    public static final Item PUNI_PUNI_BALL_GREEN = registerItem("puni_puni_ball_green", new Item(new Item.Settings()));
    public static final Item PUNI_PUNI_BALL_RED = registerItem("puni_puni_ball_red", new Item(new Item.Settings()));
    public static final Item PUNI_PUNI_BALL_BLACK = registerItem("puni_puni_ball_black", new Item(new Item.Settings()));
    public static final Item PUNI_PUNI_BALL_SILVER = registerItem("puni_puni_ball_silver", new Item(new Item.Settings()));
    public static final Item PUNI_PUNI_BALL_GOLD = registerItem("puni_puni_ball_gold", new Item(new Item.Settings()));
    public static final Item LARGE_FEATHER = registerItem("large_feather", new Item(new Item.Settings()));
    public static final Item ANIMAL_FUR = registerItem("animal_fur", new Item(new Item.Settings()));
    public static final Item FANTASY_BEAST_FUR = registerItem("fantasy_beast_fur", new Item(new Item.Settings()));
    public static final Item LARGE_BONE = registerItem("large_bone", new Item(new Item.Settings()));
    public static final Item SNAKE_SHEATH = registerItem("snake_sheath", new Item(new Item.Settings()));
    public static final Item GIANT_BEAST_FOSSIL = registerItem("giant_beast_fossil", new Item(new Item.Settings()));
    public static final Item MAGIC_STONE_FRAGMENT = registerItem("magic_stone_fragment", new Item(new Item.Settings()));
    public static final Item DARK_CRYSTAL_FRAGMENT = registerItem("dark_crystal_fragment", new Item(new Item.Settings()));
    public static final Item HOLY_STONE_FRAGMENT = registerItem("holy_stone_fragment", new Item(new Item.Settings()));
    public static final Item MAGIC_BOOK_PAGE = registerItem("magic_book_page", new Item(new Item.Settings()));
    public static final Item OLD_MAGIC_BOOK = registerItem("old_magic_book", new Item(new Item.Settings()));
    public static final Item OTHERWORLD_CORE = registerItem("otherworld_core", new Item(new Item.Settings()));
    public static final Item HOLY_TREE_LEAF = registerItem("holy_tree_leaf", new Item(new Item.Settings()));
    public static final Item MAPLE_BARK = registerItem("maple_bark", new Item(new Item.Settings()));
    public static final Item HONEY_WOOD_BRANCH = registerItem("honey_wood_branch", new Item(new Item.Settings()));
    public static final Item SPIRIT_FLOWER = registerItem("spirit_flower", new Item(new Item.Settings()));
    public static final Item SPIRIT_FEATHER = registerItem("spirit_feather", new Item(new Item.Settings()));
    public static final Item RUSTED_SWORD = registerItem("rusted_sword", new Item(new Item.Settings()));

    // Other Materials
    public static final Item BEE_HIVE = registerItem("bee_hive", new Item(new Item.Settings()));
    public static final Item GOLDEN_BEE_HIVE = registerItem("golden_bee_hive", new Item(new Item.Settings()));


    //工具
    public static final Item Test_Tool_Type1_Level1 = registerItem("test_tool_type1_level1",new AlchemyTestItem(ToolMaterials.IRON,5, 6.0F, new Item.Settings()));
    public static final Item Test_Tool_Type1_Level2 = registerItem("test_tool_type1_level2",new AlchemyTestItem(ToolMaterials.IRON,5, 6.0F, new Item.Settings()));
    public static final Item Test_Tool_Type1_Level3 = registerItem("test_tool_type1_level3",new AlchemyTestItem(ToolMaterials.IRON,5, 6.0F, new Item.Settings()));


    //能喝的
    public static final Item Goat_Milk = registerItem("goat_milk",new MilkBucketItem(new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Alchemy.LOGGER.info("Registering Mod Items for " + Alchemy.MOD_ID);
    }
}