package com.belgie.warpednether.world.feature;

import com.belgie.warpednether.util.RegistryHandler;
import net.minecraft.block.BlockState;
import net.minecraft.block.trees.Tree;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import java.util.Random;

public class OverwarpedTree extends Tree {

    public static final BaseTreeFeatureConfig OVERWARPED_TREE_CONFIG =
            (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(RegistryHandler.OVERWARPED_LOGS.get().getDefaultState()), new SimpleBlockStateProvider(RegistryHandler.OVERWARPED_LEAVE.get().getDefaultState()), new BlobFoliagePlacer(2, 0, 0, 0, 3), new StraightTrunkPlacer(4, 8, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build();


    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig,
            ?> getTreeFeature(Random randomIn, boolean b) {
        return Feature.field_236291_c_.withConfiguration(OVERWARPED_TREE_CONFIG);
    }

    @Override
    public boolean attemptGrowTree(ServerWorld world, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, Random rand) {
       return true;
    }

    protected IItemProvider getSeedsItem() {
        return RegistryHandler.OVERWARPED_SAPLING.get();
    }

    public ItemStack getItem(IBlockReader worldIn, BlockPos pos, BlockState state) {
        return new ItemStack(this.getSeedsItem());
    }
}


