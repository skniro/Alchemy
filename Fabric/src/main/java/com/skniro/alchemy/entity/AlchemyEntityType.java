package com.skniro.alchemy.entity;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.entity.customnpc.AlchemyCustomNPCEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class AlchemyEntityType {
    public static final EntityType<AlchemyCustomNPCEntity> HimegiAgeha  = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "himegiageha"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AlchemyCustomNPCEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6F, 1.8F))
                    .build()
    );

    public static final EntityType<SlimeEntity> BLUE_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "blue_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(SlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .build()
    );

    public static final EntityType<SlimeEntity> PINK_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "pink_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(SlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .build()
    );

    public static final EntityType<SlimeEntity> RED_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "red_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(SlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .build()
    );

    public static final EntityType<SlimeEntity> BLACK_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "black_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(SlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .build()
    );

    public static final EntityType<SlimeEntity> Sliver_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "sliver_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(SlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .build()
    );

    public static final EntityType<SlimeEntity> GOLD_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "gold_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(SlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .build()
    );

    public static final EntityType<SlimeEntity> GREEN_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "green_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(SlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .build()
    );
}