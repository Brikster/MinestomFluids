package io.github.togar2.fluids;

import net.minestom.server.coordinate.Point;
import net.minestom.server.event.trait.BlockEvent;
import net.minestom.server.event.trait.CancellableEvent;
import net.minestom.server.event.trait.InstanceEvent;
import net.minestom.server.instance.Instance;
import net.minestom.server.instance.block.Block;
import org.jetbrains.annotations.NotNull;

public class FluidReceiveFlowEvent implements InstanceEvent, BlockEvent, CancellableEvent {

    private boolean cancelled;

    private final Instance instance;
    private final Point blockPosition;
    private final Block block;

    public FluidReceiveFlowEvent(@NotNull Instance instance, @NotNull Point blockPosition, @NotNull Block block) {
        this.instance = instance;
        this.blockPosition = blockPosition;
        this.block = block;
    }

    @Override
    public @NotNull Block getBlock() {
        return block;
    }

    public Point getBlockPosition() {
        return blockPosition;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }

    @Override
    public @NotNull Instance getInstance() {
        return instance;
    }

}
