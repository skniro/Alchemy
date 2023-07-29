package com.skniro.alchemy.datagen;

import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.fluid.ModFluids;
import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class AlchemyModelProvider extends FabricModelProvider {
    public AlchemyModelProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){
        //Cube Block

        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.Salt_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.DEEPSLATE_Salt_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.Deepslate_arknite_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.Hematite_Ore);
        blockStateModelGenerator.registerCubeAllModelTexturePool(AlchemyOreBlocks.lightning_Ore);
        //LOG Block

        //Door

        //TRAPDOOR

        //SAPLING

        //Crop


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(AlchemyItems.Salt, Models.GENERATED);
        itemModelGenerator.register(ModFluids.PlantEssence_BUCKET, Models.GENERATED);
    }
}
