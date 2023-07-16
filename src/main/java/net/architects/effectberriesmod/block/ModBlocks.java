package net.architects.effectberriesmod.block;

import net.architects.effectberriesmod.EffectBerriesMod;
import net.architects.effectberriesmod.block.custom.*;
import net.architects.effectberriesmod.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.architects.effectberriesmod.item.ModItemGroup;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block EFFECT_BERRY_STATION = registerBlock("effect_berry_station",
            new EffectBerryStation(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).strength(4f)));


    public static final Block SPEED_EFFECT_BERRY_BUSH = registerBlock("speed_berry_bush",
            new SpeedEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SLOWNESS_EFFECT_BERRY_BUSH = registerBlock("slowness_berry_bush",
            new SlownessEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block HASTE_EFFECT_BERRY_BUSH = registerBlock("haste_berry_bush",
            new HasteEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block MINING_FATIGUE_EFFECT_BERRY_BUSH = registerBlock("mining_fatigue_berry_bush",
            new MiningFatigueEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block STRENGTH_EFFECT_BERRY_BUSH = registerBlock("strength_berry_bush",
            new StrengthEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block INSTANT_HEALTH_EFFECT_BERRY_BUSH = registerBlock("instant_health_berry_bush",
            new InstantHealthEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block INSTANT_DAMAGE_EFFECT_BERRY_BUSH = registerBlock("instant_damage_berry_bush",
            new InstantDamageEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block JUMP_BOOST_EFFECT_BERRY_BUSH = registerBlock("jump_boost_berry_bush",
            new JumpBoostEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block NAUSEA_EFFECT_BERRY_BUSH = registerBlock("nausea_berry_bush",
            new NauseaEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block REGENERATION_EFFECT_BERRY_BUSH = registerBlock("regeneration_berry_bush",
            new RegenerationEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block RESISTANCE_EFFECT_BERRY_BUSH = registerBlock("resistance_berry_bush",
            new ResistanceEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block FIRE_RESISTANCE_EFFECT_BERRY_BUSH = registerBlock("fire_resistance_berry_bush",
            new FireResistanceEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WATER_BREATHING_EFFECT_BERRY_BUSH = registerBlock("water_breathing_berry_bush",
            new WaterBreathingEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block INVISIBILITY_EFFECT_BERRY_BUSH = registerBlock("invisibility_berry_bush",
            new InvisibilityEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BLINDNESS_EFFECT_BERRY_BUSH = registerBlock("blindness_berry_bush",
            new BlindnessEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block NIGHT_VISION_EFFECT_BERRY_BUSH = registerBlock("night_vision_berry_bush",
            new NightVisionEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block HUNGER_EFFECT_BERRY_BUSH = registerBlock("hunger_berry_bush",
            new HungerEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WEAKNESS_EFFECT_BERRY_BUSH = registerBlock("weakness_berry_bush",
            new WeaknessEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block POISON_EFFECT_BERRY_BUSH = registerBlock("poison_berry_bush",
            new PoisonEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WITHER_EFFECT_BERRY_BUSH = registerBlock("wither_berry_bush",
            new WitherEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block HEALTH_BOOST_EFFECT_BERRY_BUSH = registerBlock("health_boost_berry_bush",
            new HealthBoostEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block ABSORPTION_EFFECT_BERRY_BUSH = registerBlock("absorption_berry_bush",
            new AbsorptionEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SATURATION_EFFECT_BERRY_BUSH = registerBlock("saturation_berry_bush",
            new SaturationEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GLOWING_EFFECT_BERRY_BUSH = registerBlock("glowing_berry_bush",
            new GlowingEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LEVITATION_EFFECT_BERRY_BUSH = registerBlock("levitation_berry_bush",
            new LevitationEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block LUCK_EFFECT_BERRY_BUSH = registerBlock("luck_berry_bush",
            new LuckEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block UNLUCK_EFFECT_BERRY_BUSH = registerBlock("unluck_berry_bush",
            new UnluckEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block SLOW_FALLING_EFFECT_BERRY_BUSH = registerBlock("slow_falling_berry_bush",
            new SlowFallingEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block CONDUIT_POWER_EFFECT_BERRY_BUSH = registerBlock("conduit_power_berry_bush",
            new ConduitPowerEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DOLPHINS_GRACE_EFFECT_BERRY_BUSH = registerBlock("dolphins_grace_berry_bush",
            new DolphinsGraceEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block BAD_OMEN_EFFECT_BERRY_BUSH = registerBlock("bad_omen_berry_bush",
            new BadOmenEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block DARKNESS_EFFECT_BERRY_BUSH = registerBlock("darkness_berry_bush",
            new DarknessEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block HERO_OF_THE_VILLAGE_EFFECT_BERRY_BUSH = registerBlock("hero_of_the_village_berry_bush",
            new HeroOfTheVillageEffectBerry(AbstractBlock.Settings.create().mapColor(MapColor.DARK_GREEN).ticksRandomly().noCollision().sounds(BlockSoundGroup.SWEET_BERRY_BUSH).pistonBehavior(PistonBehavior.DESTROY)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EffectBerriesMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(EffectBerriesMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        EffectBerriesMod.LOGGER.info("Registering ModBlocks for " + EffectBerriesMod.MOD_ID);
    }
}
