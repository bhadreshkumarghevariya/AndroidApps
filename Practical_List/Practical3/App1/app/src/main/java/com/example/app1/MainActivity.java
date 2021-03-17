package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtStudentName;
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
        buttonClicks();
    }

    private void controlInitialization(){
        edtTxtStudentName = findViewById(R.id.edtTxtStudentName);
        btnEnter = findViewById(R.id.btnEnter);
    }

    private void buttonClicks()
    {
        btnEnter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),edtTxtStudentName.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });
    }
}