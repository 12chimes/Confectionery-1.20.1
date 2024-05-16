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
                        ModBlocks.GINGERBREAD_SLAB.get()

                );



    //break with what tool

    }
}
