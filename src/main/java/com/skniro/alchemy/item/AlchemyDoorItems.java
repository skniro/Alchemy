package com.skniro.alchemy.item;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.block.AlchemyPalmaBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.TallBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemyDoorItems {
    public static final Item MAPLE_DOOR = registerItem("maple_door",new TallBlockItem(AlchemyMapleBlocks.MAPLE_DOOR, new FabricItemSettings().maxCount(16)));
    public static final Item Palma_DOOR = registerItem("palma_door",new TallBlockItem(AlchemyPalmaBlocks.PALMA_DOOR, new FabricItemSettings().maxCount(16)));

    private static Item registerItem(String name,Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name),item);
    }
    public static void registerAlchemyDoorItems() {
        Alchemy.LOGGER.info("Registering Alchemy Door Items for " + Alchemy.MOD_ID);
    }
}
