package com.belgie.warpednether.client.render;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.client.model.DioModel;

import com.belgie.warpednether.entities.DioEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;

import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DioRenderer  extends MobRenderer<DioEntity, DioModel<DioEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(WarpedNether.MOD_ID, "textures/entity/dio.png");

    public DioRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DioModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(DioEntity entity) {
        return TEXTURE;
    }
}

