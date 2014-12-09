package com.cvolton.classic.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init(){
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cobbleclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.cobblestone)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.grassclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.grass)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diaclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.diamond_block)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.goldclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.gold_block)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.iron_block)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gravelclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.gravel)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.leavesclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.leaves)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bricksclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.brick_block)
			});
	GameRegistry.addShapedRecipe(new ItemStack(ModItems.cobbleSlab, 1, 1), new Object[]
			{
				"###", '#', ModItems.cobbleclass
			});
	
	}
	
}
