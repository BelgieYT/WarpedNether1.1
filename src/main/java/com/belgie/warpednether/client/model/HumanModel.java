package com.belgie.warpednether.client.model;

import com.belgie.warpednether.client.render.HumanRenderer;
import com.belgie.warpednether.entities.HumanEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.AbstractZombieModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import javax.annotation.Nullable;


public class HumanModel<T extends HumanEntity> extends QuadrupedModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer headwear;
    private final ModelRenderer body;
    private final ModelRenderer left_arm;
    private final ModelRenderer right_arm;
    private final ModelRenderer left_leg;
    private final ModelRenderer right_leg;


    public HumanModel() {
        super(12, 0.0F, false, 10.0F, 4.0F, 2.0F, 2.0F, 24);


        textureWidth = 64;
            textureHeight = 64;

            head = new ModelRenderer(this);
            head.setRotationPoint(0.0F, 0.0F, 0.0F);
            head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

            headwear = new ModelRenderer(this);
            headwear.setRotationPoint(0.0F, 0.0F, 0.0F);
            headwear.setTextureOffset(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.25F, false);

            body = new ModelRenderer(this);
            body.setRotationPoint(0.0F, 0.0F, 0.0F);
            body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

            left_arm = new ModelRenderer(this);
            left_arm.setRotationPoint(-5.0F, 2.0F, 0.0F);
            left_arm.setTextureOffset(40, 16).addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

            right_arm = new ModelRenderer(this);
            right_arm.setRotationPoint(5.0F, 2.0F, 0.0F);
            right_arm.setTextureOffset(40, 16).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

            left_leg = new ModelRenderer(this);
            left_leg.setRotationPoint(-1.9F, 12.0F, 0.0F);
            left_leg.setTextureOffset(0, 16).addBox(1.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);

            right_leg = new ModelRenderer(this);
            right_leg.setRotationPoint(1.9F, 12.0F, 0.0F);
            right_leg.setTextureOffset(0, 16).addBox(-5.9F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
        }

        @Override
        public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
            this.head.rotateAngleX = headPitch * ((float)Math.PI / 120F);
            this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
            this.body.rotateAngleX = ((float)Math.PI / 90F);
            this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
            this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
            this.left_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        }

        @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            head.render(matrixStack, buffer, packedLight, packedOverlay);
            headwear.render(matrixStack, buffer, packedLight, packedOverlay);
            body.render(matrixStack, buffer, packedLight, packedOverlay);
            left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
            right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
            left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
            right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
}



