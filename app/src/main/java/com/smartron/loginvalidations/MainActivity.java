package com.smartron.loginvalidations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText emailEt, passwordEt;
    Button submitBtn;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEt = findViewById(R.id.emailEt);
        passwordEt = findViewById(R.id.passwordEt);
        submitBtn = findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isValidEmail(emailEt);
                isValidPassword(passwordEt);
           //     Toast.makeText(getApplicationContext(),"Submitted Successfully",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void isValidEmail(EditText emailEt){
        if(null != emailEt){
            Toast.makeText(this,"please enter valid emailId",Toast.LENGTH_SHORT).show();
        }
        else if(emailEt.length()<6){
            Toast.makeText(this,"please enter minimun 6 characters emailId",Toast.LENGTH_SHORT).show();
        }
        else if(emailPattern.matches(String.valueOf(emailEt))){
            Toast.makeText(getApplicationContext(),"please enter domain specified emailId",Toast.LENGTH_SHORT).show();
        }
    }

    public  void isValidPassword(EditText passwordEt) {
        if (null == passwordEt) {
            Toast.makeText(getApplicationContext(), "please enter valid emailId", Toast.LENGTH_SHORT).show();
        } else if (passwordEt.length() < 6) {
            Toast.makeText(getApplicationContext(), "please enter minimun 6 characters emailId", Toast.LENGTH_SHORT).show();
        }
    }

}
