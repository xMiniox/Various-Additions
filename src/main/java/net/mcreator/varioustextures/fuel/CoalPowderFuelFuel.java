
package net.mcreator.varioustextures.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.varioustextures.item.CoalPowderItem;
import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class CoalPowderFuelFuel extends VariousAdditionsModElements.ModElement {
	public CoalPowderFuelFuel(VariousAdditionsModElements instance) {
		super(instance, 287);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(CoalPowderItem.block, (int) (1)).getItem())
			event.setBurnTime(800);
	}
}
