
package net.mcreator.varioustextures.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

import java.util.List;

@VariousAdditionsModElements.ModElement.Tag
public class MagniumCatalystItem extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:magnium_catalyst")
	public static final Item block = null;
	public MagniumCatalystItem(VariousAdditionsModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MagniumItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.RARE));
			setRegistryName("magnium_catalyst");
		}

		@Override
		public boolean hasContainerItem() {
			return true;
		}

		@Override
		public ItemStack getContainerItem(ItemStack itemstack) {
			return new ItemStack(this);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Catalyst for crafting some magnium items"));
		}
	}
}
