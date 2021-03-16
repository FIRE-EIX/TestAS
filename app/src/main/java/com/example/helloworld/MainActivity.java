package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "LogTest";

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "----- onStart() method called -----");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "----- onDestroy() method called -----");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "----- onStop() method called -----");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "----- onResume() method called -----");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "----- onCreate() method called -----");
    }
}