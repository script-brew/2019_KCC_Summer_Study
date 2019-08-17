package com.kcc.kccm_project.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.kcc.kccm_project.Entity.UserInfo;
import com.kcc.kccm_project.R;
import com.kcc.kccm_project.controller.SignController;

public class RegisterActivity extends AppCompatActivity {
    private SignController signController;
    private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        signController = new SignController();
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

            UserInfo userInfo =
                    new UserInfo(id, password, name, "software", birthday);

            String response = signController.signUp(userInfo);

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
