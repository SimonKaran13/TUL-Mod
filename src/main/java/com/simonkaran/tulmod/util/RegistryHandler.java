package com.simonkaran.tulmod.util;

import com.simonkaran.tulmod.Tul;
import com.simonkaran.tulmod.items.TULitem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    //"List of items"
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Tul.MOD_ID);

    //New item
    public static final RegistryObject<Item> NETHERITE_TUL = ITEMS.register("netherite_tul", () -> new TULitem());
    public static final RegistryObject<Item> DIAMOND_TUL = ITEMS.register("diamond_tul", () -> new TULitem());
    public static final RegistryObject<Item> IRON_TUL = ITEMS.register("iron_tul", () -> new TULitem());
    public static final RegistryObject<Item> GOLDEN_TUL = ITEMS.register("golden_tul", () -> new TULitem());
    public static final RegistryObject<Item> STONE_TUL = ITEMS.register("stone_tul", () -> new TULitem());
    public static final RegistryObject<Item> WOODEN_TUL = ITEMS.register("wooden_tul", () -> new TULitem());

    public static void begin() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
