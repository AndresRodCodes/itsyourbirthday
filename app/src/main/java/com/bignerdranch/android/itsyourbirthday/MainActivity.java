package com.bignerdranch.android.itsyourbirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text_choose;
    Button button_topLeft;
    Button button_topRight;
    Button button_bottomLeft;
    Button button_bottomRight;
    Button button_back;

    public void chooseAnswer(View view) {

        text_choose.setText("Choose your birthday cake!");
        button_topLeft.setText("Sheet Cake");
        button_topRight.setText("Layered Cake");
        button_bottomLeft.setText("Cupcake Cake");
        button_bottomRight.setText("Ice Cream Cake");

        button_back.setVisibility(View.VISIBLE);

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


    }
}
