package net.mcreator.varioustextures.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.varioustextures.item.ArtifactFlyItem;
import net.mcreator.varioustextures.VariousAdditionsModElements;
import net.mcreator.varioustextures.VariousAdditionsMod;

import java.util.Map;

@VariousAdditionsModElements.ModElement.Tag
public class ArtifactFlyProcedureProcedure extends VariousAdditionsModElements.ModElement {
	public ArtifactFlyProcedureProcedure(VariousAdditionsModElements instance) {
		super(instance, 197);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure ArtifactFlyProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(ArtifactFlyItem.block, (int) (1)).getItem())
				|| (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemOffhand() : ItemStack.EMPTY)
						.getItem() == new ItemStack(ArtifactFlyItem.block, (int) (1)).getItem()))) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.isFlying = (true);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
	}
}
