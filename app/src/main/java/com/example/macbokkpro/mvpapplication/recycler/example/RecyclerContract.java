package com.example.macbokkpro.mvpapplication.recycler.example;

import java.util.List;

/**
 * Created by macbokkpro on 2018-07-17.
 */

public interface RecyclerContract {

    public interface RecyclerModel {
        List<String> getAllItemsByUrl(String url);
        List<String> addItemsToList(String item );

    }
    public interface AllItemsView {
        void modelResponse(List<String> allItems);
        void refreshList(List<String> allItems);

    }
    public interface RecyclerPresenter {
        void getDataFromURl(String url);
        void addNewItem(String allItems);


    }
}
