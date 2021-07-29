using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class NextButton : MonoBehaviour
{
	public void QuitRequest()
	{
		Debug.Log("Quit requested");
		Application.Quit();
	}
}
