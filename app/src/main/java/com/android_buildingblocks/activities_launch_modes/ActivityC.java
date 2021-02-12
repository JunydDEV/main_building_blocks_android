package com.android_buildingblocks.activities_launch_modes;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android_buildingblocks.R;

public class ActivityC extends AppCompatActivity {

    private Button buttonClickMeC;
    private static final String TAG = "Acitivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        setTitle("Activity C");
        Log.d(TAG,"C");

        buttonClickMeC = findViewById(R.id.buttonClickMeC);
        buttonClickMeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityC.this, ActivityD.class);
                startActivity(intent);
            }
        });
    }
}
