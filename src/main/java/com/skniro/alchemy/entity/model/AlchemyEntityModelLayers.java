package com.skniro.alchemy.entity.model;

import com.skniro.alchemy.Alchemy;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class AlchemyEntityModelLayers {
    public static final EntityModelLayer TEST =
            new EntityModelLayer(new Identifier(Alchemy.MOD_ID, "test"), "main");
}