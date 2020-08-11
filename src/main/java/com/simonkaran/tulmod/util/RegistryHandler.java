package com.simonkaran.tulmod.util;

import com.simonkaran.tulmod.TulMod;
import com.simonkaran.tulmod.tools.TulTool;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    //"List of items"
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TulMod.MOD_ID);

    //New items
    public static final RegistryObject<TulTool> NETHERITE_TUL = ITEMS.register("netherite_tul",
            () -> new TulTool(ItemTier.NETHERITE, 3, -2.4F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<TulTool> DIAMOND_TUL = ITEMS.register("diamond_tul",
            () -> new TulTool(ItemTier.DIAMOND, 3, -2.4F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<TulTool> IRON_TUL = ITEMS.register("iron_tul",
            () -> new TulTool(ItemTier.IRON, 3, -2.4F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<TulTool> GOLDEN_TUL = ITEMS.register("golden_tul",
            () -> new TulTool(ItemTier.GOLD, 3, -2.4F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<TulTool> STONE_TUL = ITEMS.register("stone_tul",
            () -> new TulTool(ItemTier.STONE, 3, -2.4F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<TulTool> WOODEN_TUL = ITEMS.register("wooden_tul",
            () -> new TulTool(ItemTier.WOOD, 3, -2.4F, new Item.Properties().group(ItemGroup.TOOLS)));

    public static void begin() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
