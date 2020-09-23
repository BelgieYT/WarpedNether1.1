package com.belgie.warpednether.world.biomes;

import com.belgie.warpednether.world.feature.OverwarpedTree;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;


public class WarpedJungle extends Biome {
    public WarpedJungle(Builder biomeBuilder) {
        super(biomeBuilder);
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
        this.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.12F)));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
                Feature.field_236291_c_.withConfiguration(OverwarpedTree.OVERWARPED_TREE_CONFIG).withPlacement
                        (Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 1.0F, 0))));
        DefaultBiomeFeatures.addLakes(this);
        DefaultBiomeFeatures.addMonsterRooms(this);
        DefaultBiomeFeatures.addGrass(this);
    }
}
