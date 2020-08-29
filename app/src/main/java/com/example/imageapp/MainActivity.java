package com.example.imageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    ImageView onlineimg, onlineimg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onlineimg = findViewById(R.id.imageView);
        onlineimg2 = findViewById(R.id.imageView3);

        String uri="https://cdn.pixabay.com/photo/2017/07/18/18/24/dove-2516641_1280.jpg";
        Picasso.get().load(uri).placeholder(R.drawable.apple).into(onlineimg);
        Picasso.get().load("https://cdn.pixabay.com/photo/2017/07/18/18/24/dove-2516641_1280.jpg").placeholder(R.drawable.apple).into(onlineimg2);
    }
}