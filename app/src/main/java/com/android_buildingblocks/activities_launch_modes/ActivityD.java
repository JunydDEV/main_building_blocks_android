package com.android_buildingblocks.activities_launch_modes;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android_buildingblocks.R;

public class ActivityD extends AppCompatActivity {

    private Button buttonClickMeD;
    private static final String TAG = "Activity";

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);

        if(intent.getExtras() != null){
            String launchMode = intent.getStringExtra("ARG_LAUNCH_MODE");
            Log.d("ARG_LAUNCH_MODE",launchMode);
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);
        setTitle("Activity D");
        Log.d(TAG,"D");

        buttonClickMeD = findViewById(R.id.buttonClickMeD);
        buttonClickMeD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityD.this, ActivityD.class);
                intent.putExtra("ARG_LAUNCH_MODE","SINGLE_TOP");
                startActivity(intent);
            }
        });
    }
}
