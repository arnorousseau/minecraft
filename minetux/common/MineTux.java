package minetux.common;

import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockStationary;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenSwamp;
import minetux.common.entities.EntityZombieKing;
import minetux.common.item.ItemWandEther;
import minetux.proxy.MineTuxCommonProxy;
import minetux.proxy.MineTuxServerProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "MineTux", name = "Mod MineTux", version = "1.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MineTux {

	@SidedProxy(clientSide = "minetux.proxy.MineTuxClientProxy", serverSide = "minetux.proxy.MineTuxServerProxy")
	public static MineTuxCommonProxy proxy;
	
	@Instance("MineTux")
	public static MineTux instance;
		
	public static final int ether_id = 8;
	
	static EnumArmorMaterial CopperArmor = EnumHelper.addArmorMaterial("CopperArmor", 20, new int[]{1, 4, 3, 1}, 15);
	static EnumArmorMaterial SilverArmor = EnumHelper.addArmorMaterial("SilverArmor", 20, new int[]{2, 8, 5, 2}, 15);
	static EnumArmorMaterial MithrilArmor = EnumHelper.addArmorMaterial("MithrilArmor", 20, new int[]{3, 8, 6, 3}, 15);
	static EnumToolMaterial WarAxeMaterial = EnumHelper.addToolMaterial("WarAxe", 2, 250, 7F, 2, 5);
	static EnumToolMaterial WarHammerMaterial = EnumHelper.addToolMaterial("Hamma", 3, 750, 1.0F, 14, 9);
	
	
	//Blocks
	public static Block BlockCopper = new BlockCopper(2600).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockCopper").setTextureName("minetux:BlockCopper");
	public static Block BlockSilver = new BlockSilver(2601).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockSilver").setTextureName("minetux:BlockSilver");	
	public static Block BlockHop = new BlockHop(2602).setUnlocalizedName("BlockHop").setTextureName("minetux:BlockHop");
	public static Block BlockRuby = new BlockRuby(2603).setHardness(1.5F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockRuby").setTextureName("minetux:BlockRuby");	
	public static Block BlockMithril = new BlockMithril(2604).setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockMithril").setTextureName("minetux:BlockMithril");	
	public static Block BlockSunFlower = new BlockSunFlower(2605).setUnlocalizedName("BlockSunFlower").setTextureName("minetux:BlockSunFlower");
	public static Block BlockVolcano = new BlockVolcano(202).setHardness(1.5F).setUnlocalizedName("BlockVolcano").setTextureName("minetux:BlockVolcano");
	public static Block BlockPeachGrass = new BlockPeachGrass(203).setHardness(0.0F).setUnlocalizedName("BlockPeachGrass");
	public static Block BlockDiscStone = new BlockDiscStone(204,"Disc Stone").setHardness(1.0F).setUnlocalizedName("BlockDiscStone").setTextureName("minetux:BlockDiscStone");
	public static Block BlockDiscDirt = new BlockDiscDirt(205).setUnlocalizedName("BlockDiscDirt").setTextureName("minetux:BlockDiscDirt");
	public static Block BlockBrickStone = new BlockBrickStone(208).setHardness(1.0F).setResistance(5.0F).setStepSound(Block.soundStoneFootstep).setUnlocalizedName("BlockBrickStone").setTextureName("minetux:BlockBrickStone");
	
	public static BlockEtherPortal BlockPortal = (BlockEtherPortal)new BlockEtherPortal(206).setHardness(-1.0F).setLightValue(0.75F).setUnlocalizedName("BlockEtherPortal");
	public static BlockEtherPortalTrigger BlockPortalTrigger = (BlockEtherPortalTrigger)new BlockEtherPortalTrigger(207).setHardness(0.0F).setLightValue(1.00F).setUnlocalizedName("BlockEtherPortalTrigger");
	
	
	public static Item CopperHelmet, CopperChestPlate, CopperLeggings, CopperBoots;
	public static Item SilverHelmet, SilverChestPlate, SilverLeggings, SilverBoots;
	public static Item MithrilHelmet, MithrilChestPlate, MithrilLeggings, MithrilBoots;	
	public static Item CookedEgg, OstrichEgg;
	public static Item IngotCopper, IngotSilver, IngotMithril;
	public static Item GemRuby;
	public static Item WandEther;
	public static Item WarAxe;
	public static Item WarHammer = new ItemWarHammer(12023, WarHammerMaterial).setCreativeTab(CreativeTabs.tabCombat).setFull3D().setUnlocalizedName("WarHammer");
	public static Item CephalosGriffe;
	
	public static final BiomeGenBase BiomeEther = new BiomeGenEther(25);
	public static final BiomeGenBase BiomeVolcano = new BiomeGenVolcano(26);
	public static final BiomeGenBase BiomeHighlands = new BiomeGenHighlandsBiome(27);
	public static final BiomeGenBase BiomeGlacier = new BiomeGenGlacier(28);
	public static final BiomeGenBase BiomeSwamp = new BiomeGenWaterSwamp(29);
	
	
	//Seeds
	public static Item HopSeed, HopItem, BeerItem;
	

	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent event){

		CopperHelmet = new ItemCopperArmor(12000, CopperArmor, 0,0).setUnlocalizedName("CopperHelmet").setTextureName("minetux:HelmetCopper");
		CopperChestPlate = new ItemCopperArmor(12001, CopperArmor, 0, 1).setUnlocalizedName("CopperChestPlate").setTextureName("minetux:ChestPlateCopper");
		CopperLeggings = new ItemCopperArmor(12002, CopperArmor, 0, 2).setUnlocalizedName("CopperLeggings").setTextureName("minetux:LeggingsCopper");
		CopperBoots = new ItemCopperArmor(12003, CopperArmor, 0, 3).setUnlocalizedName("CopperBoots").setTextureName("minetux:BootsCopper");
		CookedEgg = new ItemCookedEgg(12004, 2, 2, false).setUnlocalizedName("CookedEgg").setTextureName("minetux:CookedEgg");
		IngotCopper = new Item(12005).setUnlocalizedName("IngotCopper").setTextureName("minetux:IngotCopper");
		HopItem = new Item(12006).setUnlocalizedName("HopItem").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("minetux:HopItem");
		HopSeed = new ItemSeeds(12007,BlockHop.blockID,Block.tilledField.blockID).setUnlocalizedName("HopSeed").setTextureName("minetux:HopSeed");
		SilverHelmet = new ItemSilverArmor(12008, SilverArmor, 0,0).setUnlocalizedName("SilverHelmet").setTextureName("minetux:HelmetSilver");
		SilverChestPlate = new ItemSilverArmor(12009, SilverArmor, 0, 1).setUnlocalizedName("SilverChestPlate").setTextureName("minetux:ChestPlateSilver");
		SilverLeggings = new ItemSilverArmor(12010, SilverArmor, 0, 2).setUnlocalizedName("SilverLeggings").setTextureName("minetux:LeggingsSilver");
		SilverBoots = new ItemSilverArmor(12011, SilverArmor, 0, 3).setUnlocalizedName("SilverBoots").setTextureName("minetux:BootsSilver");
		IngotSilver = new Item(12012).setUnlocalizedName("IngotSilver").setTextureName("minetux:IngotSilver");
		GemRuby = new ItemGemRuby(12013).setUnlocalizedName("GemRuby").setTextureName("minetux:GemRuby");
		IngotMithril = new Item(12014).setUnlocalizedName("IngotMithril").setTextureName("minetux:IngotMithril");
		MithrilHelmet = new ItemMithrilArmor(12015, MithrilArmor, 0,0).setUnlocalizedName("MithrilHelmet").setTextureName("minetux:HelmetMithril");
		MithrilChestPlate = new ItemMithrilArmor(12016, MithrilArmor, 0, 1).setUnlocalizedName("MithrilChestPlate").setTextureName("minetux:ChestPlateMithril");
		MithrilLeggings = new ItemMithrilArmor(12017, MithrilArmor, 0, 2).setUnlocalizedName("MithrilLeggings").setTextureName("minetux:LeggingsMithril");
		MithrilBoots = new ItemMithrilArmor(12018, MithrilArmor, 0, 3).setUnlocalizedName("MithrilBoots").setTextureName("minetux:BootsMithril");
		WandEther = new ItemWandEther(12019).setUnlocalizedName("WandEther").setTextureName("minetux:WandEther");
		BeerItem = new ItemBeer(12020, 2, 2, false).setUnlocalizedName("Beer").setTextureName("minetux:Beer");
		OstrichEgg = new ItemOstrichEgg(12021).setUnlocalizedName("OstrichEgg").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("minetux:OstrichEgg");
		WarAxe = new ItemSword(12022,WarAxeMaterial).setUnlocalizedName("WarAxe").setTextureName("minetux:WarAxe");
		CephalosGriffe = new Item(12024).setUnlocalizedName("CephalosGriffe").setCreativeTab(CreativeTabs.tabMaterials).setTextureName("minetux:CephalosGriffe");
		
		MinecraftForge.setToolClass(WarAxe, "sword", 2);
		
		GameRegistry.registerItem(CopperHelmet, "CopperHelmet", "MineTux");
		GameRegistry.registerItem(CopperChestPlate, "CopperChestPlate", "MineTux");
		GameRegistry.registerItem(CopperLeggings, "CopperLeggings", "MineTux");
		GameRegistry.registerItem(CopperBoots, "CopperBoots", "MineTux");
		GameRegistry.registerItem(SilverHelmet, "SilverHelmet", "MineTux");
		GameRegistry.registerItem(SilverChestPlate, "SilverChestPlate", "MineTux");
		GameRegistry.registerItem(SilverLeggings, "SilverLeggings", "MineTux");
		GameRegistry.registerItem(SilverBoots, "SilverBoots", "MineTux");
		GameRegistry.registerItem(MithrilHelmet, "MithrilHelmet", "MineTux");
		GameRegistry.registerItem(MithrilChestPlate, "MithrilChestPlate", "MineTux");
		GameRegistry.registerItem(MithrilLeggings, "MithrilLeggings", "MineTux");
		GameRegistry.registerItem(MithrilBoots, "MithrilBoots", "MineTux");
		GameRegistry.registerItem(CookedEgg, "CookedEgg", "MineTux");
		GameRegistry.registerItem(IngotCopper, "IngotCopper", "MineTux");
		GameRegistry.registerItem(IngotSilver, "IngotSilver", "MineTux");
		GameRegistry.registerItem(GemRuby, "GemRuby", "MineTux");
		GameRegistry.registerItem(IngotMithril, "Mithril", "MineTux");
		GameRegistry.registerItem(HopItem, "HopItem", "MineTux");
		GameRegistry.registerItem(WandEther, "WandEther", "MineTux");
		GameRegistry.registerItem(BeerItem, "BeerItem", "MineTux");
		GameRegistry.registerItem(OstrichEgg, "OstrichEgg", "MineTux");
		GameRegistry.registerItem(WarAxe,"WarAxe","MineTux");
		GameRegistry.registerBlock(BlockCopper, "BlockCopper");
		GameRegistry.registerBlock(BlockSilver, "BlockSilver");
		GameRegistry.registerBlock(BlockRuby, "BlockRuby");
		GameRegistry.registerBlock(BlockMithril, "BlockMithril");
		GameRegistry.registerBlock(BlockHop, "BlockHop");
		GameRegistry.registerBlock(BlockSunFlower, "BlockSunFlower");
		GameRegistry.registerBlock(BlockVolcano, "BlockVolcano");
		GameRegistry.registerBlock(BlockPeachGrass, "BlockPeachGrass");
		GameRegistry.registerBlock(BlockPortal, "BlockPortal");
		GameRegistry.registerBlock(BlockPortalTrigger, "BlockPortalTrigger");
		GameRegistry.registerBlock(BlockDiscStone, "BlockDiscStone");
		GameRegistry.registerBlock(BlockBrickStone, "BlockBrickStone");
		GameRegistry.registerItem(CephalosGriffe, "CephalosGriffe", "MineTux");
		
		
		//Furnace Registry
		GameRegistry.addSmelting(Item.egg.itemID, new ItemStack(CookedEgg, 1), 0.5f);
		GameRegistry.addSmelting(BlockCopper.blockID, new ItemStack(IngotCopper, 1), 0.5f);		
		GameRegistry.addSmelting(BlockSilver.blockID, new ItemStack(IngotSilver, 1), 0.5f);	
		GameRegistry.addSmelting(BlockMithril.blockID, new ItemStack(IngotMithril, 1), 0.5f);	
		GameRegistry.addSmelting(BlockDiscStone.blockID, new ItemStack(BlockBrickStone, 1), 0.5f);	
		
		//Seeds Registry
		GameRegistry.registerItem(HopSeed, "HopSeed", "MineTux");
	}
	
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
				
		EntityRegistry.registerGlobalEntityID(EntityHerobrine.class, "Herobrine", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityHerobrine.class, "EntityHerobrine", 250, this, 100, 1, true);
		EntityRegistry.addSpawn(EntityHerobrine.class, 5, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {
			MineTux.BiomeEther, MineTux.BiomeHighlands
		});
		LanguageRegistry.instance().addStringLocalization("entity.Herobrine.name", "Herobrine");
		
		EntityRegistry.registerGlobalEntityID(EntityOgre.class, "Ogre", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityOgre.class, "EntityOgre", 251, this, 100, 1, true);
		EntityRegistry.addSpawn(EntityOgre.class, 10, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {
			MineTux.BiomeHighlands
		});
		LanguageRegistry.instance().addStringLocalization("entity.Ogre.name", "Ogre");
		
		
		EntityRegistry.registerGlobalEntityID(EntityMazeSlime.class, "MazeSlime", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityMazeSlime.class, "EntityMazeSlime", 252, this, 100, 1, true);
		EntityRegistry.addSpawn(EntityMazeSlime.class, 1, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {
			MineTux.BiomeGlacier
		});
		LanguageRegistry.instance().addStringLocalization("entity.MazeSlime.name", "MazeSlime");
		
		
		
		EntityRegistry.registerGlobalEntityID(EntityOstrich.class, "Ostrich", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityOstrich.class, "EntityOstrich", 253, this, 100, 1, true);
		EntityRegistry.addSpawn(EntityOstrich.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {
			MineTux.BiomeEther
		});
		LanguageRegistry.instance().addStringLocalization("entity.Ostrich.name", "Ostrich");
		
		
		EntityRegistry.registerGlobalEntityID(EntitySeaUrchin.class, "SeaUrchin", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntitySeaUrchin.class, "EntitySeaUrchin", 254, this, 100, 1, true);
		EntityRegistry.addSpawn(EntitySeaUrchin.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {
			BiomeGenBase.beach
		});
		LanguageRegistry.instance().addStringLocalization("entity.SeaUrchin.name", "SeaUrchin");
		
		
		EntityRegistry.registerGlobalEntityID(EntityCephalos.class, "Cephalos", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityCephalos.class, "EntityCephalos", 255, this, 100, 1, true);
		EntityRegistry.addSpawn(EntityCephalos.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {
			MineTux.BiomeVolcano
		});
		LanguageRegistry.instance().addStringLocalization("entity.Cephalos.name", "Cephalos");
		
		
		EntityRegistry.registerGlobalEntityID(EntityPopo.class, "Popo", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityPopo.class, "EntityPopo", 256, this, 100, 1, true);
		EntityRegistry.addSpawn(EntityPopo.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {
			MineTux.BiomeEther
		});
		LanguageRegistry.instance().addStringLocalization("entity.Popo.name", "Popo");
		

		EntityRegistry.registerGlobalEntityID(EntityYeti.class, "Yeti", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityYeti.class, "Yeti", 258, this, 100, 1, true);
		EntityRegistry.addSpawn(EntityYeti.class, 1, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {
			MineTux.BiomeGlacier
		});
		LanguageRegistry.instance().addStringLocalization("entity.Yeti.name", "Yeti");
		
		
		EntityRegistry.registerGlobalEntityID(EntityErupe.class, "Erupe", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityErupe.class, "EntityErupe", 259, this, 100, 1, true);
		EntityRegistry.addSpawn(EntityErupe.class, 1, 1, 4, EnumCreatureType.creature, new BiomeGenBase[] {
			MineTux.BiomeHighlands
		});
		LanguageRegistry.instance().addStringLocalization("entity.Erupe.name", "Erupe");
		
		
		EntityRegistry.registerGlobalEntityID(EntityZombieKing.class, "ZombieKing", EntityRegistry.findGlobalUniqueEntityId(), 24, 30);
		EntityRegistry.registerModEntity(EntityZombieKing.class, "ZombieKing", 260, this, 100, 1, true);
		//EntityRegistry.addSpawn(EntityZombieKing.class, 1, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {});
		LanguageRegistry.instance().addStringLocalization("entity.ZombieKing.name", "ZombieKing");
		
		
		DimensionManager.registerProviderType(MineTux.ether_id, WorldProviderEther.class, true);
        DimensionManager.registerDimension(MineTux.ether_id, MineTux.ether_id);
		
        
		//Recipe Registry
		GameRegistry.addRecipe(new ItemStack(CopperHelmet,1), new Object[]{"III","I I",Character.valueOf('I'), IngotCopper});
		GameRegistry.addRecipe(new ItemStack(CopperChestPlate,1), new Object[]{"I I","III","III",Character.valueOf('I'), IngotCopper});
		GameRegistry.addRecipe(new ItemStack(CopperLeggings,1), new Object[]{"III","I I","I I",Character.valueOf('I'), IngotCopper});
		GameRegistry.addRecipe(new ItemStack(CopperBoots,1), new Object[]{"   ","I I","I I",Character.valueOf('I'), IngotCopper});
		
		GameRegistry.addRecipe(new ItemStack(SilverHelmet,1), new Object[]{"III","I I",Character.valueOf('I'), IngotSilver});
		GameRegistry.addRecipe(new ItemStack(SilverChestPlate,1), new Object[]{"I I","III","III",Character.valueOf('I'), IngotSilver});
		GameRegistry.addRecipe(new ItemStack(SilverLeggings,1), new Object[]{"III","I I","I I",Character.valueOf('I'), IngotSilver});
		GameRegistry.addRecipe(new ItemStack(SilverBoots,1), new Object[]{"   ","I I","I I",Character.valueOf('I'), IngotSilver});
		GameRegistry.addRecipe(new ItemStack(MithrilHelmet,1), new Object[]{"III","I I",Character.valueOf('I'), IngotMithril});
		GameRegistry.addRecipe(new ItemStack(MithrilChestPlate,1), new Object[]{"I I","III","III",Character.valueOf('I'), IngotMithril});
		GameRegistry.addRecipe(new ItemStack(MithrilLeggings,1), new Object[]{"III","I I","I I",Character.valueOf('I'), IngotMithril});
		GameRegistry.addRecipe(new ItemStack(MithrilBoots,1), new Object[]{"   ","I I","I I",Character.valueOf('I'), IngotMithril});
		GameRegistry.addRecipe(new ItemStack(WandEther,1), new Object[]{" R "," B "," R ",Character.valueOf('R'), GemRuby, Character.valueOf('B'), Item.blazeRod});
		GameRegistry.addRecipe(new ItemStack(BeerItem,1), new Object[]{"OOO"," R ","   ",Character.valueOf('O'), MineTux.HopItem, Character.valueOf('R'), Item.glassBottle});
		GameRegistry.addRecipe(new ItemStack(WarAxe,1), new Object[]{"III","ISI"," S ",Character.valueOf('I'), Item.ingotIron, Character.valueOf('S'), Item.stick});
		
        GameRegistry.registerWorldGenerator(new WorldGeneratorMineTux());
        
		proxy.registerRender();
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event){
		
	}
}
