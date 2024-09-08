package com.skniro.alchemy.block.entity;

import com.skniro.alchemy.block.init.AlchemyBlockSetType;
import com.skniro.alchemy.mixin.SignTypeAccessor;
import net.minecraft.block.WoodType;

public class AlchemySignTypes {
    public static final WoodType MAPLE =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("alchemy_maple", AlchemyBlockSetType.MAPLE));

    public static final WoodType GINKGO =
            SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("alchemy_ginkgo", AlchemyBlockSetType.GINKGO));
}
