package com.skniro.alchemy.state.property;

import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;

public class AlchemyProperties {
    public static final IntProperty FLOWER_AMOUNT;
    public static final BooleanProperty SLOT_0_OCCUPIED;
    public static final BooleanProperty SLOT_1_OCCUPIED;
    public static final BooleanProperty SLOT_2_OCCUPIED;
    public static final BooleanProperty SLOT_3_OCCUPIED;
    public static final BooleanProperty SLOT_4_OCCUPIED;
    public static final BooleanProperty SLOT_5_OCCUPIED;
    public static final BooleanProperty HAS_ALCHEMY_0 ;
    public static final BooleanProperty HAS_ALCHEMY_1;
    public static final BooleanProperty HAS_ALCHEMY_2;
    public static final BooleanProperty HAS_ALCHEMY_3;
    public static final BooleanProperty HAS_ALCHEMY_4;



    static {
        FLOWER_AMOUNT = IntProperty.of("flower_amount", 1, 4);
        SLOT_0_OCCUPIED = BooleanProperty.of("slot_0_occupied");
        SLOT_1_OCCUPIED = BooleanProperty.of("slot_1_occupied");
        SLOT_2_OCCUPIED = BooleanProperty.of("slot_2_occupied");
        SLOT_3_OCCUPIED = BooleanProperty.of("slot_3_occupied");
        SLOT_4_OCCUPIED = BooleanProperty.of("slot_4_occupied");
        SLOT_5_OCCUPIED = BooleanProperty.of("slot_5_occupied");
        HAS_ALCHEMY_4 = BooleanProperty.of("has_alchemy_4");
        HAS_ALCHEMY_3 = BooleanProperty.of("has_alchemy_3");
        HAS_ALCHEMY_2 = BooleanProperty.of("has_alchemy_2");
        HAS_ALCHEMY_1 = BooleanProperty.of("has_alchemy_1");
        HAS_ALCHEMY_0 = BooleanProperty.of("has_alchemy_0");
    }
}
