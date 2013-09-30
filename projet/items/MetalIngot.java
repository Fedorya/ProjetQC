package projet.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import projet.Main;
import projet.lib.ModInfo;
import projet.lib.config.Names;

public class MetalIngot extends Item{
	
	final String unLocaName;
	
	public MetalIngot(int id, String pUnLocaName){
		super(id);
		
		unLocaName = pUnLocaName;
		
		this.setCreativeTab(Main.ProjetCreativetabMaterials);
		this.setUnlocalizedName(unLocaName);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + unLocaName);
	}
}
