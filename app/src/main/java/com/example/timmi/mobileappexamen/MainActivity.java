package com.example.timmi.mobileappexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_INFO = "default";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button buttonOceaniumTime = findViewById(R.id.buttonOceaniumTimes);
        Button buttonRivierhalTime = findViewById(R.id.buttonRivierhalTimes);
        setContentView(R.layout.activity_main);
    }

    public void startOceaniumTimeActivity(View view) {
        Intent intent = new Intent(this, OceaniumTimeActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }

    public void startRivierahalTimeActivity(View view) {
        Intent intent = new Intent(this, RivierahalTimeActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }
}
