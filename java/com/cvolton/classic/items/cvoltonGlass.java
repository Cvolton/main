package com.cvolton.classic.items;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.cvolton.classic.init.ModTabs;

public class cvoltonGlass extends Block {
	public cvoltonGlass()
	{
	super(Material.leaves);
	setCreativeTab(ModTabs.classtab);
	this.setHardness(0.2F);
    this.setLightOpacity(1);
    this.setStepSound(soundTypeGrass);
	}
	public boolean isOpaqueCube()
	{
			return false;
	}
	public int quantityDropped(Random p_149745_1_)
    {
        return p_149745_1_.nextInt(20) == 0 ? 1 : 0;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(Blocks.sapling);
    }
    protected boolean canSilkHarvest()
    {
        return true;
    }
}
