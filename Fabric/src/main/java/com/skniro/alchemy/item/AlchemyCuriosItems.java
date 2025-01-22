package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.item.init.trinket.AlchemyAglet;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemyCuriosItems {
    public static final Item GOLDEN_CROWN = registerItem("golden_crown", new AlchemyAglet(new Item.Settings()));



    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name),item);
    }


    public static void registerAlchemyCuriosItems() {
        Alchemy.LOGGER.info("Registering Alchemy Curios Items for " + Alchemy.MOD_ID);
    }
}
