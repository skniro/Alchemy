package com.skniro.alchemy.registry.tag;

import com.skniro.alchemy.Alchemy;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class AlchemyItemTags {
    public static final TagKey<Item> Tool1 = of("growfluid");



    private static TagKey<Item> of(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Alchemy.MOD_ID ,id));
    }
}
