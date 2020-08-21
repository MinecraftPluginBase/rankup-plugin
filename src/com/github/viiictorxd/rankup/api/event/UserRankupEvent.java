package com.github.viiictorxd.rankup.api.event;

import com.github.viiictorxd.rankup.entity.Rank;
import com.github.viiictorxd.rankup.entity.User;
import org.bukkit.event.Cancellable;

public class UserRankupEvent extends UserEvent implements Cancellable {

    private Rank oldRank,
            newRank;
    private boolean cancelled;

    public UserRankupEvent(User user, Rank oldRank, Rank newRank) {
        super(user);
        this.oldRank = oldRank;
        this.newRank = newRank;
        this.cancelled = false;
    }

    public Rank getOldRank() {
        return oldRank;
    }

    public Rank getNewRank() {
        return newRank;
    }

    public void setNewRank(Rank newRank) {
        this.newRank = newRank;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}
