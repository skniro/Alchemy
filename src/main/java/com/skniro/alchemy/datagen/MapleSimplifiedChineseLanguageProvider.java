package com.skniro.alchemy.datagen;

import com.skniro.alchemy.block.AlchemyOreBlocks;
import com.skniro.alchemy.item.AlchemyItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class MapleSimplifiedChineseLanguageProvider extends FabricLanguageProvider {
    public MapleSimplifiedChineseLanguageProvider(FabricDataOutput dataGenerator){
        super(dataGenerator,"zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder){
        //Maple


        //Cherry
;

        //BAMBOO


        //ITEM GLASS CUP

        //ITEM GROUP


        //Sakura


        //Salt Ore
        translationBuilder.add(AlchemyOreBlocks.DEEPSLATE_Salt_Ore,"深板岩盐矿石");
        translationBuilder.add(AlchemyOreBlocks.Salt_Ore,"盐矿石");

        //Crop

        //Food Materials

        translationBuilder.add(AlchemyItems.Salt,"盐");


        //Food
        //Boat


    }
}
