package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlchemyItems {

    //Food Materials
    public static final Item Salt = registerItem("salt",new Item(new Item.Settings().group(Alchemy.Alchemy_Group_Food)));


    //Tools

    //Seed

    //Boat

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Alchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Alchemy.LOGGER.info("Registering Mod Items for " + Alchemy.MOD_ID);
    }
}