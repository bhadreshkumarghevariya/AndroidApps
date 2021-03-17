package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTxtName,edtTxtEmail,edtTxtBirthDate,edtTxtPassword,edtTxtAddress,edtTxtWebsite;
    TextView txtShowData;
    Button btnStoreData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
    }

    private void controlInitialization()
    {
        edtTxtName = findViewById(R.id.edtTxtName);
        edtTxtEmail = findViewById(R.id.edtTxtEmail);
        edtTxtBirthDate = findViewById(R.id.edtTxtBirthDate);
        edtTxtPassword  = findViewById(R.id.edtTxtPassword);
        edtTxtAddress = findViewById(R.id.edtTxtAddress);
        edtTxtWebsite = findViewById(R.id.edtTxtWebsite);
        txtShowData = findViewById(R.id.txtShowData);
        btnStoreData = findViewById(R.id.btnStoreData);
    }

    public void storeData(View view)
    {
        String data = "Name :"+edtTxtName.getText().toString() +"\n Email Address :"+edtTxtEmail.getText().toString()+"\n Birth Date :"+edtTxtBirthDate.getText().toString()+"\n Password :"+edtTxtPassword.getText().toString()+"\n Address :"+edtTxtAddress.getText().toString()+"\n WebSite :"+edtTxtWebsite.getText().toString();
        txtShowData.setText(data);
        Toast t1 = Toast.makeText(getApplicationContext(),data,Toast.LENGTH_LONG);
        t1.show();

    }
}