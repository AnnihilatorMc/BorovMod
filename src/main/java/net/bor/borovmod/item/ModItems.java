package net.bor.borovmod.item;

import net.bor.borovmod.BorovMod;
import net.bor.borovmod.item.custom.PyropeGarnetDetectorItem;
import net.bor.borovmod.item.custom.SarmaItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BorovMod.MOD_ID);


    public static final RegistryObject<Item> SARMA = ITEMS.register("sarma",
            () -> new SarmaItem(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB).food(ModFoods.SARMA)));

    public static final RegistryObject<Item> SUROVA_SARMA = ITEMS.register("surova_sarma",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB).food(ModFoods.SUROVA_SARMA)));

    public static final RegistryObject<Item> ZELJE = ITEMS.register("zelje",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB).food(ModFoods.ZELJE)));

    public static final RegistryObject<Item> KAMEN_MODROSTI = ITEMS.register("kamen_modrosti",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB)));

    public static final RegistryObject<Item> PYROPE_GARNET = ITEMS.register("pyrope_garnet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB)));

    public static final RegistryObject<Item> PYROPE_GARNET_DETECTOR = ITEMS.register("pyrope_garnet_detector",
            () -> new PyropeGarnetDetectorItem(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB).durability(64)));

    public static final RegistryObject<Item> PYROPE_GARMET_SWORD = ITEMS.register("pyrope_garnet_sword",
            () -> new SwordItem(ModTiers.PYROPE_GARNET, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB)));

    public static final RegistryObject<Item> PYROPE_GARMET_PICKAXE = ITEMS.register("pyrope_garnet_pickaxe",
            () -> new PickaxeItem(ModTiers.PYROPE_GARNET, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB)));

    public static final RegistryObject<Item> PYROPE_GARMET_AXE = ITEMS.register("pyrope_garnet_axe",
            () -> new AxeItem(ModTiers.PYROPE_GARNET, 3, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB)));

    public static final RegistryObject<Item> PYROPE_GARMET_SHOVEL = ITEMS.register("pyrope_garnet_shovel",
            () -> new ShovelItem(ModTiers.PYROPE_GARNET, 1, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB)));

    public static final RegistryObject<Item> PYROPE_GARMET_HOE = ITEMS.register("pyrope_garnet_hoe",
            () -> new HoeItem(ModTiers.PYROPE_GARNET, 0, 4f,
                    new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB)));

    public static final RegistryObject<Item> OLIVE = ITEMS.register("olive",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB).food(ModFoods.OLIVE)));

    public static final RegistryObject<Item> FIG = ITEMS.register("fig",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB).food(ModFoods.FIG)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
