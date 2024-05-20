package uwu.cocoa.confectionery.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import uwu.cocoa.confectionery.Confectionery;
import uwu.cocoa.confectionery.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider>
            lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Confectionery.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.GINGERBREAD_BLOCK.get(),
                        ModBlocks.GINGERBREAD_STAIRS.get(),
                        ModBlocks.GINGERBREAD_SLAB.get(),
                        ModBlocks.GINGERBRICKS.get(),
                        ModBlocks.GINGERBRICK_STAIRS.get(),
                        ModBlocks.GINGERBRICK_SLAB.get(),
                        ModBlocks.CHOCOLATE_BLOCK.get(),
                        ModBlocks.CHOCOLATE_STAIRS.get(),
                        ModBlocks.CHOCOLATE_SLAB.get(),
                        ModBlocks.DARK_CHOCOLATE_BLOCK.get(),
                        ModBlocks.DARK_CHOCOLATE_STAIRS.get(),
                        ModBlocks.DARK_CHOCOLATE_SLAB.get(),
                        ModBlocks.WHITE_CHOCOLATE_BLOCK.get(),
                        ModBlocks.WHITE_CHOCOLATE_STAIRS.get(),
                        ModBlocks.WHITE_CHOCOLATE_SLAB.get(),
                        ModBlocks.RUBY_CHOCOLATE_BLOCK.get(),
                        ModBlocks.RUBY_CHOCOLATE_STAIRS.get(),
                        ModBlocks.RUBY_CHOCOLATE_SLAB.get(),
                        ModBlocks.CARAMEL_BLOCK.get(),
                        ModBlocks.CARAMEL_STAIRS.get(),
                        ModBlocks.CARAMEL_SLAB.get(),
                        ModBlocks.CANDY_CANE_BLOCK.get());
    }
}
