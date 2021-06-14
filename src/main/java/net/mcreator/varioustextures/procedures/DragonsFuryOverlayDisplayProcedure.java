package net.mcreator.varioustextures.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.varioustextures.potion.DragonsFuryPotion;
import net.mcreator.varioustextures.VariousAdditionsModElements;
import net.mcreator.varioustextures.VariousAdditionsMod;

import java.util.Map;
import java.util.Collection;

@VariousAdditionsModElements.ModElement.Tag
public class DragonsFuryOverlayDisplayProcedure extends VariousAdditionsModElements.ModElement {
	public DragonsFuryOverlayDisplayProcedure(VariousAdditionsModElements instance) {
		super(instance, 301);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure DragonsFuryOverlayDisplay!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			int check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == DragonsFuryPotion.potion)
							return effect.getAmplifier();
					}
				}
				return 0;
			}
		}.check(entity)) == 4)) {
			return (true);
		}
		return (false);
	}
}
