package net.mcreator.varioustextures.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.varioustextures.item.LaserVestItem;
import net.mcreator.varioustextures.VariousAdditionsModElements;
import net.mcreator.varioustextures.VariousAdditionsMod;

import java.util.Map;

@VariousAdditionsModElements.ModElement.Tag
public class RocketOnPlayerProcedure extends VariousAdditionsModElements.ModElement {
	public RocketOnPlayerProcedure(VariousAdditionsModElements instance) {
		super(instance, 132);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure RocketOnPlayer!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency x for procedure RocketOnPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency y for procedure RocketOnPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency z for procedure RocketOnPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency world for procedure RocketOnPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
				: ItemStack.EMPTY).getItem() == new ItemStack(LaserVestItem.body, (int) (1)).getItem())) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;
				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.firework_rocket.launch")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.firework_rocket.launch")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof LivingEntity) {
						Entity _ent = entity;
						if (!_ent.world.isRemote()) {
							ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
							entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 2, 0);
							entityToSpawn.setDamage((float) 3);
							entityToSpawn.setKnockbackStrength((int) 5);
							_ent.world.addEntity(entityToSpawn);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 10);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;
				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.firework_rocket.launch")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
										.getValue(new ResourceLocation("entity.firework_rocket.launch")),
								SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
					}
					if (entity instanceof LivingEntity) {
						Entity _ent = entity;
						if (!_ent.world.isRemote()) {
							ArrowEntity entityToSpawn = new ArrowEntity(_ent.world, (LivingEntity) entity);
							entityToSpawn.shoot(entity.getLookVec().x, entity.getLookVec().y, entity.getLookVec().z, (float) 2, 0);
							entityToSpawn.setDamage((float) 3);
							entityToSpawn.setKnockbackStrength((int) 5);
							_ent.world.addEntity(entityToSpawn);
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 10);
		}
	}
}
