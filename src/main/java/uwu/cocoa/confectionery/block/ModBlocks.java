package uwu.cocoa.confectionery.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.Confectionery;
import uwu.cocoa.confectionery.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Confectionery.MOD_ID);

    public static final RegistryObject<Block> GINGERBREAD_BLOCK = registerBlock("gingerbread_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> GINGERBREAD_STAIRS = registerBlock("gingerbread_stairs",
            () -> new StairBlock(() -> ModBlocks.GINGERBREAD_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> GINGERBREAD_SLAB = registerBlock("gingerbread_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> GINGERBRICKS = registerBlock("gingerbricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> GINGERBRICK_STAIRS = registerBlock("gingerbrick_stairs",
            () -> new StairBlock(() -> ModBlocks.GINGERBRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> GINGERBRICK_SLAB = registerBlock("gingerbrick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> CHOCOLATE_BLOCK = registerBlock("chocolate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHOCOLATE_STAIRS = registerBlock("chocolate_stairs",
            () -> new StairBlock(() -> ModBlocks.CHOCOLATE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> CHOCOLATE_SLAB = registerBlock("chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> DARK_CHOCOLATE_BLOCK = registerBlock("dark_chocolate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DARK_CHOCOLATE_STAIRS = registerBlock("dark_chocolate_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_CHOCOLATE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> DARK_CHOCOLATE_SLAB = registerBlock("dark_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> WHITE_CHOCOLATE_BLOCK = registerBlock("white_chocolate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> WHITE_CHOCOLATE_STAIRS = registerBlock("white_chocolate_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_CHOCOLATE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> WHITE_CHOCOLATE_SLAB = registerBlock("white_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> RUBY_CHOCOLATE_BLOCK = registerBlock("ruby_chocolate_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> RUBY_CHOCOLATE_STAIRS = registerBlock("ruby_chocolate_stairs",
            () -> new StairBlock(() -> ModBlocks.RUBY_CHOCOLATE_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));
    public static final RegistryObject<Block> RUBY_CHOCOLATE_SLAB = registerBlock("ruby_chocolate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.DRIPSTONE_BLOCK)));

    public static final RegistryObject<Block> CARAMEL_BLOCK = registerBlock("caramel_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> CARAMEL_STAIRS = registerBlock("caramel_stairs",
            () -> new StairBlock(() -> ModBlocks.CARAMEL_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> CARAMEL_SLAB = registerBlock("caramel_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.CORAL_BLOCK)));

    public static final RegistryObject<Block> CANDY_CANE_BLOCK = registerBlock("candy_cane_block",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BONE_BLOCK).sound(SoundType.CALCITE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
