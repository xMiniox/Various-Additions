package net.mcreator.varioustextures.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.varioustextures.item.MissilesItem;
import net.mcreator.varioustextures.VariousAdditionsModElements;
import net.mcreator.varioustextures.VariousAdditionsMod;

import java.util.Map;

@VariousAdditionsModElements.ModElement.Tag
public class MissileSwarmProcedure extends VariousAdditionsModElements.ModElement {
	public MissileSwarmProcedure(VariousAdditionsModElements instance) {
		super(instance, 158);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure MissileSwarm!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(MissilesItem.block, (int) (1)).getItem())
				|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(MissilesItem.block, (int) (1)).getItem()))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).getCooldownTracker().setCooldown((new ItemStack(MissilesItem.block, (int) (1))).getItem(), (int) 200);
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
					entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 0.5, 0);
					entityToSpawn.setDamage((float) 1);
					entityToSpawn.setKnockbackStrength((int) 1);
					_ent.world.addEntity(entityToSpawn);
				}
			}
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
					entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 1, 0);
					entityToSpawn.setDamage((float) 1);
					entityToSpawn.setKnockbackStrength((int) 1);
					_ent.world.addEntity(entityToSpawn);
				}
			}
			if (entity instanceof LivingEntity) {
				Entity _ent = entity;
				if (!_ent.world.isRemote()) {
					ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
					entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 1.5, 0);
					entityToSpawn.setDamage((float) 1);
					entityToSpawn.setKnockbackStrength((int) 1);
					_ent.world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
