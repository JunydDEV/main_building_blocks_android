package com.android_buildingblocks.services_introduction.background_service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.provider.Settings;
import android.util.Log;

import androidx.annotation.Nullable;

//BackgroundService
public class MusicService extends Service {

    private MediaPlayer mediaPlayer;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MusicService","onCreate");


        mediaPlayer = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        mediaPlayer.setLooping(true);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("MusicService","onStartCommand");

        mediaPlayer.start();

        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d("MusicService","onBind");

        return null;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("MusicService","onDestroy");

        mediaPlayer.stop();
    }
}
