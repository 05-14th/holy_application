package com.example.rosaryviewingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mysteries extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mystery_selection);
    }

    public void showJoyous(View view){
        Intent joyout_intent = new Intent(this, Joyous.class);
        startActivity(joyout_intent);
        finish();
    }

    public void showSorrowful(View view){
        Intent sorrowful_intent = new Intent(this, Sorrowful.class);
        startActivity(sorrowful_intent);
        finish();
    }

    public void showLuminous(View view){
        Intent luminous_intent = new Intent(this, Luminous.class);
        startActivity(luminous_intent);
        finish();
    }

    public void showGlorious(View view){
        Intent glorious_intent = new Intent(this, Glorious.class);
        startActivity(glorious_intent);
        finish();
    }
}
