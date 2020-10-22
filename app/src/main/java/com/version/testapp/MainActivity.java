package com.version.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        text = findViewById(R.id.text1);
        setContentView(R.layout.activity_main);

        text.setText("The real Hello World!");
    }
}