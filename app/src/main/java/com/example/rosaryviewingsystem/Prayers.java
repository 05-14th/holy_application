package com.example.rosaryviewingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Prayers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayers);
    }

    public void everyday(View view){
        Intent intent = new Intent(this, PrayerView.class);
        intent.putExtra("title", "Today's Prayer: ");
        intent.putExtra("fileName", "everyday.txt");
        intent.putExtra("image", "bible_verse1.png");
        startActivity(intent);
    }

    public void healing(View view){
        Intent intent = new Intent(this, PrayerView.class);
        intent.putExtra("title", "Prayer for Healing: ");
        intent.putExtra("fileName", "healing.txt");
        intent.putExtra("image", "bible_verse2.png");
        startActivity(intent);
    }

    public void mental(View view){
        Intent intent = new Intent(this, PrayerView.class);
        intent.putExtra("title", "Prayer for Mental Well-being: ");
        intent.putExtra("fileName", "mental.txt");
        intent.putExtra("image", "bible_verse3.png");
        startActivity(intent);
    }

    public void petition(View view){
        Intent intent = new Intent(this, PrayerView.class);
        intent.putExtra("title", "Prayer of Petition: ");
        intent.putExtra("fileName", "petition.txt");
        intent.putExtra("image", "bible_verse4.png");
        startActivity(intent);
    }

    public void lifestyle(View view){
        Intent intent = new Intent(this, PrayerView.class);
        intent.putExtra("title", "Prayer for Lifestyle: ");
        intent.putExtra("fileName", "lifestyle.txt");
        intent.putExtra("image", "bible_verse5.png");
        startActivity(intent);
    }

    public void lovedOnes(View view){
        Intent intent = new Intent(this, PrayerView.class);
        intent.putExtra("title", "Prayer for Loved Ones: ");
        intent.putExtra("fileName", "lovedOnes.txt");
        intent.putExtra("image", "bible_verse6.png");
        startActivity(intent);
    }

    public void catholic(View view){
        Intent intent = new Intent(this, PrayerView.class);
        intent.putExtra("title", "Catholic Prayers: ");
        intent.putExtra("fileName", "catholic.txt");
        intent.putExtra("image", "bible_verse7.png");
        startActivity(intent);
    }

    public void praiseWorship(View view){
        Intent intent = new Intent(this, PrayerView.class);
        intent.putExtra("title", "Praise & Worship: ");
        intent.putExtra("fileName", "praiseWorship.txt");
        intent.putExtra("image", "bible_verse8.png");
        startActivity(intent);
    }
}