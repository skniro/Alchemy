package com.skniro.alchemy.item.init;

import com.skniro.alchemy.registry.tag.AlchemyBlockTags;
import net.minecraft.item.Item;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class AlchemyTestItem extends MiningToolItem {
    public AlchemyTestItem(ToolMaterial material, int attackDamage, float attackSpeed, Item.Settings settings) {
        super((float)attackDamage, attackSpeed, material, AlchemyBlockTags.TEST_MINEABLE, settings);
    }
}
