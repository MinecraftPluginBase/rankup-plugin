package com.github.viiictorxd.rankup.api.event;

import com.github.viiictorxd.rankup.entity.User;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UserEvent extends Event implements Callable {

    private final static HandlerList HANDLER_LIST = new HandlerList();
    private User user;

    public UserEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
