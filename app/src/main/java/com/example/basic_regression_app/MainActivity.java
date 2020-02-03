package com.example.basic_regression_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.tensorflow.Graph;
import org.tensorflow.Session;
import org.tensorflow.Tensor;
import org.tensorflow.Tensors;
import org.tensorflow.contrib.android.TensorFlowInferenceInterface;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private float slope, constant;
    private EditText slopeText, constantText;
    private Button train;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("oncreate");
        slopeText = findViewById(R.id.slopeEditText);
        constantText = findViewById(R.id.constantEditText);
        train = findViewById(R.id.trainButton);
        train.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("clicked");
                slope = Integer.parseInt(slopeText.getText().toString());
                constant = Integer.parseInt(constantText.getText().toString());
                Intent intent = new Intent(MainActivity.this, WeightsActivityTwo.class);
                intent.putExtra("slope", slope);
                intent.putExtra("constant",constant);
                startActivity(intent);
            }
        });
    }




}
