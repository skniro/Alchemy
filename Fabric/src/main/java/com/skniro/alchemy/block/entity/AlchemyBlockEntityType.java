package com.skniro.alchemy.block.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyBlocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;


public class AlchemyBlockEntityType {
    public static final BlockEntityType<Alchemyblockentity> ALCHEMY_BLOCK_ENTITY;

    static {
        ALCHEMY_BLOCK_ENTITY = create("alchemy_block", BlockEntityType.Builder.create(Alchemyblockentity::new, AlchemyBlocks.Alchemy_Block));

    }

    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return (BlockEntityType) Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Alchemy.MOD_ID,id), builder.build(null));
    }

    public static void registerMapleBlockEntityType() {
        Alchemy.LOGGER.debug("Registering MapleBlockEntityType for " + Alchemy.MOD_ID);
    }

}
