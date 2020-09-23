package com.belgie.warpednether.client.render;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.client.model.DbtwModel;
import com.belgie.warpednether.client.model.IcyModel;
import com.belgie.warpednether.entities.DbtwEntity;
import com.belgie.warpednether.entities.IcyEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.layers.SheepWoolLayer;
import net.minecraft.util.ResourceLocation;

public class IcyRenderer extends MobRenderer<IcyEntity, IcyModel<IcyEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(WarpedNether.MOD_ID, "textures/entity/icy.png");

    public IcyRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new IcyModel(), 0.5F);

    }

    @Override
    public ResourceLocation getEntityTexture(IcyEntity entity) {
        return TEXTURE;
    }
}

