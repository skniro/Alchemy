package com.skniro.alchemy.util;

import net.minecraft.nbt.NbtCompound;
public interface IEntityDataSaver {
    NbtCompound getPersistentData();
}