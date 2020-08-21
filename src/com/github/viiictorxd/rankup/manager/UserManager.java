package com.github.viiictorxd.rankup.manager;

import com.github.viiictorxd.rankup.entity.User;
import com.google.common.collect.Maps;

import java.util.Map;
import java.util.UUID;

public class UserManager {

    private static Map<UUID, User> USERS = Maps.newHashMap();

    public static User get(UUID uniqueId) {
        return USERS.getOrDefault(uniqueId, null);
    }


    public static boolean contains(UUID uniqueId) {
        return USERS.containsKey(uniqueId);
    }

    public static void add(User user) {
        USERS.put(user.getUniqueId(), user);
    }
}
