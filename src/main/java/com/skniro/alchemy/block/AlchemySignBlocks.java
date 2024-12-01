package com.skniro.alchemy.block;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.entity.AlchemySignTypes;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class AlchemySignBlocks {
    public static final Block Maple_SIGN = registerBlockWithoutItem("maple_sign",new SignBlock(AbstractBlock.Settings.create().mapColor(AlchemyMapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable(),AlchemySignTypes.MAPLE),Alchemy.Alchemy_Group);
    public static final Block Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",new WallSignBlock(AbstractBlock.Settings.create().mapColor(AlchemyMapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(Maple_SIGN),AlchemySignTypes.MAPLE),Alchemy.Alchemy_Group);
    public static final Block Maple_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign", new HangingSignBlock(AbstractBlock.Settings.create().mapColor(AlchemyMapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable(), AlchemySignTypes.MAPLE),Alchemy.Alchemy_Group);
    public static final Block Maple_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign", new WallHangingSignBlock(AbstractBlock.Settings.create().mapColor(AlchemyMapleBlocks.MAPLE_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(Maple_HANGING_SIGN),AlchemySignTypes.MAPLE),Alchemy.Alchemy_Group);
    public static final Block Palma_SIGN = registerBlockWithoutItem("palma_sign",new SignBlock(AbstractBlock.Settings.create().mapColor(AlchemyPalmaBlocks.PALMA_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable(),AlchemySignTypes.MAPLE),Alchemy.Alchemy_Group);
    public static final Block Palma_WALL_SIGN = registerBlockWithoutItem("palma_wall_sign",new WallSignBlock(AbstractBlock.Settings.create().mapColor(AlchemyPalmaBlocks.PALMA_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(Maple_SIGN),AlchemySignTypes.MAPLE),Alchemy.Alchemy_Group);
    public static final Block Palma_HANGING_SIGN = registerBlockWithoutItem("palma_hanging_sign", new HangingSignBlock(AbstractBlock.Settings.create().mapColor(AlchemyPalmaBlocks.PALMA_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable(), AlchemySignTypes.MAPLE),Alchemy.Alchemy_Group);
    public static final Block Palma_WALL_HANGING_SIGN = registerBlockWithoutItem("palma_wall_hanging_sign", new WallHangingSignBlock(AbstractBlock.Settings.create().mapColor(AlchemyPalmaBlocks.PALMA_PLANKS.getDefaultMapColor()).solid().instrument(Instrument.BASS).noCollision().strength(1.0F).burnable().dropsLike(Maple_HANGING_SIGN),AlchemySignTypes.MAPLE),Alchemy.Alchemy_Group);


    private static Block registerBlockWithoutItem(String name, Block block, RegistryKey<ItemGroup> group) {
        return Registry.register(Registries.BLOCK, new Identifier(Alchemy.MOD_ID, name), block);
    }

    public static void registerAlchemySignBlocks() {
        Alchemy.LOGGER.debug("Registering AlchemySignBlocks for " + Alchemy.MOD_ID);
    }
}
