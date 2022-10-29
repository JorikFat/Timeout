package dev.jorik.timeout.sample;

import android.app.Application;

import dev.jorik.timeout.Timeout;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timeout.setTimeout(2022, 10, 30, 1, 9);
        Timeout.checkTimeout(this);
    }
}
