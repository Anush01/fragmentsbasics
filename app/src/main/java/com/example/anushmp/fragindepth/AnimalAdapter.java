package com.example.anushmp.fragindepth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {


    private ArrayList<AnimalModel> animalList;

    public AnimalAdapter(ArrayList<AnimalModel> animalList){

        this.animalList = animalList;

    }




    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        AnimalViewHolder avh = new AnimalViewHolder(view);

        return avh;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {

        AnimalModel animal = animalList.get(position);
        holder.setData(animal);



    }



    @Override
    public int getItemCount() {
        return animalList.size();
    }




}
