package com.example.harshitha.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button LogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Email = (EditText) findViewById(R.id.editText4);
        Password = (EditText) findViewById(R.id.editText6);
        LogIn = (Button) findViewById(R.id.button2);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Email.getText().toString().equals("admin") &&
                        Password.getText().toString().equals("12345")) {
                    Toast.makeText(getApplicationContext(),
                            "Redirecting...", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong ", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}

