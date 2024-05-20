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

        this.dropSelf(ModBlocks.GINGERBRICKS.get());
        this.dropSelf(ModBlocks.GINGERBRICK_STAIRS.get());
        this.add(ModBlocks.GINGERBRICK_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GINGERBRICK_SLAB.get()));

        this.dropSelf(ModBlocks.CHOCOLATE_BLOCK.get());
        this.dropSelf(ModBlocks.CHOCOLATE_STAIRS.get());
        this.add(ModBlocks.CHOCOLATE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CHOCOLATE_SLAB.get()));

        this.dropSelf(ModBlocks.DARK_CHOCOLATE_BLOCK.get());
        this.dropSelf(ModBlocks.DARK_CHOCOLATE_STAIRS.get());
        this.add(ModBlocks.DARK_CHOCOLATE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_CHOCOLATE_SLAB.get()));

        this.dropSelf(ModBlocks.WHITE_CHOCOLATE_BLOCK.get());
        this.dropSelf(ModBlocks.WHITE_CHOCOLATE_STAIRS.get());
        this.add(ModBlocks.WHITE_CHOCOLATE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WHITE_CHOCOLATE_SLAB.get()));

        this.dropSelf(ModBlocks.RUBY_CHOCOLATE_BLOCK.get());
        this.dropSelf(ModBlocks.RUBY_CHOCOLATE_STAIRS.get());
        this.add(ModBlocks.RUBY_CHOCOLATE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RUBY_CHOCOLATE_SLAB.get()));

        this.dropSelf(ModBlocks.CARAMEL_BLOCK.get());
        this.dropSelf(ModBlocks.CARAMEL_STAIRS.get());
        this.add(ModBlocks.CARAMEL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CARAMEL_SLAB.get()));

        this.dropSelf(ModBlocks.CANDY_CANE_BLOCK.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
