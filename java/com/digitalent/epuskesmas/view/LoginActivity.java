package com.digitalent.epuskesmas.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.digitalent.epuskesmas.R;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn_daftar = findViewById(R.id.btn_daftar);
        TextView tv_lupapassword = findViewById(R.id.tv_lupapassword);
        EditText et_email = findViewById(R.id.et_email);
        EditText et_password = findViewById(R.id.et_password);
        Button btn_masuk = findViewById(R.id.btn_masuk);



        btn_daftar.setOnClickListener(v -> {
            Intent regis = new Intent(getApplicationContext(),RegistrasiActivity.class);
            startActivity(regis);
            finish();
        });

        btn_masuk.setOnClickListener(v -> {
            Intent masuk = new Intent(getApplicationContext(), HomeActivity.class);
            startActivity(masuk);
            finish();
        });

        tv_lupapassword.setOnClickListener(v -> {
            Intent lupapass =new Intent(getApplicationContext(), LupaSandiActivity.class);
            startActivity(lupapass);
            finish();
        });


    }
}