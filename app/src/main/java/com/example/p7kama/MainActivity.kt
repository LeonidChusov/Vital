package com.example.p7kama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnCreate")
    }
    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnStart")
    }
    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnResume")
    }
    override fun onPostResume() {
        super.onPostResume()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnPostResume")
    }
    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnPause")
    }
    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnStop")
    }
    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        Log.i(TAG,"OnDestroy")
    }
}