package com.skniro.alchemy.datagen;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;


public class AlchemyLootTableGenerator extends SimpleFabricLootTableProvider {
    public AlchemyLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.ENTITY);
    }
    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.048F, 0.0425F, 0.062333336F, 0.1F};

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(Alchemy.MOD_ID,"blocks/alchemy_block"),
                BlockLootTableGenerator.drops(AlchemyBlocks.Alchemy_Block));
        identifierBuilderBiConsumer.accept(new Identifier(Alchemy.MOD_ID,"blocks/arknite_ore"),
                BlockLootTableGenerator.oreDrops(AlchemyOreBlocks.Deepslate_arknite_Ore, Item.fromBlock(AlchemyOreBlocks.Deepslate_arknite_Ore)));

        //MAPLE




        //BAMBOO


        //SAKURA

        //Crop

    }
}
