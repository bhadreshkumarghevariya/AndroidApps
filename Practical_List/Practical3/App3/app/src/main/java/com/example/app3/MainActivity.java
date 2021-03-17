package com.example.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rbGrpCourses;
    RadioButton rbBSCIT,rbMSCIT,rbINTMSCIT,rbBCA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        controlInitialization();
        onButtonClick();
    }

    private void controlInitialization()
    {
        rbGrpCourses = findViewById(R.id.rbGrpCourses);
        rbBCA = findViewById(R.id.rbBCA);
        rbMSCIT = findViewById(R.id.rbMSCIT);
        rbBSCIT = findViewById(R.id.rbBSCIT);
        rbINTMSCIT = findViewById(R.id.rbINTMSCIT);
    }

    private void onButtonClick()
    {
        rbGrpCourses.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rbBCA:
                        Toast.makeText(getApplicationContext(),"You selected "+rbBCA.getText().toString(),Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbBSCIT:
                        Toast.makeText(getApplicationContext(),"You selected "+rbBSCIT.getText().toString(),Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbMSCIT:
                        Toast.makeText(getApplicationContext(),"You selected "+rbMSCIT.getText().toString(),Toast.LENGTH_LONG).show();
                        break;
                    case R.id.rbINTMSCIT:
                        Toast.makeText(getApplicationContext(),"You selected "+rbINTMSCIT.getText().toString(),Toast.LENGTH_LONG).show();
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"Nothing Happen",Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}