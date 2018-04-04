package com.example.parin.finalproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MultipleChoiceQuiz extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_choice_quiz);
        String text = "Multiple Quiz";
        int time = Snackbar.LENGTH_SHORT;
        final Context context = getApplicationContext();
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinate),text,time);
        snackbar.show();
        Button button = (Button) findViewById(R.id.mcq);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String message = "Creating quiz...";
                final int toastTime = Toast.LENGTH_LONG;
                final EditText editText = (EditText)(findViewById(R.id.mEdit));
                AlertDialog.Builder builder = new AlertDialog.Builder(MultipleChoiceQuiz.this);
                builder.setTitle("Quiz creator");
                builder.setMessage("Ready for creating quiz");
                builder.setIcon(R.mipmap.ic_movie);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(!editText.getText().toString().isEmpty()){
                            Toast toast = Toast.makeText(context,message,toastTime);
                            toast.show();
                        }
                        else{
                            Toast toast = Toast.makeText(context,"Please type your name!",toastTime);
                            toast.show();
                        }

                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }
}
