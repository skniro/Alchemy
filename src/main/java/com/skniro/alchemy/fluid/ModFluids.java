package com.skniro.alchemy.fluid;

import com.skniro.alchemy.Alchemy;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

    public class ModFluids {
        public static FlowableFluid STILL_PlantEssence_WATER;
        public static FlowableFluid FLOWING_PlantEssence_WATER;
        public static Block PlantEssence_BLOCK;
        public static Item PlantEssence_BUCKET;

        public static void registerFluids() {
            STILL_PlantEssence_WATER = Registry.register(Registries.FLUID,
                    new Identifier(Alchemy.MOD_ID, "plant_essence_water"), new PlantEssenceFluid.Still());
            FLOWING_PlantEssence_WATER = Registry.register(Registries.FLUID,
                    new Identifier(Alchemy.MOD_ID, "plowing_plant_essence_water"), new PlantEssenceFluid.Flowing());

            PlantEssence_BLOCK = Registry.register(Registries.BLOCK, new Identifier(Alchemy.MOD_ID, "plant_essence_block"),
                    new FluidBlock(ModFluids.STILL_PlantEssence_WATER, FabricBlockSettings.copyOf(Blocks.WATER)){ });
            PlantEssence_BUCKET = Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, "plant_essence_bucket"),
                    new BucketItem(ModFluids.STILL_PlantEssence_WATER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));
        }
    }

