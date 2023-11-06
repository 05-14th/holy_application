package com.example.rosaryviewingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class PrayerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer_view);
        TextView textView = findViewById(R.id.textView4);
        TextView prayerTitle = findViewById(R.id.prayerTitle);

        // Read long text from the "long_text.txt" file in the "assets" folder
        String longText = readTextFromAssets();

        // Display the long text in the TextView
        textView.setText(longText);

        // Change Title
        Intent intent =getIntent();
        String title = intent.getStringExtra("title");
        prayerTitle.setText(title);

        // Change Image
        catchImage();
    }

    private String readTextFromAssets() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            AssetManager assetManager = getAssets();
            Intent intent =getIntent();
            String filename = intent.getStringExtra("fileName");
            InputStream inputStream = assetManager.open(filename);
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
        Intent returnIntent = new Intent(this, Prayers.class);
        startActivity(returnIntent);
        finish();
    }

    public void catchImage(){
        ImageView myImageView = findViewById(R.id.imageView2);
        AssetManager assetManager = getAssets();

        try {
            // Load the image from the assets folder
            Intent intent =getIntent();
            String my_image = intent.getStringExtra("image");
            InputStream imageStream = assetManager.open(my_image);
            Drawable drawable = Drawable.createFromStream(imageStream, null);

            // Set the image in the ImageView
            myImageView.setImageDrawable(drawable);

            // Close the input stream
            imageStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle any potential exceptions
        }

    }
}