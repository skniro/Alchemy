package com.skniro.alchemy.tag;

import com.skniro.alchemy.Alchemy;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlchemyItemTags {
    public static final TagKey<Item> BOOKSHELF_BOOKS = of("bookshelf_books");
    public static final TagKey<Item> HANGING_SIGNS = of("hanging_signs");

    private static TagKey<Item> of(String id) {
        return TagKey.of(Registry.ITEM_KEY, new Identifier(Alchemy.MOD_ID,id));
    }
}
