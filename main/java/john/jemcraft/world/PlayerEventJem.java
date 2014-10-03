package john.jemcraft.world;

import java.util.Collection;

import net.minecraft.entity.item.EntityItem;
import john.jemcraft.items.ModItems;
import john.jemcraft.lib.Achievements;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public final class PlayerEventJem {
	
	
	@SubscribeEvent
	public void minedRuby(PlayerEvent.ItemPickupEvent e) {
		
		if (e.pickedUp.getEntityItem().getItem().equals(ModItems.gemRuby)){			
		   e.player.addStat(Achievements.getRuby, 1);
			
		}				
    }		
	
	
	
	@SubscribeEvent
	public void minedAmethyst(PlayerEvent.ItemPickupEvent a) {
		
		if (a.pickedUp.getEntityItem().getItem().equals(ModItems.gemAmethyst)){
			a.player.addStat(Achievements.getAmethyst, 1);
		}
		
		
	}

	
	@SubscribeEvent
	public void minedSapphire(PlayerEvent.ItemPickupEvent s) {
		
		if (s.pickedUp.getEntityItem().getItem().equals(ModItems.gemSapphire)){
			s.player.addStat(Achievements.getSapphire, 1);
		}
		
		
	}

	
	
	
}


