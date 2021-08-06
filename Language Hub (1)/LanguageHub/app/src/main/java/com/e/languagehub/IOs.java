package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IOs extends AppCompatActivity {
    Button btn_files,btn_Ios,btn_Byte,btn_os,btn_is,btn_cs,btn_Standardios,btn_Filenavigation;
    String[] urls = new String[8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_os);
        btn_files =(Button)findViewById(R.id.filesIo);
        btn_Ios =(Button)findViewById(R.id.IOStreams);
        btn_Byte =(Button)findViewById(R.id.ByteStream);
        btn_os =(Button)findViewById(R.id.outputStream);
        btn_is=(Button)findViewById(R.id.inputStream);
        btn_cs=(Button)findViewById(R.id.CharacterStream);
        btn_Standardios=(Button)findViewById(R.id.StandardIo);
        btn_Filenavigation=(Button)findViewById(R.id.fileNavigation);
        urls[0]="https://youtu.be/s1zzr89XlYA";//fio
        urls[1]="https://youtu.be/s1zzr89XlYA";//ios
        urls[2]="https://youtu.be/j6W7cnV7Vc0";//byte
        urls[3]="https://youtu.be/_le5GlfBxVY";//os
        urls[4]="https://youtu.be/_le5GlfBxVY";//is
        urls[5]="https://youtu.be/S8btCYVobM4";//cs
        urls[6]="https://youtu.be/Pau1zfJ-_1o";//sios
        urls[7]="https://youtu.be/coKufdNKEnY";//filen
        btn_files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_Ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_Byte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
        btn_os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });
        btn_is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[4]);
                startActivity(intent);
            }
        });
        btn_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[5]);
                startActivity(intent);
            }
        });
        btn_Standardios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[6]);
                startActivity(intent);
            }
        });
        btn_Filenavigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[7]);
                startActivity(intent);
            }
        });

    }
}
