package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemyItems {
    public static final Item Salt = registerItem("salt",new Item(new Item.Settings()));
    public static final Item Arknite = registerItem("arknite",new Item(new Item.Settings()));
    //圣石
    public static final Item Septrin = registerItem("septrin",new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Alchemy.LOGGER.info("Registering Mod Items for " + Alchemy.MOD_ID);
    }
}