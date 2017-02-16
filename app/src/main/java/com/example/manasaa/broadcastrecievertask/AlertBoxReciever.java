package com.example.manasaa.broadcastrecievertask;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;

/**
 * Created by manasa.a on 16-02-2017.
 */

public class AlertBoxReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        LocationManager manager= (LocationManager) context.getSystemService(Context.LOCATION_SERVICE );
        if(manager.isProviderEnabled( LocationManager.GPS_PROVIDER ) ){
            Activity a= (Activity)context;
            a.finish();
        }
    }
}
