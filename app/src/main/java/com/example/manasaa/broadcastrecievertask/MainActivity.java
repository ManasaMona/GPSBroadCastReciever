package com.example.manasaa.broadcastrecievertask;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final static String TAG=MainActivity.class.getSimpleName();
    private Button button;
     //static MyBroadcastReceiver receiver = new MyBroadcastReceiver();
    private MyBroadcastReceiver receiver ;
    private IntentFilter intentFilter= new IntentFilter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG,"called ONCREATE");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(this);
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
        receiver= new MyBroadcastReceiver();
        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
        registerReceiver(receiver,intentFilter);


    }

    @Override
    protected void onStop() {
        Log.d(TAG,"called ONSTOP");
        super.onStop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(receiver);
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG,"called ONDESTSROY");
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this,Activity2.class);
        startActivity(i);

    }
}
