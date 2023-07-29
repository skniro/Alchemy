package com.skniro.alchemy.block.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyBlocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.minecraft.util.registry.Registry;


public class AlchemyBlockEntityType {
    public static final BlockEntityType<Alchemyblockentity> ALCHEMY_BLOCK_ENTITY;

    private static <T extends BlockEntity> BlockEntityType<T> create(String id, BlockEntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.BLOCK_ENTITY, id);
        return (BlockEntityType) Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Alchemy.MOD_ID,id), builder.build(null));
    }

    static {
        ALCHEMY_BLOCK_ENTITY = create("alchemy_block", BlockEntityType.Builder.create(Alchemyblockentity::new, AlchemyBlocks.Alchemy_Block));

    }

    public static void registerMapleBlockEntityType() {
        Alchemy.LOGGER.debug("Registering MapleBlockEntityType for " + Alchemy.MOD_ID);
    }

}
