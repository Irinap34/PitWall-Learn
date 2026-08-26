package com.app.pitwalllearn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;

import android.content.Intent;

public class AprenderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprender);


    Button btnFundamentos = findViewById(R.id.btnFundamentos);

        btnFundamentos.setOnClickListener(v -> {
            Intent intent = new Intent(AprenderActivity.this, FundamentosActivity.class);
            startActivity(intent);
    });
} }