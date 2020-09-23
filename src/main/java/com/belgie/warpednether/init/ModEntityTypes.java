package com.belgie.warpednether.init;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.entities.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, WarpedNether.MOD_ID);


    public static final RegistryObject<EntityType<HumanEntity>> human = ENTITY_TYPES.register("human",
            () -> EntityType.Builder.create(HumanEntity:: new, EntityClassification.CREATURE)
            .size(0.5F, 2.0F)
            .build(new ResourceLocation(WarpedNether.MOD_ID, "human").toString()));

    public static final RegistryObject<EntityType<DioEntity>> dio = ENTITY_TYPES.register("dio",
            () -> EntityType.Builder.create(DioEntity:: new, EntityClassification.CREATURE)
                    .size(0.5F, 2.0F)
                    .build(new ResourceLocation(WarpedNether.MOD_ID, "dio").toString()));

    public static final RegistryObject<EntityType<DbtwEntity>> dbtw = ENTITY_TYPES.register("dbtw",
            () -> EntityType.Builder.create(DbtwEntity:: new, EntityClassification.CREATURE)
                    .size(0.5F, 2.0F)
                    .build(new ResourceLocation(WarpedNether.MOD_ID, "dbtw").toString()));

    public static final RegistryObject<EntityType<WarpedCubeEntity>> warped_cube = ENTITY_TYPES.register("warped_cube",
            () -> EntityType.Builder.create(WarpedCubeEntity:: new, EntityClassification.CREATURE)
                    .size(1.0F, 1.0F)
                    .build(new ResourceLocation(WarpedNether.MOD_ID, "warped_cube").toString()));

    public static final RegistryObject<EntityType<IcyEntity>> icy = ENTITY_TYPES.register("icy",
            () -> EntityType.Builder.create(IcyEntity::new, EntityClassification.CREATURE)
                    .size(0.5F, 2.0F)
                    .build(new ResourceLocation(WarpedNether.MOD_ID, "icy").toString()));


}
