package ultimategdbot.guildsettings;

import sx.blah.discord.handle.obj.IGuild;
import sx.blah.discord.handle.obj.IRole;

/**
 * The role that the bot is supposed to mention where there are new awarded levels
 * 
 * @author Alex1304
 *
 */
public class RoleAwardedLevelsSetting extends RoleSetting {

	public RoleAwardedLevelsSetting(IGuild guild, IRole value) {
		super(guild, "When I send a notification telling that new levels have been rated, I will "
				+ "mention this role along with the message.", value);
	}

}
