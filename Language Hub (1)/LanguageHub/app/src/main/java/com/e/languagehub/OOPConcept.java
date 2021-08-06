package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OOPConcept extends AppCompatActivity {
    Button btn_String,btn_ObjectsAndClasses,btn_Constructors,btn_Methods,btn_Inheritence,btn_Encapsulation,btn_MethodOverriding,btn_Polymorphism;
String urls[]=new String[8];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_o_p_concept);
        btn_ObjectsAndClasses = (Button)findViewById(R.id.ObjectsAndClasses);
        btn_Constructors = (Button)findViewById(R.id.constructorss);
        btn_Methods = (Button)findViewById(R.id.Methods);
        btn_Inheritence = (Button)findViewById(R.id.Inheriitence);
        btn_Encapsulation = (Button)findViewById(R.id.Encapsulation);
        btn_MethodOverriding = (Button)findViewById(R.id.MethodOveriiding);
        btn_Polymorphism =(Button)findViewById(R.id.Polymorphism);
        btn_String=(Button)findViewById(R.id.string);
        urls[0]="https://youtu.be/cXj1hHdMNk4";
        urls[1]="https://youtu.be/XQ5NRKg8lXI";
        urls[3]="https://youtu.be/1cWAcMdEXiQ";
        urls[4]="https://youtu.be/nixQyPIAnOQ";
        urls[5]="https://youtu.be/fw1r3uIWoAA";
        urls[6]="https://youtu.be/jg4MpYr1TBc";
        urls[2]="https://youtu.be/QFl9HhrpRFA";
        urls[8]="https://youtu.be/8mwYr2I1zeM";
        btn_ObjectsAndClasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_Constructors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_Methods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });
        btn_Inheritence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[4]);
                startActivity(intent);
            }
        });
        btn_MethodOverriding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[5]);
                startActivity(intent);
            }
        });
        btn_Polymorphism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[6]);
                startActivity(intent);
            }
        });
        btn_Encapsulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
        btn_String.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[8]);
                startActivity(intent);
            }
        });





    }
}
