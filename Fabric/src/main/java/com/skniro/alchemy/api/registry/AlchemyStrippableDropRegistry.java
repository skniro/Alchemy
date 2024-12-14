package com.skniro.alchemy.api.registry;

import com.ibm.icu.impl.Pair;
import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.AxeItemAccessor;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.state.property.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class AlchemyStrippableDropRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(AlchemyStrippableDropRegistry.class);

    private AlchemyStrippableDropRegistry() {
    }

    private static final Map<Block, ItemStack> DROP_MAP = new HashMap<>();

    /**
     * register block and dropStack
     *
     * @param input     input Block
     * @param stripped  stripped Block
     * @param dropStack Drop item stack.
     */
    public static void register(Block input, Block stripped, ItemStack dropStack) {
        DROP_MAP.put(input, dropStack);
        requireNonNullAndAxisProperty(input, "input block");
        requireNonNullAndAxisProperty(stripped, "stripped block");
        Block old = (Block)getRegistry().put(input, stripped);
        if (old != null) {
            LOGGER.debug("Replaced old stripping mapping fromReplaced old stripping mapping from {} to {} with {}", new Object[]{input, old, stripped, dropStack});
        }
    }

    private static void requireNonNullAndAxisProperty(Block block, String name) {
        Objects.requireNonNull(block, name + " cannot be null");
        if (!block.getStateManager().getProperties().contains(Properties.AXIS)) {
            throw new IllegalArgumentException(name + " must have the 'axis' property");
        }
    }

    /**
     * get dropped item stack
     *
     * @param block Block
     * @return Drop item stack.
     */
    public static Optional<ItemStack> getDrop(Block block) {
        ItemStack drop = DROP_MAP.get(block);
        if (drop == null) {
            LOGGER.warn("No custom drop found for block: {}", block);
            return Optional.empty();
        }
        return Optional.of(drop);
    }

    private static Map<Block, Block> getRegistry() {
        return ImmutableCollectionUtils.getAsMutableMap(AxeItemAccessor::getStrippedBlocks, AxeItemAccessor::setStrippedBlocks);
    }
}