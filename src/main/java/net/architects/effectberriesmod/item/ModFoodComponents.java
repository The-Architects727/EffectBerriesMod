package net.architects.effectberriesmod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.random.Random;

public class ModFoodComponents {

    public static final FoodComponent SweetBerryBundle = new FoodComponent.Builder().hunger(18).saturationModifier(0.9f).build();

    public static final FoodComponent SpeedEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 400            , 0), 100).build();
    public static final FoodComponent SlownessEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400            , 0), 100).build();
    public static final FoodComponent HasteEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 400            , 0), 100).build();
    public static final FoodComponent MiningFatigueEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 400            , 0), 100).build();
    public static final FoodComponent StrengthEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 400            , 0), 100).build();
    public static final FoodComponent InstantHealthEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 400            , 0), 100).build();
    public static final FoodComponent InstantDamageEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 400            , 0), 100).build();
    public static final FoodComponent JumpBoostEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 400            , 0), 100).build();
    public static final FoodComponent NauseaEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400            , 0), 100).build();
    public static final FoodComponent RegenerationEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400            , 0), 100).build();
    public static final FoodComponent ResistanceEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 400            , 0), 100).build();
    public static final FoodComponent FireResistanceEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400            , 0), 100).build();
    public static final FoodComponent WaterBreathingEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 400            , 0), 100).build();
    public static final FoodComponent InvisibilityEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 400            , 0), 100).build();
    public static final FoodComponent BlindnessEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 400            , 0), 100).build();
    public static final FoodComponent NightVisionEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 400            , 0), 100).build();
    public static final FoodComponent HungerEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 400            , 0), 100).build();
    public static final FoodComponent WeaknessEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 400            , 0), 100).build();
    public static final FoodComponent PoisonEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 400            , 0), 100).build();
    public static final FoodComponent WitherEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 400            , 0), 100).build();
    public static final FoodComponent HealthBoostEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 400            , 0), 100).build();
    public static final FoodComponent AbsorptionEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 400            , 0), 100).build();
    public static final FoodComponent SaturationEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 400            , 0), 100).build();
    public static final FoodComponent GlowingEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 400            , 0), 100).build();
    public static final FoodComponent LevitationEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 400            , 0), 100).build();
    public static final FoodComponent LuckEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 400            , 0), 100).build();
    public static final FoodComponent UnluckEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 400            , 0), 100).build();
    public static final FoodComponent SlowFallingEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 400            , 0), 100).build();
    public static final FoodComponent ConduitPowerEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 400            , 0), 100).build();
    public static final FoodComponent DolphinsGraceEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 400            , 0), 100).build();
    public static final FoodComponent BadOmenEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 400            , 0), 100).build();
    public static final FoodComponent DarknessEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 400            , 0), 100).build();
    public static final FoodComponent HeroOfTheVillageEffectBerry = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 400            , 0), 100).build();

    //PIES

    public static final FoodComponent SpeedBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1800, 1), 100).build();
    public static final FoodComponent SlownessBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 1800, 1), 100).build();
    public static final FoodComponent HasteBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1800, 1), 100).build();
    public static final FoodComponent MiningFatigueBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 1800, 1), 100).build();
    public static final FoodComponent StrengthBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1800, 1), 100).build();
    public static final FoodComponent InstantHealthBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 1800, 1), 100).build();
    public static final FoodComponent InstantDamageBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1800, 1), 100).build();
    public static final FoodComponent JumpBoostBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1800, 1), 100).build();
    public static final FoodComponent NauseaBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1800, 1), 100).build();
    public static final FoodComponent RegenerationBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1800, 1), 100).build();
    public static final FoodComponent ResistanceBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1800, 1), 100).build();
    public static final FoodComponent FireResistanceBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1800, 1), 100).build();
    public static final FoodComponent WaterBreathingBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 1800, 1), 100).build();
    public static final FoodComponent InvisibilityBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 1800, 1), 100).build();
    public static final FoodComponent BlindnessBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 1800, 1), 100).build();
    public static final FoodComponent NightVisionBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 1800, 1), 100).build();
    public static final FoodComponent HungerBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 1800, 1), 100).build();
    public static final FoodComponent WeaknessBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 1800, 1), 100).build();
    public static final FoodComponent PoisonBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1800, 1), 100).build();
    public static final FoodComponent WitherBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 1800, 1), 100).build();
    public static final FoodComponent HealthBoostBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 1800, 1), 100).build();
    public static final FoodComponent AbsorptionBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 1800, 1), 100).build();
    public static final FoodComponent SaturationBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 1800, 1), 100).build();
    public static final FoodComponent GlowingBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 1800, 1), 100).build();
    public static final FoodComponent LevitationBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 1800, 1), 100).build();
    public static final FoodComponent LuckBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 1800, 1), 100).build();
    public static final FoodComponent UnluckBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.UNLUCK, 1800, 1), 100).build();
    public static final FoodComponent SlowFallingBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 1800, 1), 100).build();
    public static final FoodComponent ConduitPowerBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.CONDUIT_POWER, 1800, 1), 100).build();
    public static final FoodComponent DolphinsGraceBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 1800, 1), 100).build();
    public static final FoodComponent BadOmenBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.BAD_OMEN, 1800, 1), 100).build();
    public static final FoodComponent DarknessBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 1800, 1), 100).build();
    public static final FoodComponent HeroOfTheVillageBerryPie = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).alwaysEdible().statusEffect(new StatusEffectInstance(StatusEffects.HERO_OF_THE_VILLAGE, 1800, 1), 100).build();


    public static final FoodComponent MysteryPie = new FoodComponent.Builder().hunger(4).saturationModifier(0.6f).alwaysEdible().build();

}
