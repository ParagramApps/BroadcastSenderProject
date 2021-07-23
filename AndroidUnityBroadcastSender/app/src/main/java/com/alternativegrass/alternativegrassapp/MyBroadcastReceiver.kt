package com.alternativegrass.alternativegrassapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.localbroadcastmanager.content.LocalBroadcastManager

private const val TAG = "MyBroadcastReceiver"

//private var receiver: BroadcastReceiver? = null

class MyBroadcastReceiver : BroadcastReceiver(){
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_measurements)
//
//    }

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            Log.d(TAG, "Received broadcast: action = "+intent.action)
        }
        StringBuilder().apply {
            if (intent != null) {
                append("Action: ${intent.action}\n")
                append("URI: ${intent.toUri(Intent.URI_INTENT_SCHEME)}\n")
            }
            toString().also { log ->
                Log.d(TAG, log)
                Toast.makeText(context, log, Toast.LENGTH_LONG).show()
            }
        }

        var str = intent?.getStringExtra("com.alternativegrass.alternativegrassapp.EXTRA_SURFACEAREA")
        Log.d(TAG, "str = "+str)
    }
}