package com.example.macbokkpro.mvpapplication.recycler.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbokkpro on 2018-07-17.
 */

public class RecyclerModelClass implements RecyclerContract.RecyclerModel {
    List<String> animalNames ;
    @Override
    public List<String> getAllItemsByUrl(String url) {
       animalNames = new ArrayList<>();

        animalNames.add("Horse");
        animalNames.add("Cow");
        animalNames.add("Camel");
        animalNames.add("Sheep");
        animalNames.add("Goat");

        return animalNames;
    }

    @Override
    public List<String> addItemsToList(String item) {
        animalNames.add(item);
        return animalNames;
    }
}
