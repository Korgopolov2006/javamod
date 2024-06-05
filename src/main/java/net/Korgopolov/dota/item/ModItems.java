package net.Korgopolov.dota.item;

import com.mojang.blaze3d.shaders.Effect;
import net.Korgopolov.dota.block.ModBlocks;
import net.Korgopolov.dota.dota;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


import javax.tools.Tool;
import java.util.Properties;

import static net.minecraft.world.item.Tiers.STONE;

public class ModItems {



    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister. create(ForgeRegistries. ITEMS, dota.MOD_ID);




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

    public static final RegistryObject<Item> sickle = ITEMS.register("sickle",
            () -> new SickleItem(new Item.Properties()
                    .tab(ModCreativeModeTab.Flover_Tab_Items)

                    .stacksTo(1)));

    public static final RegistryObject<Item> violet_seed = ITEMS.register( "violet_seed" ,
            () -> new Item(new Item.Properties().
                    food((new FoodProperties.Builder())
                            .nutrition(1)
                            .saturationMod(0.5f)
                            .effect(() -> new MobEffectInstance(MobEffects.POISON , 200, 1), 1.0f)
                            .build()).
                    tab(ModCreativeModeTab.Flover_Tab_Items)));
    public static final RegistryObject<Item> heather_seed = ITEMS.register( "heather_seed" ,
            () -> new Item(new Item.Properties().
                    food((new FoodProperties.Builder())
                            .nutrition(1)
                            .saturationMod(0.5f)
                            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION , 200, 1), 1.0f)
                            .build()).
                    tab(ModCreativeModeTab.Flover_Tab_Items)));
    public static final RegistryObject<Item> lavender_seed = ITEMS.register( "lavender_seed" ,
            () -> new Item(new Item.Properties()
                    .food((new FoodProperties.Builder())
                                    .nutrition(1)
                                    .saturationMod(0.5f)
                                    .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED , 200, 1), 1.0f)
                                    .build()).
                    tab(ModCreativeModeTab.Flover_Tab_Items)));

    public static final RegistryObject<Item> flover_sword = ITEMS.register( "flover_sword" ,
            () -> new SwordItem(STONE , 100 , -0.4F,
                    (new Item.Properties()).
                        tab(ModCreativeModeTab.Flover_Tab_Items)));


    public void violet_seed(){

    }
}
