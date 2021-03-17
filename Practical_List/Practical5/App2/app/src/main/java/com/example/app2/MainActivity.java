package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
//        Toast.makeText(getApplicationContext(),"Button click method",Toast.LENGTH_LONG).show();
    }

    private void buttonClicks()
    {
//        Toast.makeText(getApplicationContext(),"Button click method",Toast.LENGTH_LONG).show();
        btnEnter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String name = edtTxtStudentName.getText().toString();
//                Toast.makeText(getApplicationContext(),edtTxtStudentName.getText().toString(),Toast.LENGTH_LONG).show();
                Intent objIntent = new Intent(getApplicationContext(),MainActivity2.class);
                objIntent.putExtra("studentName",name);
                startActivity(objIntent);
            }
        });
    }
}