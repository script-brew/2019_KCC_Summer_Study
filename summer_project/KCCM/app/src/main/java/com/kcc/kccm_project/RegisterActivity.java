package com.kcc.kccm_project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.kcc.kccm_project.logic.SignLogic;
import com.kcc.kccm_project.service.SignService;

public class RegisterActivity extends AppCompatActivity {
    private SignService signService;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signService = new SignLogic();
        builder = new AlertDialog.Builder(this);
        EditText idText = (EditText) findViewById(R.id.R_idtext);
        EditText passworText = (EditText) findViewById(R.id.R_passwordtext);
        EditText nameText = (EditText) findViewById(R.id.R_nametext);
        EditText ageText = (EditText) findViewById(R.id.R_agetext);
        Button registerButton =(Button) findViewById(R.id.registerbutton);

        registerButton.setOnClickListener((v) -> {
            String id = idText.getText().toString();
            String password = passworText.getText().toString();
            String name = nameText.getText().toString();
            String birthday = ageText.getText().toString();

            String response = signService.signUp(id, password, name, birthday);

            if(response.equals("OK")) {
                builder.setTitle("Success")
                        .setMessage("Success to sign up!")
                        .create()
                        .show();
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
            } else {
                builder.setTitle("Fail")
                        .setMessage("Fail to sign up!")
                        .create()
                        .show();
            }
        });


    }


}
