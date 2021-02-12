package com.android_buildingblocks.activities_launch_modes;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android_buildingblocks.R;

public class ActivityB extends AppCompatActivity {

    private Button buttonClickMeB;
    private static final String TAG = "Activity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        setTitle("Activity B");
        Log.d(TAG,"B");

        buttonClickMeB = findViewById(R.id.buttonClickMeB);
        buttonClickMeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityB.this, ActivityC.class);
                startActivity(intent);
            }
        });
    }

}
