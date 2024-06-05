package net.Korgopolov.dota;

import com.mojang.logging.LogUtils;
import net.Korgopolov.dota.block.ModBlocks;
import net.Korgopolov.dota.item.ModItems;
import net.Korgopolov.dota.biomes.ModBiomes;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(dota.MOD_ID)
public class dota {
    public static final String MOD_ID = "dota";
    private static final Logger LOGGER = LogUtils.getLogger();

    public dota() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBiomes.BIOMES.register(modEventBus);  // Регистрация биомов
        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Начальные настройки
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.violet_block.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.heather_block.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.lavender_block.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.flycatcher_block.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.cornflower_block.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.dandelion_block.get(), RenderType.cutout());
        }
    }
}
