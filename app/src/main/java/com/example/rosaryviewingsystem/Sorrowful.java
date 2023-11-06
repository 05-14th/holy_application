package com.example.rosaryviewingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class Sorrowful extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sorrowful_content);
        TextView textView = findViewById(R.id.textView4);

        // Read long text from the "long_text.txt" file in the "assets" folder
        String longText = readTextFromAssets();

        // Display the long text in the TextView
        textView.setText(longText);
    }

    private String readTextFromAssets() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            AssetManager assetManager = getAssets();
            InputStream inputStream = assetManager.open("content2.txt");
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                stringBuilder.append(new String(buffer, 0, bytesRead));
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public void returnToMystery(View view){
        Intent returnIntent = new Intent(this, Mysteries.class);
        startActivity(returnIntent);
        finish();
    }
}