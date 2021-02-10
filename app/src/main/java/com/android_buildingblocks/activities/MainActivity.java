package com.android_buildingblocks.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.android_buildingblocks.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //access_modifier ClassName instanceName
    private Button buttonClickMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        setTitle("Main Activity");

        buttonClickMe = findViewById(R.id.buttonClickMe);
        buttonClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Explicit Intent
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("ARG_PERSON_NAME","ANAS");
                startActivity(intent);



            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}