package net.thedudemc.aversion.event;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.thedudemc.aversion.Aversion;
import net.thedudemc.aversion.init.InitConfig;

@Mod.EventBusSubscriber(modid = Aversion.MODID)
public class EventAvertHostiles {

	@SubscribeEvent
	public static void onPlayerTargeted(LivingSetAttackTargetEvent event) {

		if (!(event.getTarget() instanceof EntityPlayer))
			return;

		if (!(event.getEntity() instanceof EntityLiving))
			return;

		EntityPlayer target = (EntityPlayer) event.getTarget();
		EntityLiving attacker = (EntityLiving) event.getEntity();

		if (InitConfig.CONFIG_PLAYERS.PLAYERS.contains(target.getName())) {
			attacker.setAttackTarget(null);
		}

	}

}
