 package com.ks.roundedimgeview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ks.roundedimageview.RoundedImageView;

 public class MainActivity extends AppCompatActivity {

    RoundedImageView roundedImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roundedImageView = findViewById(R.id.img);

        //roundedImageView.setCornerRadius(200);
    }
}