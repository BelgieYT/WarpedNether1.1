package com.belgie.warpednether.client.render;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.client.model.DbtwModel;
import com.belgie.warpednether.client.model.WarpedCubeModel;
import com.belgie.warpednether.entities.DbtwEntity;
import com.belgie.warpednether.entities.WarpedCubeEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WarpedCubeRenderer extends MobRenderer<WarpedCubeEntity, WarpedCubeModel<WarpedCubeEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(WarpedNether.MOD_ID, "textures/entity/warpedcube.png");

    public WarpedCubeRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new WarpedCubeModel(), 1.0F);
    }

    @Override
    public ResourceLocation getEntityTexture(WarpedCubeEntity entity) {
        return TEXTURE;
    }


}


