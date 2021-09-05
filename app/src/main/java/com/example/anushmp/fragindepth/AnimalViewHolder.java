package com.example.anushmp.fragindepth;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    TextView tvName;
    ImageView ivAnimal;


    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);

        tvName = itemView.findViewById(R.id.tvName);
        ivAnimal = itemView.findViewById(R.id.ivAnimal);


    }


    public void setData(AnimalModel animal){

        tvName.setText(animal.getName());
        ivAnimal.setImageResource(animal.getImageId());

    }



}
