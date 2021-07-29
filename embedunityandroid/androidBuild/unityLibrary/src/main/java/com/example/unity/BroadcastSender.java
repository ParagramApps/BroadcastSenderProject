package com.example.unity;

import android.content.Intent;
//import androidx.localbroadcastmanager.content.LocalBroadcastManager;


public class BroadcastSender {

    public void SendBroadcast(float surfaceArea){
        System.out.println("In MainActivityUnity.SendBroadcast");

        Intent intent = new Intent();
        if (intent == null)
        {
            System.out.println("SendBroadcast: intent is null");
        }
        if (this == null)
        {
            System.out.println("SendBroadcast: this is null");
        }
        intent.setAction("com.alternativegrass.alternativegrassapp.CUSTOM_SENDDATA_INTENT");
        intent.putExtra("com.alternativegrass.alternativegrassapp.EXTRA_SURFACEAREA", ""+surfaceArea);
//        String str = intent.getStringExtra("com.alternativegrass.alternativegrassapp.EXTRA_SURFACEAREA");
//        System.out.println("MyPlugin: str = "+str);

//        sendBroadcast(intent);
        AppContext appContext = new AppContext();
        if (appContext == null)
        {
            System.out.println("appContext is null");
        }
        else
        {
            System.out.println("appContext is not null");
        }
        if (appContext.getContext() == null)
        {
            System.out.println("appContext.getContext() is null");
        }
        else
        {
            System.out.println("appContext.getContext() is not null");
        }
//        LocalBroadcastManager.getInstance(AppContext.getContext()).sendBroadcast(intent);
        System.out.println("SendBroadcast: intent = "+intent);
        appContext.getContext().sendBroadcast(intent);
    }

}
