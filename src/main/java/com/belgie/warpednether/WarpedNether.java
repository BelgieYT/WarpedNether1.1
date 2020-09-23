package com.belgie.warpednether;


import com.belgie.warpednether.blocks.WarpedCrop;
import com.belgie.warpednether.entities.*;
import com.belgie.warpednether.init.BiomeInit;
import com.belgie.warpednether.init.ModEntityTypes;
import com.belgie.warpednether.init.SoundInit;
import com.belgie.warpednether.util.RegistryHandler;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@SuppressWarnings("deprecation")
@Mod("warpednether")
@Mod.EventBusSubscriber(modid = WarpedNether.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WarpedNether {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "warpednether";
    public static WarpedNether instance = null;

    public WarpedNether() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());
        BiomeInit.BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
        SoundInit.SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());


        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
        RegistryHandler.init();

}

    private void doClientStuff(final FMLClientSetupEvent event) { }



    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityTypes.human.get(), HumanEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.dio.get(), DioEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.dbtw.get(), DbtwEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.warped_cube.get(), WarpedCubeEntity.setCustomAttributes().create());
            GlobalEntityTypeAttributes.put(ModEntityTypes.icy.get(), IcyEntity.setCustomAttributes().create());
        });
    }
        public static class WarpedNetherItemGroup extends ItemGroup
        {
            public static final WarpedNetherItemGroup instance = new WarpedNetherItemGroup(ItemGroup.GROUPS.length, "warpednethertab");
            private WarpedNetherItemGroup(int index, String label) {
                super(index, label);
            }

            @Override
            public ItemStack createIcon() {
                return new ItemStack(RegistryHandler.HUMAN_SPAWN_EGG.get());
            }
        }
}




