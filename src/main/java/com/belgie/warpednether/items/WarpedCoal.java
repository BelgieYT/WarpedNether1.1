package com.belgie.warpednether.items;

import com.belgie.warpednether.WarpedNether;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import java.util.Collection;

public class WarpedCoal extends Item {

        public WarpedCoal() {
            super(new Properties()
                    .isBurnable()
                    .group(WarpedNether.WarpedNetherItemGroup.instance));


}

@Override
    public boolean isBurnable() {
        return true;
    }
    @Override
    public int getBurnTime(ItemStack itemStack) {
        {
            return 1000;
        }
    }
}
