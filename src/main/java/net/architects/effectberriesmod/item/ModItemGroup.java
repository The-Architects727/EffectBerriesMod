package net.architects.effectberriesmod.item;

import net.architects.effectberriesmod.EffectBerriesMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.architects.effectberriesmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup EFFECT_BERRIES = Registry.register(Registries.ITEM_GROUP, new Identifier(EffectBerriesMod.MOD_ID, "effectberries"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.effectberries"))
                    .icon(() -> new ItemStack(ModItems.HASTE_EFFECT_BERRY)).entries((displayContext, entries) -> {

                        entries.add(ModItems.SWEET_BERRY_BUNDLE);

                        entries.add(ModItems.SPEED_EFFECT_BERRY);
                        entries.add(ModItems.SLOWNESS_EFFECT_BERRY);
                        entries.add(ModItems.HASTE_EFFECT_BERRY);
                        entries.add(ModItems.MINING_FATIGUE_EFFECT_BERRY);
                        entries.add(ModItems.STRENGTH_EFFECT_BERRY);
                        entries.add(ModItems.INSTANT_HEALTH_EFFECT_BERRY);
                        entries.add(ModItems.INSTANT_DAMAGE_EFFECT_BERRY);
                        entries.add(ModItems.JUMP_BOOST_EFFECT_BERRY);
                        entries.add(ModItems.NAUSEA_EFFECT_BERRY);
                        entries.add(ModItems.REGENERATION_EFFECT_BERRY);
                        entries.add(ModItems.RESISTANCE_EFFECT_BERRY);
                        entries.add(ModItems.FIRE_RESISTANCE_EFFECT_BERRY);
                        entries.add(ModItems.WATER_BREATHING_EFFECT_BERRY);
                        entries.add(ModItems.INVISIBILITY_EFFECT_BERRY);
                        entries.add(ModItems.BLINDNESS_EFFECT_BERRY);
                        entries.add(ModItems.NIGHT_VISION_EFFECT_BERRY);
                        entries.add(ModItems.HUNGER_EFFECT_BERRY);
                        entries.add(ModItems.WEAKNESS_EFFECT_BERRY);
                        entries.add(ModItems.POISON_EFFECT_BERRY);
                        entries.add(ModItems.WITHER_EFFECT_BERRY);
                        entries.add(ModItems.HEALTH_BOOST_EFFECT_BERRY);
                        entries.add(ModItems.ABSORPTION_EFFECT_BERRY);
                        entries.add(ModItems.SATURATION_EFFECT_BERRY);
                        entries.add(ModItems.GLOWING_EFFECT_BERRY);
                        entries.add(ModItems.LEVITATION_EFFECT_BERRY);
                        entries.add(ModItems.LUCK_EFFECT_BERRY);
                        entries.add(ModItems.UNLUCK_EFFECT_BERRY);
                        entries.add(ModItems.SLOW_FALLING_EFFECT_BERRY);
                        entries.add(ModItems.CONDUIT_POWER_EFFECT_BERRY);
                        entries.add(ModItems.DOLPHINS_GRACE_EFFECT_BERRY);
                        entries.add(ModItems.BAD_OMEN_EFFECT_BERRY);
                        entries.add(ModItems.DARKNESS_EFFECT_BERRY);
                        entries.add(ModItems.HERO_OF_THE_VILLAGE_EFFECT_BERRY);

                        entries.add(ModItems.SPEED_BERRY_PIE);
                        entries.add(ModItems.SLOWNESS_BERRY_PIE);
                        entries.add(ModItems.HASTE_BERRY_PIE);
                        entries.add(ModItems.MINING_FATIGUE_BERRY_PIE);
                        entries.add(ModItems.STRENGTH_BERRY_PIE);
                        entries.add(ModItems.INSTANT_HEALTH_BERRY_PIE);
                        entries.add(ModItems.INSTANT_DAMAGE_BERRY_PIE);
                        entries.add(ModItems.JUMP_BOOST_BERRY_PIE);
                        entries.add(ModItems.NAUSEA_BERRY_PIE);
                        entries.add(ModItems.REGENERATION_BERRY_PIE);
                        entries.add(ModItems.RESISTANCE_BERRY_PIE);
                        entries.add(ModItems.FIRE_RESISTANCE_BERRY_PIE);
                        entries.add(ModItems.WATER_BREATHING_BERRY_PIE);
                        entries.add(ModItems.INVISIBILITY_BERRY_PIE);
                        entries.add(ModItems.BLINDNESS_BERRY_PIE);
                        entries.add(ModItems.NIGHT_VISION_BERRY_PIE);
                        entries.add(ModItems.HUNGER_BERRY_PIE);
                        entries.add(ModItems.WEAKNESS_BERRY_PIE);
                        entries.add(ModItems.POISON_BERRY_PIE);
                        entries.add(ModItems.WITHER_BERRY_PIE);
                        entries.add(ModItems.HEALTH_BOOST_BERRY_PIE);
                        entries.add(ModItems.ABSORPTION_BERRY_PIE);
                        entries.add(ModItems.SATURATION_BERRY_PIE);
                        entries.add(ModItems.GLOWING_BERRY_PIE);
                        entries.add(ModItems.LEVITATION_BERRY_PIE);
                        entries.add(ModItems.LUCK_BERRY_PIE);
                        entries.add(ModItems.UNLUCK_BERRY_PIE);
                        entries.add(ModItems.SLOW_FALLING_BERRY_PIE);
                        entries.add(ModItems.CONDUIT_POWER_BERRY_PIE);
                        entries.add(ModItems.DOLPHINS_GRACE_BERRY_PIE);
                        entries.add(ModItems.BAD_OMEN_BERRY_PIE);
                        entries.add(ModItems.DARKNESS_BERRY_PIE);
                        entries.add(ModItems.HERO_OF_THE_VILLAGE_BERRY_PIE);

//                        entries.add(ModItems.MYSTERY_PIE);


                        entries.add(ModBlocks.EFFECT_BERRY_STATION);

                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}
