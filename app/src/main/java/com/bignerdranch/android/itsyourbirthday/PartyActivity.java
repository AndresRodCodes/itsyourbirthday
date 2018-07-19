package com.bignerdranch.android.itsyourbirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class PartyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);

        ArrayList<String> answersArrayList = (ArrayList<String>) getIntent().getSerializableExtra("answerList");

    }
}
