
package net.mcreator.varioustextures.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.varioustextures.itemgroup.MagniumItemGroup;
import net.mcreator.varioustextures.VariousAdditionsModElements;

import java.util.List;
import java.util.Collections;

@VariousAdditionsModElements.ModElement.Tag
public class EterniumBlockBlock extends VariousAdditionsModElements.ModElement {
	@ObjectHolder("various_additions:eternium_block")
	public static final Block block = null;
	public EterniumBlockBlock(VariousAdditionsModElements instance) {
		super(instance, 93);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(MagniumItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.IRON).sound(SoundType.NETHERITE).hardnessAndResistance(5f, 10f).setLightLevel(s -> 0)
					.harvestLevel(8).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("eternium_block");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
