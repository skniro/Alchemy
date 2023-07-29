package com.skniro.alchemy.block.entity;

import com.skniro.alchemy.entity.ImplementedInventory;
import com.skniro.alchemy.recipe.AlchemyCraftingRecipe;
import com.skniro.alchemy.screen.AlchemyBlockScreenHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;

public class Alchemyblockentity extends BlockEntity implements NamedScreenHandlerFactory, ImplementedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(6, ItemStack.EMPTY);
    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;

    public Alchemyblockentity(BlockPos pos, BlockState state) {
        super(AlchemyBlockEntityType.ALCHEMY_BLOCK_ENTITY, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            public int get(int index) {
                switch (index) {
                    case 0: return Alchemyblockentity.this.progress;
                    case 1: return Alchemyblockentity.this.maxProgress;
                    default: return 0;
                }
            }

            public void set(int index, int value) {
                switch(index) {
                    case 0: Alchemyblockentity.this.progress = value; break;
                    case 1: Alchemyblockentity.this.maxProgress = value; break;
                }
            }

            public int size() {
                return 2;
            }
        };
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    public Text getDisplayName() {
        return Text.literal("crafting.table.alchemy");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return new AlchemyBlockScreenHandler(syncId, inv, this, this.propertyDelegate);
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("crafting.table.alchemy.progress", progress);
    }

    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        super.readNbt(nbt);
        progress = nbt.getInt("crafting.table.alchemy.progress");
    }

    private void resetProgress() {
        this.progress = 0;
    }

    public static void tick(World world, BlockPos blockPos, BlockState state, Alchemyblockentity entity) {
        if(world.isClient()) {
            return;
        }

        if(hasRecipe(entity)) {
            entity.progress++;
            markDirty(world, blockPos, state);
            if(entity.progress >= entity.maxProgress) {
                craftItem(entity);
            }
        } else {
            entity.resetProgress();
            markDirty(world, blockPos, state);
        }
    }

    /*private static void craftItem(Alchemyblockentity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        if(hasRecipe(entity)) {
            entity.removeStack(1, 1);

            entity.setStack(5, new ItemStack(AlchemyItems.Salt,
                    entity.getStack(5).getCount() + 1));

            entity.resetProgress();
        }
    }*/

  /*  private static boolean hasRecipe(Alchemyblockentity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }

        boolean hasRawGemInFirstSlot = entity.getStack(1).getItem() == AlchemyFoodComponents.Anko_Dango;

        return hasRawGemInFirstSlot && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, AlchemyItems.Salt);
    }*/

   private static void craftItem(Alchemyblockentity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }
        Optional<AlchemyCraftingRecipe> recipe = entity.getWorld().getRecipeManager()
                .getFirstMatch(AlchemyCraftingRecipe.Type.INSTANCE, inventory, entity.getWorld());

        if(hasRecipe(entity)) {
            entity.removeStack(0, 1);
            entity.removeStack(1, 1);
            entity.removeStack(2, 1);
            entity.setStack(5, new ItemStack(recipe.get().getOutput().getItem(),
                    entity.getStack(5).getCount() + 1));
            entity.resetProgress();
        }
    }

    private static boolean hasRecipe(Alchemyblockentity entity) {
        SimpleInventory inventory = new SimpleInventory(entity.size());
        for (int i = 0; i < entity.size(); i++) {
            inventory.setStack(i, entity.getStack(i));
        }
        Optional<AlchemyCraftingRecipe> match = entity.getWorld().getRecipeManager().getFirstMatch(
                AlchemyCraftingRecipe.Type.INSTANCE, inventory, entity.getWorld());

        return match.isPresent() && canInsertAmountIntoOutputSlot(inventory)
                && canInsertItemIntoOutputSlot(inventory, match.get().getOutput().getItem());
    }

    private static boolean canInsertItemIntoOutputSlot(SimpleInventory inventory, Item output) {
        return inventory.getStack(5).getItem() == output || inventory.getStack(5).isEmpty();
    }

    private static boolean canInsertAmountIntoOutputSlot(SimpleInventory inventory) {
        return inventory.getStack(5).getMaxCount() > inventory.getStack(5).getCount();
    }

}
