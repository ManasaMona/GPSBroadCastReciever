package com.example.manasaa.broadcastrecievertask;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;

/**
 * Created by Sowjanya on 15-02-2017.
 */

public class AlertDailogBox extends Activity {
    private static final String TAG = AlertDailogBox.class.getSimpleName();
    final String action = Settings.ACTION_LOCATION_SOURCE_SETTINGS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"called ALERTBOXACTIVITY");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder
                .setTitle("GPS")
                .setMessage("Do you want to enable your GPS ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        startActivity(new Intent(action));
                        dialog.cancel();
                        finish();
                       // dialog.dismiss();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int id)
                    {
                        dialog.cancel();
                        finish();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();



    }

}
