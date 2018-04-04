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
import android.widget.ProgressBar;
import android.widget.Toast;

public class MovieInformation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_information);
        String text = "Movie information";
        int time = Snackbar.LENGTH_SHORT;
        final int toastTime = Toast.LENGTH_LONG;
        final String message = "Movie selected";
        final Context context = getApplicationContext();
        final String errorMessage = "Please type anything!";
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinateLayout1),text,time);
        snackbar.show();

        Button button = (Button) findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText editText = (EditText)(findViewById(R.id.edit));
                AlertDialog.Builder builder = new AlertDialog.Builder(MovieInformation.this);
                builder.setTitle("Confirmation");
                builder.setMessage("Are you sure?");
                builder.setIcon(R.mipmap.ic_movie);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(!editText.getText().toString().isEmpty()){
                            Toast toast = Toast.makeText(context,message,toastTime);
                            toast.show();
                        }
                        else{
                            Toast toast1 = Toast.makeText(context,errorMessage,toastTime);
                            toast1.show();
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
