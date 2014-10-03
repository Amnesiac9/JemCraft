package john.jemcraft.lib;

import com.sun.org.apache.bcel.internal.generic.FMUL;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import john.jemcraft.Jemcraft;
import john.jemcraft.blocks.ModBlocks;
import john.jemcraft.items.ModItems;

public class Achievements {
	
	
	public static final Achievement getAmethyst = new Achievement("achievement.getAmethyst", "getAmethyst", 1, 3, ModBlocks.blockAmethyst, Achievements.getSapphire).setSpecial().registerStat();
	public static final Achievement getRuby = new Achievement("achievement.getRuby", "getRuby", -1, 3, ModItems.gemRuby, Achievements.getSapphire).registerStat();
	public static final Achievement getSapphire = new Achievement("achievement.getSapphire", "getSapphire", 0, 0, ModItems.gemSapphire, (Achievement)null).initIndependentStat().registerStat();
	
	public static void init() {}



	
	
}
