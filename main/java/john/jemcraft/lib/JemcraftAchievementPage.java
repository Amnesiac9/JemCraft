package john.jemcraft.lib;

import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class JemcraftAchievementPage extends AchievementPage {

	public static AchievementPage Jemcraftpage = new AchievementPage("Jemcraft Achievements", Achievements.getSapphire, Achievements.getAmethyst, Achievements.getRuby);
	
	
	
	public JemcraftAchievementPage() {
		
		super("Jemcraft Achievements1", Achievements.getSapphire, Achievements.getAmethyst, Achievements.getRuby);
		
		
	}

	
	
}
