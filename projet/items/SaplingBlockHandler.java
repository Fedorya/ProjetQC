package projet.items;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import projet.lib.config.Names;

public class SaplingBlockHandler extends ItemBlock{

	public SaplingBlockHandler(int par1) {
		super(par1);
		
		setHasSubtypes(true);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack) {
		return Names.Sapling_Type_unlocalizedName[itemstack.getItemDamage()];
	}
	@Override
	public int getMetadata(int damage) {
		return damage;
	}
}
