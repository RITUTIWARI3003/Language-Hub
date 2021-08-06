package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.FileObserver;
import android.view.View;
import android.widget.Button;

public class InterfaceandAbstract extends AppCompatActivity {
    Button btn_InnerClasses,btn_Interfaces,btn_Abstract;
    String[] urls = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interfaceand_abstract);
        btn_InnerClasses=(Button)findViewById(R.id.InnerClasses);
        btn_Interfaces=(Button)findViewById(R.id.Interface);
        btn_Abstract=(Button)findViewById(R.id.Abstract);
        urls[0] = "https://youtu.be/h5iX4i-BcRw";
        urls[1]="https://youtu.be/BeCDc2x1E24";
        urls[2]="https://youtu.be/vkYJFrTrh5M";
        btn_InnerClasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_Interfaces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_Abstract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });


    }
}
