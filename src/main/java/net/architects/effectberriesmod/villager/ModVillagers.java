package net.architects.effectberriesmod.villager;

import com.google.common.collect.ImmutableSet;
import net.architects.effectberriesmod.EffectBerriesMod;
import net.architects.effectberriesmod.block.ModBlocks;
import net.architects.effectberriesmod.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {
    public static final PointOfInterestType EFFECT_BERRY_POI = registerPOI("effect_berry_poi", Blocks.BEDROCK);
    public static final VillagerProfession BERRY_INFUSION_SPECIALIST = registerProfession("berry_infusion_specialist",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(EffectBerriesMod.MOD_ID, "effect_berry_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(EffectBerriesMod.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(EffectBerriesMod.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_FARMER).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(EffectBerriesMod.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        EffectBerriesMod.LOGGER.debug("Registering Villagers for " + EffectBerriesMod.MOD_ID);
    }



    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(BERRY_INFUSION_SPECIALIST,1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.SPEED_EFFECT_BERRY, 1),
                            20, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SWEET_BERRY_BUNDLE, 4),
                            new ItemStack(Items.EMERALD, 3),
                            30, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.SWEET_BERRIES, 16),
                            new ItemStack(Items.EMERALD, 1),
                            30, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(ModItems.SWEET_BERRY_BUNDLE, 6),
                            20, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(ModItems.SWEET_BERRY_BUNDLE, 16),
                            20, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.SLOWNESS_EFFECT_BERRY, 1),
                            20, 2, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.JUMP_BOOST_EFFECT_BERRY, 1),
                            20, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(ModItems.NAUSEA_EFFECT_BERRY, 1),
                            20, 3, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.HUNGER_EFFECT_BERRY, 1),
                            20, 2, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.WEAKNESS_EFFECT_BERRY, 1),
                            20, 2, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 7),
                            new ItemStack(ModItems.LUCK_EFFECT_BERRY, 1),
                            20, 2, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.UNLUCK_EFFECT_BERRY, 1),
                            20, 2, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.MINING_FATIGUE_EFFECT_BERRY, 1),
                            20, 2, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BERRY_INFUSION_SPECIALIST,2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.BLINDNESS_EFFECT_BERRY, 1),
                            15, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.POISON_EFFECT_BERRY, 1),
                            15, 7, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.HASTE_EFFECT_BERRY, 1),
                            15, 7, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.INSTANT_HEALTH_EFFECT_BERRY, 1),
                            15, 7, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.INSTANT_DAMAGE_EFFECT_BERRY, 1),
                            15, 7, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.INVISIBILITY_EFFECT_BERRY, 1),
                            15, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.NIGHT_VISION_EFFECT_BERRY, 1),
                            15, 7, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.GLOWING_EFFECT_BERRY, 1),
                            15, 3, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.LEVITATION_EFFECT_BERRY, 1),
                            15, 5, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.SLOW_FALLING_EFFECT_BERRY, 1),
                            15, 7, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.DARKNESS_EFFECT_BERRY, 1),
                            15, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BERRY_INFUSION_SPECIALIST,3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.WITHER_EFFECT_BERRY, 1),
                            10, 14, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.REGENERATION_EFFECT_BERRY, 1),
                            10, 9, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.HEALTH_BOOST_EFFECT_BERRY, 1),
                            10, 9, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 17),
                            new ItemStack(ModItems.ABSORPTION_EFFECT_BERRY, 1),
                            10, 12, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.SATURATION_EFFECT_BERRY, 1),
                            10, 9, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BERRY_INFUSION_SPECIALIST,4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 15),
                            new ItemStack(ModItems.STRENGTH_EFFECT_BERRY, 1),
                            6, 13, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.RESISTANCE_EFFECT_BERRY, 1),
                            6, 15, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 20),
                            new ItemStack(ModItems.FIRE_RESISTANCE_EFFECT_BERRY, 1),
                            6, 15, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(ModItems.WATER_BREATHING_EFFECT_BERRY, 1),
                            6, 10, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(BERRY_INFUSION_SPECIALIST,5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(ModItems.CONDUIT_POWER_EFFECT_BERRY, 1),
                            6, 6, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 25),
                            new ItemStack(ModItems.DOLPHINS_GRACE_EFFECT_BERRY, 1),
                            6, 6, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 30),
                            new ItemStack(ModItems.BAD_OMEN_EFFECT_BERRY, 1),
                            6, 6, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_BLOCK, 16),
                            new ItemStack(ModItems.BAD_OMEN_BERRY_PIE, 6),
                            new ItemStack(ModItems.HERO_OF_THE_VILLAGE_EFFECT_BERRY, 1),
                            6, 6, 0.02f
                    )));

//                    factories.add(((entity, random) -> new TradeOffer(
//                            new ItemStack(Items.EMERALD, 12),
//                            new ItemStack(ModItems.MYSTERY_PIE, 1),
//                            6, 6, 0.02f
//                    )));
                });
    }
}
