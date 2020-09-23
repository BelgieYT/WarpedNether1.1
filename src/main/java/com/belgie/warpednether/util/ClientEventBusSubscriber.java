package com.belgie.warpednether.util;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.blocks.WarpedCrop;
import com.belgie.warpednether.client.render.*;
import com.belgie.warpednether.init.BiomeInit;
import com.belgie.warpednether.init.ModEntityTypes;
import com.belgie.warpednether.items.ModSpawnEggItem;
import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.tags.ITag;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.IForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = WarpedNether.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {
    

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.human.get(), HumanRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.dio.get(), DioRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.dbtw.get(), DbtwRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.warped_cube.get(), WarpedCubeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.icy.get(), IcyRenderer::new);
        RenderTypeLookup.setRenderLayer(RegistryHandler.WARPED_CROP.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.WARPED_LADDER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.OVERWARPED_LEAVE.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(RegistryHandler.OVERWARPED_TRAPDOOR.get(), RenderType.getCutout());
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
    }

    @SubscribeEvent
    public static void onRegisterEntites(final RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
