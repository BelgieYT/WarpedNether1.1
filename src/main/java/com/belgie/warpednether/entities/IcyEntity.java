package com.belgie.warpednether.entities;
import com.belgie.warpednether.init.ModEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.HuskEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;


public class IcyEntity extends AnimalEntity {

    private AgeableEntity child;

    public IcyEntity(EntityType<? extends AnimalEntity> type, World worldIn) {
        super(type, worldIn);

    }
        public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
            return MobEntity.func_233666_p_()
                    .createMutableAttribute(Attributes.MAX_HEALTH, 12.0D)
                    .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.25D);
        }
    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new PanicGoal(this, 1.25D ) );
        this.goalSelector.addGoal(2, new BreedGoal(this, 3.8D));
        this.goalSelector.addGoal(3, new FollowParentGoal(this, 1.1D));
        this.goalSelector.addGoal(4, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(6, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(7, new HurtByTargetGoal(this));
        this.goalSelector.addGoal(8, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(10, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
    }



        {}
        @Override
        protected int getExperiencePoints(PlayerEntity player) {
            return 1 + this.world.rand.nextInt(4);
        }



        @Override
        protected SoundEvent getAmbientSound() { return SoundEvents.ENTITY_STRIDER_AMBIENT; }


        @Override
        protected SoundEvent getDeathSound() { return SoundEvents.ENTITY_STRIDER_DEATH; }


        @Override
        protected SoundEvent getHurtSound(DamageSource damageSourceIn) { return SoundEvents.ENTITY_STRIDER_HURT; }


        @Override
        protected void playStepSound(BlockPos pos, BlockState blockIn) {
            this.playSound(SoundEvents.ENTITY_STRIDER_STEP, 0.25F, 1.5F);
        }

        @Nullable
        @Override
        public AgeableEntity createChild(AgeableEntity ageable) {
            return ModEntityTypes.icy.get().create(this.world);
        }
            @Nullable
            public AgeableEntity getChild()
            {
                return child;
            }

            public void setChild(AgeableEntity proposedChild)
            {
                child = proposedChild;
            }
        }




