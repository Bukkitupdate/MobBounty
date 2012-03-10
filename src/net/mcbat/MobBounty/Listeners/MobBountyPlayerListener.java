package net.mcbat.MobBounty.Listeners;

import net.mcbat.MobBounty.MobBounty;
import net.mcbat.MobBounty.MobBountyListeners;

import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class MobBountyPlayerListener implements Listener {
	private final MobBounty _plugin;
	private final MobBountyListeners _manager;
	
	public MobBountyPlayerListener(MobBounty plugin, MobBountyListeners manager) {
		_plugin = plugin;
		_manager = manager;
	}
	
	public void registerEvents() {
		_plugin.getServer().getPluginManager().registerEvents(this, _plugin);
	}
	
	public void onPlayerQuit(PlayerQuitEvent event) {
		_manager.getEntityListener().onPlayerQuit(event.getPlayer().getName());
	}
}
