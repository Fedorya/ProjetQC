package projet.items;

import projet.Main;
import projet.lib.ModInfo;
import projet.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class OreFragment extends Item{
	
	final String unLocalName;
	
	public OreFragment(int id, String pUnlocaName){
		super(id);
		
		unLocalName = pUnlocaName;
		
		this.setCreativeTab(Main.ProjetCreativetabRessources);
		this.setUnlocalizedName(unLocalName);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + unLocalName);
	}
}
