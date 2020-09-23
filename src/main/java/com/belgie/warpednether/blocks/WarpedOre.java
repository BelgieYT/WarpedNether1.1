package com.belgie.warpednether.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class WarpedOre extends OreBlock {
    public WarpedOre() {
        super(Properties.from(Blocks.NETHER_GOLD_ORE));
    };
}
