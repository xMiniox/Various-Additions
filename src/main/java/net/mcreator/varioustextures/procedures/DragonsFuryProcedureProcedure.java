package net.mcreator.varioustextures.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.varioustextures.potion.DragonsFuryPotion;
import net.mcreator.varioustextures.item.DragonSwordItem;
import net.mcreator.varioustextures.VariousAdditionsModElements;
import net.mcreator.varioustextures.VariousAdditionsMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

@VariousAdditionsModElements.ModElement.Tag
public class DragonsFuryProcedureProcedure extends VariousAdditionsModElements.ModElement {
	public DragonsFuryProcedureProcedure(VariousAdditionsModElements instance) {
		super(instance, 307);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure DragonsFuryProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DragonSwordItem.block, (int) (1)).getItem()) && ((((new Object() {
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
				}.check(entity)) != 0) && ((new Object() {
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
				}.check(entity)) != 1)) && (((new Object() {
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
				}.check(entity)) != 2) && (((new Object() {
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
				}.check(entity)) != 3) && ((new Object() {
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
				}.check(entity)) != 4)))))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 0));
		}
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DragonSwordItem.block, (int) (1)).getItem()) && ((new Object() {
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
				}.check(entity)) == 0))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 1));
		}
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DragonSwordItem.block, (int) (1)).getItem()) && ((new Object() {
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
				}.check(entity)) == 1))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 2));
		}
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DragonSwordItem.block, (int) (1)).getItem()) && ((new Object() {
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
				}.check(entity)) == 2))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 3));
		}
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DragonSwordItem.block, (int) (1)).getItem()) && ((new Object() {
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
				}.check(entity)) == 3))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 4));
		}
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(DragonSwordItem.block, (int) (1)).getItem()) && ((new Object() {
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
				}.check(entity)) == 4))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(DragonsFuryPotion.potion, (int) 60, (int) 4));
		}
	}

	@SubscribeEvent
	public void onPlayerCriticalHit(CriticalHitEvent event) {
		Entity entity = event.getTarget();
		PlayerEntity sourceentity = event.getPlayer();
		double i = sourceentity.getPosX();
		double j = sourceentity.getPosY();
		double k = sourceentity.getPosZ();
		World world = sourceentity.world;
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("sourceentity", sourceentity);
		dependencies.put("damagemodifier", event.getDamageModifier());
		dependencies.put("isvanillacritical", event.isVanillaCritical());
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
