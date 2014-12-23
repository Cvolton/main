package com.cvolton.classic.init;

import com.cvolton.classic.help.Reference;
import com.cvolton.classic.help.RegisterHelper;
import com.cvolton.classic.items.Classifier;
import com.cvolton.classic.items.cvoltonBlock;
import com.cvolton.classic.items.cvoltonDiamond;
import com.cvolton.classic.items.cvoltonDoubleSlab;
import com.cvolton.classic.items.cvoltonGlass;
import com.cvolton.classic.items.cvoltonGold;
import com.cvolton.classic.items.cvoltonGrass;
import com.cvolton.classic.items.cvoltonGravel;
import com.cvolton.classic.items.cvoltonIron;
import com.cvolton.classic.items.cvoltonItem;
import com.cvolton.classic.items.cvoltonSlab;
import com.cvolton.classic.items.cvoltonStairs;
import com.cvolton.classic.items.itemBrickSlab;
import com.cvolton.classic.items.itemCvoltonSlab;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModItems {
	public static Item classifier = new Classifier().setUnlocalizedName("classifier");
	//public static Item amethyst = new cvoltonItem().setUnlocalizedName("amethyst");
	public static Block cobbleclass = new cvoltonBlock().setBlockName("cobbleclass").setHardness(2.0F).setResistance(10.0F);
	public static Block cobbleclassstairs = new cvoltonStairs(cobbleclass).setBlockName("cobbleclassstairs").setHardness(2.0F).setResistance(10.0F);
	public static Block grassclass = new cvoltonGrass().setBlockName("grassclass");
	public static Block diaclass = new cvoltonDiamond().setBlockName("diaclass").setHardness(2.0F).setResistance(10.0F);
	public static Block goldclass = new cvoltonGold().setBlockName("goldclass").setHardness(2.0F).setResistance(10.0F);
	public static Block ironclass = new cvoltonIron().setBlockName("ironclass").setHardness(2.0F).setResistance(10.0F);
	public static Block gravelclass = new cvoltonGravel().setBlockName("gravelclass").setHardness(2.0F).setResistance(10.0F);
	public static Block leavesclass = new cvoltonGlass().setBlockName("leavesclass");
	public static Block bricksclass = new cvoltonBlock().setBlockName("bricksclass").setHardness(2.0F).setResistance(10.0F);
	public static Block bricksclassstairs = new cvoltonStairs(bricksclass).setBlockName("bricksclassstairs").setHardness(2.0F).setResistance(10.0F);
	public static Block cobbleSlab = new cvoltonSlab(false, Material.rock).setBlockName("cobbleSlab").setCreativeTab(ModTabs.classtab).setHardness(2.0F).setResistance(10.0F);
	public static Block cobbleSlabDouble = new cvoltonSlab(true, Material.rock).setBlockName("cobbleSlab").setHardness(2.0F).setResistance(10.0F);
	public static Block brickSlab = new com.cvolton.classic.items.brickSlab(false, Material.rock).setBlockName("brickSlab").setCreativeTab(ModTabs.classtab).setHardness(2.0F).setResistance(10.0F);
	public static Block brickSlabDouble = new com.cvolton.classic.items.brickSlab(true, Material.rock).setBlockName("brickSlab").setHardness(2.0F).setResistance(10.0F);
	public static Block cobblemoss = new cvoltonBlock().setBlockName("cobblemoss").setHardness(2.0F).setResistance(10.0F);
	//public static Item cvoltonSlabItem = new itemCvoltonSlab(cobbleSlab).setUnlocalizedName("cvoltonSlab").setCreativeTab(ModTabs.classtab);
	public static void init(){
	RegisterHelper.registerItem(classifier);
	RegisterHelper.registerBlock(cobbleclass);
	GameRegistry.registerBlock(cobbleSlab, itemCvoltonSlab.class, "cobbleSlab");
	GameRegistry.registerBlock(cobbleSlabDouble, itemCvoltonSlab.class, "cobbleSlabDouble");
	RegisterHelper.registerBlock(grassclass);
	RegisterHelper.registerBlock(diaclass);
	RegisterHelper.registerBlock(goldclass);
	RegisterHelper.registerBlock(ironclass);
	RegisterHelper.registerBlock(gravelclass);
	RegisterHelper.registerBlock(leavesclass);
	RegisterHelper.registerBlock(bricksclass);
	RegisterHelper.registerBlock(bricksclassstairs);
	RegisterHelper.registerBlock(cobblemoss);
	RegisterHelper.registerBlock(cobbleclassstairs);
	GameRegistry.registerBlock(brickSlab, itemBrickSlab.class, "brickSlab");
	GameRegistry.registerBlock(brickSlabDouble, itemBrickSlab.class, "brickSlabDouble");
	//RegisterHelper.registerItem(cvoltonSlabItem);
	//RegisterHelper.registerItem(amethyst);¨
	/* * * * TEXTURE SET * * * * */
	classifier.setTextureName("fireworks_charge");
	cobbleclass.setBlockTextureName(Reference.MODID + ":" + "cobbleclass");
	gravelclass.setBlockTextureName(Reference.MODID + ":" + "gravelclass");
	leavesclass.setBlockTextureName(Reference.MODID + ":" + "leavesclass");
	cobbleSlab.setBlockTextureName(Reference.MODID + ":" + "cobbleclass");
	cobbleSlabDouble.setBlockTextureName(Reference.MODID + ":" + "cobbleclass");
	bricksclass.setBlockTextureName(Reference.MODID + ":" + "bricksclass");
	brickSlab.setBlockTextureName(Reference.MODID + ":" + "bricksclass");
	brickSlabDouble.setBlockTextureName(Reference.MODID + ":" + "bricksclass");
	cobblemoss.setBlockTextureName(Reference.MODID + ":" + "cobblemoss");
	//amethyst.setTextureName(Reference.MODID + ":" + "amethyst");
	
}
}
