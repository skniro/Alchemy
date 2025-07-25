package com.skniro.alchemy.client;

import com.skniro.alchemy.AlchemyContent;
import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.client.gui.screen.ingame.AlchemyBlockScreen;
import com.skniro.alchemy.client.render.entity.*;
import com.skniro.alchemy.entity.AlchemyEntityType;
import com.skniro.alchemy.fluid.AlchemyFluids;
import com.skniro.alchemy.screen.AlchemyScreenHandlerType;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class AlchemyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AlchemyClientContent.registerForClient();
    }
}
