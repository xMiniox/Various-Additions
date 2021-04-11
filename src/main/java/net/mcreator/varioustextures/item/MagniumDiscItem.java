
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

import java.util.List;

@VariousAdditionsModElements.ModElement.Tag
public class MagniumDiscItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:magnium_disc")
	public static final Item block = null;
	public MagniumDiscItem(VariousAdditionsModElements instance) {
		super(instance, 82);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, VariousAdditionsModElements.sounds.get(new ResourceLocation("various_additions:megalovania")),
					new Item.Properties().group(MagniumItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("magnium_disc");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("its a beautiful day outside..."));
		}
	}
}
