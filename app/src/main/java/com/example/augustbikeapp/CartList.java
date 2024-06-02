package com.example.augustbikeapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartList extends AppCompatActivity {
    private DBHandler dbHandler;
    private ArrayList<String> productModalArrayList;
    private CartRvAdapter cartRvAdapter;
    private RecyclerView cartRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart_list);
        productModalArrayList = new ArrayList<>();

        dbHandler = new DBHandler(CartList.this);

        productModalArrayList = dbHandler.readCarts();
        Log.w("CartList", productModalArrayList.toString());

        // on below line passing our array list to our adapter class.
        cartRvAdapter = new CartRvAdapter(productModalArrayList, CartList.this);
        cartRV = findViewById(R.id.idRVCart);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}