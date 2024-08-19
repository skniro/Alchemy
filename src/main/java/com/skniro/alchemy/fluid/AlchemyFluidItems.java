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

public class AlchemyFluidItems {
    public static Item PlantEssence_BUCKET= registerItem("plant_essence_bucket",
            new BucketItem(AlchemyFluids.STILL_PlantEssence_WATER, new FabricItemSettings().recipeRemainder(Items.BUCKET).maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Alchemy.MOD_ID, name), item);
    }

    public static void registerFluidsItems() {
        Alchemy.LOGGER.info("Registering Alchemy Fluid Items for " + Alchemy.MOD_ID);
    }
}

