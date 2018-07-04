package com.bignerdranch.android.itsyourbirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView text_choose;
    Button button_topLeft;
    Button button_topRight;
    Button button_bottomLeft;
    Button button_bottomRight;
    Button button_back;
    ArrayList<String> answersArrayList;
    ArrayList<String> chooseArray;

    ArrayList<String> topLeftArray;
    ArrayList<String> topRightArray;
    ArrayList<String> bottomLeftArray;
    ArrayList<String> bottomRightArray;

    int timesTapped = 1;

    public void chooseAnswer(View view) {

        if (timesTapped < chooseArray.size()) {

            Button button_pressed = (Button) view;

            answersArrayList.add((String) button_pressed.getText());

            text_choose.setText(chooseArray.get(timesTapped));
            button_topLeft.setText(topLeftArray.get(timesTapped));
            button_topRight.setText(topRightArray.get(timesTapped));
            button_bottomLeft.setText(bottomLeftArray.get(timesTapped));
            button_bottomRight.setText(bottomRightArray.get(timesTapped));

            timesTapped++;

        } else {

            Log.i("Info", "End of Arrays");

        }

        button_back.setVisibility(View.VISIBLE);

        Log.i("Info", Integer.toString(answersArrayList.size()));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_choose = findViewById(R.id.text_choose);
        button_topLeft = findViewById(R.id.button_topLeft);
        button_topRight = findViewById(R.id.button_topRight);
        button_bottomLeft = findViewById(R.id.button_bottomLeft);
        button_bottomRight = findViewById(R.id.button_bottomRight);
        button_back = findViewById(R.id.button_back);
        button_back.setVisibility(View.GONE);

        answersArrayList = new ArrayList<>();
        chooseArray = new ArrayList<>();

        topLeftArray = new ArrayList<>();
        topRightArray = new ArrayList<>();
        bottomLeftArray = new ArrayList<>();
        bottomRightArray = new ArrayList<>();

        chooseArray.add("Choose your character");
        chooseArray.add("Choose your birthday cake!");

        topLeftArray.add("Girl with long hair");
        topRightArray.add("Boy with long hair");
        bottomLeftArray.add("Girl with short hair");
        bottomRightArray.add("Boy with short hair");

        topLeftArray.add("Sheet cake");
        topRightArray.add("Layered cake");
        bottomLeftArray.add("Cupcake cake");
        bottomRightArray.add("Ice cream cake");

    }
}
