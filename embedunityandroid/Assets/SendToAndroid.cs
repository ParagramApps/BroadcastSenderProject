using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SendToAndroid : MonoBehaviour
{
    private GameObject pluginManager;

    // Start is called before the first frame update
    void Start()
    {
        pluginManager = GameObject.Find("PluginManager");
    }

    public void SendData()
    {
        pluginManager.GetComponent<AndroidPlugin>().SendMessageToAndroid(5.0f);
    }
}
