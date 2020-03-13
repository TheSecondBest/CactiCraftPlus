package tsb.cacticraft.init;


import net.minecraft.item.Item;

public class ModItems 
{
	//Tools
	public static Item flint_hatchet;
	public static Item flint_dagger;
	public static Item flint_pick;
	public static Item iron_hammer;
	public static Item kimberlite_hammer;
	public static Item longbow;
	public static Item wrench;
	public static Item cactistick;

	//Other
	public static Item souldust;
	public static Item onyx;
	public static Item raw_silicate;
	public static Item kimberlite;
	public static Item guano;
	public static Item leather_scraps;
	public static Item chainlinks;
	public static Item flint_glass;
	public static Item sack_o_taters;
	public static Item sack_of_carrots;
	public static Item sack_of_beats;
	public static Item bundle_of_bamboo;
	public static Item bundle_of_reeds;
	
	//Runes
	public static Item green_rune; //Utility
	public static Item red_rune; //Offense
	public static Item yellow_rune; //Defense
	public static Item blue_rune; //Aspect
	
	
	//Blocks
	public static Item compost;
	public static Item verdure;
	public static Item kimberlite_block;
	public static Item flint_block;
	public static Item onyx_block;
	public static Item flesh_block;
	public static Item hellforged_bricks;
	public static Item charcoal_block;
	public static Item plywood_planks;
	public static Item mangrove_planks;
	public static Item mangrove_log;
	public static Item stripped_mangrove_log;
	public static Item mangrove_bark;
	public static Item stripped_mangrove_bark;
	
	public static Item torch_lever;
	public static Item shoji;
	public static Item shoji_large;
	public static Item iron_gate;
	public static Item chain;
	
	public static Item stairs_verdure;
	public static Item stairs_plywood;
	public static Item stairs_mangrove;

	public static Item slab_dirt;
	public static Item slab_verdure;
	public static Item slab_plywood;
	public static Item slab_mangrove;

	public static Item wedge_cobblestone;
	public static Item wedge_stone;
	public static Item wedge_smooth_stone;
	public static Item wedge_mossy_cobblestone;
	public static Item wedge_stone_bricks;
	public static Item wedge_mossy_stone_bricks;
	public static Item wedge_andesite;
	public static Item wedge_polished_andesite;
	public static Item wedge_diorite;
	public static Item wedge_polished_diorite;
	public static Item wedge_granite;
	public static Item wedge_polished_granite;
	public static Item wedge_sandstone;
	public static Item wedge_cut_sandstone;
	public static Item wedge_smooth_sandstone;
	public static Item wedge_red_sandstone;
	public static Item wedge_cut_red_sandstone;
	public static Item wedge_smooth_red_sandstone;
	public static Item wedge_bricks;
	public static Item wedge_prismarine;
	public static Item wedge_prismarine_bricks;
	public static Item wedge_dark_prismarine;
	public static Item wedge_nether_bricks;
	public static Item wedge_red_nether_bricks;
	public static Item wedge_quartz;
	public static Item wedge_smooth_quartz;
	public static Item wedge_purpur;
	public static Item wedge_end_stone_bricks;
	public static Item wedge_verdure;
	public static Item wedge_plywood;
	public static Item wedge_mangrove;
	public static Item wedge_spruce;
	public static Item wedge_oak;
	public static Item wedge_birch;
	public static Item wedge_jungle;
	public static Item wedge_acacia;
	public static Item wedge_dark_oak;
	


