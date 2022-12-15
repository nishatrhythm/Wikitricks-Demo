package com.example.wikitricks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterButtonClick (View view) {
        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        TextView textFirstName = findViewById(R.id.textFirstName);
        TextView textLastName = findViewById(R.id.textLastName);
        TextView textEmail = findViewById(R.id.textEmail);

        textFirstName.setText("First Name: " + editTextFirstName.getText().toString());
        textLastName.setText("Last Name: " + editTextLastName.getText().toString());
        textEmail.setText("Email: " + editTextEmail.getText().toString());
    }
}