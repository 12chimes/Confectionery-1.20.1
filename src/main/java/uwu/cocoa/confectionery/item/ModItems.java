package uwu.cocoa.confectionery.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.RecordItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.Confectionery;
import uwu.cocoa.confectionery.item.custom.CaramelisedMarshmallowStickItem;
import uwu.cocoa.confectionery.item.custom.HotChocolateItem;
import uwu.cocoa.confectionery.item.custom.MarshmallowStickItem;
import uwu.cocoa.confectionery.item.custom.SoothingHotChocolateItem;
import uwu.cocoa.confectionery.sound.ModSounds;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Confectionery.MOD_ID);

    public static final RegistryObject<Item> GINGERDOUGH = ITEMS.register("gingerdough",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GINGERBREAD = ITEMS.register("gingerbread",
            () -> new Item(new Item.Properties().food(ModFoods.GINGERBREAD)));
    public static final RegistryObject<Item> GINGERBREAD_MAN = ITEMS.register("gingerbread_man",
            () -> new Item(new Item.Properties().food(ModFoods.GINGERBREAD_MAN)));

    public static final RegistryObject<Item> CRUSHED_COCOA = ITEMS.register("crushed_cocoa",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COCOA_POWDER = ITEMS.register("cocoa_powder",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COCOA_BUTTER = ITEMS.register("cocoa_butter",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DARK_CHOCOLATE_BAR = ITEMS.register("dark_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_BAR = ITEMS.register("white_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_BAR = ITEMS.register("ruby_chocolate_bar",
            () -> new Item(new Item.Properties().food(ModFoods.RUBY_CHOCOLATE_BAR)));
    public static final RegistryObject<Item> CARAMEL_BAR = ITEMS.register("caramel_bar",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_BAR)));

    public static final RegistryObject<Item> DARK_CHOCOLATE_BUCKET = ITEMS.register("dark_chocolate_bucket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_BUCKET = ITEMS.register("white_chocolate_bucket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_BUCKET = ITEMS.register("ruby_chocolate_bucket",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CARAMEL_BUCKET = ITEMS.register("caramel_bucket",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FULL_CHOCOLATE_BAR = ITEMS.register("full_chocolate_bar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FULL_DARK_CHOCOLATE_BAR = ITEMS.register("full_dark_chocolate_bar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FULL_WHITE_CHOCOLATE_BAR = ITEMS.register("full_white_chocolate_bar",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FULL_RUBY_CHOCOLATE_BAR = ITEMS.register("full_ruby_chocolate_bar",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HOT_CHOCOLATE = ITEMS.register("hot_chocolate",
            () -> new HotChocolateItem(new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> SOOTHING_HOT_CHOCOLATE = ITEMS.register("soothing_hot_chocolate",
            () -> new SoothingHotChocolateItem(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> DARK_CHOCOLATE_BERRIES= ITEMS.register("dark_chocolate_berries",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_BERRIES)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_BERRIES = ITEMS.register("white_chocolate_berries",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_BERRIES)));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_BERRIES = ITEMS.register("ruby_chocolate_berries",
            () -> new Item(new Item.Properties().food(ModFoods.RUBY_CHOCOLATE_BERRIES)));
    public static final RegistryObject<Item> CARAMEL_BERRIES = ITEMS.register("caramel_berries",
            () -> new Item(new Item.Properties().food(ModFoods.CARAMEL_BERRIES)));

    public static final RegistryObject<Item> MARSHMALLOW_STICK = ITEMS.register("marshmallow_stick",
            () -> new MarshmallowStickItem(new Item.Properties()));
    public static final RegistryObject<Item> CARAMELISED_MARSHMALLOW_STICK = ITEMS.register("caramelised_marshmallow_stick",
            () -> new CaramelisedMarshmallowStickItem(new Item.Properties()));
    public static final RegistryObject<Item> MARSHMALLOW = ITEMS.register("marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.MARSHMALLOW)));

    public static final RegistryObject<Item> CHOCOLATE_MARSHMALLOW = ITEMS.register("chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.CHOCOLATE_MARSHMALLOW)));
    public static final RegistryObject<Item> DARK_CHOCOLATE_MARSHMALLOW = ITEMS.register("dark_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.DARK_CHOCOLATE_MARSHMALLOW)));
    public static final RegistryObject<Item> WHITE_CHOCOLATE_MARSHMALLOW = ITEMS.register("white_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.WHITE_CHOCOLATE_MARSHMALLOW)));
    public static final RegistryObject<Item> RUBY_CHOCOLATE_MARSHMALLOW = ITEMS.register("ruby_chocolate_marshmallow",
            () -> new Item(new Item.Properties().food(ModFoods.RUBY_CHOCOLATE_MARSHMALLOW)));

    public static final RegistryObject<Item> CANDY_CANE = ITEMS.register("candy_cane",
            () -> new Item(new Item.Properties().food(ModFoods.CANDY_CANE)));

    public static final RegistryObject<Item> THE_BRIGHT_SIDE = ITEMS.register("the_bright_side",
            () -> new RecordItem(6, ModSounds.THE_BRIGHT_SIDE, new Item.Properties().food(ModFoods.MUSIC_DISC).stacksTo(1), 3220));

    public static final RegistryObject<Item> HONEY_CANDY = ITEMS.register("honey_candy",
            () -> new Item(new Item.Properties().food(ModFoods.HONEY_CANDY)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
