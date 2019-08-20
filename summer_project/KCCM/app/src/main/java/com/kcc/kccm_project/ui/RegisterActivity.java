package com.kcc.kccm_project.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.SetOptions;
import com.kcc.kccm_project.Entity.FirebaseID;

import com.kcc.kccm_project.Entity.UserInfo;
import com.kcc.kccm_project.R;

import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mEmail,mPassword,mName,mBirthday;
    private FirebaseAuth mAuth=FirebaseAuth.getInstance();
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        mEmail = findViewById(R.id.signup_idtext);
        mPassword=findViewById(R.id.signup_passwordtext);
        mName=findViewById(R.id.signup_nametext);
        mBirthday=findViewById(R.id.signup_birthdaytext);
        findViewById(R.id.signup_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //mAuth 중에 이메일,비밀번호 가입 메소드
        mAuth.createUserWithEmailAndPassword(mEmail.getText().toString(), mPassword.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            //user에 관련된 정보를 넣어줘야됨
                            if(user!=null) {
                                Map<String, Object> userMap = new HashMap<>();
                                userMap.put(FirebaseID.documentId, user.getUid());//uid
                                userMap.put(FirebaseID.email,mEmail.getText().toString());//email
                                userMap.put(FirebaseID.password,mPassword.getText().toString());
                                userMap.put(FirebaseID.name,mName.getText().toString());
                                userMap.put(FirebaseID.birthday,mBirthday.getText().toString());
                                db.collection("UserInfo").document(user.getUid()).set(userMap, SetOptions.merge());
                                //SetOptionmerge는 덮어쓰기
                                finish();
                                //회원가입 완료
                            }
                        } else {
                            Toast.makeText(RegisterActivity.this, "Sign up error",
                                    Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }

}

