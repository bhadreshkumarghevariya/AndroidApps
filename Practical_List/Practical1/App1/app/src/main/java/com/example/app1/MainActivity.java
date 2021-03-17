package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtUniAddress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
        //String address= getString(R.string.txtUniversityAddress);
        //txtUniAddress.setText(address);
    }
    private void controlInitialization()
    {
        txtUniAddress = findViewById(R.id.txtUniAddress);
    }
}