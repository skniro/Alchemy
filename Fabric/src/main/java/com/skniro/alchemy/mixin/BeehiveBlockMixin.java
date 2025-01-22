package com.skniro.alchemy.mixin;

import com.skniro.alchemy.item.AlchemyItems;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BeehiveBlock.class)
public class BeehiveBlockMixin {
    @Inject(method = "dropHoneycomb", at = @At("HEAD"), cancellable = true)
    private static void modifyHoneycombDrop(World world, BlockPos pos, CallbackInfo ci) {
        if (world.random.nextFloat() < 0.05F) {
            Block.dropStack(world, pos, new ItemStack(AlchemyItems.GOLDEN_Honeycomb,1));
        }

        if(world.random.nextFloat() < 0.1F){
            Block.dropStack(world, pos, new ItemStack(AlchemyItems.Silver_Honeycomb,1));
        }
    }
}