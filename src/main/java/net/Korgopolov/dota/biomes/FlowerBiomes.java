package net.Korgopolov.dota.biomes;

import net.Korgopolov.dota.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

import java.util.List;

public class FlowerBiomes {

    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> HEATHER_FEATURE =
            FeatureUtils.register("heather_feature",
                    Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.heather_block.get().defaultBlockState())));

    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> DANDELION_FEATURE =
            FeatureUtils.register("dandelion_feature",
                    Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.dandelion_block.get().defaultBlockState())));

    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> FLYCATCHER_FEATURE =
            FeatureUtils.register("flycatcher_feature",
                    Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.flycatcher_block.get().defaultBlockState())));

    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> LAVENDER_FEATURE =
            FeatureUtils.register("lavender_feature",
                    Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.lavender_block.get().defaultBlockState())));

    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> VIOLET_FEATURE =
            FeatureUtils.register("violet_feature",
                    Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.violet_block.get().defaultBlockState())));

    public static final Holder<ConfiguredFeature<SimpleBlockConfiguration, ?>> CORNFLOWER_FEATURE =
            FeatureUtils.register("cornflower_feature",
                    Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.cornflower_block.get().defaultBlockState())));

    public static final Holder<PlacedFeature> HEATHER_PLACED_FEATURE = PlacementUtils.register(
            "heather_placed_feature",
            HEATHER_FEATURE,
            List.of(PlacementUtils.HEIGHTMAP)
    );

    public static final Holder<PlacedFeature> DANDELION_PLACED_FEATURE = PlacementUtils.register(
            "dandelion_placed_feature",
            DANDELION_FEATURE,
            List.of(PlacementUtils.HEIGHTMAP)
    );

    public static final Holder<PlacedFeature> FLYCATCHER_PLACED_FEATURE = PlacementUtils.register(
            "flycatcher_placed_feature",
            FLYCATCHER_FEATURE,
            List.of(PlacementUtils.HEIGHTMAP)
    );

    public static final Holder<PlacedFeature> LAVENDER_PLACED_FEATURE = PlacementUtils.register(
            "lavender_placed_feature",
            LAVENDER_FEATURE,
            List.of(PlacementUtils.HEIGHTMAP)
    );

    public static final Holder<PlacedFeature> VIOLET_PLACED_FEATURE = PlacementUtils.register(
            "violet_placed_feature",
            VIOLET_FEATURE,
            List.of(PlacementUtils.HEIGHTMAP)
    );

    public static final Holder<PlacedFeature> CORNFLOWER_PLACED_FEATURE = PlacementUtils.register(
            "cornflower_placed_feature",
            CORNFLOWER_FEATURE,
            List.of(PlacementUtils.HEIGHTMAP)
    );

    public static Biome createNewBiome() {
        BiomeSpecialEffects effects = new BiomeSpecialEffects.Builder()
                .fogColor(0xC0D8FF)
                .waterColor(0x3F76E4)
                .waterFogColor(0x050533)
                .skyColor(0x77ADFF)
                .build();

        BiomeGenerationSettings.Builder generationSettingsBuilder = new BiomeGenerationSettings.Builder();
        generationSettingsBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, HEATHER_PLACED_FEATURE);
        generationSettingsBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, DANDELION_PLACED_FEATURE);
        generationSettingsBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, FLYCATCHER_PLACED_FEATURE);
        generationSettingsBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, LAVENDER_PLACED_FEATURE);
        generationSettingsBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, VIOLET_PLACED_FEATURE);
        generationSettingsBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, CORNFLOWER_PLACED_FEATURE);

        BiomeGenerationSettings generationSettings = generationSettingsBuilder.build();

        MobSpawnSettings mobSpawnSettings = new MobSpawnSettings.Builder().build();

        return new Biome.BiomeBuilder()
                .precipitation(Biome.Precipitation.RAIN)
                .temperature(0.7F)
                .downfall(0.8F)
                .specialEffects(effects)
                .generationSettings(generationSettings)
                .mobSpawnSettings(mobSpawnSettings)
                .build();
    }
}
