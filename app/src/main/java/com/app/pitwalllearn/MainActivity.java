package com.app.pitwalllearn;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnComenzar = findViewById(R.id.btnComenzar);

        btnComenzar.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, AprenderActivity.class);
        startActivity(intent);

        });
    }
}