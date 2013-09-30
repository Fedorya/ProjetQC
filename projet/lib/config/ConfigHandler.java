package projet.lib.config;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		config.load();
		
		//Blocks
		Ids.Ore_Copper_actual = config.getBlock(Names.Ore_Copper_Name, Ids.Ore_Copper_default).getInt();
		Ids.Ore_Tin_actual = config.getBlock(Names.Ore_Tin_Name, Ids.Ore_Tin_default).getInt();
		Ids.Ore_Adamantite_actual = config.getBlock(Names.Ore_Adamantite_Name, Ids.Ore_Adamantite_default).getInt();
		
		Ids.Ore_Amethyst_actual = config.getBlock(Names.Ore_Amethyst_Name, Ids.Ore_Amethyst_default).getInt();
		Ids.Ore_Onyx_actual = config.getBlock(Names.Ore_Onyx_Name, Ids.Ore_Onyx_default).getInt();
		Ids.Ore_Quartz_actual = config.getBlock(Names.Ore_Quartz_Name, Ids.Ore_Quartz_default).getInt();
		Ids.Ore_Ruby_actual = config.getBlock(Names.Ore_Ruby_Name, Ids.Ore_Ruby_default).getInt();
		Ids.Ore_Saphir_actual = config.getBlock(Names.Ore_Saphir_Name, Ids.Ore_Saphir_default).getInt();
		
		Ids.Ore_Slate_actual = config.getBlock(Names.Ore_Slate_Name, Ids.Ore_Slate_default).getInt();
		
		Ids.Block_Copper_actual = config.getBlock(Names.Block_Copper_Name, Ids.Block_Copper_default).getInt();
		Ids.Block_Tin_actual = config.getBlock(Names.Block_Tin_Name, Ids.Block_Tin_default).getInt();
		Ids.Block_Bronze_actual = config.getBlock(Names.Block_Bronze_Name, Ids.Block_Bronze_default).getInt();
		Ids.Block_Steel_actual = config.getBlock(Names.Block_Steel_Name, Ids.Block_Steel_default).getInt();
		Ids.Block_BronzeSteel_actual = config.getBlock(Names.Block_BronzeSteel_Name, Ids.Block_BronzeSteel_default).getInt();
		
		Ids.Block_Amethyst_actual = config.getBlock(Names.Block_Amethyst_Name, Ids.Block_Amethyst_default).getInt();
		Ids.Block_Onyx_actual = config.getBlock(Names.Block_Onyx_Name, Ids.Block_Onyx_default).getInt();
		Ids.Block_Quartz_actual = config.getBlock(Names.Block_Quartz_Name, Ids.Block_Quartz_default).getInt();
		Ids.Block_Ruby_actual = config.getBlock(Names.Block_Ruby_Name, Ids.Block_Ruby_default).getInt();
		Ids.Block_Saphir_actual = config.getBlock(Names.Block_Saphir_Name, Ids.Block_Saphir_default).getInt();
		
		Ids.Log_AppleTree_actual = config.getBlock(Names.Log_AppleTree_Name, Ids.Log_AppleTree_default).getInt();
		Ids.Log_BananaTree_actual = config.getBlock(Names.Log_BananaTree_Name, Ids.Log_BananaTree_default).getInt();
		Ids.Log_Baobab_actual = config.getBlock(Names.Log_Baobab_Name, Ids.Log_Baobab_default).getInt();
		Ids.Log_CherryTree_actual = config.getBlock(Names.Log_CherryTree_Name, Ids.Log_CherryTree_default).getInt();
		Ids.Log_Maple_actual = config.getBlock(Names.Log_Maple_Name, Ids.Log_Maple_default).getInt();
		Ids.Log_OrangeTree_actual = config.getBlock(Names.Log_OrangeTree_Name, Ids.Log_OrangeTree_default).getInt();
		Ids.Log_PalmTree_actual = config.getBlock(Names.Log_PalmTree_Name, Ids.Log_PalmTree_default).getInt();
		
		Ids.Plank_Wood_actual = config.getBlock(config.CATEGORY_BLOCK, Names.Plank_Wood, Ids.Plank_Wood_default).getInt();
		
		Ids.Leave_AppleTree_actual = config.getBlock(Names.Leave_AppleTree_Name, Ids.Leave_AppleTree_default).getInt();
		Ids.Leave_BananaTree_actual = config.getBlock(Names.Leave_BananaTree_Name, Ids.Leave_BananaTree_default).getInt();
		Ids.Leave_Baobab_actual = config.getBlock(Names.Leave_Baobab_Name, Ids.Leave_Baobab_default).getInt();
		Ids.Leave_CherryTree_actual = config.getBlock(Names.Leave_CherryTree_Name, Ids.Leave_CherryTree_default).getInt();
		Ids.Leave_Maple_actual = config.getBlock(Names.Leave_Maple_Name, Ids.Leave_Maple_default).getInt();
		Ids.Leave_OrangeTree_actual = config.getBlock(Names.Leave_OrangeTree_Name, Ids.Leave_OrangeTree_default).getInt();
		Ids.Leave_PalmTree_actual = config.getBlock(Names.Leave_PalmTree_Name, Ids.Leave_PalmTree_default).getInt();
		
		Ids.Sapling_Type_actual = config.getBlock(config.CATEGORY_BLOCK, Names.Sapling_Type, Ids.Sapling_Type_default).getInt();
		
		//Items
		Ids.Frag_Copper_actual = config.getItem(Names.Frag_Copper_Name, Ids.Frag_Copper_default).getInt() -256;
		Ids.Frag_Tin_actual = config.getItem(Names.Frag_Tin_Name, Ids.Frag_Tin_actual).getInt() -256;
		Ids.Frag_Iron_actual = config.getItem(Names.Frag_Iron_Name, Ids.Frag_Iron_default).getInt() -256;
		Ids.Frag_Gold_actual = config.getItem(Names.Frag_Gold_Name, Ids.Frag_Gold_default).getInt() -256;
		Ids.Frag_Adamantite_actual = config.getItem(Names.Frag_Adamantite_Name, Ids.Frag_Adamantite_default).getInt() -256;
		
		Ids.Gem_Amethyst_actual = config.getItem(Names.Gem_Amethyst_Name, Ids.Gem_Amethyst_default).getInt() -256;
		Ids.Gem_Onyx_actual = config.getItem(Names.Gem_Onyx_Name, Ids.Gem_Onyx_default).getInt() -256;
		Ids.Gem_Quartz_actual = config.getItem(Names.Gem_Quartz_Name, Ids.Gem_Quartz_default).getInt() -256;
		Ids.Gem_Ruby_actual = config.getItem(Names.Gem_Ruby_Name, Ids.Gem_Ruby_default).getInt() -256;
		Ids.Gem_Saphir_actual = config.getItem(Names.Gem_Saphir_Name, Ids.Gem_Saphir_default).getInt() -256;
		
		Ids.Ingot_Copper_actual = config.getItem(Names.Ingot_Copper_Name, Ids.Ingot_Copper_default).getInt() -256;
		Ids.Ingot_Tin_actual = config.getItem(Names.Ingot_Tin_Name, Ids.Ingot_Tin_default).getInt() -256;
		Ids.Ingot_Bronze_actual = config.getItem(Names.Ingot_Bronze_Name, Ids.Ingot_Bronze_default).getInt() -256;
		Ids.Ingot_Steel_actual = config.getItem(Names.Ingot_Steel_Name, Ids.Ingot_Steel_default).getInt() -256;
		Ids.Ingot_BronzeSteel_actual = config.getItem(Names.Ingot_BronzeSteel_Name, Ids.Ingot_BronzeSteel_default).getInt() -256;
		
		Ids.Nugget_Copper_actual = config.getItem(Names.Nugget_Copper_Name, Ids.Nugget_Copper_default).getInt() -256;
		Ids.Nugget_Tin_actual = config.getItem(Names.Nugget_Tin_Name, Ids.Nugget_Tin_default).getInt() -256;
		Ids.Nugget_Iron_actual = config.getItem(Names.Nugget_Iron_Name, Ids.Nugget_Iron_default).getInt() -256;
		Ids.Nugget_Bronze_actual = config.getItem(Names.Nugget_Bronze_Name, Ids.Nugget_Bronze_default).getInt() -256;
		Ids.Nugget_Steel_actual = config.getItem(Names.Nugget_Steel_Name, Ids.Nugget_Steel_default).getInt() -256;
		Ids.Nugget_Adamantite_actual = config.getItem(Names.Nugget_Adamantite_Name, Ids.Nugget_Adamantite_default).getInt() -256;
		
		config.save();
	}
}
