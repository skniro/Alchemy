package com.skniro.alchemy.potion;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.init.Alchemyblock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class AlchemyPotions {
    public static final Potion KARMINE_VENOM = registerPotion("karmine_venom", new Potion(new StatusEffectInstance(StatusEffects.POISON, 600, 0), new StatusEffectInstance(StatusEffects.WITHER, 300, 0), new StatusEffectInstance(StatusEffects.WEAKNESS, 900, 0)));


    private static Potion registerPotion(String name, Potion potion) {
        return Registry.register(Registries.POTION, new Identifier(Alchemy.MOD_ID, name), potion);
    }

    public static void registerAlchemyPotions() {
        Alchemy.LOGGER.info("Registering Alchemy Potions for " + Alchemy.MOD_ID);
    }
}
