package tsb.cacticraft;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StainedGlassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import tsb.cacticraft.blocks.CharcoalBlock;
import tsb.cacticraft.blocks.PanelBlock;
import tsb.cacticraft.blocks.RodBlock;
import tsb.cacticraft.blocks.TorchLever;
import tsb.cacticraft.blocks.Wedge;
import tsb.cacticraft.init.ModBlocks;
import tsb.cacticraft.init.ModItems;
import tsb.cacticraft.items.HammerItem;
import tsb.cacticraft.items.PickItem;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistries 
{
	public static final String MODID = Main.MODID;
	public static final Logger LOGGER = Main.LOGGER;
	
	public static final ItemGroup TAB = Main.TAB;
	public static final ItemGroup BUILDING = Main.BUILDING;

	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event)
	{
		event.getRegistry().registerAll
		(

				ModItems.cactistick = new Item(new Item.Properties().maxStackSize(1).group(Main.TAB)).setRegistryName(location("cactistick")),
				ModItems.flint_hatchet = new AxeItem(ItemTier.GOLD, 6.0F, -3.2F, new Item.Properties().maxDamage(16).group(Main.TAB)).setRegistryName(location("flint_hatchet")),
				ModItems.flint_dagger = new SwordItem(ItemTier.GOLD, 3, -2.0F, new Item.Properties().maxDamage(16).group(Main.TAB)).setRegistryName(location("flint_dagger")),
				ModItems.flint_pick = new PickItem(ItemTier.GOLD, 1.0F, -2.8F, new Item.Properties().maxDamage(16).group(Main.TAB)).setRegistryName(location("flint_pick")),
				ModItems.iron_hammer = new HammerItem(ItemTier.WOOD, 19.0F, -3.5F, new Item.Properties().maxDamage(255).group(Main.TAB)).setRegistryName(location("iron_hammer")),
				ModItems.kimberlite_hammer = new HammerItem(ItemTier.WOOD, 35.0F, -3.5F, new Item.Properties().maxDamage(-1).group(Main.TAB)).setRegistryName(location("kimberlite_hammer")),
				ModItems.longbow = new BowItem(new Item.Properties().maxDamage(1561).group(Main.TAB)).setRegistryName(location("longbow")),
				ModItems.wrench = new Item(new Item.Properties().maxStackSize(1).group(Main.TAB)).setRegistryName(location("wrench")),
			
				ModItems.souldust = new Item(new Item.Properties().group(Main.TAB)).setRegistryName(location("souldust")),
				ModItems.onyx = new Item(new Item.Properties().group(Main.TAB)).setRegistryName(location("onyx")),
				ModItems.raw_silicate = new Item(new Item.Properties().group(Main.TAB)).setRegistryName(location("raw_silicate")),
				ModItems.kimberlite = new Item(new Item.Properties().group(Main.TAB)).setRegistryName(location("kimberlite")),
				ModItems.guano = new Item(new Item.Properties().group(Main.TAB)).setRegistryName(location("guano")),
				ModItems.leather_scraps = new Item(new Item.Properties().group(Main.TAB)).setRegistryName(location("leather_scraps")),
				ModItems.chainlinks = new Item(new Item.Properties().group(Main.TAB)).setRegistryName(location("chainlinks")),
				ModItems.flint_glass = new Item(new Item.Properties().group(Main.TAB)).setRegistryName(location("flint_glass")),
				

				ModItems.compost = new BlockItem(ModBlocks.compost, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.compost.getRegistryName()),
				ModItems.verdure = new BlockItem(ModBlocks.verdure, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.verdure.getRegistryName()),
				ModItems.kimberlite_block = new BlockItem(ModBlocks.kimberlite_block, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.kimberlite_block.getRegistryName()),
				ModItems.flint_block = new BlockItem(ModBlocks.flint_block, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.flint_block.getRegistryName()),
				ModItems.onyx_block = new BlockItem(ModBlocks.onyx_block, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.onyx_block.getRegistryName()),
				ModItems.flesh_block = new BlockItem(ModBlocks.flesh_block, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.flesh_block.getRegistryName()),
				ModItems.hellforged_bricks = new BlockItem(ModBlocks.hellforged_bricks, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.hellforged_bricks.getRegistryName()),
				ModItems.charcoal_block = new BlockItem(ModBlocks.charcoal_block, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.charcoal_block.getRegistryName()),
				ModItems.mangrove_log = new BlockItem(ModBlocks.mangrove_log, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.mangrove_log.getRegistryName()),
				ModItems.stripped_mangrove_log = new BlockItem(ModBlocks.stripped_mangrove_log, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.stripped_mangrove_log.getRegistryName()),
				ModItems.mangrove_bark = new BlockItem(ModBlocks.mangrove_bark, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.mangrove_bark.getRegistryName()),
				ModItems.stripped_mangrove_bark = new BlockItem(ModBlocks.stripped_mangrove_bark, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.stripped_mangrove_bark.getRegistryName()),
				ModItems.plywood_planks = new BlockItem(ModBlocks.plywood_planks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.plywood_planks.getRegistryName()),
				ModItems.mangrove_planks = new BlockItem(ModBlocks.mangrove_planks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.mangrove_planks.getRegistryName()),

				ModItems.torch_lever = new BlockItem(ModBlocks.torch_lever, new Item.Properties().group(TAB)).setRegistryName(ModBlocks.torch_lever.getRegistryName()),
				ModItems.shoji = new BlockItem(ModBlocks.shoji, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.shoji.getRegistryName()),
				ModItems.shoji_large = new BlockItem(ModBlocks.shoji_large, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.shoji_large.getRegistryName()),
				ModItems.iron_gate = new BlockItem(ModBlocks.iron_gate, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.iron_gate.getRegistryName()),
				ModItems.chain = new BlockItem(ModBlocks.chain, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.chain.getRegistryName()),
				
				//ModItems.stairs_verdure = new BlockItem(ModBlocks.stairs_verdure, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.stairs_verdure.getRegistryName()),
				//ModItems.stairs_plywood = new BlockItem(ModBlocks.stairs_plywood, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.stairs_plywood.getRegistryName()),
				//ModItems.stairs_mangrove = new BlockItem(ModBlocks.stairs_mangrove, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.stairs_mangrove.getRegistryName()),

				ModItems.slab_dirt = new BlockItem(ModBlocks.slab_dirt, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.slab_dirt.getRegistryName()),
				ModItems.slab_verdure = new BlockItem(ModBlocks.slab_verdure, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.slab_verdure.getRegistryName()),
				ModItems.slab_plywood = new BlockItem(ModBlocks.slab_plywood, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.slab_plywood.getRegistryName()),
				ModItems.slab_mangrove = new BlockItem(ModBlocks.slab_mangrove, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.slab_mangrove.getRegistryName()),

				ModItems.wedge_cobblestone = new BlockItem(ModBlocks.wedge_cobblestone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_cobblestone.getRegistryName()),
				ModItems.wedge_stone = new BlockItem(ModBlocks.wedge_stone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_stone.getRegistryName()),
				ModItems.wedge_smooth_stone = new BlockItem(ModBlocks.wedge_smooth_stone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_smooth_stone.getRegistryName()),
				ModItems.wedge_mossy_cobblestone = new BlockItem(ModBlocks.wedge_mossy_cobblestone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_mossy_cobblestone.getRegistryName()),
				ModItems.wedge_stone_bricks = new BlockItem(ModBlocks.wedge_stone_bricks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_stone_bricks.getRegistryName()),
				ModItems.wedge_mossy_stone_bricks = new BlockItem(ModBlocks.wedge_mossy_stone_bricks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_mossy_stone_bricks.getRegistryName()),
				ModItems.wedge_andesite = new BlockItem(ModBlocks.wedge_andesite, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_andesite.getRegistryName()),
				ModItems.wedge_polished_andesite = new BlockItem(ModBlocks.wedge_polished_andesite, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_polished_andesite.getRegistryName()),
				ModItems.wedge_diorite = new BlockItem(ModBlocks.wedge_diorite, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_diorite.getRegistryName()),
				ModItems.wedge_polished_diorite = new BlockItem(ModBlocks.wedge_polished_diorite, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_polished_diorite.getRegistryName()),
				ModItems.wedge_granite = new BlockItem(ModBlocks.wedge_granite, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_granite.getRegistryName()),
				ModItems.wedge_polished_granite = new BlockItem(ModBlocks.wedge_polished_granite, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_polished_granite.getRegistryName()),
				ModItems.wedge_sandstone = new BlockItem(ModBlocks.wedge_sandstone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_sandstone.getRegistryName()),
				ModItems.wedge_cut_sandstone = new BlockItem(ModBlocks.wedge_cut_sandstone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_cut_sandstone.getRegistryName()),
				ModItems.wedge_smooth_sandstone = new BlockItem(ModBlocks.wedge_smooth_sandstone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_smooth_sandstone.getRegistryName()),
				ModItems.wedge_red_sandstone = new BlockItem(ModBlocks.wedge_red_sandstone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_red_sandstone.getRegistryName()),
				ModItems.wedge_cut_red_sandstone = new BlockItem(ModBlocks.wedge_cut_red_sandstone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_cut_red_sandstone.getRegistryName()),
				ModItems.wedge_smooth_red_sandstone = new BlockItem(ModBlocks.wedge_smooth_red_sandstone, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_smooth_red_sandstone.getRegistryName()),
				ModItems.wedge_bricks = new BlockItem(ModBlocks.wedge_bricks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_bricks.getRegistryName()),
				ModItems.wedge_prismarine = new BlockItem(ModBlocks.wedge_prismarine, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_prismarine.getRegistryName()),
				ModItems.wedge_prismarine_bricks = new BlockItem(ModBlocks.wedge_prismarine_bricks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_prismarine_bricks.getRegistryName()),
				ModItems.wedge_dark_prismarine = new BlockItem(ModBlocks.wedge_dark_prismarine, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_dark_prismarine.getRegistryName()),
				ModItems.wedge_nether_bricks = new BlockItem(ModBlocks.wedge_nether_bricks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_nether_bricks.getRegistryName()),
				ModItems.wedge_red_nether_bricks = new BlockItem(ModBlocks.wedge_red_nether_bricks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_red_nether_bricks.getRegistryName()),
				ModItems.wedge_quartz = new BlockItem(ModBlocks.wedge_quartz, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_quartz.getRegistryName()),
				ModItems.wedge_smooth_quartz = new BlockItem(ModBlocks.wedge_smooth_quartz, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_smooth_quartz.getRegistryName()),
				ModItems.wedge_purpur = new BlockItem(ModBlocks.wedge_purpur, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_purpur.getRegistryName()),
				ModItems.wedge_end_stone_bricks = new BlockItem(ModBlocks.wedge_end_stone_bricks, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_end_stone_bricks.getRegistryName()),
				ModItems.wedge_verdure = new BlockItem(ModBlocks.wedge_verdure, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_verdure.getRegistryName()),
				ModItems.wedge_plywood = new BlockItem(ModBlocks.wedge_plywood, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_plywood.getRegistryName()),
				ModItems.wedge_mangrove = new BlockItem(ModBlocks.wedge_mangrove, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_mangrove.getRegistryName()),
				ModItems.wedge_spruce = new BlockItem(ModBlocks.wedge_spruce, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_spruce.getRegistryName()),
				ModItems.wedge_oak = new BlockItem(ModBlocks.wedge_oak, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_oak.getRegistryName()),
				ModItems.wedge_birch = new BlockItem(ModBlocks.wedge_birch, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_birch.getRegistryName()),
				ModItems.wedge_jungle = new BlockItem(ModBlocks.wedge_jungle, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_jungle.getRegistryName()),
				ModItems.wedge_acacia = new BlockItem(ModBlocks.wedge_acacia, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_acacia.getRegistryName()),
				ModItems.wedge_dark_oak = new BlockItem(ModBlocks.wedge_dark_oak, new Item.Properties().group(BUILDING)).setRegistryName(ModBlocks.wedge_dark_oak.getRegistryName())

		);
		
		LOGGER.info("Items registered.");
		
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event)
	{
		event.getRegistry().registerAll
		(
				
				ModBlocks.compost = new Block(Block.Properties.create(Material.EARTH).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.6f, 3.0f).sound(SoundType.PLANT)).setRegistryName(location("compost")),
				ModBlocks.verdure = new Block(Block.Properties.create(Material.BAMBOO).harvestTool(ToolType.AXE).hardnessAndResistance(0.6f, 3.0f).sound(SoundType.BAMBOO)).setRegistryName(location("verdure")),
				ModBlocks.kimberlite_block = new StainedGlassBlock(null, Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.6f, 3.0f).sound(SoundType.STONE)).setRegistryName(location("kimberlite_block")),
				ModBlocks.flint_block = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.6f, 3.0f).sound(SoundType.STONE)).setRegistryName(location("flint_block")),
				ModBlocks.onyx_block = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(0.6f, 3.0f).sound(SoundType.STONE)).setRegistryName(location("onyx_block")),
				ModBlocks.flesh_block = new Block(Block.Properties.create(Material.ORGANIC).harvestTool(ToolType.AXE).hardnessAndResistance(1.0f, 5.0f).sound(SoundType.SLIME)).setRegistryName(location("flesh_block")),
				ModBlocks.hellforged_bricks = new Block(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).harvestLevel(3).hardnessAndResistance(12.0f, 6000.0f).sound(SoundType.STONE)).setRegistryName(location("hellforged_bricks")),
				ModBlocks.charcoal_block = new CharcoalBlock(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(5.0f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("charcoal_block")),
				ModBlocks.mangrove_log = new LogBlock(null, Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("mangrove_log")),
				ModBlocks.stripped_mangrove_log = new LogBlock(null, Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("stripped_mangrove_log")),
				ModBlocks.mangrove_bark = new LogBlock(null, Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("mangrove_bark")),
				ModBlocks.stripped_mangrove_bark = new LogBlock(null, Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("stripped_mangrove_bark")),
				ModBlocks.mangrove_planks = new Block(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("mangrove_planks")),
				ModBlocks.plywood_planks = new Block(Block.Properties.create(Material.WOOD).harvestTool(ToolType.PICKAXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("plywood_planks")),

				ModBlocks.torch_lever = new TorchLever(Block.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).lightValue(14).sound(SoundType.WOOD)).setRegistryName(location("torch_lever")),
				ModBlocks.shoji = new PanelBlock(Block.Properties.create(Material.BAMBOO_SAPLING).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).lightValue(14).sound(SoundType.LADDER)).setRegistryName(location("shoji")),
				ModBlocks.shoji_large = new PanelBlock(Block.Properties.create(Material.BAMBOO_SAPLING).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).lightValue(14).sound(SoundType.LADDER)).setRegistryName(location("shoji_large")),
				ModBlocks.iron_gate = new FenceGateBlock(Block.Properties.create(Material.IRON).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).lightValue(14).sound(SoundType.METAL)).setRegistryName(location("iron_gate")),
				ModBlocks.chain = new RodBlock(Block.Properties.create(Material.IRON).doesNotBlockMovement().hardnessAndResistance(0.0f, 0.0f).lightValue(14).sound(SoundType.METAL)).setRegistryName(location("chain")),

				ModBlocks.stairs_verdure = new Block(Block.Properties.create(Material.BAMBOO).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.BAMBOO)).setRegistryName(location("stairs_verdure")),
				ModBlocks.stairs_plywood = new Block(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("stairs_plywood")),
				ModBlocks.stairs_mangrove = new  Block(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("stairs_mangrove")),
				
				ModBlocks.slab_dirt = new SlabBlock(Block.Properties.create(Material.EARTH).harvestTool(ToolType.SHOVEL).hardnessAndResistance(0.5f, 2.5f).sound(SoundType.GROUND)).setRegistryName(location("slab_dirt")),
				ModBlocks.slab_verdure = new SlabBlock(Block.Properties.create(Material.BAMBOO).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.BAMBOO)).setRegistryName(location("slab_verdure")),
				ModBlocks.slab_plywood = new SlabBlock(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("slab_plywood")),
				ModBlocks.slab_mangrove = new SlabBlock(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("slab_mangrove")),

				ModBlocks.wedge_cobblestone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_cobblestone")),
				ModBlocks.wedge_stone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_stone")),
				ModBlocks.wedge_smooth_stone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_smooth_stone")),
				ModBlocks.wedge_mossy_cobblestone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_mossy_cobblestone")),
				ModBlocks.wedge_stone_bricks = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_stone_bricks")),
				ModBlocks.wedge_mossy_stone_bricks = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_mossy_stone_bricks")),
				ModBlocks.wedge_andesite = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_andesite")),
				ModBlocks.wedge_polished_andesite = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_polished_andesite")),
				ModBlocks.wedge_diorite = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_diorite")),
				ModBlocks.wedge_polished_diorite = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_polished_diorite")),
				ModBlocks.wedge_granite = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_granite")),
				ModBlocks.wedge_polished_granite = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_polished_granite")),
				ModBlocks.wedge_sandstone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_sandstone")),
				ModBlocks.wedge_cut_sandstone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_cut_sandstone")),
				ModBlocks.wedge_smooth_sandstone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_smooth_sandstone")),
				ModBlocks.wedge_red_sandstone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_red_sandstone")),
				ModBlocks.wedge_cut_red_sandstone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_cut_red_sandstone")),
				ModBlocks.wedge_smooth_red_sandstone = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_smooth_red_sandstone")),
				ModBlocks.wedge_bricks = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_bricks")),
				ModBlocks.wedge_prismarine = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_prismarine")),
				ModBlocks.wedge_prismarine_bricks = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_prismarine_bricks")),
				ModBlocks.wedge_dark_prismarine = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_dark_prismarine")),
				ModBlocks.wedge_nether_bricks = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_nether_bricks")),
				ModBlocks.wedge_red_nether_bricks = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_red_nether_bricks")),
				ModBlocks.wedge_quartz = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_quartz")),
				ModBlocks.wedge_smooth_quartz = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_smooth_quartz")),
				ModBlocks.wedge_purpur = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_purpur")),
				ModBlocks.wedge_end_stone_bricks = new Wedge(Block.Properties.create(Material.ROCK).harvestTool(ToolType.PICKAXE).hardnessAndResistance(1.5f, 30.0f).sound(SoundType.STONE)).setRegistryName(location("wedge_end_stone_bricks")),
				ModBlocks.wedge_verdure = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_verdure")),
				ModBlocks.wedge_plywood = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_plywood")),
				ModBlocks.wedge_mangrove = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_mangrove")),
				ModBlocks.wedge_spruce = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_spruce")),
				ModBlocks.wedge_oak = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_oak")),
				ModBlocks.wedge_birch = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_birch")),
				ModBlocks.wedge_jungle = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_jungle")),
				ModBlocks.wedge_acacia = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_acacia")),
				ModBlocks.wedge_dark_oak = new Wedge(Block.Properties.create(Material.WOOD).harvestTool(ToolType.AXE).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.WOOD)).setRegistryName(location("wedge_dark_oak"))
				
		);
		
		LOGGER.info("Blocks registered.");
	}
	
	public static ResourceLocation location(String name)
	{
		return new ResourceLocation(MODID, name);
	}
}	
		
		
		
		
		
		
		
		
		
		
		