package com.cvolton.classic.items;

import java.util.List;
import java.util.Random;

import com.cvolton.classic.init.ModItems;
import com.cvolton.classic.init.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class brickSlab extends BlockSlab
{
public static final String[] woodType = { "blockMySlab" };

public brickSlab(boolean isDouble, Material mat)
{
super(isDouble, mat);
useNeighborBrightness = true;
}

public void registerIcons(IIconRegister par1IconRegister)
{
this.blockIcon = par1IconRegister.registerIcon("mm:myslab");
}

public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
{
return Item.getItemFromBlock(ModItems.brickSlab);
}

public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
{
if(par1World.getBlock(par2, par3 - 1, par4) == ModItems.brickSlab)
{
par1World.setBlock(par2, par3 - 1, par4, ModItems.brickSlabDouble);
}
if(par1World.getBlock(par2, par3 + 1, par4) == ModItems.brickSlab)
{
par1World.setBlock(par2, par3 + 1, par4, ModItems.brickSlabDouble);
}
}

protected ItemStack createStackedBlock(int par1)
{
return new ItemStack(ModItems.brickSlab, 2, par1 & 7);
}

public String getFullSlabName(int par1)
{
if ((par1 < 0) || (par1 >= woodType.length))
{
par1 = 0;
}

return getUnlocalizedName() + "." + woodType[par1];
}

public void getSubBlocks(Block block, CreativeTabs par2CreativeTabs, List par3List)
{
if (block != ModItems.brickSlabDouble)
{
par3List.add(new ItemStack(block, 1, 0));
}
}

@Override
public String func_150002_b(int p_150002_1_) {
	// TODO Auto-generated method stub
	return getUnlocalizedName();
}

}