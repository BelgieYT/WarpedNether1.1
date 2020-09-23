package com.belgie.warpednether.items;

import com.belgie.warpednether.WarpedNether;
import net.minecraft.block.Block;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.function.Supplier;

public class WarpedApple extends Item {

        public WarpedApple() {
            super(new Properties()
                    .group(WarpedNether.WarpedNetherItemGroup.instance)
                    .food(new Food.Builder()
                            .hunger(8)
                            .saturation(1.8f)
                            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 150, 1), 0.2F)
                            .effect(new EffectInstance(Effects.LUCK, 100, 2), 0.1F)
                            .build()));
}

}
