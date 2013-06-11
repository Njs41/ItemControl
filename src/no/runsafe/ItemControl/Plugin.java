package no.runsafe.ItemControl;

import no.runsafe.framework.RunsafeConfigurablePlugin;
import no.runsafe.worldguardbridge.WorldGuardInterface;

public class Plugin extends RunsafeConfigurablePlugin
{
	@Override
	protected void PluginSetup()
	{
		this.addComponent(getFirstPluginAPI(WorldGuardInterface.class));
		this.addComponent(Globals.class);
		this.addComponent(PlayerListener.class);
		this.addComponent(BlockListener.class);
		this.addComponent(EntityListener.class);
	}
}
