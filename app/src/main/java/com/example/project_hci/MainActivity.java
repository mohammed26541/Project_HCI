package com.example.project_hci;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button a_button,b_button,c_button,d_button,f_button,g_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a_button = findViewById(R.id.button2);
        b_button = findViewById(R.id.button4);
        c_button = findViewById(R.id.button5);
        d_button = findViewById(R.id.button6);
        f_button = findViewById(R.id.button8);
        g_button = findViewById(R.id.button7);
        a_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mAlertDialog = new AlertDialog.Builder(MainActivity.this);
                mAlertDialog.setIcon(R.drawable.baseline_check_circle_outline_24);
                mAlertDialog.setTitle("The price is espresso = 20EGP");
                mAlertDialog.setMessage("Do you want to complete the ordering process?");
                mAlertDialog.setCancelable(false);
                
                mAlertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "I hope you liked our service", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.show();
            }
        });
        b_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mAlertDialog = new AlertDialog.Builder(MainActivity.this);
                mAlertDialog.setIcon(R.drawable.baseline_check_circle_outline_24);
                mAlertDialog.setTitle("The price is Orange Juice = 15EGP");
                mAlertDialog.setMessage("Do you want to complete the ordering process?");
                mAlertDialog.setCancelable(false);

                mAlertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "I hope you liked our service", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.show();
            }
        });
        c_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mAlertDialog = new AlertDialog.Builder(MainActivity.this);
                mAlertDialog.setIcon(R.drawable.baseline_check_circle_outline_24);
                mAlertDialog.setTitle("The price is Cappuccino = 30EGP");
                mAlertDialog.setMessage("Do you want to complete the ordering process?");
                mAlertDialog.setCancelable(false);

                mAlertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "I hope you liked our service", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.show();
            }
        });
        d_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mAlertDialog = new AlertDialog.Builder(MainActivity.this);
                mAlertDialog.setIcon(R.drawable.baseline_check_circle_outline_24);
                mAlertDialog.setTitle("The price is Black Coffee = 30EGP");
                mAlertDialog.setMessage("Do you want to complete the ordering process?");
                mAlertDialog.setCancelable(false);

                mAlertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "I hope you liked our service", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.show();
            }
        });
        f_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mAlertDialog = new AlertDialog.Builder(MainActivity.this);
                mAlertDialog.setIcon(R.drawable.baseline_check_circle_outline_24);
                mAlertDialog.setTitle("The price is Mango Juice = 30EGP");
                mAlertDialog.setMessage("Do you want to complete the ordering process?");
                mAlertDialog.setCancelable(false);

                mAlertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "I hope you liked our service", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.show();
            }
        });
        g_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mAlertDialog = new AlertDialog.Builder(MainActivity.this);
                mAlertDialog.setIcon(R.drawable.baseline_check_circle_outline_24);
                mAlertDialog.setTitle("The price is Tea😎 = 10EGP");
                mAlertDialog.setMessage("Do you want to complete the ordering process?");
                mAlertDialog.setCancelable(false);

                mAlertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(MainActivity.this, "I hope you liked our service", Toast.LENGTH_SHORT).show();
                    }
                });
                mAlertDialog.show();
            }
        });

    }
}