package uwu.cocoa.confectionery.utiil;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import uwu.cocoa.confectionery.Confectionery;

public class ModTags {
    public static class Blocks {

        //custom block tags

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Confectionery.MOD_ID, name));
        }
    }

    public static class Items {

        //custom item tags

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Confectionery.MOD_ID, name));
        }
    }
}
