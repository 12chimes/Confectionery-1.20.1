package uwu.cocoa.confectionery.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import uwu.cocoa.confectionery.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.GINGERBREAD_BLOCK.get());
        this.dropSelf(ModBlocks.GINGERBREAD_STAIRS.get());
        this.add(ModBlocks.GINGERBREAD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GINGERBREAD_SLAB.get()));




        //blocks need to drop themselves when broken




    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
