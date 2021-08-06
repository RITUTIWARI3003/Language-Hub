package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class over extends AppCompatActivity {
    Button btn_Over,btn_Features,btn_EnSetup;
    String[] url = new String[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_over);
        btn_Over = (Button)findViewById(R.id.Over);
        btn_Features= (Button)findViewById(R.id.Features);
        btn_EnSetup = (Button)findViewById(R.id.EnSetup);
        url[0]="https://youtu.be/whM2vDyAlr8";
        url[1]="https://youtu.be/ifLqQsbXTuc";
        url[2]="https://youtu.be/bxIZ1GVWYkQ";
        btn_Over.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",url[0]);
                startActivity(intent);
            }
        });
        btn_Features.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",url[1]);
                startActivity(intent);
            }
        });
        btn_EnSetup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",url[2]);
                startActivity(intent);
            }
        });


    }
}
