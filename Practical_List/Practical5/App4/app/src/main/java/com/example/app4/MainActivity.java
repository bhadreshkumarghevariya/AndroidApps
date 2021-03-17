package com.example.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtMessage,edtTxtMobileNumber;
    Button btnSend;
    TextView txtErr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
        buttonClick();
    }

    private void controlInitialization(){
        edtTxtMobileNumber = findViewById(R.id.edtTxtMobileNumber);
        edtTxtMessage = findViewById(R.id.edtTxtMessage);
        txtErr = findViewById(R.id.txtErr);
        btnSend = findViewById(R.id.btnSend);
    }

    private void buttonClick(){
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobileNumber = edtTxtMobileNumber.getText().toString();
//                Toast.makeText(getApplicationContext(),mobileNumber,Toast.LENGTH_SHORT).show();
                String message = edtTxtMessage.getText().toString();
//                Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("smsto:"+mobileNumber));
                intent.putExtra("sms_body",message);
                startActivity(intent);
            }
        });
    }
}