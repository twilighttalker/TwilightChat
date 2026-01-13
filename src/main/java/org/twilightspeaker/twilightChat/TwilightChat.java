package org.twilightspeaker.twilightChat;

import org.bukkit.plugin.java.JavaPlugin;
import org.twilightspeaker.twilightChat.advanced.ChatListener;

public final class TwilightChat extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);

        getLogger().info("Successfully running.");
    }

    @Override
    public void onDisable() {
        getLogger().info("Successfully off.");
    }
}
