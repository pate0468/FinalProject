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

public class PatientIntakeForm extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_intake_form);
        String text = "Patient Information";
        int time = Snackbar.LENGTH_SHORT;
        final Context context = getApplicationContext();
        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinate),text,time);
        snackbar.show();
        Button button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String message = "Patient info submitted";
                final int toastTime = Toast.LENGTH_LONG;
                final EditText editText = (EditText)(findViewById(R.id.edit));
                AlertDialog.Builder builder = new AlertDialog.Builder(PatientIntakeForm.this);
                builder.setTitle("Patient");
                builder.setMessage("Submit imformation?");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(!editText.getText().toString().isEmpty()){
                            Toast toast = Toast.makeText(context,message,toastTime);
                            toast.show();
                        }
                        else{
                            Toast toast = Toast.makeText(context,"Please mention information!",toastTime);
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
