package com.belgie.warpednether.items;

import com.belgie.warpednether.WarpedNether;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance));
    }
}
