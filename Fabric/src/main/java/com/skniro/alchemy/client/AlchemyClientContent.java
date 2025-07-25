package com.skniro.alchemy.client;

import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.client.gui.screen.ingame.AlchemyBlockScreen;
import com.skniro.alchemy.client.render.entity.*;
import com.skniro.alchemy.entity.AlchemyEntityType;
import com.skniro.alchemy.fluid.AlchemyFluids;
import com.skniro.alchemy.screen.AlchemyScreenHandlerType;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class AlchemyClientContent {

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerForClient() {
        registerFluidRenderForClient();
        registerBlockRenderForClient();
        registerEntityForClient();
        registerScreenForClient();
        registerNetworkForClient();
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerFluidRenderForClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(AlchemyFluids.STILL_EmeraldBand_WATER, AlchemyFluids.FLOWING_EmeraldBand_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA59EE261
                ));
        FluidRenderHandlerRegistry.INSTANCE.register(AlchemyFluids.STILL_RotwaterMineral_WATER, AlchemyFluids.FLOWING_RotwaterMineral_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA59EE261
                ));
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerBlockRenderForClient() {
        RenderLayer renderLayer1 = RenderLayer.getCutout();
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.MAPLE_DOOR, renderLayer1);
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.MAPLE_TRAPDOOR, renderLayer1);
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyBlocks.Alchemy_Block, renderLayer1);

        RenderLayer renderLayer2 = RenderLayer.getCutoutMipped();
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.RED_MAPLE_CARPET, renderLayer2);


        RenderLayer renderLayer3 = RenderLayer.getCutout();
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.RED_MAPLE_LEAVES, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.RED_MAPLE_SAPLING, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyMapleBlocks.POTTED_RED_MAPLE_SAPLING, renderLayer3);
        BlockRenderLayerMap.INSTANCE.putBlock(AlchemyBlocks.BERRY_BUSH, renderLayer3);


        RenderLayer renderLayer4 = RenderLayer.getTranslucent();
        BlockRenderLayerMap.INSTANCE.putFluids(renderLayer4, AlchemyFluids.STILL_EmeraldBand_WATER, AlchemyFluids.FLOWING_EmeraldBand_WATER);
        BlockRenderLayerMap.INSTANCE.putFluids(renderLayer4, AlchemyFluids.FLOWING_RotwaterMineral_WATER, AlchemyFluids.FLOWING_RotwaterMineral_WATER);

    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerScreenForClient() {
        HandledScreens.register(AlchemyScreenHandlerType.ALCHEMY, AlchemyBlockScreen::new);
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerEntityForClient() {
        EntityRendererRegistry.register(AlchemyEntityType.HimegiAgeha, AlchemyCustomNPCRenderer::new);
        EntityRendererRegistry.register(AlchemyEntityType.BLUE_SLIME, BlueSlimeEntityRenderer::new);
        EntityRendererRegistry.register(AlchemyEntityType.BLACK_SLIME, BlackSlimeEntityRenderer::new);
        EntityRendererRegistry.register(AlchemyEntityType.GOLD_SLIME, GoldSlimeEntityRenderer::new);
        EntityRendererRegistry.register(AlchemyEntityType.RED_SLIME, RedSlimeEntityRenderer::new);
        EntityRendererRegistry.register(AlchemyEntityType.PINK_SLIME, PinkSlimeEntityRenderer::new);
        EntityRendererRegistry.register(AlchemyEntityType.Sliver_SLIME, SliverSlimeEntityRenderer::new);
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerNetworkForClient() {
    }

}
