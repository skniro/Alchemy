package com.skniro.alchemy.registry.tag;

import com.skniro.alchemy.Alchemy;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class AlchemyFluidTags {
    public static final TagKey<Fluid> GrowFluid = of("growfluid");



    private static TagKey<Fluid> of(String id) {
        return TagKey.of(RegistryKeys.FLUID, Identifier.of(Alchemy.MOD_ID ,id));
    }
}
