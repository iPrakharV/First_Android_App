package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int a=5;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}