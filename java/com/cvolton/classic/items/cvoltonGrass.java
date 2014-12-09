package com.cvolton.classic.items;

import java.util.Random;

import com.cvolton.classic.help.Reference;
import com.cvolton.classic.init.ModTabs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class cvoltonGrass extends Block{
	public IIcon Bottom;
	public IIcon Top;
	public IIcon Side2;
	public cvoltonGrass()
	{
	super(Material.grass);
	setCreativeTab(ModTabs.classtab);
	setHardness(0.6F);
	}
	public void registerBlockIcons(IIconRegister icon){
	Bottom = icon.registerIcon("minecraft:dirt");
	Top = icon.registerIcon(Reference.MODID + ":grass_top");
	Side2 = icon.registerIcon(Reference.MODID + ":grass_side");
	
	}
	public IIcon getIcon(int side, int meta)
	    {
		if(side == 0){
			return Bottom;
		}else if(side == 1){
			return Top;
		}else if(side == 2){
			return Side2;
		}else if(side == 3){
			return Side2;
		}else if(side == 4){
			return Side2;
		}else if(side == 5){
			return Side2;
		}
	        return null;
	    }
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Blocks.dirt.getItemDropped(0, p_149650_2_, p_149650_3_);
    }
	
	
	}

