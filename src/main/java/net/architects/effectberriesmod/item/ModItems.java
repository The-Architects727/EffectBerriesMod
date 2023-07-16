package net.architects.effectberriesmod.item;

import net.architects.effectberriesmod.EffectBerriesMod;
import net.architects.effectberriesmod.item.custom.MysteryPie;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.architects.effectberriesmod.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item SWEET_BERRY_BUNDLE = registerItem("sweet_berry_bundle",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.SweetBerryBundle)));

//    public static final Item MYSTERY_PIE = registerItem("mystery_pie",
//            new MysteryPie(new FabricItemSettings().maxCount(64).food(ModFoodComponents.MysteryPie)));

    public static final Item SPEED_EFFECT_BERRY = registerItem("speed_effect_berry",
            new AliasedBlockItem(ModBlocks.SPEED_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.SpeedEffectBerry)));
    public static final Item SLOWNESS_EFFECT_BERRY = registerItem("slowness_effect_berry",
            new AliasedBlockItem(ModBlocks.SLOWNESS_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.SlownessEffectBerry)));
    public static final Item HASTE_EFFECT_BERRY = registerItem("haste_effect_berry",
            new AliasedBlockItem(ModBlocks.HASTE_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.HasteEffectBerry)));
    public static final Item MINING_FATIGUE_EFFECT_BERRY = registerItem("mining_fatigue_effect_berry",
            new AliasedBlockItem(ModBlocks.MINING_FATIGUE_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.MiningFatigueEffectBerry)));
    public static final Item STRENGTH_EFFECT_BERRY = registerItem("strength_effect_berry",
            new AliasedBlockItem(ModBlocks.STRENGTH_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.StrengthEffectBerry)));
    public static final Item INSTANT_HEALTH_EFFECT_BERRY = registerItem("instant_health_effect_berry",
            new AliasedBlockItem(ModBlocks.INSTANT_HEALTH_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.InstantHealthEffectBerry)));
    public static final Item INSTANT_DAMAGE_EFFECT_BERRY = registerItem("instant_damage_effect_berry",
            new AliasedBlockItem(ModBlocks.INSTANT_DAMAGE_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.InstantDamageEffectBerry)));
    public static final Item JUMP_BOOST_EFFECT_BERRY = registerItem("jump_boost_effect_berry",
            new AliasedBlockItem(ModBlocks.JUMP_BOOST_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.JumpBoostEffectBerry)));
    public static final Item NAUSEA_EFFECT_BERRY = registerItem("nausea_effect_berry",
            new AliasedBlockItem(ModBlocks.NAUSEA_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.NauseaEffectBerry)));
    public static final Item REGENERATION_EFFECT_BERRY = registerItem("regeneration_effect_berry",
            new AliasedBlockItem(ModBlocks.REGENERATION_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.RegenerationEffectBerry)));
    public static final Item RESISTANCE_EFFECT_BERRY = registerItem("resistance_effect_berry",
            new AliasedBlockItem(ModBlocks.RESISTANCE_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.ResistanceEffectBerry)));
    public static final Item FIRE_RESISTANCE_EFFECT_BERRY = registerItem("fire_resistance_effect_berry",
            new AliasedBlockItem(ModBlocks.FIRE_RESISTANCE_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.FireResistanceEffectBerry)));
    public static final Item WATER_BREATHING_EFFECT_BERRY = registerItem("water_breathing_effect_berry",
            new AliasedBlockItem(ModBlocks.WATER_BREATHING_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.WaterBreathingEffectBerry)));
    public static final Item INVISIBILITY_EFFECT_BERRY = registerItem("invisibility_effect_berry",
            new AliasedBlockItem(ModBlocks.INVISIBILITY_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.InvisibilityEffectBerry)));
    public static final Item BLINDNESS_EFFECT_BERRY = registerItem("blindness_effect_berry",
            new AliasedBlockItem(ModBlocks.BLINDNESS_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.BlindnessEffectBerry)));
    public static final Item NIGHT_VISION_EFFECT_BERRY = registerItem("night_vision_effect_berry",
            new AliasedBlockItem(ModBlocks.NIGHT_VISION_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.NightVisionEffectBerry)));
    public static final Item HUNGER_EFFECT_BERRY = registerItem("hunger_effect_berry",
            new AliasedBlockItem(ModBlocks.HUNGER_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.HungerEffectBerry)));
    public static final Item WEAKNESS_EFFECT_BERRY = registerItem("weakness_effect_berry",
            new AliasedBlockItem(ModBlocks.WEAKNESS_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.WeaknessEffectBerry)));
    public static final Item POISON_EFFECT_BERRY = registerItem("poison_effect_berry",
            new AliasedBlockItem(ModBlocks.POISON_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.PoisonEffectBerry)));
    public static final Item WITHER_EFFECT_BERRY = registerItem("wither_effect_berry",
            new AliasedBlockItem(ModBlocks.WITHER_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.WitherEffectBerry)));
    public static final Item HEALTH_BOOST_EFFECT_BERRY = registerItem("health_boost_effect_berry",
            new AliasedBlockItem(ModBlocks.HEALTH_BOOST_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.HealthBoostEffectBerry)));
    public static final Item ABSORPTION_EFFECT_BERRY = registerItem("absorption_effect_berry",
            new AliasedBlockItem(ModBlocks.ABSORPTION_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.AbsorptionEffectBerry)));
    public static final Item SATURATION_EFFECT_BERRY = registerItem("saturation_effect_berry",
            new AliasedBlockItem(ModBlocks.SATURATION_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.SaturationEffectBerry)));
    public static final Item GLOWING_EFFECT_BERRY = registerItem("glowing_effect_berry",
            new AliasedBlockItem(ModBlocks.GLOWING_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.GlowingEffectBerry)));
    public static final Item LEVITATION_EFFECT_BERRY = registerItem("levitation_effect_berry",
            new AliasedBlockItem(ModBlocks.LEVITATION_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.LevitationEffectBerry)));
    public static final Item LUCK_EFFECT_BERRY = registerItem("luck_effect_berry",
            new AliasedBlockItem(ModBlocks.LUCK_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.LuckEffectBerry)));
    public static final Item UNLUCK_EFFECT_BERRY = registerItem("unluck_effect_berry",
            new AliasedBlockItem(ModBlocks.UNLUCK_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.UnluckEffectBerry)));
    public static final Item SLOW_FALLING_EFFECT_BERRY = registerItem("slow_falling_effect_berry",
            new AliasedBlockItem(ModBlocks.SLOW_FALLING_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.SlowFallingEffectBerry)));
    public static final Item CONDUIT_POWER_EFFECT_BERRY = registerItem("conduit_power_effect_berry",
            new AliasedBlockItem(ModBlocks.CONDUIT_POWER_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.ConduitPowerEffectBerry)));
    public static final Item DOLPHINS_GRACE_EFFECT_BERRY = registerItem("dolphins_grace_effect_berry",
            new AliasedBlockItem(ModBlocks.DOLPHINS_GRACE_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.DolphinsGraceEffectBerry)));
    public static final Item BAD_OMEN_EFFECT_BERRY = registerItem("bad_omen_effect_berry",
            new AliasedBlockItem(ModBlocks.BAD_OMEN_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.BadOmenEffectBerry)));
    public static final Item DARKNESS_EFFECT_BERRY = registerItem("darkness_effect_berry",
            new AliasedBlockItem(ModBlocks.DARKNESS_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.DarknessEffectBerry)));
    public static final Item HERO_OF_THE_VILLAGE_EFFECT_BERRY = registerItem("hero_of_the_village_effect_berry",
            new AliasedBlockItem(ModBlocks.HERO_OF_THE_VILLAGE_EFFECT_BERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.HeroOfTheVillageEffectBerry)));

    //PIES
    public static final Item SPEED_BERRY_PIE = registerItem("speed_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.SpeedBerryPie)));
    public static final Item SLOWNESS_BERRY_PIE = registerItem("slowness_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.SlownessBerryPie)));
    public static final Item HASTE_BERRY_PIE = registerItem("haste_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.HasteBerryPie)));
    public static final Item MINING_FATIGUE_BERRY_PIE = registerItem("mining_fatigue_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.MiningFatigueBerryPie)));
    public static final Item STRENGTH_BERRY_PIE = registerItem("strength_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.StrengthBerryPie)));
    public static final Item INSTANT_HEALTH_BERRY_PIE = registerItem("instant_health_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.InstantHealthBerryPie)));
    public static final Item INSTANT_DAMAGE_BERRY_PIE = registerItem("instant_damage_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.InstantDamageBerryPie)));
    public static final Item JUMP_BOOST_BERRY_PIE = registerItem("jump_boost_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.JumpBoostBerryPie)));
    public static final Item NAUSEA_BERRY_PIE = registerItem("nausea_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.NauseaBerryPie)));
    public static final Item REGENERATION_BERRY_PIE = registerItem("regeneration_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.RegenerationBerryPie)));
    public static final Item RESISTANCE_BERRY_PIE = registerItem("resistance_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.ResistanceBerryPie)));
    public static final Item FIRE_RESISTANCE_BERRY_PIE = registerItem("fire_resistance_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.FireResistanceBerryPie)));
    public static final Item WATER_BREATHING_BERRY_PIE = registerItem("water_breathing_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.WaterBreathingBerryPie)));
    public static final Item INVISIBILITY_BERRY_PIE = registerItem("invisibility_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.InvisibilityBerryPie)));
    public static final Item BLINDNESS_BERRY_PIE = registerItem("blindness_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.BlindnessBerryPie)));
    public static final Item NIGHT_VISION_BERRY_PIE = registerItem("night_vision_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.NightVisionBerryPie)));
    public static final Item HUNGER_BERRY_PIE = registerItem("hunger_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.HungerBerryPie)));
    public static final Item WEAKNESS_BERRY_PIE = registerItem("weakness_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.WeaknessBerryPie)));
    public static final Item POISON_BERRY_PIE = registerItem("poison_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.PoisonBerryPie)));
    public static final Item WITHER_BERRY_PIE = registerItem("wither_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.WitherBerryPie)));
    public static final Item HEALTH_BOOST_BERRY_PIE = registerItem("health_boost_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.HealthBoostBerryPie)));
    public static final Item ABSORPTION_BERRY_PIE = registerItem("absorption_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.AbsorptionBerryPie)));
    public static final Item SATURATION_BERRY_PIE = registerItem("saturation_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.SaturationBerryPie)));
    public static final Item GLOWING_BERRY_PIE = registerItem("glowing_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.GlowingBerryPie)));
    public static final Item LEVITATION_BERRY_PIE = registerItem("levitation_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.LevitationBerryPie)));
    public static final Item LUCK_BERRY_PIE = registerItem("luck_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.LuckBerryPie)));
    public static final Item UNLUCK_BERRY_PIE = registerItem("unluck_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.UnluckBerryPie)));
    public static final Item SLOW_FALLING_BERRY_PIE = registerItem("slow_falling_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.SlowFallingBerryPie)));
    public static final Item CONDUIT_POWER_BERRY_PIE = registerItem("conduit_power_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.ConduitPowerBerryPie)));
    public static final Item DOLPHINS_GRACE_BERRY_PIE = registerItem("dolphins_grace_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.DolphinsGraceBerryPie)));
    public static final Item BAD_OMEN_BERRY_PIE = registerItem("bad_omen_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.BadOmenBerryPie)));
    public static final Item DARKNESS_BERRY_PIE = registerItem("darkness_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.DarknessBerryPie)));
    public static final Item HERO_OF_THE_VILLAGE_BERRY_PIE = registerItem("hero_of_the_village_berry_pie",
            new Item(new FabricItemSettings().maxCount(64).food(ModFoodComponents.HeroOfTheVillageBerryPie)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(EffectBerriesMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        EffectBerriesMod.LOGGER.info("Registering Mod Items for " + EffectBerriesMod.MOD_ID);
    }
}
