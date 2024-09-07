package com.skniro.alchemy.entity.client.render.entity;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.entity.customnpc.AlchemyCustomNPCEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.render.entity.model.PlayerEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class AlchemyCustomNPCRenderer extends MobEntityRenderer<AlchemyCustomNPCEntity, PlayerEntityModel<AlchemyCustomNPCEntity>> {
    private static final Identifier TEXTURE = new Identifier(Alchemy.MOD_ID, "textures/entity/himegiageha.png");

    public AlchemyCustomNPCRenderer(EntityRendererFactory.Context context) {
        super(context, new PlayerEntityModel<>(context.getPart(EntityModelLayers.PLAYER), true), 0.6f);
    }

    @Override
    public Identifier getTexture(AlchemyCustomNPCEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(AlchemyCustomNPCEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {

        matrixStack.scale(1f, 1f, 1f);

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}

