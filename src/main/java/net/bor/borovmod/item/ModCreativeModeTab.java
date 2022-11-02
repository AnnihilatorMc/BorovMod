package net.bor.borovmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BALKAN_TAB = new CreativeModeTab("balkan_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SARMA.get());
        }
    };
}
