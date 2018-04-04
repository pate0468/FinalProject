package com.example.parin.finalproject;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class OCTranspoBusRouteApp extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octranspo_bus_route_app);
       final Context context = getApplicationContext();
       final CharSequence text = "Successfully entered route number";
        Button button = (Button) (findViewById(R.id.button5));

        final int time = Toast.LENGTH_SHORT;
        int snackTime = Snackbar.LENGTH_LONG;
        String message = "Welcome to OCTranspo";

        Snackbar snackbar = Snackbar.make(findViewById(R.id.coordinateLayout),message,snackTime);
        snackbar.show();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View customView = getLayoutInflater().inflate(R.layout.custom_dialog, null);
                AlertDialog.Builder builder = new AlertDialog.Builder(OCTranspoBusRouteApp.this);
                builder.setView(customView);
                builder.setTitle("Bus Information");
                builder.setIcon(R.mipmap.ic_notification);
                final EditText editText = (EditText)customView.findViewById(R.id.edit);

                builder.setPositiveButton((R.string.success), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                     if(!editText.getText().toString().isEmpty()) {
                         Toast toast = Toast.makeText(context, text, time);
                         toast.show();
                     }
                     else{
                            Toast toast1 = Toast.makeText(context,"Please enter route number",time);
                            toast1.show();
                        }
                    }
                });
                builder.setNegativeButton((R.string.error), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       // dialog.dismiss();
                    }

                });
                final AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

 }




}
