package com.skniro.alchemy.mixin;

import com.skniro.alchemy.entity.boat.AlchemyBoatType;
import com.skniro.alchemy.item.AlchemyBoatItems;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

//CREDIT TO nyuppo/fabric-boat-example ON GITHUB

@Mixin(ChestBoatEntity.class)
public class ChestBoatDropsMixin {
    @Inject(method = "asItem", at = @At("HEAD"), cancellable = true)
    public void asItem(CallbackInfoReturnable<Item> ci) {
        if (((BoatEntity)(Object)this).getVariant() == AlchemyBoatType.MAPLE) {
            ci.setReturnValue(AlchemyBoatItems.MAPLE_CHEST_BOAT);
        }else if (((BoatEntity)(Object)this).getVariant() == AlchemyBoatType.Palma) {
            ci.setReturnValue(AlchemyBoatItems.Palma_CHEST_BOAT);
        }
    }
}
