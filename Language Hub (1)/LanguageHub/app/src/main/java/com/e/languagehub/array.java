package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class array extends AppCompatActivity {
    Button btn_Array,btn_ArrayMethodArg,btn_ArraysasReturnValue;
    String[] urls = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        btn_Array = (Button)findViewById(R.id.Arrays);
        btn_ArrayMethodArg=(Button)findViewById(R.id.MA);
        btn_ArraysasReturnValue=(Button)findViewById(R.id.rv);
        urls[0]="https://youtu.be/hhScibE9dJw";
        urls[1]="https://youtu.be/t90WLRTS3hI";
        urls[2]="https://youtu.be/IlQYpv6Ze90";
        btn_Array.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_ArrayMethodArg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_ArraysasReturnValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
    }
}
