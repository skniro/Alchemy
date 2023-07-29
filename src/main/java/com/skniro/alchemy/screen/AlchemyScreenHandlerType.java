package com.skniro.alchemy.screen;

import com.skniro.alchemy.Alchemy;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AlchemyScreenHandlerType <T extends ScreenHandler>{
    public static ScreenHandlerType<AlchemyBlockScreenHandler> ALCHEMY;



    private final ScreenHandlerType.Factory<T> factory;
    private static <T extends ScreenHandler> ScreenHandlerType<T> register(String id, ScreenHandlerType.Factory<T> factory) {
        return (ScreenHandlerType) Registry.register(Registry.SCREEN_HANDLER, new Identifier(Alchemy.MOD_ID,id), new ScreenHandlerType(factory));
    }

    public AlchemyScreenHandlerType(ScreenHandlerType.Factory<T> factory) {
        this.factory = factory;
    }

    public T create(int syncId, PlayerInventory playerInventory) {
        return this.factory.create(syncId, playerInventory);
    }

    public interface Factory<T extends ScreenHandler> {
        T create(int syncId, PlayerInventory playerInventory);
    }

    public static void registeralchemyscreenhandlertype () {
        ALCHEMY = new ScreenHandlerType<>(AlchemyBlockScreenHandler::new);
    }
}
