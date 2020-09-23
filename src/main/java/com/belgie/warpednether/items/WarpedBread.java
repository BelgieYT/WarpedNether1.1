package com.belgie.warpednether.items;

import com.belgie.warpednether.WarpedNether;
import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

import java.util.Properties;

public class WarpedBread extends Item {

        public WarpedBread() {
            super(new Properties()
                    .group(WarpedNether.WarpedNetherItemGroup.instance)
                    .food(new Food.Builder()
                            .hunger(6)
                            .saturation(2.5f)
                            .fastToEat()
                            .build()));
}

    @Override
    public SoundEvent getEatSound() {
        return SoundEvents.ENTITY_STRIDER_EAT;
    }

    @Override
    public boolean isFood() {
        return true;
    }
}

