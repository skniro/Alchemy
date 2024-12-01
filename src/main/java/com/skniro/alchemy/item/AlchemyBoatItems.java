package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.entity.boat.AlchemyBoatType;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemyBoatItems {
    //Boat
    public static final Item MAPLE_BOAT = registerItem("maple_boat", (new BoatItem(false, AlchemyBoatType.MAPLE, (new Item.Settings()).maxCount(1))));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat", (new BoatItem(true, AlchemyBoatType.MAPLE, (new Item.Settings()).maxCount(1))));
    public static final Item Palma_BOAT = registerItem("palma_boat", (new BoatItem(false, AlchemyBoatType.Palma, (new Item.Settings()).maxCount(1))));
    public static final Item Palma_CHEST_BOAT = registerItem("palma_chest_boat", (new BoatItem(true, AlchemyBoatType.Palma, (new Item.Settings()).maxCount(1))));


    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name),item);
    }

    public static void registerAlchemyBoatItems() {
        Alchemy.LOGGER.info("Registering Alchemy Boat Items for " + Alchemy.MOD_ID);
    }
}