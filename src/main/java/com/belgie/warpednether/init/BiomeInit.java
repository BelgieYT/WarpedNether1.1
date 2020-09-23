package com.belgie.warpednether.init;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.world.biomes.WarpedJungle;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Function;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, WarpedNether.MOD_ID);

    public static final RegistryObject<Biome> WARPEDJUNGLE = BIOMES
            .register("warpedjungle",
                    () -> new WarpedJungle(new Biome.Builder().surfaceBuilder(SurfaceBuilder.DEFAULT,
                                     new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(),
                                    Blocks.WARPED_WART_BLOCK.getDefaultState(),
                                    Blocks.WARPED_WART_BLOCK.getDefaultState()))
            .precipitation(Biome.RainType.NONE).category(Biome.Category.MUSHROOM).depth(0.0F).scale(0.1F).temperature(0.8F)
                                             .downfall(0.4F).func_235097_a_((new BiomeAmbience.Builder()).setWaterColor(5415108).setWaterFogColor(5415140).setFogColor(5439487).setMoodSound(MoodSoundAmbience.field_235027_b_).build()).parent((String)null).func_235098_a_(ImmutableList.of(new Biome.Attributes(10.0F, 0.9F, 10.0F, 10.0F, 0.0F)))));





    public static void registerBiomes(){
        registerBiome(WARPEDJUNGLE.get(), BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
    }

    public static void registerBiome(Biome biome, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 100));
        BiomeManager.addSpawnBiome(biome);
    }
    @SuppressWarnings("deprecation")
    private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
        return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));

    }
}
