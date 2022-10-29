package dev.jorik.timeout;

import static android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK;
import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

import android.app.Application;
import android.content.Intent;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TimeoutActivity.setTimeout(2022, 10, 29, 20, 20);
        if(TimeoutActivity.timeoutExpired()){
            startActivity(
                    new Intent(this, TimeoutActivity.class)
                            .addFlags(FLAG_ACTIVITY_CLEAR_TASK | FLAG_ACTIVITY_NEW_TASK)
            );
        }
    }
}
