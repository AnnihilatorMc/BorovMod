package net.bor.borovmod.world.gen;

import net.bor.borovmod.world.feature.ModPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class ModTreeGeneration {
    public static void generateTrees(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.VEGETAL_DECORATION);

        if(event.getCategory() == Biome.BiomeCategory.PLAINS) {
            base.add(ModPlacedFeatures.OLIVE_PLACED);
            base.add(ModPlacedFeatures.FIG_PLACED);
        }
    }
}
