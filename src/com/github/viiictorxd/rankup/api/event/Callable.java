package com.github.viiictorxd.rankup.api.event;

import org.bukkit.Bukkit;
import org.bukkit.event.Event;

public interface Callable {

    default void call() {
        Bukkit.getPluginManager().callEvent((Event) this);
    }
}
