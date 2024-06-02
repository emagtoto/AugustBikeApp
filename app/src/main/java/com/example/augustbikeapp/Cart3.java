package com.example.augustbikeapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Cart3 extends AppCompatActivity {
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart3);
        dbHandler = new DBHandler(Cart3.this);

        View addToCartBtn = findViewById(R.id.imageView15);

        addToCartBtn.setOnClickListener(v -> {
            // Add to cart
            dbHandler.addToCart("Granite Bottle Holder", "P1,200");
            /*String name = "test";
            String age = "Carlo";
            dbManager.insert(name, age);*/
            Log.d("Cart3", "Added to cart");
        });
    }
}
