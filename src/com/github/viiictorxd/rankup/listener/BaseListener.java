package com.github.viiictorxd.rankup.listener;

import com.github.viiictorxd.rankup.api.RankAPI;
import com.github.viiictorxd.rankup.api.event.UserRankupEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class BaseListener implements Listener {

    @EventHandler
    private void onUserRankup(UserRankupEvent event) {
        if (!event.isCancelled() && event.getUser().getUniqueId().toString().equals("7fb38974-dc49-4591-8a95-bd20ab273acf")) {
            event.setNewRank(new RankAPI(5).getRank());
        }
    }
}
