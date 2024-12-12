package com.skniro.alchemy.fluid;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.fluid.init.EmeraldBandFluid;
import com.skniro.alchemy.fluid.init.RotwaterMineralFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

    public class AlchemyFluids {

        public static final FlowableFluid STILL_EmeraldBand_WATER = registerFluid("emerald_band_water", new EmeraldBandFluid.Still());
        public static final FlowableFluid FLOWING_EmeraldBand_WATER = registerFluid("plowing_emerald_band_water", new EmeraldBandFluid.Flowing());
        public static final FlowableFluid STILL_RotwaterMineral_WATER = registerFluid("rotwater_mineral_water", new RotwaterMineralFluid.Still());
        public static final FlowableFluid FLOWING_RotwaterMineral_WATER = registerFluid("plowing_rotwater_mineral_water", new RotwaterMineralFluid.Flowing());



        private static FlowableFluid registerFluid(String name, FlowableFluid fluid) {
            return Registry.register(Registries.FLUID, new Identifier(Alchemy.MOD_ID, name), fluid);
        }
        public static void registerFluids() {
            Alchemy.LOGGER.info("Registering Alchemy Fluids for " + Alchemy.MOD_ID);
        }
    }

