package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chIphone,chAndroid,chWindows;
    Button btnShowSelected;
    String msg="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
        onButtonClick();
    }

    private void controlInitialization(){
        btnShowSelected = findViewById(R.id.btnShowSelected);
        chIphone = findViewById(R.id.chIphone);
        chAndroid = findViewById(R.id.chAndroid);
        chWindows = findViewById(R.id.chWindows);
    }

    private void onButtonClick(){
        btnShowSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chIphone.isChecked()){
                    msg=msg+chIphone.getText().toString() + " ";
                }
                if (chAndroid.isChecked()) {
                    msg=msg+chAndroid.getText().toString()+ " ";
                }
                if (chWindows.isChecked()){
                    msg=msg+chWindows.getText().toString()+ " ";
                }

                if(msg == "")
                {
                    Toast.makeText(getApplicationContext(),"Nothing is selected.", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), msg + " are selected.", Toast.LENGTH_LONG).show();
                }
                msg="";
            }
        });
    }
}