package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class AlchemyFoodComponents {
    public static final Item PALMA_FRUIT = registerItem("palma_fruit",
            new Item(new Item
                    .Settings()
                    .rarity(Rarity.RARE)
                    .food
                            (new FoodComponent
                                    .Builder()
                                    .hunger(6)
                                    .saturationModifier(0.3f)
                                    .alwaysEdible()
/*                                    .statusEffect
                                            (new StatusEffectInstance(StatusEffects.POISON,
                                                            300,
                                                            0),
                                                    1.0F)*/
                                    .build()
                            )
    ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name),item);
    }
    public static void registerMapleFoodItems() {
        Alchemy.LOGGER.info("Registering Alchemy Food Items for " + Alchemy.MOD_ID);
    }
}
