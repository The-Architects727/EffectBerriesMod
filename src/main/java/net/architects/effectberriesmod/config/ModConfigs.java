package net.architects.effectberriesmod.config;

import com.mojang.datafixers.util.Pair;
import net.architects.effectberriesmod.EffectBerriesMod;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;
    public static Boolean GENERATE_BERRIES;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(EffectBerriesMod.MOD_ID + "config").provider(configs).request();

        assignConfigs();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(new Pair<>("Generate Bushes: ", false), "false");
    }

    private static void assignConfigs() {
        GENERATE_BERRIES = CONFIG.getOrDefault("Generate Bushes: ", false);

        System.out.println("All " + configs.getConfigsList().size() + " have been set properly");
    }
}