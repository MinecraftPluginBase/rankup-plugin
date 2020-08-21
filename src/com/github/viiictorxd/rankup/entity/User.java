package com.github.viiictorxd.rankup.entity;

import java.util.UUID;

public class User {

    private UUID uniqueId;
    private Rank rank;

    public User(UUID uniqueId, Rank rank) {
        this.uniqueId = uniqueId;
        this.rank = rank;
    }

    public UUID getUniqueId() {
        return uniqueId;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
