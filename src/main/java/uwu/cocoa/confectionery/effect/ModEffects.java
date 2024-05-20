package uwu.cocoa.confectionery.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.Confectionery;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Confectionery.MOD_ID);

    public static final RegistryObject<MobEffect> STIMULATION = MOB_EFFECTS.register("stimulation",
            () -> new StimulationEffect(MobEffectCategory.BENEFICIAL, -10278906));
    public static final RegistryObject<MobEffect> REST = MOB_EFFECTS.register("rest",
            () -> new RestEffect(MobEffectCategory.BENEFICIAL, -2119568));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
