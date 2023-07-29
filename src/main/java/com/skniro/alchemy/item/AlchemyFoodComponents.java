package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlchemyFoodComponents {
    private static Item registerItem(String name,Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Alchemy.MOD_ID, name),item);
    }
    public static void registerMapleFoodItems() {
        Alchemy.LOGGER.info("Registering Alchemy Food Items for " + Alchemy.MOD_ID);
    }
}
