package com.alternativegrass.alternativegrassapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import com.example.unity.AppContext;
import com.example.unity.BroadcastSender;
import com.example.unity.MyPlugin;


public class JavaBroadcastReceiver {

    private BroadcastReceiver receiver;

    Context myContext;
    public JavaBroadcastReceiver() {
        receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                myContext = context;
                //receive your message here
                String message = intent.getStringExtra("com.alternativegrass.alternativegrassapp.EXTRA_SURFACEAREA");
                 }
        };

//        LocalBroadcastManager.getInstance(myContext).registerReceiver(receiver, new IntentFilter("com.alternativegrass.alternativegrassapp.CUSTOM_SENDDATA_INTENT"));
        LocalBroadcastManager.getInstance(AppContext.getContext()).registerReceiver(receiver, new IntentFilter("com.alternativegrass.alternativegrassapp.CUSTOM_SENDDATA_INTENT"));

//        LocalBroadcastManager  localBroadcastManager = LocalBroadcastManager.getInstance(myContext);
//        localBroadcastManager.registerReceiver(receiver); // or other operations
    }
}
