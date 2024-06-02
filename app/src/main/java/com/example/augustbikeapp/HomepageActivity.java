package com.example.augustbikeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomepageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Get references to the ImageView
        ImageView imageView = findViewById(R.id.imageView2);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page when the ImageView is clicked
                Intent intent = new Intent(HomepageActivity.this, CartActivity.class);
                intent.putExtra("productName", "Trek Bike");
                intent.putExtra("productPrice", 24999);
                startActivity(intent);
            }
        });

        ImageView imageView11 = findViewById(R.id.imageView11);
        imageView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page when the ImageView is clicked
                Intent intent = new Intent(HomepageActivity.this, CartList.class);
                startActivity(intent);
            }
        });

        ImageView imageView1 = findViewById(R.id.imageView3);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page when the ImageView is clicked
                Intent intent = new Intent(HomepageActivity.this, Cart2Activity.class);
                startActivity(intent);
            }
        });

        ImageView imageView2 = findViewById(R.id.imageView4);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page when the ImageView is clicked
                Intent intent = new Intent(HomepageActivity.this, Cart3.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.imageView12);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page when the ImageView is clicked
                Intent intent = new Intent(HomepageActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 = findViewById(R.id.imageView6);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page when the ImageView is clicked
                Intent intent = new Intent(HomepageActivity.this, Cart3.class);
                startActivity(intent);
            }
        });

        ImageView imageView5 = findViewById(R.id.imageView8);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page when the ImageView is clicked
                Intent intent = new Intent(HomepageActivity.this, Cart2Activity.class);
                startActivity(intent);
            }
        });

        ImageView imageView6 = findViewById(R.id.imageView9);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next page when the ImageView is clicked
                Intent intent = new Intent(HomepageActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });
    }
}