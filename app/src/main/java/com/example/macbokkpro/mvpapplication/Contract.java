package com.example.macbokkpro.mvpapplication;

/**
 * Created by macbokkpro on 2018-07-17.
 */

public interface Contract {

    public interface ViewMVP {
        void showData(String value);
    }
    public interface ModelMVP {
        String getData();
    }
    public interface PresenterMVP {
        void connectViewWithModel ();
    }
}
