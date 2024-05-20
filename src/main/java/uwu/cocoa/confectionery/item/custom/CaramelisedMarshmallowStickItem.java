package uwu.cocoa.confectionery.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class CaramelisedMarshmallowStickItem extends Item {
    public CaramelisedMarshmallowStickItem(Properties properties) {
        super(properties);
    }

    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        Player playerentity = entity instanceof Player ? (Player)entity : null;
        if (playerentity instanceof ServerPlayer) {
            CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayer)playerentity, stack);
        }

        if (!world.isClientSide) {
            entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0, false,false, false));
        }

        if (playerentity != null) {
            playerentity.awardStat(Stats.ITEM_USED.get(this));
            playerentity.getFoodData().eat(8, 0.9F);
            if (!playerentity.getAbilities().instabuild) {
                stack.shrink(1);
            }
        }

        if (playerentity == null || !playerentity.getAbilities().instabuild) {
            if (stack.isEmpty()) {
                return new ItemStack(Items.STICK);
            }

            if (playerentity != null) {
                playerentity.getInventory().add(new ItemStack(Items.STICK));
            }
        }

        return stack;
    }

    public int getUseDuration(ItemStack stack) {
        return 32;
    }

    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.EAT;
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        player.startUsingItem(interactionHand);
        return InteractionResultHolder.success(player.getItemInHand(interactionHand));
    }
}
