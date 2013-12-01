package tutorial;

import tutorial.blocks.Blocks;
import tutorial.items.Items;
import tutorial.lib.ModInfo;
import tutorial.lib.Recipes;
import tutorial.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod ( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )
@NetworkMod ( channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = true )

public class Tutorial {
@SidedProxy ( clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy", serverSide = ModInfo.PROXY_LOCATION + ".CommonProxy" )
public static CommonProxy proxy;

@EventHandler
public static void preInit ( FMLPreInitializationEvent event ) {

}

@EventHandler
public static void init ( FMLInitializationEvent event ) {
Items.init();
Items.addNames();

Blocks.init();
Blocks.addNames();


Recipes.init();
}

@EventHandler
public static void postInit ( FMLPostInitializationEvent event ) {

}
}