package projet.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import projet.items.Items;
import projet.items.PlankBlockHandler;
import projet.items.SaplingBlockHandler;
import projet.lib.config.Ids;
import projet.lib.config.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	public static Block Ore_Copper;
	public static Block Ore_Tin;
	public static Block Ore_Adamantite;
	public static Block Ore_Amethyst;
	public static Block Ore_Onyx;
	public static Block Ore_Quartz;
	public static Block Ore_Ruby;
	public static Block Ore_Saphir;
	public static Block Ore_Slate;
	
	public static Block Block_Copper;
	public static Block Block_Tin;
	public static Block Block_Bronze;
	public static Block Block_Steel;
	public static Block Block_BronzeSteel;
	
	public static Block Block_Ametyste;
	public static Block Block_Onyx;
	public static Block Block_Quartz;
	public static Block Block_Ruby;
	public static Block Block_Saphir;
	
	public static Block Log_AppleTree;
	public static Block Log_BananaTree;
	public static Block Log_Baobab;
	public static Block Log_CherryTree;
	public static Block Log_MapleTree;
	public static Block Log_OrangeTree;
	public static Block Log_PalmTree;
	
	public static Block Plank_Wood;
	
	public static Block Leave_AppleTree;
	public static Block Leave_BananaTree;
	public static Block Leave_Baobab;
	public static Block Leave_CherryTree;
	public static Block Leave_Maple;
	public static Block Leave_OrangeTree;
	public static Block Leave_PalmTree;
	
	public static Block Sapling_Type;
	
	public static void init() {
		/* Minerais */
		Ore_Copper = new OreBlock(Ids.Ore_Copper_actual, Names.Ore_Copper_unlocalizedName, Items.Frag_Copper.itemID);
		Ore_Tin = new OreBlock(Ids.Ore_Tin_actual, Names.Ore_Tin_unlocalizedName, Items.Frag_Tin.itemID);
		Ore_Amethyst = new OreBlock(Ids.Ore_Amethyst_actual, Names.Ore_Amethyst_unlocalizedName, Items.Gem_Ametyste.itemID);
		Ore_Onyx = new OreBlock(Ids.Ore_Onyx_actual, Names.Ore_Onyx_unlocalizedName, Items.Gem_Onyx.itemID);
		Ore_Quartz = new OreBlock(Ids.Ore_Quartz_actual, Names.Ore_Quartz_unlocalizedName, Items.Gem_Quartz.itemID);
		Ore_Ruby = new OreBlock(Ids.Ore_Ruby_actual, Names.Ore_Ruby_unlocalizedName, Items.Gem_Ruby.itemID);
		Ore_Saphir = new OreBlock(Ids.Ore_Saphir_actual, Names.Ore_Saphir_unlocalizedName, Items.Gem_Saphir.itemID);
		Ore_Adamantite = new OreBlock(Ids.Ore_Adamantite_actual, Names.Ore_Adamantite_unlocalizedName, Items.Frag_Adamantite.itemID);
		Ore_Slate = new OreSlate(Ids.Ore_Slate_actual);
		
		/* Métaux */
		Block_Copper = new MetalBlock(Ids.Block_Copper_actual, Names.Block_Copper_unlocalizedName);
		Block_Tin = new MetalBlock(Ids.Block_Tin_actual, Names.Block_Tin_unlocalizedName);
		Block_Bronze = new MetalBlock(Ids.Block_Bronze_actual, Names.Block_Bronze_unlocalizedName);
		Block_Steel = new MetalBlock(Ids.Block_Steel_actual, Names.Block_Steel_unlocalizedName);
		Block_BronzeSteel = new MetalBlock(Ids.Block_BronzeSteel_actual, Names.Block_BronzeSteel_unlocalizedName);
		
		/* Gem */
		Block_Ametyste = new GemBlock(Ids.Block_Amethyst_actual,Names.Block_Amethyst_unlocalizedName);
		Block_Onyx = new GemBlock(Ids.Block_Onyx_actual,Names.Block_Onyx_unlocalizedName);
		Block_Quartz = new GemBlock(Ids.Block_Quartz_actual,Names.Block_Quartz_unlocalizedName);
		Block_Ruby = new GemBlock(Ids.Block_Ruby_actual,Names.Block_Ruby_unlocalizedName);
		Block_Saphir = new GemBlock(Ids.Block_Saphir_actual,Names.Block_Saphir_unlocalizedName);
		
		/* Log Tree */
		Log_AppleTree = new LogAppleTree(Ids.Log_AppleTree_actual, Names.Log_AppleTree_unlocalizedName);
		Log_BananaTree = new LogBananaTree(Ids.Log_BananaTree_actual, Names.Log_BananaTree_unlocalizedName);
		Log_Baobab = new LogBaobab(Ids.Log_Baobab_actual, Names.Log_Baobab_unlocalizedName);
		Log_CherryTree = new LogCherryTree(Ids.Log_CherryTree_actual, Names.Log_CherryTree_unlocalizedName);
		Log_MapleTree = new LogMaple(Ids.Log_Maple_actual, Names.Log_Maple_unlocalizedName);
		Log_OrangeTree = new LogOrangeTree(Ids.Log_OrangeTree_actual, Names.Log_OrangeTree_unlocalizedName);
		Log_PalmTree = new LogPalmTree(Ids.Log_PalmTree_actual, Names.Log_PalmTree_unlocalizedName);
		
		/* Planks */
		Plank_Wood = new PlankBlock(Ids.Plank_Wood_actual);
		
		/* Leave */
		Leave_AppleTree = new LeaveAppleTree(Ids.Leave_AppleTree_actual);
		Leave_BananaTree = new LeaveBananaTree(Ids.Leave_BananaTree_actual);
		Leave_Baobab = new LeaveBaobab(Ids.Leave_Baobab_actual);
		Leave_CherryTree = new LeaveCherryTree(Ids.Leave_CherryTree_actual);
		Leave_Maple = new LeaveMaple(Ids.Leave_Maple_actual);
		Leave_OrangeTree = new LeaveOrangeTree(Ids.Leave_OrangeTree_actual);
		Leave_PalmTree = new LeavePalmTree(Ids.Leave_PalmTree_actual);
		
		/* Sapling */
		Sapling_Type = new SaplingBlock(Ids.Sapling_Type_actual);
		
		registerBlock();
	}
	private static void registerBlock(){
		/* Minerais */
		GameRegistry.registerBlock(Ore_Copper, Names.Ore_Copper_Name);
		GameRegistry.registerBlock(Ore_Tin, Names.Ore_Tin_Name);
		GameRegistry.registerBlock(Ore_Amethyst, Names.Ore_Amethyst_Name);
		GameRegistry.registerBlock(Ore_Onyx, Names.Ore_Onyx_Name);
		GameRegistry.registerBlock(Ore_Quartz, Names.Ore_Quartz_Name);
		GameRegistry.registerBlock(Ore_Ruby, Names.Ore_Ruby_Name);
		GameRegistry.registerBlock(Ore_Saphir, Names.Ore_Saphir_Name);
		GameRegistry.registerBlock(Ore_Slate, Names.Ore_Slate_Name);
		GameRegistry.registerBlock(Ore_Adamantite, Names.Ore_Adamantite_Name);
		
		/* Métaux */
		GameRegistry.registerBlock(Block_Copper, Names.Block_Copper_Name);
		GameRegistry.registerBlock(Block_Tin, Names.Block_Tin_Name);
		GameRegistry.registerBlock(Block_Bronze, Names.Block_Bronze_Name);
		GameRegistry.registerBlock(Block_Steel, Names.Block_Steel_Name);
		GameRegistry.registerBlock(Block_BronzeSteel, Names.Block_BronzeSteel_Name);
		
		/* Gem */
		GameRegistry.registerBlock(Block_Ametyste, Names.Block_Amethyst_Name);
		GameRegistry.registerBlock(Block_Onyx, Names.Block_Onyx_Name);
		GameRegistry.registerBlock(Block_Quartz, Names.Block_Quartz_Name);
		GameRegistry.registerBlock(Block_Ruby, Names.Block_Ruby_Name);
		GameRegistry.registerBlock(Block_Saphir, Names.Block_Saphir_Name);
		
		/* Log Tree */
		GameRegistry.registerBlock(Log_AppleTree, Names.Log_AppleTree_Name);
		GameRegistry.registerBlock(Log_BananaTree, Names.Log_BananaTree_Name);
		GameRegistry.registerBlock(Log_Baobab, Names.Log_Baobab_Name);
		GameRegistry.registerBlock(Log_CherryTree, Names.Log_CherryTree_Name);
		GameRegistry.registerBlock(Log_MapleTree, Names.Log_Maple_Name);
		GameRegistry.registerBlock(Log_OrangeTree, Names.Log_OrangeTree_Name);
		GameRegistry.registerBlock(Log_PalmTree, Names.Log_PalmTree_Name);
		
		/* Planks */
		GameRegistry.registerBlock(Plank_Wood, PlankBlockHandler.class);
		
		/* Leave */
		GameRegistry.registerBlock(Leave_AppleTree, Names.Leave_AppleTree_Name);
		GameRegistry.registerBlock(Leave_BananaTree, Names.Leave_BananaTree_Name);
		GameRegistry.registerBlock(Leave_Baobab, Names.Leave_Baobab_Name);
		GameRegistry.registerBlock(Leave_CherryTree, Names.Leave_CherryTree_Name);
		GameRegistry.registerBlock(Leave_Maple, Names.Leave_Maple_Name);
		GameRegistry.registerBlock(Leave_OrangeTree, Names.Leave_OrangeTree_Name);
		GameRegistry.registerBlock(Leave_PalmTree, Names.Leave_PalmTree_Name);
		
		/* Sapling */
		GameRegistry.registerBlock(Sapling_Type, SaplingBlockHandler.class);
	}
	public static void addNames() {
		/* Minerais */
		LanguageRegistry.addName(Ore_Copper, Names.Ore_Copper_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Copper, "pickaxe", 1);
		
		LanguageRegistry.addName(Ore_Tin, Names.Ore_Tin_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Tin, "pickaxe", 1);
		
		LanguageRegistry.addName(Ore_Amethyst, Names.Ore_Amethyst_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Amethyst, "pickaxe", 2);
		
		LanguageRegistry.addName(Ore_Onyx, Names.Ore_Onyx_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Onyx, "pickaxe", 2);
		
		LanguageRegistry.addName(Ore_Quartz, Names.Ore_Quartz_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Quartz, "pickaxe", 2);
		
		LanguageRegistry.addName(Ore_Ruby, Names.Ore_Ruby_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Ruby, "pickaxe", 2);
		
		LanguageRegistry.addName(Ore_Saphir, Names.Ore_Saphir_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Saphir, "pickaxe", 2);
		
		LanguageRegistry.addName(Ore_Slate, Names.Ore_Slate_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Slate, "pickaxe", 1);
		
		LanguageRegistry.addName(Ore_Adamantite, Names.Ore_Adamantite_Name);
		MinecraftForge.setBlockHarvestLevel(Ore_Adamantite, "pickaxe", 3);
		
		/* Metaux */
		LanguageRegistry.addName(Block_Copper, Names.Block_Copper_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Copper, "pickaxe", 1);
		
		LanguageRegistry.addName(Block_Tin, Names.Block_Tin_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Tin, "pickaxe", 1);
		
		LanguageRegistry.addName(Block_Bronze, Names.Block_Bronze_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Bronze, "pickaxe", 1);
		
		LanguageRegistry.addName(Block_Steel, Names.Block_Steel_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Steel, "pickaxe", 2);
		
		LanguageRegistry.addName(Block_BronzeSteel, Names.Block_BronzeSteel_Name);
		MinecraftForge.setBlockHarvestLevel(Block_BronzeSteel, "pickaxe", 2);
		
		/* Gem */
		LanguageRegistry.addName(Block_Ametyste, Names.Block_Amethyst_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Ametyste, "pickaxe", 2);
		
		LanguageRegistry.addName(Block_Onyx, Names.Block_Onyx_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Onyx, "pickaxe", 2);
		
		LanguageRegistry.addName(Block_Quartz, Names.Block_Quartz_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Quartz, "pickaxe", 2);
		
		LanguageRegistry.addName(Block_Ruby, Names.Block_Ruby_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Ruby, "pickaxe", 2);
		
		LanguageRegistry.addName(Block_Saphir, Names.Block_Saphir_Name);
		MinecraftForge.setBlockHarvestLevel(Block_Saphir, "pickaxe", 2);
		
		/* Tree */
		LanguageRegistry.addName(Log_AppleTree, Names.Log_AppleTree_Name);
		LanguageRegistry.addName(Log_BananaTree, Names.Log_BananaTree_Name);
		LanguageRegistry.addName(Log_Baobab, Names.Log_Baobab_Name);
		LanguageRegistry.addName(Log_CherryTree, Names.Log_CherryTree_Name);
		LanguageRegistry.addName(Log_MapleTree, Names.Log_Maple_Name);
		LanguageRegistry.addName(Log_OrangeTree, Names.Log_OrangeTree_Name);
		LanguageRegistry.addName(Log_PalmTree, Names.Log_PalmTree_Name);
		
		/* Plank */
		for(int i = 0; i < Names.Plank_Wood_Name.length; i++){
			LanguageRegistry.addName(new ItemStack(Plank_Wood, 1, i), Names.Plank_Wood_Name[i]);
		}
		
		/* Leave */
		LanguageRegistry.addName(Leave_AppleTree, Names.Leave_AppleTree_Name);
		LanguageRegistry.addName(Leave_BananaTree, Names.Leave_BananaTree_Name);
		LanguageRegistry.addName(Leave_Baobab, Names.Leave_Baobab_Name);
		LanguageRegistry.addName(Leave_CherryTree, Names.Leave_CherryTree_Name);
		LanguageRegistry.addName(Leave_Maple, Names.Leave_Maple_Name);
		LanguageRegistry.addName(Leave_OrangeTree, Names.Leave_OrangeTree_Name);
		LanguageRegistry.addName(Leave_PalmTree, Names.Leave_PalmTree_Name);
		
		/* Sapling */
		for(int i = 0; i < Names.Sapling_Type_Name.length; i++){
			LanguageRegistry.addName(new ItemStack(Sapling_Type, 1, i), Names.Sapling_Type_Name[i]);
		}
	}
}
