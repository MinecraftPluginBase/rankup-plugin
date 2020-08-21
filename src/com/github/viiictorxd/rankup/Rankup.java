package com.github.viiictorxd.rankup;

import com.github.viiictorxd.rankup.command.CommandRankup;
import com.github.viiictorxd.rankup.listener.BaseListener;
import com.github.viiictorxd.rankup.listener.PlayerListener;
import com.github.viiictorxd.rankup.loader.RankLoader;
import com.github.viiictorxd.rankup.manager.RankManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Rankup extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();

        saveDefaultConfig();

        // Loading all ranks from config.yml
        RankManager.put(new RankLoader(this).getAll());

        // Registering command
        getCommand("rankup").setExecutor(new CommandRankup());

        // Registering listener
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new BaseListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
