package uwu.cocoa.confectionery.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.Confectionery;
import uwu.cocoa.confectionery.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Confectionery.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CONFECTIONERY_TAB = CREATIVE_MODE_TABS.register("confectionery_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Items.COCOA_BEANS))
                    .title(Component.translatable("creativetab.confectionery_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GINGERBREAD_BLOCK.get());
                        output.accept(ModBlocks.GINGERBREAD_STAIRS.get());
                        output.accept(ModBlocks.GINGERBREAD_SLAB.get());

                        output.accept(ModItems.CANDY_CANE.get());

                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
