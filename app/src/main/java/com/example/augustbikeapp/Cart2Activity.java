package com.example.augustbikeapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Cart2Activity extends AppCompatActivity {
    private DatabaseManager databaseManager;
    private DBHandler dbHandler;
    private DBManager dbManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart2);


        dbHandler = new DBHandler(Cart2Activity.this);
        dbManager = new DBManager(Cart2Activity.this);

        View addToCartBtn = findViewById(R.id.imageView15);

        addToCartBtn.setOnClickListener(v -> {
            // Add to cart
            dbHandler.addToCart("Silver Chain", "P24,999");
            /*String name = "test";
            String age = "Carlo";
            dbManager.insert(name, age);*/
            Log.d("Cart2Activity", "Added to cart");
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}