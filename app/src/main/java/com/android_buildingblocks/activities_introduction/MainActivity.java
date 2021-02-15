package com.android_buildingblocks.activities_introduction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android_buildingblocks.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //access_modifier ClassName instanceName
    private Button buttonCLickMe1;
    private Button buttonCLickMe2;
    private Button buttonCLickMe3;
    private TextView textViewPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate");
        setContentView(R.layout.activity_main);
        setTitle("Main Activity");

        buttonCLickMe1 = findViewById(R.id.buttonClickMe1);
        buttonCLickMe2 = findViewById(R.id.buttonClickMe2);
        buttonCLickMe3 = findViewById(R.id.buttonClickMe3);
        textViewPhone = findViewById(R.id.textViewPhone);

        buttonCLickMe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                User user = new User();

                //Explicit Intent
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("ARG_USER",user);
                startActivityForResult(intent,123);

            }
        });

        buttonCLickMe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        buttonCLickMe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == Activity.RESULT_OK){
            if(requestCode == 123){
                String phoneNumber = data.getStringExtra("ARG_PERSON_PHONE");
                textViewPhone.setText(phoneNumber);
            }
        }
    }
}