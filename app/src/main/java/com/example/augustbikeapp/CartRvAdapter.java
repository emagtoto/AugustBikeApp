package com.example.augustbikeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartRvAdapter extends RecyclerView.Adapter<CartRvAdapter.ViewHolder> {

    // variable for our array list and context
    private final ArrayList<String> cartModalArrayList;

    // constructor
    public CartRvAdapter(ArrayList<String> cartModalArrayList, Context context) {
        this.cartModalArrayList = cartModalArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // on below line we are inflating our layout
        // file for our recycler view items.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_rv_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // on below line we are setting data
        // to our views of recycler view item.
        String modal = cartModalArrayList.get(position);
        holder.courseNameTV.setText(modal);
    }

    @Override
    public int getItemCount() {
        // returning the size of our array list
        return cartModalArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        // creating variables for our text views.
        private final TextView courseNameTV;
        private TextView courseDescTV;
        private TextView courseDurationTV;
        private TextView courseTracksTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            // initializing our text views
            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseDescTV = itemView.findViewById(R.id.idTVCourseDescription);
            courseDurationTV = itemView.findViewById(R.id.idTVCourseDuration);
            courseTracksTV = itemView.findViewById(R.id.idTVCourseTracks);
        }
    }
}
