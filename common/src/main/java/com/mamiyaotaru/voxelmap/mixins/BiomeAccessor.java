package com.mamiyaotaru.voxelmap.mixins;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.ClimateSettings;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@FunctionalInterface
@Mixin(Biome.class)
public interface BiomeAccessor {
    @Accessor
    ClimateSettings getClimateSettings();
}