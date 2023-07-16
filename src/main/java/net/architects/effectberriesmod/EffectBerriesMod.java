package net.architects.effectberriesmod;

import net.architects.effectberriesmod.config.ModConfigs;
import net.architects.effectberriesmod.villager.ModVillagers;
import net.architects.effectberriesmod.world.feature.ModConfiguredFeatures;
import net.architects.effectberriesmod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.architects.effectberriesmod.block.ModBlocks;
import net.architects.effectberriesmod.item.ModItemGroup;
import net.architects.effectberriesmod.item.ModItems;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class EffectBerriesMod implements ModInitializer {
	public static final String MOD_ID = "effectberriesmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("effectberriesmod");

	@Override
	public void onInitialize() {

		ModConfiguredFeatures.registerConfiguredFeatures();

		ModConfigs.registerConfigs();

		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();

		ModWorldGen.generateModWorldGen();

	}
}