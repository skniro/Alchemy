package com.skniro.alchemy.screen;

import com.skniro.alchemy.Alchemy;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class AlchemyScreenHandlerType <T extends ScreenHandler>{
    public static ScreenHandlerType<AlchemyBlockScreenHandler> ALCHEMY;

    public static void registeralchemyscreenhandlertype () {
        ALCHEMY = new ScreenHandlerType<>(AlchemyBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES);
    }
}
