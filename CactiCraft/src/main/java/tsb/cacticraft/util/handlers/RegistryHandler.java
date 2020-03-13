package tsb.cacticraft.util.handlers;

import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler 
{

	/*
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		//TileEntityHandler.registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event)
	{
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	
	
	public static void setup(FMLCommonSetupEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new BlockEventHandler());
	}

	**/
	/*
	@SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event)
    {
        IForgeRegistryModifiable modRegistry = (IForgeRegistryModifiable) event.getRegistry();
    	ResourceLocation pick1 = new ResourceLocation("minecraft:wooden_pickaxe");
    	ResourceLocation axe1 = new ResourceLocation("minecraft:wooden_axe");
    	ResourceLocation sword1 = new ResourceLocation("minecraft:wooden_sword");
    	ResourceLocation spade1 = new ResourceLocation("minecraft:wooden_spade");
    	ResourceLocation hoe1 = new ResourceLocation("minecraft:wooden_hoe");
        modRegistry.remove(pick1);
        modRegistry.remove(axe1);
        modRegistry.remove(sword1);
        modRegistry.remove(spade1);
        modRegistry.remove(hoe1);
   }
   **/
}
