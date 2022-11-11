package com.example.ggwp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


public class RegistrActivity extends AppCompatActivity {
    private EditText phone;
    private EditText repeat;
    private EditText password;
    private EditText username;
    private EditText email;
    private ImageButton nazad;
    private Button save;
    private ImageButton photo;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr);
        ActionBar actionBar = getSupportActionBar();
        assert actionBar != null;
        actionBar.hide();
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        phone = (EditText) findViewById(R.id.phone);
        repeat = (EditText) findViewById(R.id.repeat);
        email = (EditText) findViewById(R.id.email);
        photo = (ImageButton)findViewById(R.id.photo);
        save = (Button) findViewById(R.id.save);
        nazad = (ImageButton) findViewById(R.id.nazad);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("z")&&
                        password.getText().toString().equals("z")&&
                        phone.getText().toString().equals("z")&&
                        repeat.getText().toString().equals("z")&&
                        email.getText().toString().equals("z")) {
                    Toast.makeText(RegistrActivity.this, "Вход выполнен!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(RegistrActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Неправильные данные!", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }


    public void nazad(View view) {
        Intent mainIntnet = new Intent(RegistrActivity.this,SplashActivity.class);
        RegistrActivity.this.startActivity(mainIntnet);
        RegistrActivity.this.finish();
    }
}