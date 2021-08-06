package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Modifiers extends AppCompatActivity {
    Button btn_modTypes,btn_ACM,btn_NAM,btn_StaticMod,btn_FinalMod,btn_AbstractMod;
    String[] urls = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modifiers);
        btn_modTypes=(Button)findViewById(R.id.ModifierTypes);
        btn_ACM=(Button)findViewById(R.id.AccessMod);
        btn_NAM=(Button)findViewById(R.id.NonAccess);
        btn_StaticMod=(Button)findViewById(R.id.StaticMod);
        btn_FinalMod=(Button)findViewById(R.id.Finalmod);
        btn_AbstractMod=(Button)findViewById(R.id.AbstractMod);
        urls[0]="https://youtu.be/A9twidM8ZXQ";
        urls[1]="https://youtu.be/EL9fRXCtIso";//acm
        urls[2]="https://youtu.be/7rhTArJLATY";//ncm
        urls[3]="https://youtu.be/7rhTArJLATY";//sm
        urls[4]="https://youtu.be/0JyfM9F8Fv0";//fm
        urls[5]="https://youtu.be/0JyfM9F8Fv0";//am
        btn_modTypes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_ACM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_NAM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
        btn_StaticMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });
        btn_FinalMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[4]);
                startActivity(intent);
            }
        });
        btn_AbstractMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[5]);
                startActivity(intent);
            }
        });
    }
}
