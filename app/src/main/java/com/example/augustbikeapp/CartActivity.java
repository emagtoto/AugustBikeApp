package com.example.augustbikeapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        dbHandler = new DBHandler(CartActivity.this);

        View addToCartBtn = findViewById(R.id.imageView15);

        addToCartBtn.setOnClickListener(v -> {

//            String base64String = ImageUtils.convertDrawableToBase64(this, R.drawable.product_2);

            // Add to cart
            dbHandler.addToCart("a", "P24,999");
            /*String name = "test";
            String age = "Carlo";
            dbManager.insert(name, age);*/
            Log.d("CartActivity", "Added to cart");
        });
    }
}