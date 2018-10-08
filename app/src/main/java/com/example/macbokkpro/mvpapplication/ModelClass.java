package com.example.macbokkpro.mvpapplication;

import android.content.Context;

/**
 * Created by macbokkpro on 2018-07-17.
 */

public class ModelClass implements Contract.ModelMVP {

    @Override
    public String getData() {
        return "test mvp";
    }
}
