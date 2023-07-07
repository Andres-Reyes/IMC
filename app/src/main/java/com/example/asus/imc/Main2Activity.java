package com.example.asus.imc;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
Button mensaje, hola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mensaje=(Button)findViewById(R.id.button);
        hola=(Button)findViewById(R.id.button2);
        mensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta=new AlertDialog.Builder(Main2Activity.this);
                alerta.setMessage("Dependiendo tu clasificacion de peso dale en el boton  ")
                    .setCancelable(false)

                    .setPositiveButton("BAJO", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                            startActivity(intent);
                        }
                    })

                        .setNegativeButton("fin", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();

                            }
                        });

                      AlertDialog titulo=alerta.create();
                      titulo.setTitle("TIPS DE ALIMENTACION Y ACTIVIDAD FISICA");
                      titulo.show();
            }
        });
        hola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta=new AlertDialog.Builder(Main2Activity.this);
                alerta.setMessage("Dependiendo tu clasificacion   ")
                        .setCancelable(false)

                        .setPositiveButton("BAJO", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent=new Intent(Main2Activity.this,MainActivity.class);
                                startActivity(intent);
                            }
                        })

                        .setNegativeButton("fin", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog titulo=alerta.create();
                titulo.setTitle("TIPS DE ALIMENTACION Y ACTIVIDAD FISICA");
                titulo.show();
            }
        });
    }
}
