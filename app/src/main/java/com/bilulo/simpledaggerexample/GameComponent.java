package com.bilulo.simpledaggerexample;

import com.bilulo.simpledaggerexample.session.GameSession;

//DaggerComponent that will take care of injecting any dependency we define into the GameSession.
import dagger.Component;
@Component
public interface GameComponent {
    void inject(GameSession session);
}
