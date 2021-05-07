package com.example.programmingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.login);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("gbs_user") && password.getText().toString().equals("123456")) {
                    Intent in = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(in);
                } else {
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder( MainActivity.this);
                    alertDialogBuilder.setMessage("Invalid Credentials");
                    alertDialogBuilder.setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface arg0, int arg1) {
                                    Toast.makeText(MainActivity.this,"Enter Valid Username and Password", Toast.LENGTH_LONG).show();
                                }
                            });

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
            }
        });
    }
}

//                    AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(MainActivity.this);
//
//                    dlgAlert.setMessage("Invalid Credentials");
//                    dlgAlert.setTitle("Error Message...");
//                    dlgAlert.setPositiveButton("OK", null);
//                    dlgAlert.setCancelable(true);
//                    dlgAlert.create().show();
//
//                    dlgAlert.setPositiveButton("Ok",
//                            new DialogInterface.OnClickListener() {
//                                public void onClick(DialogInterface dialog, int which) {
//
//                                }
//                            });



