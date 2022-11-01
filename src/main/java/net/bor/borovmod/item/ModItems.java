package net.bor.borovmod.item;

import net.bor.borovmod.BorovMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BorovMod.MOD_ID);


    public static final RegistryObject<Item> SARMA = ITEMS.register("sarma",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(12).saturationMod(16).build())));

    public static final RegistryObject<Item> SUROVA_SARMA = ITEMS.register("surova_sarma",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(3).saturationMod(2).build())));

    public static final RegistryObject<Item> ZELJE = ITEMS.register("zelje",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).food(new FoodProperties.Builder().nutrition(2).saturationMod(2).build())));

    public static final RegistryObject<Item> KAMEN_MODROSTI = ITEMS.register("kamen_modrosti",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
