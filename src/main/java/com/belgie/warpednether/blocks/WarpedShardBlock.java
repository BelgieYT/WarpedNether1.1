package com.belgie.warpednether.blocks;

import com.belgie.warpednether.util.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;
import net.minecraftforge.common.ToolType;

public class WarpedShardBlock extends GlassBlock {

    public WarpedShardBlock() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(1.0F, 4.0F)
                .sound(SoundType.GLASS)
                .harvestLevel(0)
                .harvestTool(ToolType.PICKAXE));
    }
}

