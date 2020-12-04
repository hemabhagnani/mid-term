package com.example.midterm;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyHomeDataAdapter extends RecyclerView.Adapter<MyHomeDataAdapter.ViewHolder> {
    List<MyHomeData> myHomeData;

    public MyHomeDataAdapter(List<MyHomeData> myHomeData, Home home) {
        this.myHomeData = myHomeData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final MyHomeData myHomeDataList = myHomeData.get(position);
        holder.titleView.setText(myHomeDataList.getTask());
    }

    @Override
    public int getItemCount() {
        return myHomeData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleView;

        public ViewHolder(View itemView) {
            super(itemView);
            titleView = itemView.findViewById(R.id.titleView);
        }
    }
}
