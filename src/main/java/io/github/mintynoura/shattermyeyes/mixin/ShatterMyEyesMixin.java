package io.github.mintynoura.shattermyeyes.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import io.github.mintynoura.shattermyeyes.ShatterMyEyes;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.projectile.EyeOfEnder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;


@Mixin(EyeOfEnder.class)
public class ShatterMyEyesMixin {
	@Shadow
	private boolean surviveAfterDeath;

	@WrapOperation(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/projectile/EyeOfEnder;playSound(Lnet/minecraft/sounds/SoundEvent;FF)V"))
	private void shatterMyEyes$shatterSound(EyeOfEnder instance, SoundEvent soundEvent, float f, float g, Operation<Void> original) {
		if (this.surviveAfterDeath) {
			original.call(instance, soundEvent, f, g);
		} else original.call(instance, ShatterMyEyes.ENDER_EYE_SHATTER, f, g);
	}
}