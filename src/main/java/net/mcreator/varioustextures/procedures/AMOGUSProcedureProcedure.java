package net.mcreator.varioustextures.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.varioustextures.item.AmogusItem;
import net.mcreator.varioustextures.VariousAdditionsModElements;
import net.mcreator.varioustextures.VariousAdditionsMod;

import java.util.Map;

@VariousAdditionsModElements.ModElement.Tag
public class AMOGUSProcedureProcedure extends VariousAdditionsModElements.ModElement {
	public AMOGUSProcedureProcedure(VariousAdditionsModElements instance) {
		super(instance, 160);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VariousAdditionsMod.LOGGER.warn("Failed to load dependency entity for procedure AMOGUSProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() == 0.1)) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(AmogusItem.block, (int) (1));
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"kill");
				}
			}
		} else {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(AmogusItem.block, (int) (1));
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(Items.DIAMOND, (int) (1));
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
		}
	}
}
