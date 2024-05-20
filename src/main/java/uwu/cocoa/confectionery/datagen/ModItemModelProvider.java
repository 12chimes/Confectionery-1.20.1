package uwu.cocoa.confectionery.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.Confectionery;
import uwu.cocoa.confectionery.block.ModBlocks;
import uwu.cocoa.confectionery.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Confectionery.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        evenSimplerBlockItem(ModBlocks.GINGERBREAD_STAIRS);
        evenSimplerBlockItem(ModBlocks.GINGERBREAD_SLAB);

        evenSimplerBlockItem(ModBlocks.GINGERBRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.GINGERBRICK_SLAB);

        evenSimplerBlockItem(ModBlocks.CHOCOLATE_STAIRS);
        evenSimplerBlockItem(ModBlocks.CHOCOLATE_SLAB);

        evenSimplerBlockItem(ModBlocks.DARK_CHOCOLATE_STAIRS);
        evenSimplerBlockItem(ModBlocks.DARK_CHOCOLATE_SLAB);

        evenSimplerBlockItem(ModBlocks.WHITE_CHOCOLATE_STAIRS);
        evenSimplerBlockItem(ModBlocks.WHITE_CHOCOLATE_SLAB);

        evenSimplerBlockItem(ModBlocks.RUBY_CHOCOLATE_STAIRS);
        evenSimplerBlockItem(ModBlocks.RUBY_CHOCOLATE_SLAB);

        evenSimplerBlockItem(ModBlocks.CARAMEL_STAIRS);
        evenSimplerBlockItem(ModBlocks.CARAMEL_SLAB);

        evenSimplerBlockItem(ModBlocks.CANDY_CANE_BLOCK);

        simpleItem(ModItems.GINGERDOUGH);
        simpleItem(ModItems.GINGERBREAD);
        simpleItem(ModItems.GINGERBREAD_MAN);

        simpleItem(ModItems.CRUSHED_COCOA);
        simpleItem(ModItems.COCOA_POWDER);
        simpleItem(ModItems.COCOA_BUTTER);

        simpleItem(ModItems.DARK_CHOCOLATE_BAR);
        simpleItem(ModItems.WHITE_CHOCOLATE_BAR);
        simpleItem(ModItems.RUBY_CHOCOLATE_BAR);
        simpleItem(ModItems.CARAMEL_BAR);

        simpleItem(ModItems.DARK_CHOCOLATE_BUCKET);
        simpleItem(ModItems.WHITE_CHOCOLATE_BUCKET);
        simpleItem(ModItems.RUBY_CHOCOLATE_BUCKET);
        simpleItem(ModItems.CARAMEL_BUCKET);

        simpleItem(ModItems.FULL_CHOCOLATE_BAR);
        simpleItem(ModItems.FULL_DARK_CHOCOLATE_BAR);
        simpleItem(ModItems.FULL_WHITE_CHOCOLATE_BAR);
        simpleItem(ModItems.FULL_RUBY_CHOCOLATE_BAR);

        simpleItem(ModItems.HOT_CHOCOLATE);
        simpleItem(ModItems.SOOTHING_HOT_CHOCOLATE);

        simpleItem(ModItems.DARK_CHOCOLATE_BERRIES);
        simpleItem(ModItems.WHITE_CHOCOLATE_BERRIES);
        simpleItem(ModItems.RUBY_CHOCOLATE_BERRIES);
        simpleItem(ModItems.CARAMEL_BERRIES);

        simpleHandItem(ModItems.MARSHMALLOW_STICK);
        simpleHandItem(ModItems.CARAMELISED_MARSHMALLOW_STICK);
        simpleItem(ModItems.MARSHMALLOW);

        simpleItem(ModItems.CHOCOLATE_MARSHMALLOW);
        simpleItem(ModItems.DARK_CHOCOLATE_MARSHMALLOW);
        simpleItem(ModItems.WHITE_CHOCOLATE_MARSHMALLOW);
        simpleItem(ModItems.RUBY_CHOCOLATE_MARSHMALLOW);

        simpleItem(ModItems.CANDY_CANE);
        simpleItem(ModItems.THE_BRIGHT_SIDE);

        simpleItem(ModItems.HONEY_CANDY);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Confectionery.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleHandItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Confectionery.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Confectionery.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}
