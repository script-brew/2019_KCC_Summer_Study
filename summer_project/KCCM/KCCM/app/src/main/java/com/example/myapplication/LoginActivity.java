package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText idText = (EditText) findViewById(R.id.idText);
        final EditText passworText = (EditText) findViewById(R.id.passwordText);
        Button loginButton =(Button) findViewById(R.id.LoginText);
        TextView registerButton = (TextView) findViewById(R.id.registerText);

        //Login 값 넘겨주기

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {                      //클릭을 받아들이는 리스너
                String email = idText.getText().toString(); //email이게 때문에 string으로 반환받아야함
                String password = passworText.getText().toString();
                Intent intent = new Intent(LoginActivity.this,LoginResultActivity.class);  //값 넘길때 쓰는 메소드
                intent.putExtra("email",email);
                intent.putExtra("password",password);
                startActivity(intent); //intent를 넘겨줌
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registerIntent = new Intent(LoginActivity.this,RegisterActivity.class);
                LoginActivity.this.startActivity(registerIntent);
            }
        });
    }
}
