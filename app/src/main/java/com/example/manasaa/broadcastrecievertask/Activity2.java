package com.example.manasaa.broadcastrecievertask;

import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {
    private final static String TAG=Activity2.class.getSimpleName();
    private MyBroadcastReceiver receiver;
    private IntentFilter intentFilter=new IntentFilter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    @Override
    protected void onStart() {
        Log.d(TAG,"called ONSTART");
        super.onStart();

    }

    @Override
    protected void onResume() {
        Log.d(TAG,"called ONRESUME");
        super.onResume();
//        receiver = new MyBroadcastReceiver();
//        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
//        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"called ONSTOP");
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
//        unregisterReceiver(receiver);
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"called ONDESTSROY");
        super.onDestroy();
    }

}
