package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText idText = (EditText) findViewById(R.id.M_idText);
        EditText passworText = (EditText) findViewById(R.id.M_passwordText);
        TextView welcomeMessage = (TextView) findViewById(R.id.WelcomeMessage);

    }
}
