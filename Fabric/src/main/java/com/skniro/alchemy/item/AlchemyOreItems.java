package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemyOreItems {
    //矿物
    public static final Item Salt = registerItem("salt",new Item(new Item.Settings()));
    public static final Item Arknite = registerItem("arknite",new Item(new Item.Settings()));
    public static final Item Crimson = registerItem("crimson",new Item(new Item.Settings()));
    public static final Item Hematite = registerItem("hematite",new Item(new Item.Settings()));
    public static final Item Septrin = registerItem("septrin",new Item(new Item.Settings()));
    public static final Item CREATION_REVERSE_STONE = registerItem("creation_reverse_stone", new Item(new Item.Settings()));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name),item);
    }


    public static void registerAlchemyOreItems() {
        Alchemy.LOGGER.info("Registering Alchemy Curios Items for " + Alchemy.MOD_ID);
    }
}