	/*
	
	//Materials
	//public static final IItemTier MATERIAL_STEEL = new ItemTiered("material_steel", 4, 800, 8.0F, 3.0F, 10);
	
	//Items
	public static final Item JERKY = new Jerky( 2, 16.0F, true, "jerky");
	public static final Item GRAPHITE_LUMP = new ItemBase("graphite_lump", Main.cactitab);
	public static final Item BUCKET_OF_ROCKS = new ItemBase("bucket_of_rocks", Main.cactitab);
	public static final Item TAN_DYE = new ItemBase("tan_dye", Main.cactitab);


	//Metals
	public static final Item TIN_INGOT = new ItemBase("tin_ingot", Main.cactitab);
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", Main.cactitab);
	public static final Item BRONZE_INGOT = new ItemBase("bronze_ingot", Main.cactitab);
	public static final Item NICKEL_INGOT = new ItemBase("nickel_ingot", Main.cactitab);
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot", Main.cactitab);
	public static final Item MAGNETIC_GOLD_INGOT = new ItemBase("magnetic_gold_ingot", Main.cactitab);
	public static final Item COBALT = new ItemBase("cobalt", Main.cactitab);
	public static final Item NICO_INGOT = new ItemBase("nico_ingot", Main.cactitab);
	public static final Item RED_STEEL_INGOT = new ItemBase("red_steel_ingot", Main.cactitab);
	public static final Item HARDENED_SILICATE = new ItemBase("hardened_silicate", Main.cactitab);
	public static final Item TEMPERED_SILICATE = new ItemBase("tempered_silicate", Main.cactitab);
	public static final Item REINFORCED_SILICATE = new ItemBase("reinforced_silicate", Main.cactitab);
	public static final Item KIMBERLITE = new ItemBase("kimberlite", Main.cactitab);
	public static final Item LEAD_INGOT = new ItemBase("lead_ingot", Main.cactitab);
	public static final Item ORICHALCUM_INGOT = new ItemBase("orichalcum_ingot", Main.cactitab);
	
	
	//Tools
	
	public static final HammerBase IRON_HAMMER = new HammerBase(ItemBase.ToolMaterial.IRON, "iron_hammer");
	public static final HammerBase KIMBERLITE_HAMMER = new HammerBase(ItemBase.ToolMaterial.KIMBERLITE, "kimberlite_hammer");
	
	public static final PickaxeBase COPPER_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.STONE, "copper_pickaxe");
	public static final PickaxeBase TIN_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.STONE, "tin_pickaxe");
	public static final PickaxeBase BRONZE_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.BRONZE, "bronze_pickaxe");
	public static final PickaxeBase STONE_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.STONE, "stone_pickaxe");
	public static final PickaxeBase IRON_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.IRON, "iron_pickaxe");
	public static final PickaxeBase GOLD_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.GOLD, "gold_pickaxe");
	public static final PickaxeBase STEEL_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.STEEL, "steel_pickaxe");
	public static final PickaxeBase MAGNETIC_GOLD_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.STEEL, "magnetic_gold_pickaxe");
	public static final PickaxeBase RED_STEEL_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.RED_STEEL, "red_steel_pickaxe");
	public static final PickaxeBase DIAMOND_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.NICO, "diamond_pickaxe");
	public static final PickaxeBase NICO_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.NICO, "nico_pickaxe");
	public static final PickaxeBase KIMBERLITE_PICKAXE = new PickaxeBase(ItemBase.ToolMaterial.KIMBERLITE, "kimberlite_pickaxe");
	
	public static final SwordBase COPPER_SWORD = new SwordBase(ItemBase.ToolMaterial.STONE, "copper_sword");
	public static final SwordBase STONE_SWORD = new SwordBase(ItemBase.ToolMaterial.STONE, "stone_sword");
	//public static final SwordBase IRON_SWORD = new SwordBase(ItemBase.ToolMaterial.IRON, "iron_sword");
	//public static final SwordBase GOLD_SWORD = new SwordBase(ItemBase.ToolMaterial.GOLD, "gold_sword");
	//public static final SwordBase DIAMOND_SWORD = new SwordBase(ItemBase.ToolMaterial.RED_STEEL, "diamond_sword");
	public static final SwordBase KIMBERLITE_SWORD = new SwordBase(ItemBase.ToolMaterial.KIMBERLITE, "kimberlite_sword");
	
	public static final HoeBase STONE_HOE = new HoeBase(ItemBase.ToolMaterial.STONE, "stone_hoe");
	//public static final HoeBase IRON_HOE = new HoeBase(ItemBase.ToolMaterial.IRON, "iron_hoe");
	//public static final HoeBase GOLD_HOE = new HoeBase(ItemBase.ToolMaterial.GOLD, "gold_hoe");
	//public static final HoeBase DIAMOND_HOE = new HoeBase(ItemBase.ToolMaterial.RED_STEEL, "diamond_hoe");
	public static final HoeBase KIMBERLITE_HOE = new HoeBase(ItemBase.ToolMaterial.KIMBERLITE, "kimberlite_hoe");
	
	//public static final AxeBase STONE_AXE = new AxeBase(ItemBase.ToolMaterial.STONE, "stone_axe");
	//public static final AxeBase IRON_AXE = new AxeBase(ItemBase.ToolMaterial.IRON, "iron_axe");
	//public static final AxeBase GOLD_AXE = new AxeBase(ItemBase.ToolMaterial.GOLD, "gold_axe");
	//public static final AxeBase DIAMOND_AXE = new AxeBase(ItemBase.ToolMaterial.RED_STEEL, "diamond_axe");
	//public static final AxeBase KIMBERLITE_AXE = new AxeBase(ItemBase.ToolMaterial.KIMBERLITE, "kimberlite_axe");
	
	public static final SpadeBase STONE_SPADE = new SpadeBase(ItemBase.ToolMaterial.STONE, "stone_spade");
	//public static final SpadeBase IRON_SPADE = new SpadeBase(ItemBase.ToolMaterial.IRON, "iron_spade");
	//public static final SpadeBase GOLD_SPADE = new SpadeBase(ItemBase.ToolMaterial.GOLD, "gold_spade");
	//public static final SpadeBase DIAMOND_SPADE = new SpadeBase(ItemBase.ToolMaterial.RED_STEEL, "diamond_spade");
	public static final SpadeBase KIMBERLITE_SPADE = new SpadeBase(ItemBase.ToolMaterial.KIMBERLITE, "kimberlite_spade");
	
	
	//Armor
	public static final ArmorBase BRONZEMAIL_BOOTS = new ArmorBase(ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.FEET, "bronzemail_boots");
	public static final ArmorBase BRONZEMAIL_LEGGINGS = new ArmorBase(ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.LEGS, "bronzemail_leggings");
	public static final ArmorBase BRONZEMAIL_CHESTPLATE = new ArmorBase(ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.CHEST, "bronzemail_chestplate");
	public static final ArmorBase BRONZEMAIL_HELMET = new ArmorBase(ArmorMaterial.CHAIN, 1, EntityEquipmentSlot.HEAD, "bronzemail_helmet");
	
	public static final ArmorBase STEEL_BOOTS = new ArmorBase(ArmorMaterial.STEEL, 1, EntityEquipmentSlot.FEET, "steel_boots");
	public static final ArmorBase STEEL_LEGGINGS = new ArmorBase(ArmorMaterial.STEEL, 1, EntityEquipmentSlot.LEGS, "steel_leggings");
	public static final ArmorBase STEEL_CHESTPLATE = new ArmorBase(ArmorMaterial.STEEL, 1, EntityEquipmentSlot.CHEST, "steel_chestplate");
	public static final ArmorBase STEEL_HELMET = new ArmorBase(ArmorMaterial.STEEL, 1, EntityEquipmentSlot.HEAD, "steel_helmet");
	
	public static final ArmorBase KIMBERLITE_BOOTS = new ArmorBase(ArmorMaterial.KIMBERLITE, 1, EntityEquipmentSlot.FEET, "kimberlite_boots");
	public static final ArmorBase KIMBERLITE_LEGGINGS = new ArmorBase(ArmorMaterial.KIMBERLITE, 1, EntityEquipmentSlot.LEGS, "kimberlite_leggings");
	public static final ArmorBase KIMBERLITE_CHESTPLATE = new ArmorBase(ArmorMaterial.KIMBERLITE, 1, EntityEquipmentSlot.CHEST, "kimberlite_chestplate");
	public static final ArmorBase KIMBERLITE_HELMET = new ArmorBase(ArmorMaterial.KIMBERLITE, 1, EntityEquipmentSlot.HEAD, "kimberlite_helmet");
	
	/*
	//Molds
	public static final ToolPart EMPTY_MOLD = new ToolPart("empty_mold");
	public static final ToolPart TOOL_ROD_MOLD = new ToolPart("tool_rod_mold");
	public static final ToolPart TRIDENT_HEAD_MOLD = new ToolPart("trident_head_mold");
	public static final ToolPart PICKAXE_HEAD_MOLD = new ToolPart("pickaxe_head_mold");
	public static final ToolPart AXE_HEAD_MOLD = new ToolPart("axe_head_mold");
	public static final ToolPart SWORD_HEAD_MOLD = new ToolPart("sword_head_mold");
	public static final ToolPart SPADE_HEAD_MOLD = new ToolPart("spade_head_mold");
	public static final ToolPart HOE_HEAD_MOLD = new ToolPart("hoe_head_mold");
	
	//Tool Parts
	public static final ToolPart WOOD_TOOL_ROD = new ToolPart("wood_tool_rod");
	public static final ToolPart IRON_TOOL_ROD = new ToolPart("iron_tool_rod");
	public static final ToolPart PRISMARINE_TOOL_ROD = new ToolPart("prismarine_tool_rod");
	public static final ToolPart TRIDENT_HEAD = new ToolPart("trident_head");
	public static final ToolPart FLINT_HATCHET_HEAD = new ToolPart("flint_hatchet_head");
	public static final ToolPart FLINT_DAGGER_HEAD = new ToolPart("flint_dagger_head");
	public static final ToolPart FLINT_PICK_HEAD = new ToolPart("flint_pick_head");

	public static final ToolPart IRON_HAMMER_HEAD = new ToolPart("iron_hammer_head");
	public static final ToolPart KIMBERLITE_HAMMER_HEAD = new ToolPart("kimberlite_hammer_head");

	public static final ToolPart STONE_PICKAXE_HEAD = new ToolPart("stone_pickaxe_head");
	public static final ToolPart COPPER_PICKAXE_HEAD = new ToolPart("copper_pickaxe_head");
	public static final ToolPart TIN_PICKAXE_HEAD = new ToolPart("tin_pickaxe_head");
	public static final ToolPart BRONZE_PICKAXE_HEAD = new ToolPart("bronze_pickaxe_head");
	public static final ToolPart IRON_PICKAXE_HEAD = new ToolPart("iron_pickaxe_head");
	public static final ToolPart GOLD_PICKAXE_HEAD = new ToolPart("gold_pickaxe_head");
	public static final ToolPart STEEL_PICKAXE_HEAD = new ToolPart("steel_pickaxe_head");
	public static final ToolPart MAGNETIC_GOLD_PICKAXE_HEAD = new ToolPart("magnetic_gold_pickaxe_head");
	public static final ToolPart RED_STEEL_PICKAXE_HEAD = new ToolPart("red_steel_pickaxe_head");
	public static final ToolPart DIAMOND_PICKAXE_HEAD = new ToolPart("diamond_pickaxe_head");
	public static final ToolPart NICO_PICKAXE_HEAD = new ToolPart("nico_pickaxe_head");
	public static final ToolPart KIMBERLITE_PICKAXE_HEAD = new ToolPart("kimberlite_pickaxe_head");

	public static final ToolPart STONE_HOE_HEAD = new ToolPart("stone_hoe_head");
	*/
	
	
}
