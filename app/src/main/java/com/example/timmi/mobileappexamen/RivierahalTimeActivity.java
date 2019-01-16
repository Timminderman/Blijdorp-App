package com.example.timmi.mobileappexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class RivierahalTimeActivity extends AppCompatActivity {

    public static final String EXTRA_INFO = "default";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button buttonRivierahalTime1 = findViewById(R.id.buttonRivierahalTime1);
        Button buttonRivierahalTime2 = findViewById(R.id.buttonRivierahalTime2);
        Button buttonBackMainActivity = findViewById(R.id.buttonBackMainActivity);
        setContentView(R.layout.activity_rivierahal_time);
    }

    //    Start de activity die bij 10:00 - 13:00 past
    public void startRivierahalActivity(View view) {
        Intent intent = new Intent(this, RivierahalActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }
    //    Start de activity die bij 14:00 - 17:00 past
    public void startRivierahalActivity2(View view) {
        Intent intent = new Intent(this, RivierahalActivity2.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }

    //    Terug knop naar Main Activity
    public void startMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_INFO, "dit bericht komt uit MainActivity.");
        startActivity(intent);
    }
}
