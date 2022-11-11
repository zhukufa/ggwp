package com.example.ggwp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private final int LAUNCH_DISPLAY_LENGTH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        assert  actionBar != null;
        actionBar.hide();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntnet = new Intent(MainActivity.this, SplashActivity.class);
                MainActivity.this.startActivity(mainIntnet);
                MainActivity.this.finish();
            }
        }, LAUNCH_DISPLAY_LENGTH);
    }
}