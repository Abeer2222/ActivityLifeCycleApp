package com.example.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Main Activity", "On Create")

    }
    override fun onStart() {
        super.onStart()
        Log.i("Main Activity", "On Start")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Main Activity", "On Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Main Activity", "On Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Main Activity", "On Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Main Activity", "On Destroy")
    }

}