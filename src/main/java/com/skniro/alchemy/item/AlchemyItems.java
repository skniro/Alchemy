package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.item.init.AlchemyTestItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemyItems {
    public static final Item Salt = registerItem("salt",new Item(new Item.Settings()));
    public static final Item Arknite = registerItem("arknite",new Item(new Item.Settings()));
    //圣石
    public static final Item Septrin = registerItem("septrin",new Item(new Item.Settings()));


    public static final Item Test_Tool = registerItem("testtool",new AlchemyTestItem(ToolMaterials.IRON,5, 6.0F, new Item.Settings()));

    //能喝的
    public static final Item Goat_Milk = registerItem("goat_milk",new MilkBucketItem(new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Alchemy.LOGGER.info("Registering Mod Items for " + Alchemy.MOD_ID);
    }
}