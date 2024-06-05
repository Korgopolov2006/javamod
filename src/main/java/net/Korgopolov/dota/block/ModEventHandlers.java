package net.Korgopolov.dota.block;

import net.Korgopolov.dota.block.ModBlocks;
import net.Korgopolov.dota.dota;
import net.Korgopolov.dota.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.level.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Random;

@Mod.EventBusSubscriber(modid = dota.MOD_ID)
public class ModEventHandlers {

    private static final Random RANDOM = new Random();

    @SubscribeEvent
    public static void onBlockBreak(BreakEvent event) {
        BlockState state = event.getState();
        Block block = state.getBlock();
        ItemStack heldItem = event.getPlayer().getMainHandItem();
        BlockPos pos = event.getPos();
        ServerLevel world = (ServerLevel) event.getLevel();

        if (block == ModBlocks.violet_block.get() && heldItem.getItem() == ModItems.sickle.get()) {
            int seedCount = 1 + RANDOM.nextInt(5);
            ItemStack seeds = new ItemStack(ModItems.violet_seed.get(), seedCount);
            Block.popResource(world, pos, seeds);
        }
        if (block == ModBlocks.heather_block.get() && heldItem.getItem() == ModItems.sickle.get()) {
            int seedCount = 1 + RANDOM.nextInt(5);
            ItemStack seeds = new ItemStack(ModItems.heather_seed.get(), seedCount);
            Block.popResource(world, pos, seeds);
        }
        if (block == ModBlocks.lavender_block.get() && heldItem.getItem() == ModItems.sickle.get()) {
            int seedCount = 1 + RANDOM.nextInt(5);
            ItemStack seeds = new ItemStack(ModItems.lavender_seed.get(), seedCount);
            Block.popResource(world, pos, seeds);
        }
    }
}
