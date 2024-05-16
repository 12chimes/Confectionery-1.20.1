package uwu.cocoa.confectionery.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
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
                blockTexture(ModBlocks.GINGERBREAD_BLOCK.get()), //repeat this twice for slabs
                blockTexture(ModBlocks.GINGERBREAD_BLOCK.get()));


        //blockstates


    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
