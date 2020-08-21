package com.github.viiictorxd.rankup.entity;

import com.github.viiictorxd.rankup.manager.RankManager;

import java.util.List;

public class Rank {

    private String name,
            shortPrefix,
            longPrefix;
    private int position;
    private double price;
    private List<String> commands;

    public Rank(String name, String shortPrefix, String longPrefix, int position, double price, List<String> commands) {
        this.name = name;
        this.shortPrefix = shortPrefix;
        this.longPrefix = longPrefix;
        this.position = position;
        this.price = price;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String getShortPrefix() {
        return shortPrefix;
    }

    public String getLongPrefix() {
        return longPrefix;
    }

    public int getPosition() {
        return position;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getCommands() {
        return commands;
    }

    public Rank getNextRank() {
        return RankManager.get(position + 1);
    }

    public boolean hasNextRank() {
        return RankManager.contains(position + 1);
    }
}
