package net.bor.borovmod.world.feature;

import net.bor.borovmod.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.AcaciaFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.ForkingTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class ModConfiguredFeatures {

    //OLIVE TREE FEATURE
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> OLIVE_TREE =
            FeatureUtils.register("olive", Feature.TREE, new TreeConfiguration
                    .TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.OLIVE_LOG.get()),
                    new StraightTrunkPlacer(4, 2, 0), BlockStateProvider.simple(ModBlocks.OLIVE_LEAVES.get()),
                    new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 3),
                    new TwoLayersFeatureSize(1, 0, 1)).build()
            );

    public static final Holder<PlacedFeature> OLIVE_CHECKED = PlacementUtils.register("olive_checked", OLIVE_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.OLIVE_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> OLIVE_SPAWN =
            FeatureUtils.register("olive_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(OLIVE_CHECKED, 0.5F)), OLIVE_CHECKED));

    //FIG TREE FEATURE
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> FIG_TREE =
            FeatureUtils.register("fig", Feature.TREE, new TreeConfiguration
                    .TreeConfigurationBuilder(BlockStateProvider.simple(ModBlocks.FIG_LOG.get()),
                    new ForkingTrunkPlacer(5, 2, 2), BlockStateProvider.simple(ModBlocks.FIG_LEAVES.get()),
                    new AcaciaFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0)),
                    new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

    public static final Holder<PlacedFeature> FIG_CHECKED = PlacementUtils.register("fig_checked", FIG_TREE,
            PlacementUtils.filteredByBlockSurvival(ModBlocks.FIG_SAPLING.get()));

    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> FIG_SPAWN =
            FeatureUtils.register("fig_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(FIG_CHECKED, 0.5F)), FIG_CHECKED));

    public static final List<OreConfiguration.TargetBlockState> OVERWORLD_PYROPE_GARNET_ORES = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.PYROPE_GARNET_ORE.get().defaultBlockState()),
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_PYROPE_GARNET_ORE.get().defaultBlockState())
    );

    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PYROPE_GARNET_ORE = FeatureUtils.register("pyrope_garnet_ore",
            Feature.ORE, new OreConfiguration(OVERWORLD_PYROPE_GARNET_ORES, 9));
}
