package net.Korgopolov.dota.biomes;

import net.Korgopolov.dota.dota;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = dota.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBiomes {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, dota.MOD_ID);

    public static final RegistryObject<Biome> FLOWER_BIOME = BIOMES.register("flower_biome", FlowerBiomes::createNewBiome);


    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ResourceKey<Biome> flowerBiomeKey = ResourceKey.create(Registry.BIOME_REGISTRY,
                    new ResourceLocation(dota.MOD_ID, "flower_biome"));
            BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(flowerBiomeKey, 10));
        });
    }
}
