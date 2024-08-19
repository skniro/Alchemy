package com.skniro.alchemy.fluid;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.fluid.init.PlantEssenceFluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

    public class AlchemyFluids {

        public static final FlowableFluid STILL_PlantEssence_WATER = registerFluid("plant_essence_water", new PlantEssenceFluid.Still());
        public static final FlowableFluid FLOWING_PlantEssence_WATER = registerFluid("plowing_plant_essence_water", new PlantEssenceFluid.Flowing());



        private static FlowableFluid registerFluid(String name, FlowableFluid fluid) {
            return Registry.register(Registries.FLUID, new Identifier(Alchemy.MOD_ID, name), fluid);
        }
        public static void registerFluids() {
            Alchemy.LOGGER.info("Registering Alchemy Fluids for " + Alchemy.MOD_ID);
        }
    }

