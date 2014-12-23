package com.cvolton.classic.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipesClassic {
	public static void init() {
	GameRegistry.addRecipe(new ItemStack(ModItems.cobbleSlab, 1), new Object[] {"###", '#', ModItems.cobbleclass});
	GameRegistry.addRecipe(new ItemStack(ModItems.brickSlab, 1), new Object[] {"###", '#', ModItems.bricksclass});
	GameRegistry.addRecipe(new ItemStack(ModItems.cobbleclassstairs, 1), new Object[] {"#  ", "## ", "###", '#', ModItems.cobbleclass});
	GameRegistry.addRecipe(new ItemStack(ModItems.bricksclassstairs, 1), new Object[] {"#  ", "## ", "###", '#', ModItems.bricksclass});
	GameRegistry.addRecipe(new ItemStack(ModItems.classifier, 1), new Object[] {"###", "#X#", "###", '#', Blocks.cobblestone, 'X', Items.gold_ingot});
	}
}
