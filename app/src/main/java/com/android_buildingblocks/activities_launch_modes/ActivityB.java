package com.android_buildingblocks.activities_launch_modes;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android_buildingblocks.R;

public class ActivityB extends AppCompatActivity {

    private Button buttonClickMeB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        buttonClickMeB = findViewById(R.id.buttonClickMeB);
    }

}
