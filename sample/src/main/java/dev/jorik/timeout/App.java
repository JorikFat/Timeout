package dev.jorik.timeout;

import android.app.Application;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timeout.setTimeout(2022, 10, 29, 20, 50);
        Timeout.checkTimeout(this);
    }
}
