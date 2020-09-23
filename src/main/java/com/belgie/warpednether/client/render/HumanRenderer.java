package com.belgie.warpednether.client.render;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.client.model.DioModel;
import com.belgie.warpednether.client.model.HumanModel;
import com.belgie.warpednether.entities.HumanEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.util.ResourceLocation;

public class HumanRenderer extends MobRenderer<HumanEntity, HumanModel<HumanEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(WarpedNether.MOD_ID, "textures/entity/human.png");

    public HumanRenderer(EntityRendererManager renderManagerIn)  {
        super(renderManagerIn, new HumanModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(HumanEntity entity) {
        return TEXTURE;
    }
}

