package net.bor.borovmod.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.bor.borovmod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PyropeGarnetDetectorItem extends Item {
    public PyropeGarnetDetectorItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {

        if(pContext.getLevel().isClientSide()) {

            BlockPos clickedPos = pContext.getClickedPos(); //shrani xyz kliknjenega blocka v clickedPos
            Player player = pContext.getPlayer();           //shrani playerja v player

            boolean najdenGarnet = false;                   //Ali je najden garnet?

            for (int i = clickedPos.getY(); i >= -64; i--) {

                Block block = pContext.getLevel().getBlockState(clickedPos.atY(i)).getBlock();  //Dobi block na xz od dlickedPos in y on i

                if (JePyropeGarnet(block)) {                //Ce je garnet
                    najdenGarnet = true;                    //Garnet je najden
                    break;                                  //break
                }
            }

            if(najdenGarnet) {
                player.sendMessage(new TranslatableComponent("item.borovmod.pyrope_garnet_detector.garnet_found"), player.getUUID());   //Informira igralca
            }
            else {
                player.sendMessage(new TranslatableComponent("item.borovmod.pyrope_garnet_detector.garnet_not_found"), player.getUUID());
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),      //Vzame durability / unici item
                (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.useOn(pContext);
    }

    private boolean JePyropeGarnet(Block block) {
        return block == ModBlocks.PYROPE_GARNET_ORE.get() || block == ModBlocks.DEEPSLATE_PYROPE_GARNET_ORE.get();
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(new TranslatableComponent("tooltip.borovmod.pyrope_garnet_detector.tooltip.shift"));
        } else {
            pTooltipComponents.add(new TranslatableComponent("tooltip.borovmod.pyrope_garnet_detector.tooltip"));
        }
    }
}
