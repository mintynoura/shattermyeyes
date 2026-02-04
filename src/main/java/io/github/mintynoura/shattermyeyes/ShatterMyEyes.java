package io.github.mintynoura.shattermyeyes;

import net.fabricmc.api.ModInitializer;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class ShatterMyEyes implements ModInitializer {
	public static final String MOD_ID = "shattermyeyes";
	public static final ResourceLocation SOUND_ID = new ResourceLocation(MOD_ID, "entity.ender_eye.shatter");

	public static final SoundEvent ENDER_EYE_SHATTER = Registry.register(BuiltInRegistries.SOUND_EVENT, SOUND_ID, SoundEvent.createVariableRangeEvent(SOUND_ID));

	@Override
	public void onInitialize() {
	}
}