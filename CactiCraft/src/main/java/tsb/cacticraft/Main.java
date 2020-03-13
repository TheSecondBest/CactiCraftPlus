package tsb.cacticraft;

import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import tsb.cacticraft.config.Config;
import tsb.cacticraft.init.ModItems;

@Mod(Reference.MODID)
public class Main 
{
	public static Main instance;
	public static final String MODID = Reference.MODID;
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public static final CactiTab TAB = new CactiTab("cactitab");
	public static final CactiTab BUILDING = new CactiTab("cactitab_building");

	
	public Main()
	{
		instance = this;

		ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.SERVER, "cacticraft-server.toml");
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, Config.CLIENT, "cacticraft-client.toml");
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientStuff);

		Config.loadConfig(Config.CLIENT, FMLPaths.CONFIGDIR.get().resolve("cacticraft-client.toml").toString());
		Config.loadConfig(Config.SERVER, FMLPaths.CONFIGDIR.get().resolve("cacticraft-server.toml").toString());

		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void setup(final FMLCommonSetupEvent event)
	{
	    Iterator<IRecipe<?>> recipes = new RecipeManager().getRecipes().iterator();
	    while(recipes.hasNext()) {
	        recipes.remove();
	    }
		LOGGER.info("Setup method registered");
	}

	private void clientStuff(final FMLClientSetupEvent event)
	{
		(TAB).setIcon(ModItems.cactistick);
		(BUILDING).setIcon(ModItems.plywood_planks);
		
		LOGGER.info("clienteRegistries method registered");
	}
}
