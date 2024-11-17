package com.skniro.alchemy.command;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.skniro.alchemy.event.CoinData;
import com.skniro.alchemy.util.IEntityDataSaver;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

public class CoinCommand {
    public static void register() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("coin")

                .then(CommandManager.literal("get")
                    .executes(ctx -> {
                        ServerPlayerEntity player = ctx.getSource().getPlayer();
                        int coins = CoinData.getCoins((IEntityDataSaver) player);
                        ctx.getSource().sendFeedback(() -> Text.literal("Your coins: " + coins), false);
                        return coins;
                    })
                )

                .then(CommandManager.literal("add")
                    .then(CommandManager.argument("amount", IntegerArgumentType.integer(1))
                        .executes(ctx -> {
                            ServerPlayerEntity player = ctx.getSource().getPlayer();
                            int amount = IntegerArgumentType.getInteger(ctx, "amount");
                            CoinData.addCoins((IEntityDataSaver) player, amount);
                            ctx.getSource().sendFeedback(() -> Text.literal("Added " + amount + " coins."), false);
                            return 1;
                        })
                    )
                )

                .then(CommandManager.literal("remove")
                    .then(CommandManager.argument("amount", IntegerArgumentType.integer(1))
                        .executes(ctx -> {
                            ServerPlayerEntity player = ctx.getSource().getPlayer();
                            int amount = IntegerArgumentType.getInteger(ctx, "amount");
                            CoinData.removeCoins((IEntityDataSaver) player, amount);
                            ctx.getSource().sendFeedback(() -> Text.literal("Removed " + amount + " coins."), false);
                            return 1;
                        })
                    )
                )
            );
        });
    }
}