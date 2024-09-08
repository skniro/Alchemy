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

public class AlchemyFluidBlocks {

    public static final Block EmeraldBand_BLOCK = registerBlockWithoutItem("emerald_band_block",
            new FluidBlock(AlchemyFluids.STILL_EmeraldBand_WATER, FabricBlockSettings.copyOf(Blocks.WATER)){ });
    public static final Block RotwaterMineral_BLOCK = registerBlockWithoutItem("rotwater_mineral_block",
            new FluidBlock(AlchemyFluids.STILL_RotwaterMineral_WATER, FabricBlockSettings.copyOf(Blocks.WATER)){ });


    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Alchemy.MOD_ID, name), block);
    }
    public static void registerFluidBlocks() {
        Alchemy.LOGGER.info("Registering Alchemy Fluid Blocks for " + Alchemy.MOD_ID);
    }

}

