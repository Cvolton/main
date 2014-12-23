package com.cvolton.classic.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModRecipesClassifier {
	public static final int WILDCARD_VALUE = Short.MAX_VALUE;
	public static void init(){
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cobbleclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.cobblestone), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cobbleclassstairs, 1, 1), new Object[]
			{
				new ItemStack(Blocks.stone_stairs), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.grassclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.grass), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.diaclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.diamond_block), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.goldclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.gold_block), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ironclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.iron_block), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gravelclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.gravel), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.leavesclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.leaves, 1, WILDCARD_VALUE), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.leavesclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.leaves2, 1, WILDCARD_VALUE), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bricksclass, 1, 1), new Object[]
			{
				new ItemStack(Blocks.brick_block), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.bricksclassstairs, 1, 1), new Object[]
			{
				new ItemStack(Blocks.brick_stairs), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cobbleSlab, 1, 1), new Object[]
			{
				new ItemStack(Blocks.stone_slab, 1, 3), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.brickSlab, 1, 1), new Object[]
			{
				new ItemStack(Blocks.stone_slab, 1, 4), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cobblemoss, 1, 1), new Object[]
			{
				new ItemStack(Blocks.mossy_cobblestone), new ItemStack(ModItems.classifier, 1, WILDCARD_VALUE)
			});
	
	}
	
}
