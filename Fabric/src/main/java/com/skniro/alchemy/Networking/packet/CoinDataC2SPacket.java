package com.skniro.alchemy.Networking.packet;

import com.skniro.alchemy.event.CoinData;
import com.skniro.alchemy.util.IEntityDataSaver;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayNetworkHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;

public class CoinDataC2SPacket {
    public static void receive(MinecraftServer server, ServerPlayerEntity player, ServerPlayNetworkHandler handler,
                               PacketByteBuf buf, PacketSender responseSender) {
          CoinData.syncCoin(((IEntityDataSaver) player).getPersistentData().getInt("coin"), player);
        }
    }