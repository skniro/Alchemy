package com.skniro.alchemy.client.render.entity;

import com.skniro.alchemy.Alchemy;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.SlimeEntityRenderer;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class SliverSlimeEntityRenderer extends SlimeEntityRenderer {
    private static final Identifier TEXTURE = new Identifier(Alchemy.MOD_ID, "textures/entity/slime/sliver_slime.png");

    public SliverSlimeEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(SlimeEntity slimeEntity) {
        return TEXTURE;
    }
}