package uwu.cocoa.confectionery.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties CANDY_CANE = new FoodProperties.Builder().nutrition(2).fast().alwaysEat()
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200), 1f).build();


    //add properties for items that are foods

}
