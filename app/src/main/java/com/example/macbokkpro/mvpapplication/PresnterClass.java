package com.example.macbokkpro.mvpapplication;

/**
 * Created by macbokkpro on 2018-07-17.
 */

public class PresnterClass implements Contract.PresenterMVP {
    Contract.ModelMVP  modelMVP;
    Contract.ViewMVP viewMVP;

    public PresnterClass( Contract.ViewMVP viewMVP) {
        this.modelMVP = new ModelClass();
        this.viewMVP = viewMVP;
    }

    @Override
    public void connectViewWithModel() {
        viewMVP.showData(modelMVP.getData());
    }
}
