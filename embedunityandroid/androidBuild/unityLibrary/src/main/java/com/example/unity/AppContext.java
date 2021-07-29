package com.example.unity;

import android.app.Application;
import android.content.Context;

public class AppContext extends Application {

    private static AppContext instance;

    public AppContext() {
        instance = this;
    }

    public static Context getContext() {
        return instance;
    }
}
