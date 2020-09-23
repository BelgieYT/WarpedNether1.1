package com.belgie.warpednether.tools;


import com.belgie.warpednether.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.Properties;
import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {

    WARPED(5, 1000, 10.0f, 3.0f, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.WARPED_SWORD.get());

    }),

        QUARTZ(4, 800, 9.0f, 2.0f, 15, () -> {
            return Ingredient.fromItems(RegistryHandler.QUARTZ_SWORD.get());
     });


    {}
    private final int harvestLevel;
    private final int maxUses;
    private final int efficiency;
    private final int attackdamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = (int) efficiency;
        this.attackdamage = (int) attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;

    }
    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackdamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}

