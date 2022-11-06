package net.bor.borovmod.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> OLIVE_PLACED = PlacementUtils.register("olive_placed",
            ModConfiguredFeatures.OLIVE_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 3)));

    public static final Holder<PlacedFeature> FIG_PLACED = PlacementUtils.register("fig_placed",
            ModConfiguredFeatures.FIG_SPAWN, VegetationPlacements.treePlacement(
                    PlacementUtils.countExtra(0, 0.1f, 3)));
}
