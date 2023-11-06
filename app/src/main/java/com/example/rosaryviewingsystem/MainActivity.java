package com.example.rosaryviewingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void continueNext(View view) {
        Intent categories_intent = new Intent(MainActivity.this, Categories.class);
        startActivity(categories_intent);
        finish();
    }
}