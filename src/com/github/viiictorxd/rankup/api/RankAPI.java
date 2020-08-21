package com.github.viiictorxd.rankup.api;

import com.github.viiictorxd.rankup.entity.Rank;
import com.github.viiictorxd.rankup.manager.RankManager;

public class RankAPI {

    private final Rank rank;

    public RankAPI(int position) {
        this.rank = RankManager.get(position);
    }

    public Rank getRank() {
        return rank;
    }

    public boolean exists() {
        return rank != null;
    }
}
