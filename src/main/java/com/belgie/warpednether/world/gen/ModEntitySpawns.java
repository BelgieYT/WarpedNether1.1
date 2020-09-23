package com.belgie.warpednether.world.gen;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.init.ModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = WarpedNether.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void spawnEntities(FMLLoadCompleteEvent event) {

        for (Biome biome : ForgeRegistries.BIOMES) {

            if (biome.getCategory() == Biome.Category.NETHER) {
            } else {
                if (biome.getCategory() != Biome.Category.OCEAN)
                    if (biome.getCategory() != Biome.Category.BEACH)
                        if (biome.getCategory() != Biome.Category.RIVER){
                    biome.getSpawns(EntityClassification.CREATURE)
                            .add(new Biome.SpawnListEntry(ModEntityTypes.human.get(), 100, 1, 2));
                };

            }
            if (biome.getCategory() == Biome.Category.NETHER) {
            } else {
                if (biome.getCategory() != Biome.Category.OCEAN)
                    if (biome.getCategory() != Biome.Category.BEACH)
                        if (biome.getCategory() != Biome.Category.RIVER){
                    biome.getSpawns(EntityClassification.CREATURE)
                            .add(new Biome.SpawnListEntry(ModEntityTypes.dio.get(), 200, 1, 2));
                };
            }
                if (biome.getCategory() == Biome.Category.NETHER) {
                } else {
                    if (biome.getCategory() != Biome.Category.OCEAN)
                        if (biome.getCategory() != Biome.Category.BEACH)
                        if (biome.getCategory() != Biome.Category.RIVER) {
                        biome.getSpawns(EntityClassification.CREATURE)
                                .add(new Biome.SpawnListEntry(ModEntityTypes.dbtw.get(), 200, 1, 2));
                    };
                }
                    if (biome.getCategory() == Biome.Category.NETHER) {
                    } else {
                        if (biome.getCategory() != Biome.Category.OCEAN)
                            if (biome.getCategory() != Biome.Category.BEACH)
                                if (biome.getCategory() != Biome.Category.RIVER) {
                        biome.getSpawns(EntityClassification.CREATURE)
                                    .add(new Biome.SpawnListEntry(ModEntityTypes.warped_cube.get(), 50, 0, 1));
                        };
                    }
            if (biome.getCategory() == Biome.Category.ICY) {
            } else {
                if (biome.getCategory() == Biome.Category.ICY)
                    { biome.getSpawns(EntityClassification.CREATURE)
                                    .add(new Biome.SpawnListEntry(ModEntityTypes.icy.get(), 200, 1, 2));
                        };
                    }
                }}}





