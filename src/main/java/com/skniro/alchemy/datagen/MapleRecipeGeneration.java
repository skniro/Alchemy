package com.skniro.alchemy.datagen;

import com.google.common.collect.Lists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Util;

import java.util.List;
import java.util.function.Consumer;

public class MapleRecipeGeneration extends FabricRecipeProvider {
    public MapleRecipeGeneration(FabricDataGenerator generator) {
        super(generator);
    }

    public static final List<ItemConvertible> STRIPPED_MAPLE = Util.make(Lists.newArrayList(), list -> {
    });

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {



    }
}
