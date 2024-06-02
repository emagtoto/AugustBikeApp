package com.example.augustbikeapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseManager {

    private SQLiteDatabase database;
    private final DBHelper dbHelper;

    public DatabaseManager(Context context) {
        dbHelper = new DBHelper(context);
    }

    public void open() {
        database = dbHelper.getWritableDatabase();
    }

    public void close() {
        dbHelper.close();
    }

    public long insertOrder(String productId, String productName, Integer productQuantity) {
        ContentValues values = new ContentValues();
        values.put("productId", productId);
        values.put("productName", productName);
        values.put("productQuantity", productQuantity);
        return database.insert("orders", null, values);
    }

    public Cursor getAllOrders() {
        return database.query("orders", null, null, null, null, null, null);
    }
}
