package net.architects.effectberriesmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.Objects;

public class MysteryPie extends Item {

    public MysteryPie(Settings settings) {
        super(settings);
    }
    private static Random randMinecraft = net.minecraft.util.math.random.Random.create();
    private static java.util.Random randJava = new java.util.Random();

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
//        if(randJava.nextInt(100) < 50) {
//            user.clearStatusEffects();
//        } else {
//            user.addStatusEffect(new StatusEffectInstance(Objects.requireNonNull(Registries.STATUS_EFFECT.get(randJava.nextInt(33))), randJava.nextInt(200, 3600), randJava.nextInt(10)));
//        }

        //MAKE RANDOM EVENTS

        return this.isFood() ? user.eatFood(world, stack) : stack;
    }
}
