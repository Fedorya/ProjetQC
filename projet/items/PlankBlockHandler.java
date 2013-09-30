package projet.items;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import projet.lib.config.Names;

public class PlankBlockHandler extends ItemBlock{

	public PlankBlockHandler(int par1) {
		super(par1);
		
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return Names.Plank_Wood_unlocalizedName[itemstack.getItemDamage()];
	}
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
}
