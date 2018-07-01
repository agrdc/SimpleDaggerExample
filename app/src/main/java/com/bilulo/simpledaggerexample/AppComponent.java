package com.bilulo.simpledaggerexample;

import dagger.Component;

//DaggerComponent that will take care of injecting any dependency we define into the MainActivity.
@Component
public interface AppComponent {
    void inject(MainActivity activity);
}
