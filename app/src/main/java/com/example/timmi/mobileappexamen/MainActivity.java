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
        Button oceanium = findViewById(R.id.buttonOceanium);
        Button rivierahal = findViewById(R.id.buttonRivierhal);
        setContentView(R.layout.activity_main);
    }

    public void startOceaniumActivity(View view) {
        Intent intent = new Intent(this, OceaniumActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }

    public void startRivierahalActivity(View view) {
        Intent intent = new Intent(this, RivierahalActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }
}
