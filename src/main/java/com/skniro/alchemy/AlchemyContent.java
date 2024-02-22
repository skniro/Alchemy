package com.skniro.alchemy;


import com.skniro.alchemy.block.entity.AlchemyBlockEntityType;
import com.skniro.alchemy.client.gui.screen.ingame.AlchemyBlockScreen;
import com.skniro.alchemy.fluid.ModFluids;
import com.skniro.alchemy.item.AlchemyFoodComponents;
import com.skniro.alchemy.item.AlchemyItems;
import com.skniro.alchemy.recipe.AlchemyRecipeType;
import com.skniro.alchemy.screen.AlchemyScreenHandlerType;
import com.skniro.alchemy.util.MapleFlammableBlocks;
import com.skniro.alchemy.util.MapleStrippableBlocks;
import com.skniro.alchemy.world.AlchemyConfiguredFeatures;
import com.skniro.alchemy.world.biome.MapleBiomeKeys;
import com.skniro.alchemy.world.gen.MapleTreeGeneration;
import com.skniro.alchemy.world.gen.ModOreGeneration;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;


public class AlchemyContent {


    public static void registerItem(){
        AlchemyItems.registerModItems();
        AlchemyFoodComponents.registerMapleFoodItems();
    }
    public static void registerBlock(){
        MapleFlammableBlocks.registerFlammableBlocks();
        MapleStrippableBlocks.registerStrippables();
    }

    public static void CreativeTab() {
    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        ModOreGeneration.generateOres();
        MapleBiomeKeys.registerBiome();
    }
    public static void registerMapleConfigured() {
        AlchemyConfiguredFeatures.registerConfiguredFeatures();
    }

    public static void registerType() {
        AlchemyRecipeType.registerRecipeType();
        AlchemyScreenHandlerType.registeralchemyscreenhandlertype();
        AlchemyBlockEntityType.registerMapleBlockEntityType();
    }


    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerforclient() {
        HandledScreens.register(AlchemyScreenHandlerType.ALCHEMY, AlchemyBlockScreen::new);
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_PlantEssence_WATER, ModFluids.FLOWING_PlantEssence_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA59EE261
                ));

        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(),
                ModFluids.STILL_PlantEssence_WATER, ModFluids.FLOWING_PlantEssence_WATER);
    }

}

