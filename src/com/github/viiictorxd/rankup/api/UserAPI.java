package com.github.viiictorxd.rankup.api;

import com.github.viiictorxd.rankup.entity.User;
import com.github.viiictorxd.rankup.manager.UserManager;

import java.util.UUID;

public class UserAPI {

    private final User user;

    public UserAPI(UUID uniqueId) {
        this.user = UserManager.get(uniqueId);
    }

    public User getUser() {
        return user;
    }

    public boolean exists() {
        return user != null;
    }
}
