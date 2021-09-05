package com.example.anushmp.fragindepth;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class AnimalFragment extends Fragment {

    private RecyclerView rv;
    private ArrayList<AnimalModel> animalList = new ArrayList<>();//empty vs null.




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);//methods
        buildlist();//methods
        setRv();//methods

    }

    private void initViews(View view) {
        rv = view.findViewById(R.id.rv);
    }

    private void buildlist(){

        for(int i = 0; i<11; i++){

            AnimalModel animal = new AnimalModel("Animal" + i,R.drawable.masailogo);

            animalList.add(animal);

        }



    }


    private void setRv(){

        AnimalAdapter aa = new AnimalAdapter(animalList);
        GridLayoutManager grid = new GridLayoutManager(getContext(),2,RecyclerView.VERTICAL,false);
        //LinearLayoutManager llm = new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,)
        rv.setLayoutManager(grid);
        rv.setAdapter(aa);

    }

}