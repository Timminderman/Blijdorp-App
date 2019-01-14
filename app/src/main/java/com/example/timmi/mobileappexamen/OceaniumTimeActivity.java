package com.example.timmi.mobileappexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class OceaniumTimeActivity extends AppCompatActivity {

    public static final String EXTRA_INFO = "default";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button buttonOceaniumTime1 = findViewById(R.id.buttonOceaniumTime1);
        Button buttonOceaniumTime2 = findViewById(R.id.buttonOceaniumTime2);
        setContentView(R.layout.activity_oceanium_time);
    }

    //    Start de activity die bij 10:00 - 13:00 past
    public void startOceaniumActivity(View view) {
        Intent intent = new Intent(this, OceaniumActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }
    //    Start de activity die bij 14:00 - 17:00 past
    public void startOceaniumActivity2(View view) {
        Intent intent = new Intent(this, OceaniumActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }
}
