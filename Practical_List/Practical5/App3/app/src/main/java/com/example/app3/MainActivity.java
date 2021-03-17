package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText edtTxtMobileNumber;
    Button btnCall;
    TextView txtErr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
        onButtonClick();
    }

    private void controlInitialization(){
        edtTxtMobileNumber=findViewById(R.id.edtTxtMobileNumber);
        btnCall=findViewById(R.id.btnCall);
        txtErr = findViewById(R.id.txtErr);
    }

    private void onButtonClick(){
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNum = edtTxtMobileNumber.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + phoneNum));
                if(phoneNum.length() !=10)
                {
                    txtErr.setText("Please Enter correct Mobile Number");
                }
                else {
                    startActivity(intent);
                }
            }
        });
    }
}