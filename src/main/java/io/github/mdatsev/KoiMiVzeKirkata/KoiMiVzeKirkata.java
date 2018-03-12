package io.github.mdatsev.KoiMiVzeKirkata;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.inventory.InventoryClickEvent;

public final class KoiMiVzeKirkata extends JavaPlugin implements Listener {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this, this);
	}

	@EventHandler(priority = EventPriority.MONITOR)
	public void onLogin(InventoryClickEvent event) {
		getLogger().info(event.getAction().toString() + " " + event.getCurrentItem().toString());
	}

	@Override
	public void onDisable() {
		getLogger().info("onDisable has been invoked!");
	}
}
