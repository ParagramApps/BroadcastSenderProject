package com.alternativegrass.alternativegrassapp

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.unity3d.player.UnityPlayerActivity

//import com.example.unity.MyPlugin;

const val EXTRA_SURFACEAREA = "com.alternativegrass.alternativegrassapp.SURFACEAREA"

class MainActivity : AppCompatActivity() {
    var firstTime: Boolean = true;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val br: MyBroadcastReceiver = MyBroadcastReceiver()
        val filter = IntentFilter()
        filter.addAction("com.example.broadcast.MY_NOTIFICATION")
        this.registerReceiver(br, filter)

//        val intent: Intent = Intent(this, MeasurementsActivity::class.java).apply {
////            putExtra("keyname", 1)
//        }
//        startActivity(intent)
//        val sendIntent: Intent = Intent().apply {
//            action = Intent.ACTION_SEND
//            putExtra("keyname", 1)
//            type = "text/plain"
//        }
//        startActivity(sendIntent)


//        val br: BroadcastReceiver = MeasurementsActivity()
//        val filter = IntentFilter("com.alternativegrass.alternativegrassapp.CUSTOM_SENDDATA_INTENT").apply {
//            addAction("com.alternativegrass.alternativegrassapp.CUSTOM_SENDDATA_INTENT")
//        }
//        registerReceiver(br, filter)


//        val intent = Intent("com.alternativegrass.alternativegrassapp.CUSTOM_SENDDATA_INTENT")
//        intent.putExtra("com.alternativegrass.alternativegrassapp.EXTRA_SURFACEAREA", "5.0")
//        sendBroadcast(intent)

        val arButton = findViewById<Button>(R.id.arButton)
        arButton.setOnClickListener {
            val intent = Intent(this, UnityPlayerActivity::class.java)
            startActivity(intent)
        }
    }
}