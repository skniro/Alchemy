package com.skniro.alchemy.entity.customnpc;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class AlchemyCustomNPCEntity extends PathAwareEntity {

    public AlchemyCustomNPCEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // 类似村民的行为
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(2, new WanderAroundGoal(this, 1.0));
        this.goalSelector.add(3, new LookAroundGoal(this));
    }

    public static DefaultAttributeContainer.Builder createMobAttributes() {
        return PathAwareEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3D)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D);
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        // NPC交互
        if (this.getWorld().isClient) {
           // player.playSound(SoundEvents.ENTITY_VILLAGER_TRADE, 1.0F, 1.0F);
        }
        return ActionResult.SUCCESS;
    }
}