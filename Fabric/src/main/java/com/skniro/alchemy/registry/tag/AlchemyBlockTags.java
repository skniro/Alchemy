package com.skniro.alchemy.registry.tag;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.item.AlchemyItems;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class AlchemyBlockTags {
    public static final TagKey<Block> TEST_MINEABLE = of("test_mineable");


    private AlchemyBlockTags() {
    }

    private static TagKey<Block> of(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Alchemy.MOD_ID, name));
    }
}