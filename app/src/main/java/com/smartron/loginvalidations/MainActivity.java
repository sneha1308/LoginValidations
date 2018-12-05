package com.smartron.loginvalidations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
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
                if (isValid(emailEt, passwordEt)) {
                    Toast.makeText(MainActivity.this, "Submitted Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public boolean isValid(EditText emailEt, EditText passwordEt) {
        if (emailEt.getText().toString().matches("")) {
            Toast.makeText(this, "please enter emailId", Toast.LENGTH_SHORT).show();
        } else if (emailEt.length() < 6) {
            Toast.makeText(this, "please enter minimum 6 characters emailId", Toast.LENGTH_SHORT).show();
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailEt.getText().toString()).matches()) {
            Toast.makeText(getApplicationContext(), "please enter domain specified emailId", Toast.LENGTH_SHORT).show();
        } else if (passwordEt.getText().toString().matches("")) {
            Toast.makeText(getApplicationContext(), "please enter valid password", Toast.LENGTH_SHORT).show();
        } else if (passwordEt.length() < 6) {
            Toast.makeText(getApplicationContext(), "please enter minimum 6 characters password", Toast.LENGTH_SHORT).show();
        } else {
            return true;
        }
        return false;
    }
}
