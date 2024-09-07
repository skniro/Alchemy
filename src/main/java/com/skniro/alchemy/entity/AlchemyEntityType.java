package com.skniro.alchemy.entity;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.entity.customnpc.AlchemyCustomNPCEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
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
}