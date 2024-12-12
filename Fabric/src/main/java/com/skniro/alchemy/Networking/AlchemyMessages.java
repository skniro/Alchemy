package com.skniro.alchemy.Networking;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.Networking.packet.CoinDataC2SPacket;
import com.skniro.alchemy.Networking.packet.CoinSyncDataS2CPacket;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.util.Identifier;

public class AlchemyMessages {
    public static final Identifier COIN_ID = new Identifier(Alchemy.MOD_ID, "coin_id");
    public static final Identifier COIN_SYNC_ID = new Identifier(Alchemy.MOD_ID, "coin_sync");

    public static void registerC2SPackets() {
        ServerPlayNetworking.registerGlobalReceiver(COIN_ID, CoinDataC2SPacket::receive);
    }

    public static void registerS2CPackets() {
        ClientPlayNetworking.registerGlobalReceiver(COIN_SYNC_ID, CoinSyncDataS2CPacket::receive);
    }
}