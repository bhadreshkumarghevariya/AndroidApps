package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        controlInitialization();

        String sname = getIntent().getStringExtra("studentName");
        Toast.makeText(getApplicationContext(),sname,Toast.LENGTH_LONG).show();
        txtName.setText(sname);

    }

    private void controlInitialization() {
        txtName = findViewById(R.id.txtName);
    }
}