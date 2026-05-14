package com.example.miactividadwidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtNombre;
    Button btnMostrar;
    CheckBox chkAcepto;
    RadioButton rbAndroid, rbJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        edtNombre = findViewById(R.id.edtNombre);
        btnMostrar = findViewById(R.id.btnMostrar);
        chkAcepto = findViewById(R.id.chkAcepto);

        rbAndroid = findViewById(R.id.rbAndroid);
        rbJava = findViewById(R.id.rbJava);

        btnMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre = edtNombre.getText().toString();

                String curso = "";

                if(rbAndroid.isChecked()){
                    curso = "Java";
                }

                if(rbJava.isChecked()){
                    curso = "Python";
                }

                if(chkAcepto.isChecked()){

                    Toast.makeText(
                            MainActivity.this,
                            "Nombre: " + nombre + " Curso: " + curso,
                            Toast.LENGTH_LONG
                    ).show();

                }else{

                    Toast.makeText(
                            MainActivity.this,
                            "Debe aceptar términos",
                            Toast.LENGTH_LONG
                    ).show();
                }
            }
        });
    }
}

