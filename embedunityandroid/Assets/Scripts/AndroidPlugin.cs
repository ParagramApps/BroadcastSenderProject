using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AndroidPlugin : MonoBehaviour
{
    const string pluginName = "com.example.unity.MyPlugin";
    //const string pluginName = "com.alternativegrass.alternativegrassapp.UnityDataReceiver";

    static AndroidJavaClass _pluginClass;
    static AndroidJavaObject _pluginInstance;

    public static AndroidJavaClass PluginClass
    {
        get
        {
            if (_pluginClass == null)
            {
                _pluginClass = new AndroidJavaClass(pluginName);
            }
            return _pluginClass;
        }
    }

    public static AndroidJavaObject PluginInstance
    {
        get
        {
            if (_pluginInstance == null)
            {
                _pluginInstance = PluginClass.CallStatic<AndroidJavaObject>("getInstance");
            }
            return _pluginInstance;
        }
    }

    public void SendMessageToAndroid(float num)
    {

        if (Application.platform == RuntimePlatform.Android)
        {
            PluginInstance.Call("printText", num);
        }
    }
}
