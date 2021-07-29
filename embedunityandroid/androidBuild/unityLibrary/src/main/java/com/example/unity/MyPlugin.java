package com.example.unity;

import android.util.Log;

public class MyPlugin {
    private static final MyPlugin ourInstance = new MyPlugin();

    private static final String LOGTAG = "AltGras";

    public static MyPlugin getInstance() { return ourInstance; }
    public static BroadcastSender mainActivity;
    public float surfaceArea ;

    private MyPlugin() {
        mainActivity = new BroadcastSender();
        Log.i(LOGTAG, "Created MyPlugin");
    }

    public void printText(float num)
    {
        surfaceArea = num;
        System.out.println("printText: Text from Unity: "+num);
        mainActivity.SendBroadcast(num);
    }
}
