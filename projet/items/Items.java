package projet.items;

import cpw.mods.fml.common.registry.LanguageRegistry;
import projet.lib.config.Ids;
import projet.lib.config.Names;
import net.minecraft.item.Item;

public class Items {
	public static Item Frag_Copper;
	public static Item Ingot_Copper;
	public static Item Nugget_Copper;
	
	public static Item Frag_Tin;
	public static Item Ingot_Tin;
	public static Item Nugget_Tin;
	
	public static Item Frag_Adamantite;
	public static Item Nugget_Adamantite;
	
	public static Item Frag_Iron;
	public static Item Nugget_Iron;
	
	public static Item Frag_Gold;
	
	public static Item Ingot_Bronze;
	public static Item Nugget_Bronze;
	
	public static Item Ingot_Steel;
	public static Item Nugget_Steel;
	
	public static Item Ingot_BronzeSteel;
	
	public static Item Gem_Ametyste;
	public static Item Gem_Ruby;
	public static Item Gem_Saphir;
	public static Item Gem_Onyx;
	public static Item Gem_Quartz;
	
	public static void init(){
		Frag_Copper = new OreFragment(Ids.Frag_Copper_actual, Names.Frag_Copper_unlocalizedName);
		Frag_Tin = new OreFragment(Ids.Frag_Tin_actual, Names.Frag_Tin_unlocalizedName);
		Frag_Iron = new OreFragment(Ids.Frag_Iron_actual, Names.Frag_Iron_unlocalizedName);
		Frag_Gold = new  OreFragment(Ids.Frag_Gold_actual, Names.Frag_Gold_unlocalizedName);
		Frag_Adamantite = new OreFragment(Ids.Frag_Adamantite_actual, Names.Frag_Adamantite_unlocalizedName);
		
		Nugget_Copper = new MetalNugget(Ids.Nugget_Copper_actual, Names.Nugget_Copper_unlocalizedName);
		Nugget_Tin = new MetalNugget(Ids.Nugget_Tin_actual, Names.Nugget_Tin_unlocalizedName);
		Nugget_Iron = new MetalNugget(Ids.Nugget_Iron_actual, Names.Nugget_Iron_unlocalizedName);
		Nugget_Bronze = new MetalNugget(Ids.Nugget_Bronze_actual, Names.Nugget_Bronze_unlocalizedName);
		Nugget_Steel = new MetalNugget(Ids.Nugget_Steel_actual, Names.Nugget_Steel_unlocalizedName);
		Nugget_Adamantite = new MetalNugget(Ids.Nugget_Adamantite_actual, Names.Nugget_Adamantite_unlocalizedName);
		
		Ingot_Copper = new MetalIngot(Ids.Ingot_Copper_actual, Names.Ingot_Copper_unlocalizedName);
		Ingot_Tin = new MetalIngot(Ids.Ingot_Tin_actual, Names.Ingot_Tin_unlocalizedName);
		Ingot_Bronze = new MetalIngot(Ids.Ingot_Bronze_actual, Names.Ingot_Bronze_unlocalizedName);
		Ingot_Steel = new MetalIngot(Ids.Ingot_Steel_actual, Names.Ingot_Steel_unlocalizedName);
		Ingot_BronzeSteel = new MetalIngot(Ids.Ingot_BronzeSteel_actual, Names.Ingot_BronzeSteel_unlocalizedName);
		
		Gem_Ametyste = new GemItem(Ids.Gem_Amethyst_actual, Names.Gem_Amethyst_unlocalizedName);
		Gem_Ruby = new GemItem(Ids.Gem_Ruby_actual, Names.Gem_Ruby_unlocalizedName);
		Gem_Saphir = new GemItem(Ids.Gem_Saphir_actual, Names.Gem_Saphir_unlocalizedName);
		Gem_Onyx = new GemItem(Ids.Gem_Onyx_actual, Names.Gem_Onyx_unlocalizedName);
		Gem_Quartz = new GemItem(Ids.Gem_Quartz_actual, Names.Gem_Quartz_unlocalizedName);
	}
	public static void addNames(){
		LanguageRegistry.addName(Frag_Copper,Names.Frag_Copper_Name);
		LanguageRegistry.addName(Frag_Tin,Names.Frag_Tin_Name);
		LanguageRegistry.addName(Frag_Iron,Names.Frag_Iron_Name);
		LanguageRegistry.addName(Frag_Gold,Names.Frag_Gold_Name);
		LanguageRegistry.addName(Frag_Adamantite,Names.Frag_Adamantite_Name);
		
		LanguageRegistry.addName(Nugget_Copper,Names.Nugget_Copper_Name);
		LanguageRegistry.addName(Nugget_Tin,Names.Nugget_Tin_Name);
		LanguageRegistry.addName(Nugget_Iron,Names.Nugget_Iron_Name);
		LanguageRegistry.addName(Nugget_Bronze,Names.Nugget_Bronze_Name);
		LanguageRegistry.addName(Nugget_Steel,Names.Nugget_Steel_Name);
		LanguageRegistry.addName(Nugget_Adamantite,Names.Nugget_Adamantite_Name);
		
		LanguageRegistry.addName(Ingot_Copper,Names.Ingot_Copper_Name);
		LanguageRegistry.addName(Ingot_Tin,Names.Ingot_Tin_Name);
		LanguageRegistry.addName(Ingot_Bronze,Names.Ingot_Bronze_Name);	
		LanguageRegistry.addName(Ingot_Steel,Names.Ingot_Steel_Name);
		LanguageRegistry.addName(Ingot_BronzeSteel,Names.Ingot_BronzeSteel_Name);
		
		LanguageRegistry.addName(Gem_Ametyste,Names.Gem_Amethyst_Name);
		LanguageRegistry.addName(Gem_Ruby,Names.Gem_Ruby_Name);
		LanguageRegistry.addName(Gem_Saphir,Names.Gem_Saphir_Name);
		LanguageRegistry.addName(Gem_Onyx,Names.Gem_Onyx_Name);
		LanguageRegistry.addName(Gem_Quartz,Names.Gem_Quartz_Name);
	}
}
