package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExceptionHandling extends AppCompatActivity {
    Button btn_Exception, btn_ExceptionHierarchy, btn_ExceptionMethods, btn_MultipleCatch, btn_Catching, btn_Finally;
    String[] urls=new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exception_handling);
        btn_Exception=(Button)findViewById(R.id.Exception);
        btn_ExceptionHierarchy=(Button)findViewById(R.id.ExceptionHierarchy);
        btn_ExceptionMethods=(Button)findViewById(R.id.ExceptionMethods);
        btn_MultipleCatch=(Button)findViewById(R.id.MultipleCatch);
        btn_Catching=(Button)findViewById(R.id.CatchingException);
        btn_Finally=(Button)findViewById(R.id.FinallyBlock);
        urls[0]="https://youtu.be/dT4jBkFA-MI";
        urls[1]="https://youtu.be/dT4jBkFA-MI";
        urls[2]="https://youtu.be/R_MLk9nt6Aw";
        urls[3]="https://youtu.be/R_MLk9nt6Aw";
        urls[4]="https://youtu.be/AZDitBkj7kA";
        urls[5]="https://youtu.be/8_-aKmOXOl0";
        btn_Exception.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_ExceptionHierarchy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_ExceptionMethods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
        btn_MultipleCatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });
        btn_Catching.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[4]);
                startActivity(intent);
            }
        });
        btn_Finally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[5]);
                startActivity(intent);
            }
        });
    }
}
