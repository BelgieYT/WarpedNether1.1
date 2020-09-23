package com.belgie.warpednether.blocks;

import javafx.scene.control.TreeItem;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import sun.rmi.runtime.Log;

import java.util.stream.Stream;

public class OverwarpedLogs extends RotatedPillarBlock {

    public OverwarpedLogs() {
        super(Properties.from(Blocks.OAK_LOG));
    };
}




