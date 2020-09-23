package com.belgie.warpednether.armor;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmourMaterial implements IArmorMaterial {

    WARPED(WarpedNether.MOD_ID + ":warped", 600, new int[] {2, 5, 6, 2}, 18, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1.0F, () -> {return Ingredient.fromItems(RegistryHandler.WARPED_SHARD.get()); }),


    INVIS(WarpedNether.MOD_ID + ":invis", 100, new int[]{3, 6, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F, () -> {
            return Ingredient.fromItems(RegistryHandler.INVIS_CRSYTAL.get());
        });




    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmourMaterial(String name, int maxDamageFactor, int[] damageReductionArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionArray = damageReductionArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] = this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return -12;
    }
}
