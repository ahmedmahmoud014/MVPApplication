package com.example.macbokkpro.mvpapplication.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.macbokkpro.mvpapplication.Contract;
import com.example.macbokkpro.mvpapplication.PresnterClass;
import com.example.macbokkpro.mvpapplication.R;

public class MainActivity extends AppCompatActivity implements Contract.ViewMVP {
    TextView   textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =  (TextView)findViewById(R.id.testText);


        // call  presenter
        PresnterClass presnterClass = new PresnterClass(this);
        presnterClass.connectViewWithModel();



    }


    @Override
    public void showData(String value) {
        textView.setText(value);

    }
}
