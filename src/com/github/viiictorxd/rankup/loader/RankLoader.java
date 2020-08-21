package com.github.viiictorxd.rankup.loader;

import com.github.viiictorxd.rankup.entity.Rank;
import com.google.common.collect.Maps;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.plugin.Plugin;

import java.util.Map;

public class RankLoader {

    private Plugin plugin;

    public RankLoader(Plugin plugin) {
        this.plugin = plugin;
    }

    public Map<Integer, Rank> getAll() {
        if (plugin != null) {
            Map<Integer, Rank> RANKS = Maps.newHashMap();

            ConfigurationSection configurationSection = plugin.getConfig().getConfigurationSection("ranks");
            if (configurationSection != null) {
                for (String key : configurationSection.getKeys(false)) {
                    String name = configurationSection.getString(key + ".name");
                    String shortPrefix = configurationSection.getString(key + ".prefix.short");
                    String longPrefix = configurationSection.getString(key + ".prefix.long");
                    int position = configurationSection.getInt(key + ".position", 1);
                    double price = configurationSection.getDouble(key + ".price", 0);

                    RANKS.put(position, new Rank(
                            name,
                            shortPrefix,
                            longPrefix,
                            position,
                            price
                    ));
                }
                return RANKS;
            }
        }
        return Maps.newHashMap();
    }
}
