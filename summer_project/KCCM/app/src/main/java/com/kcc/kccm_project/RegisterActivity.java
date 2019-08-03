package com.kcc.kccm_project;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        EditText idText = (EditText) findViewById(R.id.R_idtext);
        EditText passworText = (EditText) findViewById(R.id.R_passwordtext);
        EditText nameText = (EditText) findViewById(R.id.R_nametext);
        EditText ageText = (EditText) findViewById(R.id.R_agetext);
        Button registerButton =(Button) findViewById(R.id.registerbutton);

    }
}
