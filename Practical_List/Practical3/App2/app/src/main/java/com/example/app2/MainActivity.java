package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtTxtNum1,edtTxtNum2;
    Button btnPlus,btnMinus,btnMultiplication,btnDivide;
    TextView txtAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
        buttonClicks();
    }

    private void controlInitialization()
    {
        edtTxtNum1 = findViewById(R.id.edtTxtNum1);
        edtTxtNum2 = findViewById(R.id.edtTxtNum2);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btnDivide = findViewById(R.id.btnDivide);
        txtAnswer = findViewById(R.id.txtAnswer);
    }

    private String  performOperation(float num1,float num2,char opr)
    {
        String ans;
        switch (opr)
        {
            case '+':
//                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_LONG).show();
                ans = Float.toString(num1 + num2);
                break;
            case '-':
                ans = Float.toString(num1 - num2);
                break;
            case '*':
                ans = Float.toString(num1 * num2);
                break;
            case '/':
                if(num2 == 0)
                {
                    ans = "Number 2 is 0 so division is not possible.";
                }
                else {
                    ans = Float.toString(num1 / num2);
                }
                break;
            default:
                ans = "No operations performed";;
        }
        return ans;
    }

    private void buttonClicks(){
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2;
                n1 = Float.parseFloat(edtTxtNum1.getText().toString());
                n2 = Float.parseFloat(edtTxtNum2.getText().toString());
                txtAnswer.setText(performOperation(n1,n2,'+'));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2;
                n1 = Float.parseFloat(edtTxtNum1.getText().toString());
                n2 = Float.parseFloat(edtTxtNum2.getText().toString());
                txtAnswer.setText(performOperation(n1,n2,'-'));
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2;
                n1 = Float.parseFloat(edtTxtNum1.getText().toString());
                n2 = Float.parseFloat(edtTxtNum2.getText().toString());
                txtAnswer.setText(performOperation(n1,n2,'*'));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float n1,n2;
                n1 = Float.parseFloat(edtTxtNum1.getText().toString());
                n2 = Float.parseFloat(edtTxtNum2.getText().toString());
                txtAnswer.setText(performOperation(n1,n2,'/'));
            }
        });
    }
}