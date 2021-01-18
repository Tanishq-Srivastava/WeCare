package com.example.wecare;

import android.os.*;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
