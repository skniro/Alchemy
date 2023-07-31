package com.skniro.alchemy.datagen;

import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleEnglishLanguageProvider extends FabricLanguageProvider {
    public MapleEnglishLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        //Maple


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

    }
}
