package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemySignBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemySignItems {
    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            new SignItem(new FabricItemSettings().maxCount(16),
                    AlchemySignBlocks.Maple_SIGN, AlchemySignBlocks.Maple_WALL_SIGN));
    public static final Item Maple_HANGING_SIGN = registerItem("maple_hanging_sign", new HangingSignItem(
            AlchemySignBlocks.Maple_HANGING_SIGN, AlchemySignBlocks.Maple_WALL_HANGING_SIGN, new FabricItemSettings().maxCount(16)));


    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name),item);
    }
    public static void registerAlchemySignItems() {
        Alchemy.LOGGER.info("Registering Alchemy Sign Items for " + Alchemy.MOD_ID);
    }
}
