package com.bilulo.simpledaggerexample.session;


import com.bilulo.simpledaggerexample.DaggerGameComponent;
import com.bilulo.simpledaggerexample.data.GameData;

import javax.inject.Inject;

public class GameSession {
    @Inject
    public GameData data;

    @Inject
    public GameSession(GameData data) {
        this.data = data;
    }
}
