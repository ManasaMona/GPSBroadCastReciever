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

public class AppRecieverSettings extends Application implements Application.ActivityLifecycleCallbacks{
    private final String TAG="AppRecieverSettings";
    private MyBroadcastReceiver receiver;
    private IntentFilter intentFilter= new IntentFilter();
    private Activity mActivity ;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"called ONCREATE");

        receiver = new MyBroadcastReceiver();
        intentFilter.addAction("android.location.PROVIDERS_CHANGEDe");
        registerReceiver(receiver,intentFilter);

    }

    @Override
    public void unregisterComponentCallbacks(ComponentCallbacks callback) {
        Log.d("unregister callbacks","unregisster caallbacks");
        super.unregisterComponentCallbacks(callback);

    }

    @Override
    public void onTerminate() {
        Log.d(TAG,"called terminate");
        super.onTerminate();


    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {
        Log.d(TAG,"APP ONCREATED ACTIVITY");
        mActivity=activity;
        mActivity.unregisterReceiver(receiver);

    }
}
