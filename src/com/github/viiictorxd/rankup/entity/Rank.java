package com.github.viiictorxd.rankup.entity;

import com.github.viiictorxd.rankup.manager.RankManager;

public class Rank {

    private String name,
            shortPrefix,
            longPrefix;
    private int position;
    private double price;

    public Rank(String name, String shortPrefix, String longPrefix, int position, double price) {
        this.name = name;
        this.shortPrefix = shortPrefix;
        this.longPrefix = longPrefix;
        this.position = position;
        this.price = price;
    }

    public String getName() {
        return name;
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

    public Rank getNextRank() {
        return RankManager.get(position + 1);
    }

    public boolean hasNextRank() {
        return RankManager.contains(position + 1);
    }
}
