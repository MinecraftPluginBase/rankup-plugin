package com.github.viiictorxd.rankup.listener;

import com.github.viiictorxd.rankup.entity.User;
import com.github.viiictorxd.rankup.manager.RankManager;
import com.github.viiictorxd.rankup.manager.UserManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerListener implements Listener {

    @EventHandler
    private void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        // O jogador já se encontra no cache
        if (UserManager.contains(player.getUniqueId())) return;

        UserManager.add(new User(
                player.getUniqueId(),
                RankManager.first()
        ));
    }
}
