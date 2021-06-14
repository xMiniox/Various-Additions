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
public class DragonsFuryProcedureProcedure extends VariousAdditionsModElements.ModElement {
	public DragonsFuryProcedureProcedure(VariousAdditionsModElements instance) {
		super(instance, 298);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure DragonsFuryProcedure!");
			return;
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
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 4));
		}
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
		}.check(entity)) == 3)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 4));
		}
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
		}.check(entity)) == 2)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 3));
		}
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
		}.check(entity)) == 1)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 2));
		}
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
		}.check(entity)) == 0)) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 1));
		}
	}
}
