package com.belgie.warpednether.util;

import com.belgie.warpednether.WarpedNether;
import com.belgie.warpednether.armor.ModArmourMaterial;
import com.belgie.warpednether.blocks.*;
import com.belgie.warpednether.init.ModEntityTypes;
import com.belgie.warpednether.items.*;
import com.belgie.warpednether.tools.ModItemTier;
import com.belgie.warpednether.world.feature.OverwarpedTree;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class RegistryHandler {




    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WarpedNether.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WarpedNether.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> WARPED_SHARD = ITEMS.register("warped_shard", ItemBase::new);
    public static final RegistryObject<Item> WARPED_WART = ITEMS.register("warped_wart", ItemBase::new);
    public static final RegistryObject<WarpedHuitlacoche> WARPED_Huitlacoche = ITEMS.register("warped_huitlacoche", WarpedHuitlacoche::new);
    public static final RegistryObject<WarpedCorn> WARPED_CORN = ITEMS.register("warped_corn", WarpedCorn::new);
    public static final RegistryObject<Item> ARMOR_ASH = ITEMS.register("armor_ash", ItemBase::new);
    public static final RegistryObject<Item> WARPED_STICK = ITEMS.register("warped_stick", ItemBase::new);
    public static final RegistryObject<WarpedApple> WARPED_APPLE = ITEMS.register("warped_apple", WarpedApple::new);
    public static final RegistryObject<Item> STRIDER_HAIR = ITEMS.register("strider_hair", ItemBase::new);
    public static final RegistryObject<Item> WARPED_DYE = ITEMS.register("warped_dye", ItemBase::new);
    public static final RegistryObject<Item> INVIS_CRSYTAL = ITEMS.register("invis_crystal", ItemBase::new);
    public static final RegistryObject<Item> WARPED_WHEAT = ITEMS.register("warped_wheat", ItemBase::new);
    public static final RegistryObject<WarpedCoal> WARPED_COAL = ITEMS.register("warped_coal", WarpedCoal::new);
    public static final RegistryObject<WarpedBread> WARPED_BREAD = ITEMS.register("warped_bread", WarpedBread::new);
    public static final RegistryObject<Item> WARPED_QUARTZ = ITEMS.register("warped_quartz", ItemBase::new);



    // Mob Spawn Eggs
    public static final RegistryObject<ModSpawnEggItem> HUMAN_SPAWN_EGG = ITEMS.register("human_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.human, 0x37C3BD, 0x226F6C, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ModSpawnEggItem> DBTW_SPAWN_EGG = ITEMS.register("dbtw_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.dbtw, 0x44380D, 0xA60BF4, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ModSpawnEggItem> DIO_SPAWN_EGG = ITEMS.register("dio_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.dio, 0xF60C0C, 0x0C56F6, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ModSpawnEggItem> WARPEDCUBE_SPAWN_EGG = ITEMS.register("warped_cube_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.warped_cube, 0x0051FF, 0x00FFE8, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ModSpawnEggItem> ICY_SPAWN_EGG = ITEMS.register("icy_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.icy, 0xF86020, 0x93E1FF, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));


    // Tools
    public static final RegistryObject<SwordItem> WARPED_SWORD = ITEMS.register("warped_sword", () ->
            new SwordItem(ModItemTier.WARPED, 5, -2.0f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<PickaxeItem> WARPED_PICKAXE = ITEMS.register("warped_pickaxe", () ->
            new PickaxeItem(ModItemTier.WARPED, -1, -2.8f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<AxeItem> WARPED_AXE = ITEMS.register("warped_axe", () ->
            new AxeItem(ModItemTier.WARPED, -1, -2.8f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ShovelItem> WARPED_SHOVEL = ITEMS.register("warped_shovel", () ->
            new ShovelItem(ModItemTier.WARPED, -1, -2.8f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<HoeItem> WARPED_HOE = ITEMS.register("warped_hoe", () ->
            new HoeItem(ModItemTier.WARPED, -1, -2.8f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<SwordItem> QUARTZ_SWORD = ITEMS.register("quartz_sword", () ->
            new SwordItem(ModItemTier.QUARTZ, 5, -2.0f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<PickaxeItem> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe", () ->
            new PickaxeItem(ModItemTier.QUARTZ, -1, -2.0F, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<AxeItem> QUARTZ_AXE = ITEMS.register("quartz_axe", () ->
            new AxeItem(ModItemTier.QUARTZ, -1, -2.8f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ShovelItem> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel", () ->
            new ShovelItem(ModItemTier.WARPED, -1, -2.8f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<HoeItem> QUARTZ_HOE = ITEMS.register("quartz_hoe", () ->
            new HoeItem(ModItemTier.WARPED, -1, -2.8f, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));


    // Armour
    public static final RegistryObject<ArmorItem> WARPED_HELMET = ITEMS.register("warped_helmet", () -> new ArmorItem(ModArmourMaterial.WARPED,
            EquipmentSlotType.HEAD, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ArmorItem> WARPED_CHESTPLATE = ITEMS.register("warped_chestplate", () -> new ArmorItem(ModArmourMaterial.WARPED,
            EquipmentSlotType.CHEST, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ArmorItem> WARPED_LEGGINGS = ITEMS.register("warped_leggings", () -> new ArmorItem(ModArmourMaterial.WARPED,
            EquipmentSlotType.LEGS, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ArmorItem> WARPED_BOOTS = ITEMS.register("warped_boots", () -> new ArmorItem(ModArmourMaterial.WARPED,
            EquipmentSlotType.FEET, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));

    public static final RegistryObject<ArmorItem> INVIS_HELMET = ITEMS.register("invis_helmet", () -> new ArmorItem(ModArmourMaterial.INVIS,
            EquipmentSlotType.HEAD, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ArmorItem> INVIS_CHESTPLATE = ITEMS.register("invis_chestplate", () -> new ArmorItem(ModArmourMaterial.INVIS,
            EquipmentSlotType.CHEST, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ArmorItem> INVIS_LEGGINGS = ITEMS.register("invis_leggings", () -> new ArmorItem(ModArmourMaterial.INVIS,
            EquipmentSlotType.LEGS, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<ArmorItem> INVIS_BOOTS = ITEMS.register("invis_boots", () -> new ArmorItem(ModArmourMaterial.INVIS,
            EquipmentSlotType.FEET, new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));


    // Blocks
    public static final RegistryObject<Block> WARPED_ORE = BLOCKS.register("warped_ore", WarpedOre::new);
    public static final RegistryObject<Block> WARPED_SHARD_BLOCK = BLOCKS.register("warped_shard_block", WarpedShardBlock::new);
    public static final RegistryObject<Block> WARPED_WOOL = BLOCKS.register("warped_wool", WarpedWool::new);
    public static final RegistryObject<Block> OVERWARPED_LOGS = BLOCKS.register("overwarped_logs", OverwarpedLogs::new);
    public static final RegistryObject<Block> OVERWARPED_LEAVE = BLOCKS.register("overwarped_leave", OverwarpedLeave::new);
    public static final RegistryObject<Block> WARPED_CROP = BLOCKS.register("warped_crop", () -> new WarpedCrop(AbstractBlock.Properties.from(Blocks.WHEAT)));
    public static final RegistryObject<LadderBlock> WARPED_LADDER = BLOCKS.register("warped_ladder", () -> new WarpedLadder(AbstractBlock.Properties.from(Blocks.LADDER)));
    public static final RegistryObject<Block> WARPED_QUARTZ_BLOCK = BLOCKS.register("warped_quartz_block", WarpedQuartzBlock::new);
    public static final RegistryObject<GrassBlock> WARPED_GRASS_BLOCK = BLOCKS.register("warped_grass_block", () -> new GrassBlock(AbstractBlock.Properties.from(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<Block> OVERWARPED_SAPLING = BLOCKS.register("overwarped_sapling", () -> new OverwarpedSapling(() -> new OverwarpedTree(), AbstractBlock.Properties.from(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> OVERWARPED_PLANKS = BLOCKS.register("overwarped_planks", OverwarpedPlanks::new);
    public static final RegistryObject<Block> OVERWARPED_SLAB = BLOCKS.register("overwarped_slab", () -> new SlabBlock(AbstractBlock.Properties.from(RegistryHandler.OVERWARPED_PLANKS.get())));
    public static final RegistryObject<Block> OVERWARPED_BUTTON = BLOCKS.register("overwarped_button", () -> new WoodButtonBlock(AbstractBlock.Properties.from(RegistryHandler.OVERWARPED_PLANKS.get())));
    public static final RegistryObject<Block> OVERWARPED_STAIRS = BLOCKS.register("overwarped_stairs", () -> new StairsBlock(Blocks.OAK_STAIRS.getDefaultState(), AbstractBlock.Properties.from(RegistryHandler.OVERWARPED_PLANKS.get())));
    public static final RegistryObject<Block> OVERWARPED_PRESSUREPLATE = BLOCKS.register("overwarped_pressureplate", () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.WOOD, Blocks.OAK_PLANKS.getMaterialColor()).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WARPED_QUARTZ_ORE = BLOCKS.register("warped_quartz_ore", WarpedQuartzOre::new);
    public static final RegistryObject<Block> OVERWARPED_TRAPDOOR = BLOCKS.register("overwarped_trapdoor", () -> new TrapDoorBlock(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));

    // Block item
    public static final RegistryObject<Item> WARPED_ORE_ITEM = ITEMS.register("warped_ore", () -> new BlockItemBase(WARPED_ORE.get()));
    public static final RegistryObject<Item> WARPED_SHARD_BLOCK_ITEM = ITEMS.register("warped_shard_block", () -> new BlockItemBase(WARPED_SHARD_BLOCK.get()));
    public static final RegistryObject<Item> WARPED_WOOL_ITEM = ITEMS.register("warped_wool", () -> new BlockItemBase(WARPED_WOOL.get()));
    public static final RegistryObject<Item> OVERWARPED_LOGS_ITEM = ITEMS.register("overwarped_logs", () -> new BlockItemBase(OVERWARPED_LOGS.get()));
    public static final RegistryObject<Item> OVERWARPED_LEAVE_ITEM = ITEMS.register("overwarped_leave", () -> new BlockItemBase(OVERWARPED_LEAVE.get()));
    public static final RegistryObject<Item> WARPED_SEED_ITEM = ITEMS.register("warped_seed", () -> new BlockItem(RegistryHandler.WARPED_CROP.get(), new Item.Properties().group(WarpedNether.WarpedNetherItemGroup.instance)));
    public static final RegistryObject<Item> WARPED_LADDER_ITEM = ITEMS.register("warped_ladder", () -> new BlockItemBase(WARPED_LADDER.get()));
    public static final RegistryObject<Item> WARPED_QUARTZ_BLOCK_ITEM = ITEMS.register("warped_quartz_block", () -> new BlockItemBase(WARPED_QUARTZ_BLOCK.get()));
    public static final RegistryObject<Item> WARPED_GRASS_BLOCK_ITEM = ITEMS.register("warped_grass_block", () -> new BlockItemBase(WARPED_GRASS_BLOCK.get()));
    public static final RegistryObject<Item> OVERWARPED_SAPLING_ITEM = ITEMS.register("overwarped_sapling", () -> new BlockItemBase(OVERWARPED_SAPLING.get()));
    public static final RegistryObject<Item> OVERWARPED_PLANKS_ITEM = ITEMS.register("overwarped_planks", () -> new BlockItemBase(OVERWARPED_PLANKS.get()));
    public static final RegistryObject<Item> OVERWARPED_SLAB_ITEM = ITEMS.register("overwarped_slab", () -> new BlockItemBase(OVERWARPED_SLAB.get()));
    public static final RegistryObject<Item> OVERWARPED_BUTTON_ITEM = ITEMS.register("overwarped_button", () -> new BlockItemBase(OVERWARPED_BUTTON.get()));
    public static final RegistryObject<Item> OVERWARPED_STAIRS_ITEM = ITEMS.register("overwarped_stairs", () -> new BlockItemBase(OVERWARPED_STAIRS.get()));
    public static final RegistryObject<Item> OVERWARPED_PRESSUREPLATE_ITEM = ITEMS.register("overwarped_pressureplate", () -> new BlockItemBase(OVERWARPED_PRESSUREPLATE.get()));
    public static final RegistryObject<Item> WARPED_QUARTZ_ORE_ITEM = ITEMS.register("warped_quartz_ore", () -> new BlockItemBase(WARPED_QUARTZ_ORE.get()));
    public static final RegistryObject<Item> OVERWARPED_TRAPDOOR_ITEM = ITEMS.register("overwarped_trapdoor", () -> new BlockItemBase(OVERWARPED_TRAPDOOR.get()));
}



