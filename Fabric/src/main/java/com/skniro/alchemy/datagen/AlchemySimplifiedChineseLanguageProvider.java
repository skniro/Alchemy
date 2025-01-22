package com.skniro.alchemy.datagen;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.*;
import com.skniro.alchemy.item.AlchemyCuriosItems;
import com.skniro.alchemy.item.AlchemyFoodComponents;
import com.skniro.alchemy.item.AlchemyItems;
import com.skniro.alchemy.item.AlchemyOreItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class AlchemySimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public AlchemySimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
            //Maple
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_PLANKS,"枫木木板");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_LOG,"枫树原木");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_WOOD,"枫树木");
            translationBuilder.add(AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD,"去皮枫树木");
            translationBuilder.add(AlchemyMapleBlocks.STRIPPED_MAPLE_LOG,"去皮枫树原木");
            translationBuilder.add(AlchemyMapleBlocks.RED_MAPLE_LEAVES,"红枫枫树叶");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_DOOR,"枫木门");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_BUTTON,"枫木按钮");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_FENCE,"枫木栏杆");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_FENCE_GATE,"枫木栏杆门");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_SLAB,"枫木台阶");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_STAIRS,"枫木楼梯");
            translationBuilder.add(AlchemyMapleBlocks.RED_MAPLE_SAPLING,"红枫枫木树苗");
            translationBuilder.add(AlchemyMapleBlocks.POTTED_RED_MAPLE_SAPLING,"枫木树苗盆栽");
            translationBuilder.add(AlchemySignBlocks.Maple_SIGN,"枫木告示牌");
            translationBuilder.add(AlchemySignBlocks.Maple_HANGING_SIGN,"悬挂式枫木告示牌");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_TRAPDOOR,"枫木活版门");
            translationBuilder.add(AlchemyMapleBlocks.MAPLE_PRESSURE_PLATE,"枫木压力板");
            translationBuilder.add(AlchemyMapleBlocks.RED_MAPLE_CARPET,"红枫落叶");
            translationBuilder.add(AlchemyItems.MAPLE_BARK,"枫树皮");


            //PALMA
            translationBuilder.add(AlchemyPalmaBlocks.PALMA_WOOD,"帕尔马木");

            //史莱姆球
            translationBuilder.add(AlchemyItems.PUNI_PUNI_BALL_BLUE,"噗尼噗尼珠·蓝");
            translationBuilder.add(AlchemyItems.PUNI_PUNI_BALL_GREEN,"噗尼噗尼珠·绿");
            translationBuilder.add(AlchemyItems.PUNI_PUNI_BALL_RED,"噗尼噗尼珠·红");
            translationBuilder.add(AlchemyItems.PUNI_PUNI_BALL_BLACK,"噗尼噗尼珠·黑");
            translationBuilder.add(AlchemyItems.PUNI_PUNI_BALL_SILVER,"噗尼噗尼珠·银");
            translationBuilder.add(AlchemyItems.PUNI_PUNI_BALL_GOLD,"噗尼噗尼珠·金");


            //ITEM GROUP
            translationBuilder.add(Alchemy.Alchemy_Group,"Alchemy");

            //Sakura


            //Ore
            translationBuilder.add(AlchemyOreBlocks.DEEPSLATE_Salt_Ore,"深板岩盐矿石");
            translationBuilder.add(AlchemyOreBlocks.Salt_Ore,"盐矿石");
            translationBuilder.add(AlchemyOreItems.Crimson,"赤热矿");
            translationBuilder.add(AlchemyOreItems.Hematite,"赤铁矿");
            translationBuilder.add(AlchemyOreBlocks.AZURITE_ORE,"海蓝石矿");

            //Crop

            //Food Materials
            translationBuilder.add(AlchemyFoodComponents.PALMA_FRUIT,"帕尔马果实");
            translationBuilder.add(AlchemyOreItems.Salt,"盐");
            translationBuilder.add(AlchemyFoodComponents.KARMINE_FRUIT,"卡明果实");

            //Food
            //Boat

            translationBuilder.add(AlchemyItems.PlantEssence,"植物精华");
            translationBuilder.add(AlchemyItems.NamelessGrass,"无名草");
            translationBuilder.add(AlchemyItems.EtherAqua,"以太水");
            translationBuilder.add(AlchemyItems.ScorchedGrass,"焦草");
            translationBuilder.add(AlchemyItems.LuckyClover,"幸运四叶草");
            translationBuilder.add(AlchemyItems.PoisonEater,"食毒草");
            translationBuilder.add(AlchemyItems.WasserWheat,"瓦塞麦");
            translationBuilder.add(AlchemyItems.MapleLeaf,"枫叶");
            translationBuilder.add(AlchemyItems.SweetLeaf,"甜叶");
            translationBuilder.add(AlchemyItems.RoseLeaf,"玫瑰叶");
            translationBuilder.add(AlchemyItems.AncientBranch,"古树枝");


            // Sea Urchins
            translationBuilder.add(AlchemyItems.SeaUrchin,"海胆（素材）");
            translationBuilder.add(AlchemyItems.SILVER_SEA_URCHIN,"银海胆");
            translationBuilder.add(AlchemyItems.GOLDEN_SEA_URCHIN,"黄金海胆");

            // Flowers
            translationBuilder.add(AlchemyItems.FORGET_ME_NOT,"忘忧花");
            translationBuilder.add(AlchemyItems.NORTH_WIND_FLOWER,"北风之花");
            translationBuilder.add(AlchemyItems.NIGHTGLOW_FLOWER,"夜光花");
            translationBuilder.add(AlchemyItems.Sun_Nectar_Flower,"阳气蜜花");
            translationBuilder.add(AlchemyItems.Blessed_Clear_Flower,"祝福清花");
            translationBuilder.add(AlchemyItems.Reminiscence_Mist_Flower,"追忆雾花");
            translationBuilder.add(AlchemyItems.Silent_Moonflower,"静寂月花");
            translationBuilder.add(AlchemyItems.Tranquil_Flower,"宁静花");
            translationBuilder.add(AlchemyItems.Clear_Water_White_Princess,"清水白姬");
            translationBuilder.add(AlchemyItems.DOLPHIN_ROSE,"德尔福玫瑰");

            // Grass, Herbs, and Leaves
            translationBuilder.add(AlchemyItems.LANTERN_GRASS,"灯笼草");
            translationBuilder.add(AlchemyItems.SOAP_GRASS,"肥皂草");
            translationBuilder.add(AlchemyItems.Aether_Grass,"艾思草");

            translationBuilder.add(AlchemyItems.HERB,"药草");
            translationBuilder.add(AlchemyItems.LONG_NECK_GRASS,"长颈通草");
            translationBuilder.add(AlchemyItems.MUTANT_PLANT,"变异草");
            translationBuilder.add(AlchemyItems.THREE_SEED_GRASS,"三子草");
            translationBuilder.add(AlchemyItems.RED_GRASS,"红草");
            translationBuilder.add(AlchemyItems.BITTER_ROOT,"苦根");
            translationBuilder.add(AlchemyItems.SAPLING_BRANCHES,"幼树枝叶");
            translationBuilder.add(AlchemyItems.RICH_SOIL,"肥土");
            translationBuilder.add(AlchemyItems.MEDICINE_BONE,"中药骨");

            translationBuilder.add(AlchemyItems.DECAYED_BARK,"朽木树皮");
            translationBuilder.add(AlchemyItems.WAILING_GROANS,"怨嗟悲鸣");
            translationBuilder.add(AlchemyItems.MUSHROOM_SPORES,"蘑菇孢子");
            translationBuilder.add(AlchemyItems.DEATHS_SIGH,"死亡叹息");
            translationBuilder.add(AlchemyItems.FOREST_WISDOM_GRASS,"森林智草");
            translationBuilder.add(AlchemyItems.NIGHT_FLOWER,"一夜花");
            translationBuilder.add(AlchemyItems.SOFT_SAND,"软砂");
            translationBuilder.add(AlchemyItems.FLAMMABLE_SAND,"可燃之砂");
            translationBuilder.add(AlchemyItems.WHITE_ASH_SAND,"白灰砂");
            translationBuilder.add(AlchemyItems.POLLUTED_DEAD_LEAF_SOIL,"受污染的腐叶土");;
            translationBuilder.add(AlchemyItems.EMERALD_GLASS,"翡翠玻璃");
            translationBuilder.add(AlchemyItems.SANDSTONE,"砂石");
            translationBuilder.add(AlchemyItems.WEATHERED_STONE,"风化石材");
            translationBuilder.add(AlchemyItems.ANCIENT_PILLAR,"古代石柱");
            translationBuilder.add(AlchemyItems.CORAL_STONE,"珊瑚石");
            translationBuilder.add(AlchemyItems.CAVE_CORAL,"洞窟珊瑚");
            translationBuilder.add(AlchemyItems.RIVER_STONE,"河石");
            translationBuilder.add(AlchemyItems.RIVER_STONE_BLAZE,"河石·苍炎");
            translationBuilder.add(AlchemyItems.STALACTITE_FRAGMENT,"钟乳石碎片");
            translationBuilder.add(AlchemyItems.SPIRIT_WHITE_ROCK,"白灵岩");
            translationBuilder.add(AlchemyOreBlocks.PAINT_NIGHTSTONE,"派恩特夜石");
            translationBuilder.add(AlchemyOreBlocks.MOLDY_NIGHTSTONE,"毛尔迪夜石");
            translationBuilder.add(AlchemyOreBlocks.GORDY_NIGHTSTONE,"戈尔迪夜石");
            translationBuilder.add(AlchemyItems.COMET_ROCK,"彗星岩");
            translationBuilder.add(AlchemyOreItems.CREATION_REVERSE_STONE,"创生逆石");
            translationBuilder.add(AlchemyItems.SMALL_CRYSTAL,"小晶石");
            translationBuilder.add(AlchemyItems.UNKNOWN_ORE,"未知的原石");
            translationBuilder.add(AlchemyItems.GREAT_WHITE_PEARL,"大贝白玉");
            translationBuilder.add(AlchemyItems.STRIPED_STONE,"斑石");;
            translationBuilder.add(AlchemyItems.AMBER_FRAGMENT,"琥珀碎片");
            translationBuilder.add(AlchemyItems.AMBER_CRYSTAL,"琥珀水晶");
            translationBuilder.add(AlchemyItems.MAGNETIC_MARBLE,"磁性大理石");
            translationBuilder.add(AlchemyItems.HOLY_TREE_CRYSTAL,"圣树结晶");
            translationBuilder.add(AlchemyItems.DRIED_WOOD_CHIP,"干燥木屑");
            translationBuilder.add(AlchemyItems.BLACK_FLAME_SAND,"焰之黑砂");
            translationBuilder.add(AlchemyItems.MAGMA_POWDER,"岩浆粉");
            translationBuilder.add(AlchemyItems.PAPER_SCRAP,"纸屑");
            translationBuilder.add(AlchemyItems.FLAMMABLE_BARK,"易燃树皮");
            translationBuilder.add(AlchemyItems.PALM_BARK,"帕尔马树皮");
            translationBuilder.add(AlchemyItems.NATURAL_OIL,"天然油");
            translationBuilder.add(AlchemyItems.WHITE_SMOKE_CHARCOAL,"白烟炭");
            translationBuilder.add(AlchemyItems.PALM_BLACK_CHARCOAL,"帕尔马黑炭");
            translationBuilder.add(AlchemyItems.WILD_POTATO,"野生土豆");
            translationBuilder.add(AlchemyItems.BEAST_MEAT,"兽肉");
            translationBuilder.add(AlchemyItems.FRESH_MEAT,"新鲜的肉");
            translationBuilder.add(AlchemyItems.KUKEN_FRUIT,"库肯果");
            translationBuilder.add(AlchemyItems.UNKNOWN_EGG,"不知名的蛋");
            translationBuilder.add(AlchemyItems.SEVEN_COLORED_GRAPE,"七色葡萄");

            translationBuilder.add(AlchemyItems.BERRY,"莓果");
            translationBuilder.add(AlchemyItems.OIL_TREE_FRUIT,"油木果实");
            translationBuilder.add(AlchemyItems.DEW_FRUIT,"甘露果实");
            translationBuilder.add(AlchemyItems.OAK_MUSHROOM,"橡树菇");
            translationBuilder.add(AlchemyItems.DREAM_MUSHROOM,"做梦蘑菇");
            translationBuilder.add(AlchemyItems.CLUSTER_MUSHROOM,"群生蘑菇");
            translationBuilder.add(AlchemyItems.JUPITER_TOOTH_MUSHROOM,"尤皮特齿菇");
            translationBuilder.add(AlchemyCuriosItems.GOLDEN_CROWN,"金色王冠");
            translationBuilder.add(AlchemyItems.BEAUTIFUL_SHELL,"美丽贝壳");
            translationBuilder.add(AlchemyItems.SARDINE,"沙丁鱼");
            translationBuilder.add(AlchemyItems.JIANG_LONG_FISH,"江龙鱼");
            translationBuilder.add(AlchemyItems.SPIKY_FISH,"1");;
            translationBuilder.add(AlchemyItems.YELLOW_TAIL_FISH,"黄尾鱼");
            translationBuilder.add(AlchemyItems.SHRUB_CRAB,"灌木蟹");
            translationBuilder.add(AlchemyItems.CAP_CRAB,"帽蟹");
            translationBuilder.add(AlchemyItems.SHARP_NOSE_FISH,"尖嘴刺鱼");
            translationBuilder.add(AlchemyItems.HAMMERFISH,"钉锤鱼");
            translationBuilder.add(AlchemyItems.ANCIENT_FISH,"万年鱼");
            translationBuilder.add(AlchemyItems.LAKE_MASTER,"湖底之主");
            translationBuilder.add(AlchemyItems.OTHERWORLD_MASTER,"异界之主");
            translationBuilder.add(AlchemyItems.SEVEN_STAR_BUG ,"七星虫");
            translationBuilder.add(AlchemyItems.HONEY_ANT,"蜜蚁");
            translationBuilder.add(AlchemyItems.LANTERN_FIREFLY,"灯笼萤火虫");
            translationBuilder.add(AlchemyItems.ROSE_BEE,"玫瑰蜂");
            translationBuilder.add(AlchemyItems.BEETLE,"甲虫（采集物）");
            translationBuilder.add(AlchemyItems.BLAZING_DRAGONFLY,"炎烧蜻蜓");
            translationBuilder.add(AlchemyItems.SPEAR_WORM,"矛线虫");
            translationBuilder.add(AlchemyItems.AMBER_FLY,"琥珀飞虫");
            translationBuilder.add(AlchemyItems.NAPIS_BUTTERFLY,"娜匹斯蝶");
            translationBuilder.add(AlchemyItems.YOUNG_RAINBOW_WORM,"幼虹虫");
            translationBuilder.add(AlchemyItems.TRIANGLE_BEETLE,"三角甲虫");
            translationBuilder.add(AlchemyItems.HARDENED_SPIDER_SILK,"钢化蛛丝");
            translationBuilder.add(AlchemyItems.STRONG_VINE,"强韧藤蔓");
            translationBuilder.add(AlchemyItems.WOOLLY_GRASS,"绵毛草");
            translationBuilder.add(AlchemyItems.GIANT_IVY,"大树常春藤");
            translationBuilder.add(AlchemyItems.STURDY_LOG,"结实的圆木");
            translationBuilder.add(AlchemyItems.MOSSY_DRIFTWOOD,"长苔藓的流木");
            translationBuilder.add(AlchemyItems.FOSSIL_TREE,"化石树");
            translationBuilder.add(AlchemyItems.HONEY_WOOD,"香蜜木");
            translationBuilder.add(AlchemyItems.OTHERWORLD_ROTTEN_WOOD,"异界朽木");
            translationBuilder.add(AlchemyItems.HOLY_TREE_BIG_BRANCH,"圣树大枝");
            translationBuilder.add(AlchemyItems.WINGED_LEAF_GRASS,"翼叶草");
            translationBuilder.add(AlchemyItems.SKY_BUBBLE,"天空泡沫");
            translationBuilder.add(AlchemyItems.SCORCH_MUSHROOM,"焦菇");
            translationBuilder.add(AlchemyItems.ROTTEN_WOOD_POISON_MIST,"朽木毒雾");

            translationBuilder.add(AlchemyItems.LARGE_FEATHER,"大片羽毛");
            translationBuilder.add(AlchemyItems.ANIMAL_FUR,"动物毛皮");
            translationBuilder.add(AlchemyItems.FANTASY_BEAST_FUR,"幻兽毛皮");
            translationBuilder.add(AlchemyItems.LARGE_BONE,"大骨");
            translationBuilder.add(AlchemyItems.SNAKE_SHEATH,"蛇蜕");
            translationBuilder.add(AlchemyItems.GIANT_BEAST_FOSSIL,"巨兽化石");
            translationBuilder.add(AlchemyItems.MAGIC_STONE_FRAGMENT,"魔石碎片");
            translationBuilder.add(AlchemyItems.DARK_CRYSTAL_FRAGMENT,"暗水晶碎片");
            translationBuilder.add(AlchemyItems.HOLY_STONE_FRAGMENT,"圣石碎片");
            translationBuilder.add(AlchemyItems.MAGIC_BOOK_PAGE,"魔导书残页");
            translationBuilder.add(AlchemyItems.OLD_MAGIC_BOOK,"陈旧的魔导书");
            translationBuilder.add(AlchemyItems.OTHERWORLD_CORE,"异界之核");
            translationBuilder.add(AlchemyItems.HOLY_TREE_LEAF,"圣树叶");
            translationBuilder.add(AlchemyItems.HONEY_WOOD_BRANCH,"蜜木枝");
            translationBuilder.add(AlchemyItems.SPIRIT_FLOWER,"精神之花");
            translationBuilder.add(AlchemyItems.SPIRIT_FEATHER,"精神之羽");
            translationBuilder.add(AlchemyItems.RUSTED_SWORD,"Rusty Sword");




            // Other Materials
            translationBuilder.add(AlchemyItems.BEE_HIVE,"蜂巢（采集物）");
            translationBuilder.add(AlchemyItems.GOLDEN_BEE_HIVE,"金色蜂巢");




        try {
                Path existingFilePath = dataOutput.getModContainer().findPath("assets/alchemy/lang/zh_cn.existing.json").get();
                translationBuilder.add(existingFilePath);
        } catch (Exception e) {
                throw new RuntimeException("Failed to add existing language file!", e);
        }
    }
}
