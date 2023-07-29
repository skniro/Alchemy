package com.skniro.alchemy.datagen;

import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleTraditionalChineseLanguageProvider extends FabricLanguageProvider {
    public MapleTraditionalChineseLanguageProvider(FabricDataGenerator dataGenerator){
        super(dataGenerator,"zh_tw");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        //Maple


        //Cherry


        //BAMBOO


        //ITEM GLASS CUP

        //ITEM GROUP


        //Sakura

        //Salt Ore
        translationBuilder.add(AlchemyOreBlocks.DEEPSLATE_Salt_Ore,"深板岩鹽礦石");
        translationBuilder.add(AlchemyOreBlocks.Salt_Ore,"鹽礦石");

        //Crop


        //Food Materials

        translationBuilder.add(AlchemyItems.Salt,"鹽");

        //Food

        //Boat

    }
}
