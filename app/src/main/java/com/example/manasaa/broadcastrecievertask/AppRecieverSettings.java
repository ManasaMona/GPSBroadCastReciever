package com.example.manasaa.broadcastrecievertask;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by manasa.a on 16-02-2017.
 */

public class AppRecieverSettings extends Application{
    private static final String TAG="AppRecieverSettings";
    private MyBroadcastReceiver mReceiver;
    private IntentFilter mIntentFilter;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"called ONCREATE");
        mReceiver = new MyBroadcastReceiver();
        mIntentFilter= new IntentFilter();
        mIntentFilter.addAction("android.location.PROVIDERS_CHANGED");
        registerReceiver(mReceiver,mIntentFilter);

    }


}
