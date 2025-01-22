package com.skniro.alchemy.entity;

import com.mojang.datafixers.types.Type;
import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.entity.customnpc.AlchemyCustomNPCEntity;
import com.skniro.alchemy.entity.furniture.ChairEntity;
import com.skniro.alchemy.entity.slime.AlchemySlimeEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.datafixer.TypeReferences;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

public class AlchemyEntityType {
    public static final EntityType<AlchemyCustomNPCEntity> HimegiAgeha  = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "himegiageha"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, AlchemyCustomNPCEntity::new)
                    .dimensions(EntityDimensions.fixed(0.6F, 1.8F))
                    .build()
    );

    public static final EntityType<ChairEntity> CHAIR_ENTITY =
            register("chair_entity",  EntityType.Builder.create(ChairEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.5f, 0.5f));

    public static final EntityType<AlchemySlimeEntity> BLUE_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "blue_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(AlchemySlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .trackRangeBlocks(10)
                    .build()
    );

    public static final EntityType<AlchemySlimeEntity> PINK_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "pink_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(AlchemySlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .trackRangeBlocks(10)
                    .build()
    );

    public static final EntityType<AlchemySlimeEntity> RED_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "red_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(AlchemySlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .trackRangeBlocks(10)
                    .build()
    );

    public static final EntityType<AlchemySlimeEntity> BLACK_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "black_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(AlchemySlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .trackRangeBlocks(10)
                    .build()
    );

    public static final EntityType<AlchemySlimeEntity> Sliver_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "sliver_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(AlchemySlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .trackRangeBlocks(10)
                    .build()
    );

    public static final EntityType<AlchemySlimeEntity> GOLD_SLIME = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(Alchemy.MOD_ID, "gold_slime"),
            FabricEntityTypeBuilder.createMob()
                    .entityFactory(AlchemySlimeEntity::new)
                    .dimensions(EntityDimensions.fixed(2.04F, 2.04F))
                    .trackRangeBlocks(10)
                    .build()
    );

    private static <T extends Entity> EntityType<T> register(String name, EntityType.Builder<T> builder) {
        Type<?> type = Util.getChoiceType(TypeReferences.ENTITY, name);
        return (EntityType) Registry.register(Registries.ENTITY_TYPE, new Identifier(Alchemy.MOD_ID, name), builder.build(name));
    }
}