package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlchemyItems {
    public static final Item Salt = registerItem("salt",new Item(new Item.Settings().group(Alchemy.Alchemy_Group_Food)));
    public static final Item Arknite = registerItem("arknite",new Item(new Item.Settings().group(Alchemy.Alchemy_Group)));
    //圣石
    public static final Item Septrin = registerItem("septrin",new Item(new Item.Settings().group(Alchemy.Alchemy_Group)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Alchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Alchemy.LOGGER.info("Registering Mod Items for " + Alchemy.MOD_ID);
    }
}