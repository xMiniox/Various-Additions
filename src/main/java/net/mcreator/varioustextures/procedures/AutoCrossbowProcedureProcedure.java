package net.mcreator.varioustextures.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.varioustextures.item.AutoCrossbowItem;
import net.mcreator.varioustextures.VariousAdditionsModElements;
import net.mcreator.varioustextures.VariousAdditionsMod;

import java.util.Map;

@VariousAdditionsModElements.ModElement.Tag
public class AutoCrossbowProcedureProcedure extends VariousAdditionsModElements.ModElement {
	public AutoCrossbowProcedureProcedure(VariousAdditionsModElements instance) {
		super(instance, 268);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure AutoCrossbowProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown((new ItemStack(AutoCrossbowItem.block, (int) (1))).getItem(), (int) 10);
	}
}
