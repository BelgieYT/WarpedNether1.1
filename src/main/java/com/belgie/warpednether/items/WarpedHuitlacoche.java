package com.belgie.warpednether.items;

import com.belgie.warpednether.WarpedNether;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class WarpedHuitlacoche extends Item {

        public WarpedHuitlacoche() {
            super(new Properties()
                    .group(WarpedNether.WarpedNetherItemGroup.instance)
                    .food(new Food.Builder()
                            .hunger(1)
                            .saturation(0.5f)
                            .effect(new EffectInstance(Effects.BLINDNESS, 150, 1), 0.5F)
                            .effect(new EffectInstance(Effects.HUNGER, 100, 2), 0.8F)
                            .build()));
}
}
