package com.skniro.alchemy.mixin.api;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.api.registry.AlchemyStrippableDropRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(AxeItem.class)
public abstract class AxeItemStrippableDropMixin {

    @Inject(method = "useOnBlock", at = @At("HEAD"), cancellable = true)
    private void dropCustomItems(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();
        BlockState blockState = world.getBlockState(pos);

        Optional<ItemStack> optionalDrop = AlchemyStrippableDropRegistry.getDrop(blockState.getBlock());
        if (optionalDrop.isPresent()) {
            Block.dropStack(world, pos, optionalDrop.get());
            Alchemy.LOGGER.debug("Dropping custom item: " + optionalDrop.get());
        }
    }
}