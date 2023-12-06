package com.example.logowanie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextLogin;

    private String login = "login";

    private String haslo = "haslo";
    private EditText editTextPassword;
    private Button buttonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextLogin = findViewById(R.id.editTextLogin);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginn();
            }
        });
    }

    private void loginn() {
        String loginn = editTextLogin.getText().toString();
        String passwordd = editTextPassword.getText().toString();

        if (loginn.equals(login) && passwordd.equals(haslo)) {
            showToast("Login successful!");

        } else {
            showToast("Invalid login or password. Try again.");
        }
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}