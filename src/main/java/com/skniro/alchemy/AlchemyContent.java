package com.skniro.alchemy;


import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.block.entity.AlchemyBlockEntityType;
import com.skniro.alchemy.client.gui.screen.ingame.AlchemyBlockScreen;
import com.skniro.alchemy.entity.customnpc.AlchemyCustomNPCEntity;
import com.skniro.alchemy.entity.client.render.entity.AlchemyCustomNPCRenderer;
import com.skniro.alchemy.entity.AlchemyEntityType;
import com.skniro.alchemy.fluid.AlchemyFluidBlocks;
import com.skniro.alchemy.fluid.AlchemyFluidItems;
import com.skniro.alchemy.fluid.AlchemyFluids;
import com.skniro.alchemy.item.AlchemyFoodComponents;
import com.skniro.alchemy.item.AlchemyItems;
import com.skniro.alchemy.recipe.AlchemyRecipeType;
import com.skniro.alchemy.screen.AlchemyScreenHandlerType;
import com.skniro.alchemy.util.AlchemyFlammableBlocks;
import com.skniro.alchemy.util.AlchemyStrippableBlocks;
import com.skniro.alchemy.world.gen.MapleTreeGeneration;
import com.skniro.alchemy.world.gen.ModOreGeneration;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.skniro.alchemy.Alchemy.Alchemy_Group;


public class AlchemyContent {


    public static void registerItem(){
        AlchemyItems.registerModItems();
        AlchemyFoodComponents.registerMapleFoodItems();
    }
    public static void registerBlock(){
        AlchemyFlammableBlocks.registerFlammableBlocks();
        AlchemyStrippableBlocks.registerStrippables();
        AlchemyBlocks.registerAlchemyBlocks();
        AlchemyOreBlocks.registerAlchemyExperienceDroppingBlocks();
    }

    public static void registerFluid(){
        AlchemyFluids.registerFluids();
        AlchemyFluidBlocks.registerFluidBlocks();
        AlchemyFluidItems.registerFluidsItems();
    }

    public static void generateWorldGen() {
        MapleTreeGeneration.generateTrees();
        ModOreGeneration.generateOres();
    }

    public static void registerType() {
        AlchemyRecipeType.registerRecipeType();
        AlchemyScreenHandlerType.registeralchemyscreenhandlertype();
        AlchemyBlockEntityType.registerMapleBlockEntityType();
    }

    public static void registerItemGroup() {
        Registry.register(Registries.ITEM_GROUP, Alchemy_Group, FabricItemGroup.builder()
                .icon(() -> new ItemStack(Items.STONE))
                .displayName(Text.translatable("itemGroup.alchemy.alchemy_group"))
                .build()); // build() no longer registers by itself

        ItemGroupEvents.modifyEntriesEvent(Alchemy_Group).register(content -> {
            //Entity Block
            content.add(AlchemyBlocks.Alchemy_Block);

            //Ore
            content.add(AlchemyOreBlocks.Crimson_ore);

            //Items
            content.add(AlchemyItems.Salt);
            content.add(AlchemyItems.Arknite);
            content.add(AlchemyItems.Septrin);
            content.add(AlchemyItems.Test_Tool);

            //Fluids
            content.add(AlchemyFluidItems.PlantEssence_BUCKET);
        });
    }
    public static void registerEntityAttribute() {
        FabricDefaultAttributeRegistry.register(AlchemyEntityType.HimegiAgeha, AlchemyCustomNPCEntity.createMobAttributes());
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerForClient() {
        registerFluidRenderForClient();
        registerBlockRenderForClient();
        registerEntityForClient();
        registerScreenForClient();
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerFluidRenderForClient() {
        FluidRenderHandlerRegistry.INSTANCE.register(AlchemyFluids.STILL_PlantEssence_WATER, AlchemyFluids.FLOWING_PlantEssence_WATER,
                new SimpleFluidRenderHandler(
                        new Identifier("minecraft:block/water_still"),
                        new Identifier("minecraft:block/water_flow"),
                        0xA59EE261
                ));
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerBlockRenderForClient() {
        BlockRenderLayerMap.INSTANCE.putFluids(RenderLayer.getTranslucent(), AlchemyFluids.STILL_PlantEssence_WATER, AlchemyFluids.FLOWING_PlantEssence_WATER);
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerScreenForClient() {
        HandledScreens.register(AlchemyScreenHandlerType.ALCHEMY, AlchemyBlockScreen::new);
    }

    @net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
    public static void registerEntityForClient() {
        EntityRendererRegistry.register(AlchemyEntityType.HimegiAgeha, AlchemyCustomNPCRenderer::new);
    }

}

