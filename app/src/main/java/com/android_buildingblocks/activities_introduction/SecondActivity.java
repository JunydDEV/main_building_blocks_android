package com.android_buildingblocks.activities_introduction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.android_buildingblocks.R;

public class SecondActivity extends Activity {

    //access_modifier className instanceName
    private Button buttonFinish;

    //TypeCasting: to convert a type from one form to another


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonFinish = findViewById(R.id.buttonFinish);

        Intent intent = getIntent();
        if (intent.getExtras() != null) {
            User user = intent.getParcelableExtra("ARG_USER");
            Log.d("User", user.name);
            Log.d("User", user.phoneNumber);
            Log.d("User", user.address);
        }


        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIintent = new Intent();
                resultIintent.putExtra("ARG_PERSON_PHONE","0333-1234567");
                setResult(Activity.RESULT_OK,resultIintent);
                finish();
            }
        });

    }
}
