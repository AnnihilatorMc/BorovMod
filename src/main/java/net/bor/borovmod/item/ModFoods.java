package net.bor.borovmod.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SARMA = (new FoodProperties.Builder()).nutrition(12).saturationMod(1F).build();
    public static final FoodProperties SUROVA_SARMA = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();
    public static final FoodProperties ZELJE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();

    public static final FoodProperties OLIVE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.15F).build();

    public static final FoodProperties FIG = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.25F).build();
}
