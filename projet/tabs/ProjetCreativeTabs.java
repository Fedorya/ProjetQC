package projet.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import projet.blocks.Blocks;

public class ProjetCreativeTabs extends CreativeTabs{
	public ProjetCreativeTabs(String label){
		super(label);
	}
	
	@Override
	public ItemStack getIconItemStack(){
	    return new ItemStack(Blocks.Ore_Copper);
	}
}
