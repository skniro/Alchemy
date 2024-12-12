package com.skniro.alchemy.client;

import com.mojang.blaze3d.systems.RenderSystem;
import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.event.CoinData;
import com.skniro.alchemy.util.IEntityDataSaver;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.util.Identifier;

public class CoinHudOverlay implements HudRenderCallback {
    private static final Identifier Coin = new Identifier(Alchemy.MOD_ID,
            "textures/coin/coin.png");

    @Override
    public void onHudRender(DrawContext context, float tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.player == null) return;
        int width = client.getWindow().getScaledWidth();
        int height = client.getWindow().getScaledHeight();
        int x = width / 2 - 50;
        int y = height - 40;

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);

        int coins = ((IEntityDataSaver) MinecraftClient.getInstance().player).getPersistentData().getInt("coin");
        context.drawTexture(Coin, x - 20, y - 10, 0, 0, 16, 16, 16, 16);

        String coinText = "Coins: " + coins;
        context.drawText(client.textRenderer, coinText, x, y, 0xFFFF00, false);
    }
}