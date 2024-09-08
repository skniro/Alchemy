package com.skniro.alchemy.datagen;

import com.skniro.alchemy.block.AlchemyBlocks;
import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.block.AlchemySignBlocks;
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

        //MAPLE
        addDrop(AlchemySignBlocks.Maple_SIGN);
        addDrop(AlchemySignBlocks.Maple_WALL_SIGN);
        addDrop(AlchemySignBlocks.Maple_HANGING_SIGN);
        addDrop(AlchemySignBlocks.Maple_WALL_HANGING_SIGN);
        addDrop(AlchemyMapleBlocks.MAPLE_LOG);
        addDrop(AlchemyMapleBlocks.MAPLE_WOOD);
        addDrop(AlchemyMapleBlocks.MAPLE_DOOR,doorDrops(AlchemyMapleBlocks.MAPLE_DOOR));
        addDrop(AlchemyMapleBlocks.RED_MAPLE_SAPLING);
        addDrop(AlchemyMapleBlocks.RED_MAPLE_LEAVES,leavesDrops(AlchemyMapleBlocks.RED_MAPLE_LEAVES,AlchemyMapleBlocks.RED_MAPLE_SAPLING,SAPLING_DROP_CHANCE));
        addDrop(AlchemyMapleBlocks.MAPLE_BUTTON);
        addDrop(AlchemyMapleBlocks.MAPLE_FENCE);
        addDrop(AlchemyMapleBlocks.MAPLE_FENCE_GATE);
        addDrop(AlchemyMapleBlocks.MAPLE_PLANKS);
        addDrop(AlchemyMapleBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(AlchemyMapleBlocks.MAPLE_SLAB);
        addDrop(AlchemyMapleBlocks.MAPLE_STAIRS);
        addDrop(AlchemyMapleBlocks.MAPLE_TRAPDOOR);
        addDrop(AlchemyMapleBlocks.STRIPPED_MAPLE_LOG);
        addDrop(AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD);
    }
}
