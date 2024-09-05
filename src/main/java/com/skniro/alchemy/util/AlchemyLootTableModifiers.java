package com.skniro.alchemy.util;

import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.util.Identifier;

public class AlchemyLootTableModifiers {
    private static final Identifier GRASS_BLOCK_ID
            = new Identifier("minecraft", "blocks/grass");
    private static final Identifier IGLOO_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier Mineshaft_STRUCTURE_CHEST_ID
            = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier Ancient_City_CHEST_ID
            = new Identifier("minecraft", "chests/ancient_city");
    private static final Identifier Bastion_Bridge_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_bridge");
    private static final Identifier Bastion_Hoglin_Stable_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_hoglin_stable");
    private static final Identifier Bastion_Other_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_other");
    private static final Identifier Bastion_Treasure_CHEST_ID
            = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier Buried_Treasure_CHEST_ID
            = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier End_City_Treasure_CHEST_ID
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier Desert_Pyramid_ID
            = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier Jungle_Temple_CHEST_ID
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier Jungle_Temple_Dispenser_CHEST_ID
            = new Identifier("minecraft", "chests/jungle_temple_dispenser");
    private static final Identifier Underwater_Ruin_Small_CHEST_ID
            = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier Underwater_Ruin_Big_CHEST_ID
            = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier Stronghold_Corridor_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier Stronghold_Crossing_CHEST_ID
            = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier Pillager_Outpost_CHEST_ID
            = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier Ruined_Portal_CHEST_ID
            = new Identifier("minecraft", "chests/ruined_portal");
    private static final Identifier Woodland_Mansion_CHEST_ID
            = new Identifier("minecraft", "chests/woodland_mansion");
    private static final Identifier Simple_Dungeon_CHEST_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier Nether_Bridge_CHEST_ID
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier Shipwreck_Map_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_map");
    private static final Identifier Shipwreck_Supply_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_supply");
    private static final Identifier Shipwreck_Treasure_CHEST_ID
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier CREEPER_ID
            = new Identifier("minecraft", "entities/creeper");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(GRASS_BLOCK_ID.equals(id)) {
                LootPool.Builder poolBuilder2 = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.35f))// Drops 35% of the time
                        .with(ItemEntry.builder(Items.IRON_HOE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 2.0f)).build());
                tableBuilder.pool(poolBuilder2.conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create().items(AlchemyItems.Test_Tool))).build());
            }
        });
    }
}