package net.Korgopolov.dota.item;


import net.Korgopolov.dota.block.ModBlocks;
import net.minecraft.world.item. CreativeModeTab;
import net.minecraft.world.item.ItemStack;


public class ModCreativeModeTab {
    public static final CreativeModeTab Flover_Tab_Items = new CreativeModeTab("Flover_Tab_Items"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.sickle.get());
        }
    };

    public static final CreativeModeTab Flover_Tab_block = new CreativeModeTab("Flover_Tab_block"){
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.flycatcher_block.get());
        }
    };
}

