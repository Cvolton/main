package com.cvolton.classic.items;

import com.cvolton.classic.init.ModTabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Classifier extends Item
{
        public Classifier()
        {
                super();
                setCreativeTab(ModTabs.classtab);
                maxStackSize = 1;
                setMaxDamage(255);
        }
       
        @Override
        public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack)
        {
                return false;
        }
        public boolean hasContainerItem(ItemStack stack) {
			return true;
		}
        @Override
        public ItemStack getContainerItem(ItemStack itemStack)
        {
            ItemStack cStack = itemStack.copy();
           cStack.setItemDamage(cStack.getItemDamage() + 1);
            cStack.stackSize = 1;
            return cStack;
        }
}