package com.example.manasaa.broadcastrecievertask;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by manasa.a on 15-02-2017.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    private final static String TAG=MyBroadcastReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG," called ONRECEIVE");
       if (intent.getAction().matches("android.location.PROVIDERS_CHANGED")) {
            LocationManager manager= (LocationManager) context.getSystemService(Context.LOCATION_SERVICE );
            if ( !manager.isProviderEnabled( LocationManager.GPS_PROVIDER ) ) {
                Intent i = new Intent(context,AlertDailogBox.class);
                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(i);
                //context.getApplicationContext().startService(intent);

           // }
//            else {
//                Toast.makeText(context, "GPS enabled",
//                        Toast.LENGTH_SHORT).show();
//                Toast.makeText(context, "GPS Dsabled",
//                        Toast.LENGTH_SHORT).show();
//
           }

        }
    }
}
