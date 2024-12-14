package com.skniro.alchemy.event;

import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.item.AlchemyItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AlchemyEventHandler {
    public static ActionResult MapleBarkDrop(PlayerEntity player, World world, Hand hand, BlockHitResult hitResult) {
        ItemStack heldItem = player.getStackInHand(hand);
        BlockPos pos = hitResult.getBlockPos();
        BlockState blockState = world.getBlockState(pos);

        if (world.isClient && !(heldItem.getItem() instanceof AxeItem)) {
            return ActionResult.PASS;
        }

        if (blockState.isOf(AlchemyMapleBlocks.MAPLE_LOG)) {
            if (world instanceof ServerWorld serverWorld) {
                Block.dropStack(serverWorld, pos, AlchemyItems.MAPLE_BARK.getDefaultStack());
            }
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}