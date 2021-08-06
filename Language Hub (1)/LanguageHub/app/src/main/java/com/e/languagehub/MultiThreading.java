package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MultiThreading extends AppCompatActivity {
    Button btn_multithreading;
    String[] url = new String[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_threading);
        btn_multithreading = (Button)findViewById(R.id.Multi);
        url[0]="https://youtu.be/Yk7BXaotJ24";
        btn_multithreading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",url[0]);
                startActivity(intent);
            }
        });
    }
}
