package com.example.basic_regression_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WeightsActivityTwo extends AppCompatActivity {

    private Training training;
    private ArrayList<Weights> weights;
    private WeightAdapter adapter;
    private String path = "graph.pb";
    private float slope,constant;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weights_two);

        Intent intent = getIntent();
        slope = intent.getFloatExtra("slope",-5);
        constant = intent.getFloatExtra("constant",-5);
        setContentView(R.layout.weights_layout);
        list= (ListView)findViewById(R.id.list);
        training = new Training(getAssets(), path, slope, constant);
        training.loadModel();
        weights = training.train();
        adapter = new WeightAdapter(WeightsActivityTwo.this, weights);
        list.setAdapter((ListAdapter) adapter);
    }
}
