package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class keywords extends AppCompatActivity {
    Button btn_this,btn_super,btn_void,btn_return;
    String[] urls = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keywords);
        urls[0] = "https://youtu.be/xS3aT_AKpFk";
        urls[1]="https://youtu.be/yw1cyiamP0g";
        urls[2]="https://youtu.be/ybtJE9IHLak";
        urls[3]="https://youtu.be/8_wb4atAMDQ";
        btn_this =(Button)findViewById(R.id.This);
        btn_super =(Button)findViewById(R.id.SUper);
        btn_void =(Button)findViewById(R.id.Void);
        btn_return=(Button)findViewById(R.id.Return);
        btn_this.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_super.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_void.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });

    }
}
