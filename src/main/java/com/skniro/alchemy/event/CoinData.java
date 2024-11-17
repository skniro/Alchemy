package com.skniro.alchemy.event;

import com.skniro.alchemy.Networking.AlchemyMessages;
import com.skniro.alchemy.util.IEntityDataSaver;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;

public class CoinData {
    private static final String COIN_KEY = "coin";

    public static int getCoins(IEntityDataSaver player) {
        NbtCompound nbt = player.getPersistentData();
        int coin = nbt.getInt(COIN_KEY);
        syncCoin(coin, (ServerPlayerEntity) player);
        return coin;
    }

    public static void setCoins(IEntityDataSaver player, int amount) {
        NbtCompound nbt = player.getPersistentData();
        int coin = nbt.getInt(COIN_KEY);
        syncCoin(coin, (ServerPlayerEntity) player);
        nbt.putInt(COIN_KEY, amount);
    }

    public static void addCoins(IEntityDataSaver player, int amount) {
        setCoins(player, getCoins(player) + amount);
    }

    public static void removeCoins(IEntityDataSaver player, int amount) {
        setCoins(player, Math.max(0, getCoins(player) - amount));
    }

    public static void syncCoin(int coin, ServerPlayerEntity player) {
        PacketByteBuf buffer = PacketByteBufs.create();
        buffer.writeInt(coin);
        ServerPlayNetworking.send(player, AlchemyMessages.COIN_SYNC_ID, buffer);
    }
}