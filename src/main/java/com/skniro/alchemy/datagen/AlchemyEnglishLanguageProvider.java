package com.skniro.alchemy.datagen;

import com.skniro.alchemy.block.AlchemyMapleBlocks;
import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.block.AlchemySignBlocks;
import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.nio.file.Path;

public class AlchemyEnglishLanguageProvider extends FabricLanguageProvider {
    public AlchemyEnglishLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //Maple
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_PLANKS,"Maple Planks");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_LOG,"Maple Log");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_WOOD,"Maple Wood");
        translationBuilder.add(AlchemyMapleBlocks.STRIPPED_MAPLE_WOOD,"Stripped Maple Wood");
        translationBuilder.add(AlchemyMapleBlocks.STRIPPED_MAPLE_LOG,"Stripped Maple Log");
        translationBuilder.add(AlchemyMapleBlocks.RED_MAPLE_LEAVES,"Red Maple Leaves");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_DOOR,"Maple Door");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_BUTTON,"Maple Button");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_FENCE,"Maple Fence");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_FENCE_GATE,"Maple Fence Gate");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_SLAB,"Maple Slab");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_STAIRS,"Maple Stairs");
        translationBuilder.add(AlchemyMapleBlocks.RED_MAPLE_SAPLING,"Red Maple Sapling");
        translationBuilder.add(AlchemyMapleBlocks.POTTED_RED_MAPLE_SAPLING,"Potted Red Maple Sapling");
        translationBuilder.add(AlchemySignBlocks.Maple_SIGN,"Maple Sign");
        translationBuilder.add(AlchemySignBlocks.Maple_HANGING_SIGN,"Maple Hanging Sign");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_TRAPDOOR,"Maple Trapdoor");
        translationBuilder.add(AlchemyMapleBlocks.MAPLE_PRESSURE_PLATE,"Maple Pressure Plate");
        translationBuilder.add(AlchemyMapleBlocks.RED_MAPLE_CARPET,"Red Maple Fallen Leaves");


        //Cherry


        //BAMBOO


        //ITEM GLASS CUP

        //ITEM GROUP

        //Sakura


        //Salt Ore
        translationBuilder.add(AlchemyOreBlocks.DEEPSLATE_Salt_Ore,"Deepslate Salt Ore");
        translationBuilder.add(AlchemyOreBlocks.Salt_Ore,"Salt Ore");

        //Crop

        //Food Materials
        translationBuilder.add(AlchemyItems.Salt,"Salt");

        //Food

        //Boat
/*        try {
            Path existingFilePath = dataOutput.getModContainer().findPath("assets/maple/lang/en_us.existing.json").get();
            translationBuilder.add(existingFilePath);
        } catch (Exception e) {
            throw new RuntimeException("Failed to add existing language file!", e);
        }*/
    }
}
