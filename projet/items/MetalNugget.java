package projet.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import projet.Main;
import projet.lib.ModInfo;
import projet.lib.config.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MetalNugget extends Item{
	
	final String unLocalName;
	
	public MetalNugget(int id, String pUnLocaName){
		super(id);
		
		unLocalName = pUnLocaName;
		
		this.setCreativeTab(Main.ProjetCreativetabMaterials);
		this.setUnlocalizedName(pUnLocaName);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister icon){
		itemIcon = icon.registerIcon(ModInfo.ID.toLowerCase() + ":" + unLocalName);
	}
}
