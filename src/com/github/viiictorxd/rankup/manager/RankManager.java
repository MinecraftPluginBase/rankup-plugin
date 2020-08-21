package com.github.viiictorxd.rankup.manager;

import com.github.viiictorxd.rankup.entity.Rank;
import com.google.common.collect.Maps;

import java.util.Map;

public class RankManager {

    private static Map<Integer, Rank> RANKS = Maps.newHashMap();

    public static Rank get(int position) {
        return RANKS.getOrDefault(position, RANKS.getOrDefault(1, null));
    }

    public static Rank first() {
        return get(1);
    }

    public static boolean contains(int position) {
        return RANKS.containsKey(position);
    }

    public static void put(Map<Integer, Rank> RANKS) {
        RankManager.RANKS = RANKS;
    }
}
