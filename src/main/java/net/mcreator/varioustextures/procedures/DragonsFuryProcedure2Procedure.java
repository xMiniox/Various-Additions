package net.mcreator.varioustextures.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.varioustextures.potion.DragonsFuryPotion;
import net.mcreator.varioustextures.item.DragonSwordItem;
import net.mcreator.varioustextures.VariousAdditionsModElements;
import net.mcreator.varioustextures.VariousAdditionsMod;

import java.util.Map;
import java.util.Collection;

@VariousAdditionsModElements.ModElement.Tag
public class DragonsFuryProcedure2Procedure extends VariousAdditionsModElements.ModElement {
	public DragonsFuryProcedure2Procedure(VariousAdditionsModElements instance) {
		super(instance, 308);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure DragonsFuryProcedure2!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == DragonsFuryPotion.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) == (false))) {
			(new ItemStack(DragonSwordItem.block, (int) (1))).setDamage((int) 5);
		} else if (((new Object() {
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
			(new ItemStack(DragonSwordItem.block, (int) (1))).setDamage((int) 6);
		} else if (((new Object() {
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
			(new ItemStack(DragonSwordItem.block, (int) (1))).setDamage((int) 7);
		} else if (((new Object() {
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
			(new ItemStack(DragonSwordItem.block, (int) (1))).setDamage((int) 8);
		} else if (((new Object() {
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
			(new ItemStack(DragonSwordItem.block, (int) (1))).setDamage((int) 9);
		} else if (((new Object() {
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
			(new ItemStack(DragonSwordItem.block, (int) (1))).setDamage((int) 10);
		}
	}
}
