package com.example.mpsan.laboratorio1v2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button login_button = (Button)findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_email = ((EditText)findViewById(R.id.textEdit_email)).getText().toString();
                String user_password = ((EditText)findViewById(R.id.textEdit_password)).getText().toString();
                if (isEmailValid(user_email) & isPasswordValid(user_password) ) {
                    Toast.makeText(getApplicationContext(), "Has iniciado sesion", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getApplicationContext(), "Email o Constraseña Incorrectos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    private boolean isEmailValid(String email) {
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 4;
    }


}
