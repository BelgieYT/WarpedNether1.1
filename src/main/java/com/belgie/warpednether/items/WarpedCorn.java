package com.belgie.warpednether.items;

import com.belgie.warpednether.WarpedNether;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
public class WarpedCorn extends Item {

        public WarpedCorn() {
            super(new Item.Properties()
                    .group(WarpedNether.WarpedNetherItemGroup.instance)
                    .food(new Food.Builder()
                            .hunger(13)
                            .saturation(1.2f)
                            .build()));
}
}
