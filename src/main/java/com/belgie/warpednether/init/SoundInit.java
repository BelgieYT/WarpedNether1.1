package com.belgie.warpednether.init;

import com.belgie.warpednether.WarpedNether;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WarpedNether.MOD_ID);

    public static final RegistryObject<SoundEvent> AMBIENT = SOUNDS.register("entity.dbtw_entity.ambient",
            () -> new SoundEvent(new ResourceLocation(WarpedNether.MOD_ID, "entity.dbtw_entity.ambient")));

    public static final RegistryObject<SoundEvent> HURT = SOUNDS.register("entity.dbtw_entity.hurt",
            () -> new SoundEvent(new ResourceLocation(WarpedNether.MOD_ID, "entity.dbtw_entity.hurt")));

    public static final RegistryObject<SoundEvent> DEATH = SOUNDS.register("entity.dbtw_entity.death",
            () -> new SoundEvent(new ResourceLocation(WarpedNether.MOD_ID, "entity.dbtw_entity.death")));

}
