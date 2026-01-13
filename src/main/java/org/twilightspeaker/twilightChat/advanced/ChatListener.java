package org.twilightspeaker.twilightChat.advanced;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatListener implements Listener {
    private final MiniMessage mm = MiniMessage.miniMessage();

    @EventHandler
    public void onChat(AsyncChatEvent event) {
        var player = event.getPlayer();

        event.renderer((source, sourceDisplayName, message, viewer) -> {
            Component playerPart = mm.deserialize("<gold>" + player.getName() + "</gold>");
            Component arrow = mm.deserialize("<gray> -> </gray>");
            Component messagePart = message.color(NamedTextColor.WHITE);

            return Component.text()
                    .append(playerPart)
                    .append(arrow)
                    .append(messagePart)
                    .build();
        });
    }
}
