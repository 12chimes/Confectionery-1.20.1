package uwu.cocoa.confectionery.sound;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.Confectionery;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Confectionery.MOD_ID);

    public static final RegistryObject<SoundEvent> THE_BRIGHT_SIDE = registerSoundEvents("the_bright_side");


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Confectionery.MOD_ID, name)));
    }


    public static void  register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
