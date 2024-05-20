package uwu.cocoa.confectionery.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.Confectionery;
import uwu.cocoa.confectionery.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Confectionery.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CONFECTIONERY_TAB = CREATIVE_MODE_TABS.register("confectionery_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GINGERBREAD_MAN.get()))
                    .title(Component.translatable("creativetab.confectionery_tab"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.GINGERBREAD_BLOCK.get());
                        output.accept(ModBlocks.GINGERBREAD_STAIRS.get());
                        output.accept(ModBlocks.GINGERBREAD_SLAB.get());

                        output.accept(ModBlocks.GINGERBRICKS.get());
                        output.accept(ModBlocks.GINGERBRICK_STAIRS.get());
                        output.accept(ModBlocks.GINGERBRICK_SLAB.get());

                        output.accept(ModBlocks.CHOCOLATE_BLOCK.get());
                        output.accept(ModBlocks.CHOCOLATE_STAIRS.get());
                        output.accept(ModBlocks.CHOCOLATE_SLAB.get());

                        output.accept(ModBlocks.DARK_CHOCOLATE_BLOCK.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_STAIRS.get());
                        output.accept(ModBlocks.DARK_CHOCOLATE_SLAB.get());

                        output.accept(ModBlocks.WHITE_CHOCOLATE_BLOCK.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_STAIRS.get());
                        output.accept(ModBlocks.WHITE_CHOCOLATE_SLAB.get());

                        output.accept(ModBlocks.RUBY_CHOCOLATE_BLOCK.get());
                        output.accept(ModBlocks.RUBY_CHOCOLATE_STAIRS.get());
                        output.accept(ModBlocks.RUBY_CHOCOLATE_SLAB.get());

                        output.accept(ModBlocks.CARAMEL_BLOCK.get());
                        output.accept(ModBlocks.CARAMEL_STAIRS.get());
                        output.accept(ModBlocks.CARAMEL_SLAB.get());

                        output.accept(ModBlocks.CANDY_CANE_BLOCK.get());

                        output.accept(ModItems.GINGERDOUGH.get());
                        output.accept(ModItems.GINGERBREAD.get());
                        output.accept(ModItems.GINGERBREAD_MAN.get());

                        output.accept(ModItems.CRUSHED_COCOA.get());
                        output.accept(ModItems.COCOA_POWDER.get());
                        output.accept(ModItems.COCOA_BUTTER.get());

                        output.accept(ModItems.DARK_CHOCOLATE_BAR.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_BAR.get());
                        output.accept(ModItems.RUBY_CHOCOLATE_BAR.get());
                        output.accept(ModItems.CARAMEL_BAR.get());

                        output.accept(ModItems.DARK_CHOCOLATE_BUCKET.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_BUCKET.get());
                        output.accept(ModItems.RUBY_CHOCOLATE_BUCKET.get());
                        output.accept(ModItems.CARAMEL_BUCKET.get());

                        output.accept(ModItems.FULL_CHOCOLATE_BAR.get());
                        output.accept(ModItems.FULL_DARK_CHOCOLATE_BAR.get());
                        output.accept(ModItems.FULL_WHITE_CHOCOLATE_BAR.get());
                        output.accept(ModItems.FULL_RUBY_CHOCOLATE_BAR.get());

                        output.accept(ModItems.HOT_CHOCOLATE.get());
                        output.accept(ModItems.SOOTHING_HOT_CHOCOLATE.get());

                        output.accept(ModItems.DARK_CHOCOLATE_BERRIES.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_BERRIES.get());
                        output.accept(ModItems.RUBY_CHOCOLATE_BERRIES.get());
                        output.accept(ModItems.CARAMEL_BERRIES.get());

                        output.accept(ModItems.MARSHMALLOW_STICK.get());
                        output.accept(ModItems.CARAMELISED_MARSHMALLOW_STICK.get());
                        output.accept(ModItems.MARSHMALLOW.get());

                        output.accept(ModItems.CHOCOLATE_MARSHMALLOW.get());
                        output.accept(ModItems.DARK_CHOCOLATE_MARSHMALLOW.get());
                        output.accept(ModItems.WHITE_CHOCOLATE_MARSHMALLOW.get());
                        output.accept(ModItems.RUBY_CHOCOLATE_MARSHMALLOW.get());

                        output.accept(ModItems.CANDY_CANE.get());
                        output.accept(ModItems.THE_BRIGHT_SIDE.get());

                        output.accept(ModItems.HONEY_CANDY.get());

                    })).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
