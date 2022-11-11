package com.example.ggwp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();


    }

    public void getsmart(View view) {
        Intent mainIntnet = new Intent(SplashActivity.this,RegistrActivity.class);
        SplashActivity.this.startActivity(mainIntnet);
        SplashActivity.this.finish();
    }
}