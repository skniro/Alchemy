package com.skniro.alchemy.client;

import com.skniro.alchemy.AlchemyContent;
import net.fabricmc.api.ClientModInitializer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class AlchemyClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        AlchemyContent.registerforclient();
    }
}
