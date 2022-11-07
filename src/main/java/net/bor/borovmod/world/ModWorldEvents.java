package net.bor.borovmod.world;

import net.bor.borovmod.BorovMod;
import net.bor.borovmod.world.gen.ModOreGeneration;
import net.bor.borovmod.world.gen.ModTreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BorovMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModTreeGeneration.generateTrees(event);
        ModOreGeneration.generateOres(event);
    }
}
