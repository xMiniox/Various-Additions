
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

@VariousAdditionsModElements.ModElement.Tag
public class CodSushiItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:cod_sushi")
	public static final Item block = null;
	public CodSushiItem(VariousAdditionsModElements instance) {
		super(instance, 105);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MagniumItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(6).saturation(4f).build()));
			setRegistryName("cod_sushi");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
