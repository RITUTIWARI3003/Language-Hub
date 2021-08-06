package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Basics extends AppCompatActivity {
    Button btn_HelloWorld,btn_JVM;
    Button btn_DataTypes;
    Button btn_Literals;
    String[] urls = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics);
        btn_HelloWorld = (Button)findViewById(R.id.HelloWorld);
        btn_JVM = (Button)findViewById(R.id.JVm);
        btn_DataTypes=(Button)findViewById(R.id.DataTypes);
        btn_Literals=(Button)findViewById(R.id.Literals);
        urls[0] = "https://youtu.be/I2wvhRUVNTM";
        urls[1]= "https://youtu.be/BXFHuaQNnLo";
        urls[2] = "https://youtu.be/0MFC_Vw9NxY";
        urls[3]="https://youtu.be/lGDC7YUlQAc";
        btn_HelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_JVM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_DataTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
        btn_Literals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });


    }

}
