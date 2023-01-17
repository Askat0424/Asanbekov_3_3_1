package com.example.asanbekov_3_3_1;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ConstructionCompaniesAdapter extends RecyclerView.Adapter<ConstructionCompaniesViewHolder> {

    private ArrayList<String>CompaniesList;

    public ConstructionCompaniesAdapter(ArrayList<String> companiesList) {
        this.CompaniesList = companiesList;
    }

    @NonNull
    @Override
    public ConstructionCompaniesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ConstructionCompaniesViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_construction_companies,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ConstructionCompaniesViewHolder holder, int position) {
    holder.bind(CompaniesList.get(position));
    }

    @Override
    public int getItemCount() {
        return CompaniesList.size();
    }
}
