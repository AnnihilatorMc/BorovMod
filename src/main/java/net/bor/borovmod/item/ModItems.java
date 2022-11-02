package net.bor.borovmod.item;

import net.bor.borovmod.BorovMod;
import net.bor.borovmod.item.custom.PyropeGarnetDetectorItem;
import net.bor.borovmod.item.custom.SarmaItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BorovMod.MOD_ID);


    public static final RegistryObject<Item> SARMA = ITEMS.register("sarma",
            () -> new SarmaItem(new Item.Properties().tab(ModCreativeModeTab.BALKAN_TAB).food(ModFoods.SARMA).rarity(Rarity.EPIC)));

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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
