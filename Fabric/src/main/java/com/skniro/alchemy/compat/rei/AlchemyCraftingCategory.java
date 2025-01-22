package com.skniro.alchemy.compat.rei;

import com.skniro.alchemy.Alchemy;
import com.skniro.alchemy.block.AlchemyBlocks;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.LinkedList;
import java.util.List;

// Done with the help:
// https://github.com/TeamGalacticraft/Galacticraft/tree/main (MIT License)
public class AlchemyCraftingCategory implements DisplayCategory<BasicDisplay> {
    public static final CategoryIdentifier<AlchemyCraftingDisplay> UID = CategoryIdentifier.of(Alchemy.MOD_ID, "table.alchemy");
    public static final Identifier TEXTURE = Identifier.of(Alchemy.MOD_ID,
            "textures/gui/container/alchemy_table.png");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return UID;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("crafting.table.alchemy");
    }


    @Override
    public Renderer getIcon() {
        return EntryStacks.of(AlchemyBlocks.Alchemy_Block.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        final Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 35);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 82)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 29, startPoint.y + 10))
                .entries(display.getInputEntries().get(0)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 56, startPoint.y + 10))
                .entries(display.getInputEntries().get(1)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 42, startPoint.y + 58))
                .entries(display.getInputEntries().get(2)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 67, startPoint.y + 34))
                .entries(display.getInputEntries().get(3)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 18, startPoint.y + 34))
                .entries(display.getInputEntries().get(4)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 114, startPoint.y + 30))
                .markOutput().entries(display.getOutputEntries().get(0)));
        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}