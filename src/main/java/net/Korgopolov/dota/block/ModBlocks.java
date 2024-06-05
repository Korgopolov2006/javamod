package net.Korgopolov.dota.block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.Korgopolov.dota.item.ModCreativeModeTab;
import net.Korgopolov.dota.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus. api. IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.Korgopolov.dota.dota;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister. create(ForgeRegistries. BLOCKS, dota. MOD_ID);

    public static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
    public static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturns = BLOCKS.register(name, block);
        registryBlockItem(name, toReturns, tab);
        return toReturns;
    }

    public static final RegistryObject<Block> heather_block = registryBlock(  "heather_block",
            ()-> new Block(BlockBehaviour.Properties
                .of(Material.DECORATION)
                .strength(3f)
                .instabreak()
                .randomTicks()
                .noCollission()
                .noOcclusion()
                .sound(SoundType.GRASS)),
            ModCreativeModeTab.Flover_Tab_block);

    public static final RegistryObject<Block> dandelion_block = registryBlock(  "dandelion_block",
            ()-> new Block(BlockBehaviour.Properties
                    .of(Material.DECORATION)
                    .strength(3f)
                    .instabreak()
                    .randomTicks()
                    .noCollission()
                    .noOcclusion()
                    .sound(SoundType.GRASS)),
            ModCreativeModeTab.Flover_Tab_block);



    public static final RegistryObject<Block> flycatcher_block = registryBlock("flycatcher_block",
            () -> new Block(BlockBehaviour.Properties
                    .of(Material.DECORATION)
                    .strength(3f)
                    .instabreak()
                    .randomTicks()
                    .noCollission()
                    .noOcclusion()
                    .sound(SoundType.GRASS)),
            ModCreativeModeTab.Flover_Tab_block
    );


    public static final RegistryObject<Block> lavender_block = registryBlock(  "lavender_block",
            ()-> new Block(BlockBehaviour.Properties
                    .of(Material.DECORATION)
                    .strength(3f)
                    .instabreak()
                    .randomTicks()
                    .noCollission()
                    .noOcclusion()
                    .sound(SoundType.GRASS)),


            ModCreativeModeTab.Flover_Tab_block);

    public static final RegistryObject<Block> violet_block = registryBlock(  "violet_block",
            ()-> new Block(BlockBehaviour.Properties
                    .of(Material.DECORATION)
                    .strength(3f)
                    .instabreak()
                    .randomTicks()
                    .noCollission()
                    .noOcclusion()
                    .sound(SoundType.GRASS)),

            ModCreativeModeTab.Flover_Tab_block);
    public static final RegistryObject<Block> cornflower_block = registryBlock(  "cornflower_block",
            ()-> new Block(BlockBehaviour.Properties
                    .of(Material.DECORATION)
                    .strength(3f)
                    .instabreak()
                    .randomTicks()
                    .noCollission()
                    .noOcclusion()
                    .sound(SoundType.GRASS)),

            ModCreativeModeTab.Flover_Tab_block);


}
