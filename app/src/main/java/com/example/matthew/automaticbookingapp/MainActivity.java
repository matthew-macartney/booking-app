package com.example.matthew.automaticbookingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void getValuesEntered(View view) {

        Switch toggle = findViewById(R.id.switch1);


            EditText editDay = findViewById(R.id.editDay);
            String day = editDay.getText().toString();

            EditText editTime = findViewById(R.id.editTime);
            String time = editTime.getText().toString();

            EditText editTextPlayer1 = findViewById(R.id.editTextPlayer1);
            String player1 = editTextPlayer1.getText().toString();

            EditText editTextPlayer2 = findViewById(R.id.editTextPlayer2);
            String player2 = editTextPlayer2.getText().toString();

            EditText editTextPlayer3 = findViewById(R.id.editTextPlayer3);
            String player3 = editTextPlayer3.getText().toString();
        }

    }

