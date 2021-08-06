package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_C,btn_Cplus,btn_java,btn_python,btn_js,btn_kotlin;
    Button btn_Flutter,btn_DSA,btn_SQL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_C = (Button)findViewById(R.id.buttonC);
        btn_Cplus = (Button)findViewById(R.id.buttonCplus);
        btn_java = (Button)findViewById(R.id.buttonjava);
        btn_python = (Button)findViewById(R.id.buttonPython);
        btn_js = (Button)findViewById(R.id.buttonjs);
        btn_kotlin = (Button)findViewById(R.id.buttonkotlin);
        btn_Flutter =(Button)findViewById(R.id.buttonFlutter);
        btn_SQL =(Button)findViewById(R.id.buttonSQL);
        btn_DSA = (Button)findViewById(R.id.buttonDSA);
        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"C",Toast.LENGTH_SHORT).show();
            }
        });
        btn_Cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "C++", Toast.LENGTH_SHORT).show();
            }
        });
        btn_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent = new Intent(MainActivity.this,ContentPage.class);
                startActivity(categoryIntent);
                finish();
            }
        });

        btn_python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"PYTHON",Toast.LENGTH_SHORT).show();}});
        btn_js.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"JAVASCRIPT",Toast.LENGTH_SHORT).show();}});
        btn_kotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"KOTLIN",Toast.LENGTH_SHORT).show();}});
        btn_Flutter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"FLUTTER",Toast.LENGTH_SHORT).show();
            }
        });
        btn_SQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"SQL",Toast.LENGTH_SHORT).show();
            }
        });
        btn_DSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"DSA",Toast.LENGTH_SHORT).show();
            }
        });}




}


