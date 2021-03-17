package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
        onButtonClick();
    }

    private void controlInitialization(){
        btnWelcome = findViewById(R.id.btnWelcome);
    }

    private void onButtonClick(){
        btnWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objIntent = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(objIntent);
            }
        });
    }
}