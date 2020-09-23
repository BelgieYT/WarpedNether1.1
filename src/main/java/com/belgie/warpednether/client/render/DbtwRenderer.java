package com.belgie.warpednether.client.render;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.client.model.DbtwModel;
import com.belgie.warpednether.client.model.HumanModel;
import com.belgie.warpednether.entities.DbtwEntity;
import com.belgie.warpednether.entities.HumanEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class DbtwRenderer extends MobRenderer<DbtwEntity, DbtwModel<DbtwEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(WarpedNether.MOD_ID, "textures/entity/dbtw.png");

    public DbtwRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new DbtwModel(), 0.5F);
    }
    

    @Override
    public ResourceLocation getEntityTexture(DbtwEntity entity) {
        return TEXTURE;
    }
}

