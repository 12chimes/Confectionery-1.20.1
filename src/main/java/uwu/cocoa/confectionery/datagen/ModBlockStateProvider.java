package uwu.cocoa.confectionery.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.Confectionery;
import uwu.cocoa.confectionery.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Confectionery.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.GINGERBREAD_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.GINGERBREAD_STAIRS.get()),
                blockTexture(ModBlocks.GINGERBREAD_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.GINGERBREAD_SLAB.get()),
                blockTexture(ModBlocks.GINGERBREAD_BLOCK.get()),
                blockTexture(ModBlocks.GINGERBREAD_BLOCK.get()));

        blockWithItem(ModBlocks.GINGERBRICKS);
        stairsBlock(((StairBlock) ModBlocks.GINGERBRICK_STAIRS.get()),
                blockTexture(ModBlocks.GINGERBRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GINGERBRICK_SLAB.get()),
                blockTexture(ModBlocks.GINGERBRICKS.get()),
                blockTexture(ModBlocks.GINGERBRICKS.get()));

        blockWithItem(ModBlocks.CHOCOLATE_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.CHOCOLATE_STAIRS.get()),
                blockTexture(ModBlocks.CHOCOLATE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.CHOCOLATE_SLAB.get()),
                blockTexture(ModBlocks.CHOCOLATE_BLOCK.get()),
                blockTexture(ModBlocks.CHOCOLATE_BLOCK.get()));

        blockWithItem(ModBlocks.DARK_CHOCOLATE_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.DARK_CHOCOLATE_STAIRS.get()),
                blockTexture(ModBlocks.DARK_CHOCOLATE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.DARK_CHOCOLATE_SLAB.get()),
                blockTexture(ModBlocks.DARK_CHOCOLATE_BLOCK.get()),
                blockTexture(ModBlocks.DARK_CHOCOLATE_BLOCK.get()));

        blockWithItem(ModBlocks.WHITE_CHOCOLATE_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.WHITE_CHOCOLATE_STAIRS.get()),
                blockTexture(ModBlocks.WHITE_CHOCOLATE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.WHITE_CHOCOLATE_SLAB.get()),
                blockTexture(ModBlocks.WHITE_CHOCOLATE_BLOCK.get()),
                blockTexture(ModBlocks.WHITE_CHOCOLATE_BLOCK.get()));

        blockWithItem(ModBlocks.RUBY_CHOCOLATE_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.RUBY_CHOCOLATE_STAIRS.get()),
                blockTexture(ModBlocks.RUBY_CHOCOLATE_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.RUBY_CHOCOLATE_SLAB.get()),
                blockTexture(ModBlocks.RUBY_CHOCOLATE_BLOCK.get()),
                blockTexture(ModBlocks.RUBY_CHOCOLATE_BLOCK.get()));

        blockWithItem(ModBlocks.CARAMEL_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.CARAMEL_STAIRS.get()),
                blockTexture(ModBlocks.CARAMEL_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.CARAMEL_SLAB.get()),
                blockTexture(ModBlocks.CARAMEL_BLOCK.get()),
                blockTexture(ModBlocks.CARAMEL_BLOCK.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.CANDY_CANE_BLOCK.get()), blockTexture(ModBlocks.CANDY_CANE_BLOCK.get()),
                new ResourceLocation(Confectionery.MOD_ID, "block/candy_cane_block_top"));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
