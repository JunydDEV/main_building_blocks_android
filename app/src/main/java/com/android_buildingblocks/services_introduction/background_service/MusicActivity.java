package com.android_buildingblocks.services_introduction.background_service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.android_buildingblocks.R;

public class MusicActivity extends Activity implements View.OnClickListener{

    private Button buttonPlayMusic;
    private Button buttonStopMusic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        buttonPlayMusic = findViewById(R.id.buttonPlayMusic);
        buttonStopMusic = findViewById(R.id.buttonStopMusic);

        buttonPlayMusic.setOnClickListener(this);
        buttonStopMusic.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, MusicService.class);

        if (view.getId() == R.id.buttonPlayMusic) {
            startService(intent);
        } else {
            stopService(intent);
        }
    }
}
