package edu.washington.zarkoc.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "ActivitySpy"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate event fired")
        Log.i(TAG, savedInstanceState.toString())
    }

    override fun onDestroy() {
        Log.e(TAG, "We're going down, Captain!")
        super.onDestroy()
    }
}