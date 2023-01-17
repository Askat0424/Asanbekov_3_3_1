package com.example.asanbekov_3_3_1;

import android.view.View;

import androidx.annotation.NonNull;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ConstructionCompaniesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCompanies;
    public ConstructionCompaniesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCompanies = itemView.findViewById(R.id.tv_companies);
    }
    public void bind(String companies){
        tvCompanies.setText(companies);
    }

}
