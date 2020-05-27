package com.example.carl.aidlservice2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivityS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.example.carl.aidlservice2",
                "com.example.carl.aidlservice2.remote.MyService"));
        //startService(intent);
        //startService(new Intent(this, MyRemoteService.class));
        Log.i(TAG,"Service app onCreate...");
    }
}
