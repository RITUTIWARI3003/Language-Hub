package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ContentPage extends AppCompatActivity  {

    Button btn_mod;
    Button btn_Overview, btn_Basics, btn_OOPconcept,btn_Operators, btn_ControlFlowStatement,  btn_InputsAndOutputs, btn_ArrayClassess, btn_Keywords, btn_ExceptionHandling, btn_InterfacesandAbstracts, btn_javaPackages, btn_Multithreading, btn_Extras;
String[] urls = new String[17];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_page);
        btn_Overview = (Button) findViewById(R.id.Overview);
        btn_Basics = (Button) findViewById(R.id.Basics);
        btn_OOPconcept = (Button) findViewById(R.id.oopConcept);
        btn_ControlFlowStatement= (Button) findViewById(R.id.Operator);
        btn_InputsAndOutputs = (Button) findViewById(R.id.ios);
        btn_ArrayClassess = (Button) findViewById(R.id.array);
        btn_Keywords = (Button) findViewById(R.id.keywords);
        btn_Operators = (Button) findViewById(R.id.operator);
        btn_mod=(Button)findViewById(R.id.modifiers);
//        btn_Constructors = (Button) findViewById(R.id.Constructors);
        btn_ExceptionHandling = (Button) findViewById(R.id.ExceptionHandling);
//        btn_GarbageColletion = (Button) findViewById(R.id.GarbageCollection);
       // btn_Inheritence = (Button) findViewById(R.id.Inheritence);
        btn_InterfacesandAbstracts = (Button) findViewById(R.id.InterfacAndAbstractClass);
        btn_javaPackages = (Button) findViewById(R.id.JavaPackages);
        btn_Multithreading = (Button) findViewById(R.id.Multithreading);
        btn_Extras = (Button) findViewById(R.id.SomeExtratopicsinjava);
//        urls[0] ="https://youtu.be/whM2vDyAlr8";
//        urls[1]="https://youtu.be/81piDKqPxjQ";
//        urls[2]="https://youtu.be/EKxJclTX8iM";
//        urls[3]="https://youtu.be/8CX4Tdttbqk";
//        urls[4]="https://youtu.be/8mwYr2I1zeM";
//        urls[5]="https://youtu.be/QfGVi89AV4c";
//        urls[6]="https://youtu.be/QfGVi89AV4c";
//        urls[7]="https://youtu.be/hhScibE9dJw";
//        urls[8]="https://youtu.be/1cWAcMdEXiQ";
//        urls[9]="https://youtu.be/Bh5qETmJgJM";
//        urls[10]="https://youtu.be/dT4jBkFA-MI";
//        urls[11]="https://youtu.be/CVjMPbXRrUc";
//        urls[12]="https://youtu.be/KOOzUclWhfY";
//        urls[13]="https://youtu.be/vkYJFrTrh5M";
//        urls[14]="https://youtu.be/PlDzyefyAmk";
//        urls[15]="https://youtu.be/Yk7BXaotJ24";
//        urls[16] ="https://youtu.be/9r1a8PzFXZA";


        btn_Overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent1 = new Intent(ContentPage.this,over.class);
                startActivity(categoryIntent1);
                finish();
            }


        });

        btn_Basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent1 = new Intent(ContentPage.this,Basics.class);
                startActivity(categoryIntent1);
                finish();
            }


        });

        btn_OOPconcept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,OOPConcept.class);
                startActivity(categoryIntent2);
                finish();
            }


        });
        btn_Operators.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,operator.class);
                startActivity(categoryIntent2);
                finish();
            }


        });


        btn_ControlFlowStatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,cfs.class);
                startActivity(categoryIntent2);
                finish();
            }


        });
//        btn_Strings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
//                intent.putExtra("Links",urls[4]);
//                startActivity(intent);
//
//            }
//        });

        btn_InputsAndOutputs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,IOs.class);
                startActivity(categoryIntent2);
                finish();
            }


        });
        btn_ArrayClassess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,array.class);
                startActivity(categoryIntent2);
                finish();
            }


        });
        btn_Keywords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,keywords.class);
                startActivity(categoryIntent2);
                finish();
            }


        });
              btn_mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,Modifiers.class);
                startActivity(categoryIntent2);
                finish();
          }

        });
////
//        btn_Constructors.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
//                intent.putExtra("Links",urls[9]);
//                startActivity(intent);
//
//            }
//        });
        btn_ExceptionHandling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,ExceptionHandling.class);
                startActivity(categoryIntent2);
                finish();
            }

        });
//        btn_GarbageColletion.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
//                intent.putExtra("Links",urls[11]);
//                startActivity(intent);
//
//            }
//        });
//        btn_Inheritence.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
//                intent.putExtra("Links",urls[12]);
//                startActivity(intent);
//
//            }
//        });
        btn_InterfacesandAbstracts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,InterfaceandAbstract.class);
                startActivity(categoryIntent2);
                finish();
            }      });
        btn_javaPackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,javaPackages.class);
                startActivity(categoryIntent2);
                finish();
            }      });
        btn_Multithreading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,MultiThreading.class);
                startActivity(categoryIntent2);
                finish();
            }      });
        btn_Extras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent2 = new Intent(ContentPage.this,extras.class);
                startActivity(categoryIntent2);
                finish();
            }      });}
}


