package com.example.rosaryviewingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class Categories extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_selector);
    }

    public void showMysteries(View view){
        Intent mysteries_intent = new Intent(Categories.this, Mysteries.class);
        startActivity(mysteries_intent);
    }

    public void showPrayers(View view){
        Intent prayers_intent = new Intent(Categories.this, Prayers.class);
        startActivity(prayers_intent);
    }

    public void showVerses(View view){
        Intent verses_intent = new Intent(this, Verses.class);
        startActivity(verses_intent);
    }

}
