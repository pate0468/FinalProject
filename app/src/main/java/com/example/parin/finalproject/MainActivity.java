package com.example.parin.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button2 = (Button)findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(MainActivity.this,
                       MultipleChoiceQuiz.class);
                startActivityForResult(secondIntent, 50);
            }
        });
        Button button3 = (Button)findViewById(R.id.button2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(MainActivity.this,
                        PatientIntakeForm.class);
                startActivityForResult(secondIntent, 50);
            }
        });
        Button button4 = (Button)findViewById(R.id.button3);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(MainActivity.this,
                        MovieInformation.class);
                startActivityForResult(secondIntent, 50);
            }
        });

        Button button5 = (Button)findViewById(R.id.button4);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent secondIntent = new Intent(MainActivity.this,
                        OCTranspoBusRouteApp.class);
                startActivityForResult(secondIntent, 50);
            }
        });

    }
}
