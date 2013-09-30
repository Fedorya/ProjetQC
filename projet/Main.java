package projet;

import java.util.logging.Level;

import net.minecraft.creativetab.CreativeTabs;
import projet.blocks.Blocks;
import projet.generation.Generation;
import projet.items.Items;
import projet.lib.LogHelper;
import projet.lib.ModInfo;
import projet.lib.Recipe.CopperRecipe;
import projet.lib.Recipe.Recipes;
import projet.lib.Recipe.TinRecipe;
import projet.lib.config.ConfigHandler;
import projet.proxies.CommonProxy;
import projet.tabs.ProjetCreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
//Poney2
@Mod( modid= ModInfo.ID, name= ModInfo.NAME, version=ModInfo.VERSION )
@NetworkMod( channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = true )
public class Main {
	@SidedProxy(clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy", serverSide= ModInfo.PROXY_LOCATION + ".CommonProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs ProjetCreativetabBlocks = new ProjetCreativeTabs("Blocks");
	public static CreativeTabs ProjetCreativetabDecorations = new ProjetCreativeTabs("Decorations");
	public static CreativeTabs ProjetCreativetabRessources = new ProjetCreativeTabs("Ressources");
	public static CreativeTabs ProjetCreativetabMaterials = new ProjetCreativeTabs("Materials");
	
	@EventHandler
	public static void preInit( FMLPreInitializationEvent event){
		LogHelper.init();
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public static void Init( FMLInitializationEvent event){
		LogHelper.log(Level.INFO, "Preparing items");
		Items.init();
		Items.addNames();
		LogHelper.log(Level.INFO, "Items loaded");
		
		LogHelper.log(Level.INFO, "Preparing blocks");
		Blocks.init();
		Blocks.addNames();
		LogHelper.log(Level.INFO, "Blocks loaded");
		
		LogHelper.log(Level.INFO, "Preparing recipes");
		Recipes.init();
		CopperRecipe.init();
		TinRecipe.init();
		LogHelper.log(Level.INFO, "Recipes loaded");
		
		GameRegistry.registerWorldGenerator(new Generation());
	}
	
	@EventHandler
	public static void postInit( FMLPostInitializationEvent event){
		
	}
}
