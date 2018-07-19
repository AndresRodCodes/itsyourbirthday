package com.bignerdranch.android.itsyourbirthday;

import android.content.Intent;
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

    int timesTapped = 0;

    public void back(View view) {

        if (timesTapped > 0) {

            answersArrayList.remove(answersArrayList.size() - 1);

            timesTapped --;

            text_choose.setText(chooseArray.get(timesTapped));
            button_topLeft.setText(topLeftArray.get(timesTapped));
            button_topRight.setText(topRightArray.get(timesTapped));
            button_bottomLeft.setText(bottomLeftArray.get(timesTapped));
            button_bottomRight.setText(bottomRightArray.get(timesTapped));

            Log.i("info-back", "Times Tapped: " + Integer.toString(timesTapped));

            for (int i = 0; i < answersArrayList.size(); i++) {

                Log.i("info-back","answerList: " + answersArrayList.get(i));

            }

        } else {

            Toast.makeText(this, "Can't go back", Toast.LENGTH_SHORT).show();

        }
    }

    public void chooseAnswer(View view) {

        if (timesTapped < chooseArray.size()) {

            Button button_pressed = (Button) view;

            answersArrayList.add((String) button_pressed.getText());

            if (chooseArray.size() - timesTapped == 1) {

                text_choose.setText(chooseArray.get(timesTapped));
                button_topLeft.setText(topLeftArray.get(timesTapped));
                button_topRight.setText(topRightArray.get(timesTapped));
                button_bottomLeft.setText(bottomLeftArray.get(timesTapped));
                button_bottomRight.setText(bottomRightArray.get(timesTapped));

                Intent intent = new Intent(this, PartyActivity.class);
                intent.putExtra("answerList", answersArrayList);
                startActivity(intent);

            } else {

                text_choose.setText(chooseArray.get(timesTapped + 1));
                button_topLeft.setText(topLeftArray.get(timesTapped + 1));
                button_topRight.setText(topRightArray.get(timesTapped + 1));
                button_bottomLeft.setText(bottomLeftArray.get(timesTapped + 1));
                button_bottomRight.setText(bottomRightArray.get(timesTapped + 1));

                timesTapped++;

            }

        }

        button_back.setVisibility(View.VISIBLE);

        Log.i("Info","answerArrayList size: "  + Integer.toString(answersArrayList.size()));
        Log.i("info", "timesTapped: " + Integer.toString(timesTapped));
        Log.i("info", "chooseArray size: " + Integer.toString(chooseArray.size()));

        for (int i = 0; i < answersArrayList.size(); i++) {

            Log.i("info","answerList: " + answersArrayList.get(i));

        }

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

        chooseArray.add("Choose your character!");
        topLeftArray.add("Girl with long hair");
        topRightArray.add("Boy with Long hair");
        bottomLeftArray.add("Girl with short hair");
        bottomRightArray.add("Boy with short hair");

        text_choose.setText(chooseArray.get(timesTapped));
        button_topLeft.setText(topLeftArray.get(timesTapped));
        button_topRight.setText(topRightArray.get(timesTapped));
        button_bottomLeft.setText(bottomLeftArray.get(timesTapped));
        button_bottomRight.setText(bottomRightArray.get(timesTapped));

        chooseArray.add("Choose your birthday cake!");
        topLeftArray.add("Sheet cake");
        topRightArray.add("Layered cake");
        bottomLeftArray.add("Cupcake cake");
        bottomRightArray.add("Ice cream cake");

        chooseArray.add("Choose your flavor!");
        topLeftArray.add("Chocolate");
        topRightArray.add("Vanilla");
        bottomLeftArray.add("Tres Leche");
        bottomRightArray.add("Strawberry");

        chooseArray.add("Choose your special guest!");
        topLeftArray.add("Elephant");
        topRightArray.add("Clown");
        bottomLeftArray.add("Dracula");
        bottomRightArray.add("Robot");

        chooseArray.add("Choose your setting!");
        topLeftArray.add("Space");
        topRightArray.add("Underwater");
        bottomLeftArray.add("Jungle");
        bottomRightArray.add("Space");

        chooseArray.add("Choose your ballon color!");
        topLeftArray.add("Pink");
        topRightArray.add("Blue");
        bottomLeftArray.add("red");
        bottomRightArray.add("white");

        chooseArray.add("Choose your party game!");
        topLeftArray.add("Jumper");
        topRightArray.add("Water Slide");
        bottomLeftArray.add("Rocket ride");
        bottomRightArray.add("Pin the tail on the donkey");

        chooseArray.add("Choose your Entertainment!");
        topLeftArray.add("Musician");
        topRightArray.add("Mad Scientist");
        bottomLeftArray.add("Dancer");
        bottomRightArray.add("Magician");

    }
}
