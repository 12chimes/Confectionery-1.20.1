package uwu.cocoa.confectionery.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import uwu.cocoa.confectionery.effect.ModEffects;

public class ModFoods {

    public static final FoodProperties GINGERBREAD = new FoodProperties.Builder()
            .nutrition(4)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 0, false, false, false), 1f)
            .alwaysEat()
            .build();

    public static final FoodProperties GINGERBREAD_MAN = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 400, 0, false, false, false), 1f)
            .alwaysEat()
            .build();

    public static final FoodProperties DARK_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(ModEffects.STIMULATION.get(), 120, 0, false, false, false), 1f)
            .build();

    public static final FoodProperties WHITE_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(ModEffects.REST.get(), 600, 0, false, false, false), 1f)
            .build();

    public static final FoodProperties RUBY_CHOCOLATE_BAR = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 40, 0, false, false, false), 1f)
            .build();

    public static final FoodProperties CARAMEL_BAR = new FoodProperties.Builder()
            .nutrition(6)
            .saturationMod(0.3f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0, false, false, false), 1f)
            .build();

    public static final FoodProperties DARK_CHOCOLATE_BERRIES = new FoodProperties.Builder()
            .nutrition(7)
            .saturationMod(1.1f)
            .effect(() -> new MobEffectInstance(ModEffects.STIMULATION.get(), 120, 0, false, false, false), 1f)
            .build();

    public static final FoodProperties WHITE_CHOCOLATE_BERRIES = new FoodProperties.Builder()
            .nutrition(7)
            .saturationMod(1.1f)
            .effect(() -> new MobEffectInstance(ModEffects.REST.get(), 600, 0,false, false, false), 1f)
            .build();

    public static final FoodProperties RUBY_CHOCOLATE_BERRIES = new FoodProperties.Builder()
            .nutrition(7)
            .saturationMod(1.1f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 40, 0, false, false, false), 1f)
            .build();

    public static final FoodProperties CARAMEL_BERRIES = new FoodProperties.Builder()
            .nutrition(7)
            .saturationMod(1.1f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0, false, false, false), 1f)
            .build();

    public static final FoodProperties MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .alwaysEat()
            .fast()
            .build();

    public static final FoodProperties CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.6f)
            .alwaysEat()
            .build();

    public static final FoodProperties DARK_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.STIMULATION.get(), 120, 0, false, false, false), 1f)
            .alwaysEat()
            .build();

    public static final FoodProperties WHITE_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(ModEffects.REST.get(), 600, 0, false, false, false), 1f)
            .alwaysEat()
            .build();

    public static final FoodProperties RUBY_CHOCOLATE_MARSHMALLOW = new FoodProperties.Builder()
            .nutrition(5)
            .saturationMod(0.6f)
            .effect(() -> new MobEffectInstance(MobEffects.SATURATION, 40, 0, false, false, false), 1f)
            .alwaysEat()
            .build();

    public static final FoodProperties CANDY_CANE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationMod(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 200, 0, false, false, false), 1f)
            .fast()
            .alwaysEat()
            .build();

    public static final FoodProperties MUSIC_DISC = new FoodProperties.Builder()
            .nutrition(7)
            .saturationMod(0.4f)
            .effect(() -> new MobEffectInstance(ModEffects.STIMULATION.get(), 120, 0, false, false, false), 1f)
            .build();

    public static final FoodProperties HONEY_CANDY = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.5f)
            .alwaysEat()
            .build();








}
