package com.skniro.alchemy.datagen;

import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;


public class AlchemyLootTableGenerator extends FabricBlockLootTableProvider {
    public AlchemyLootTableGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }
    public static final float[] SAPLING_DROP_CHANCE = new float[]{0.048F, 0.0425F, 0.062333336F, 0.1F};

    @Override
    public void generate() {
        addDrop(AlchemyOreBlocks.Deepslate_arknite_Ore, oreDrops(AlchemyOreBlocks.Deepslate_arknite_Ore, AlchemyItems.Arknite));
        addDrop(AlchemyOreBlocks.End_Septrin_Ore, oreDrops(AlchemyOreBlocks.End_Septrin_Ore,AlchemyItems.Septrin));
        addDrop(AlchemyBlocks.Alchemy_Block);

    }
}
