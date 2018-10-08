package com.example.macbokkpro.mvpapplication.recycler.example;

import java.util.List;

/**
 * Created by macbokkpro on 2018-07-17.
 */

public class REcyclerPresenterClass implements RecyclerContract.RecyclerPresenter {


    private List<String> mData;

    RecyclerContract.RecyclerModel recyclerModel;
    RecyclerContract.AllItemsView  recyclerView;


    public REcyclerPresenterClass(  RecyclerContract.AllItemsView recyclerView) {
        this.recyclerModel = new RecyclerModelClass();
        this.recyclerView = recyclerView;
    }



    @Override
    public void getDataFromURl(String url) {
        recyclerView.modelResponse(recyclerModel.getAllItemsByUrl(""));

    }

    @Override
    public void addNewItem(String allItems) {
        recyclerView.modelResponse(recyclerModel.addItemsToList(allItems));
    }


}
