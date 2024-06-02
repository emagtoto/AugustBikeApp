package com.example.augustbikeapp;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {

    // creating a constant variables for our database.
    // below variable is for our database name.
    private static final String DB_NAME = "AugustBikeDB2";

    // below int is our database version
    private static final int DB_VERSION = 1;

    // below variable is for our table name.
    private static final String TABLE_NAME = "BikeCart";

    // below variable is for our id column.
    private static final String ID_COL = "id";

    // below variable is for our cart name column
    private static final String NAME_COL = "name";

    // below variable id for our cart duration column.
    private static final String PRICE_COL = "price";

    // below variable for our cart description column.


    // creating a constructor for our database handler.
    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    // below method is for creating a database by running a sqlite query
    @Override
    public void onCreate(SQLiteDatabase db) {
        // on below line we are creating
        // an sqlite query and we are
        // setting our column names
        // along with their data types.
        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT,"
                + PRICE_COL + " TEXT)";

        // at last we are calling a exec sql
        // method to execute above sql query
        db.execSQL(query);
    }

    // this method is use to add new cart to our sqlite database.
    public void addToCart(String bikeName, String bikePrice) {

        // on below line we are creating a variable for
        // our sqlite database and calling writable method
        // as we are writing data in our database.
        SQLiteDatabase db = this.getWritableDatabase();

        // on below line we are creating a
        // variable for content values.
        ContentValues values = new ContentValues();

        // on below line we are passing all values
        // along with its key and value pair.
        values.put(NAME_COL, bikeName);
        values.put(PRICE_COL, bikePrice);

        // after adding all values we are passing
        // content values to our table.
        db.insert(TABLE_NAME, null, values);

        // at last we are closing our
        // database after adding database.
        db.close();
    }
    @SuppressLint("Range")
    public ArrayList<String> readCarts() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursorCarts = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        ArrayList<String> cartIdsList = new ArrayList<>();

        if (cursorCarts != null) {
            if (cursorCarts.moveToFirst()) {
                do {
                    // Get the value from the "id" column
                    String cartId = cursorCarts.getString(cursorCarts.getColumnIndex(ID_COL));
                    String cartName = cursorCarts.getString(cursorCarts.getColumnIndex(NAME_COL));
                    String cartPrice = cursorCarts.getString(cursorCarts.getColumnIndex(PRICE_COL));

                    cartIdsList.add(cartId);
                    cartIdsList.add(cartName);
                    cartIdsList.add(cartPrice);

                } while (cursorCarts.moveToNext());
            }
            cursorCarts.close();
        } else {
            Log.e("DBHandler", "Cursor is null or empty.");
        }

        return cartIdsList;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // this method is called to check if the table exists already.
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}