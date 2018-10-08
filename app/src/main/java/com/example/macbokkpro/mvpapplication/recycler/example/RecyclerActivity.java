package com.example.macbokkpro.mvpapplication.recycler.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.macbokkpro.mvpapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by macbokkpro on 2018-07-17.
 */

public class RecyclerActivity extends AppCompatActivity implements MyRecyclerViewAdapter.ItemClickListener ,RecyclerContract.AllItemsView{

    MyRecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    EditText editText;
    Button button;
    REcyclerPresenterClass  rEcyclerPresenterClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recyclerview_layout);


        // set up the RecyclerView
        recyclerView = findViewById(R.id.rvAnimals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setClickListener(this);
        editText = findViewById(R.id.edit_text);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
    @Override
        public void onClick(View view) {


        rEcyclerPresenterClass.addNewItem(editText.getText().toString());

    }
       });

      rEcyclerPresenterClass =  new REcyclerPresenterClass(this);
      rEcyclerPresenterClass.getDataFromURl("url");



    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }





    @Override
    public void modelResponse(List<String> allItems) {
        adapter = new MyRecyclerViewAdapter(this, allItems);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void refreshList(List<String> allItems) {

        adapter = new MyRecyclerViewAdapter(this, allItems);
        adapter.notifyDataSetChanged();
    }
}