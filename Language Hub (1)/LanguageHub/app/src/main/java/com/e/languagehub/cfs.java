package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cfs extends AppCompatActivity {
    Button btn_if,btn_ifElse,btn_NestedIf,btn_Switch,btn_LoopControls,btn_While;
    Button btn_For,btn_DoWhile,btn_LoopControlStatement,btn_Break,btn_Continue;
    String[] urls = new String[11];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfs);
        btn_if = (Button)findViewById(R.id.If);
        btn_ifElse = (Button)findViewById(R.id.IfElse);
        btn_NestedIf = (Button)findViewById(R.id.NestedIf);
        btn_Switch = (Button)findViewById(R.id.Switch);
        btn_LoopControls = (Button)findViewById(R.id.Loop);
        btn_While = (Button)findViewById(R.id.While);
        btn_For = (Button)findViewById(R.id.For);
        btn_DoWhile = (Button)findViewById(R.id.DoWhileLoop);
        btn_LoopControlStatement = (Button)findViewById(R.id.LoopControlStatement);
        btn_Break= (Button)findViewById(R.id.bs);
        btn_Continue = (Button)findViewById(R.id.cs);
        urls[0] = "https://youtu.be/7qLGhGPth3I";//if
        urls[1] = "https://youtu.be/cM-SuD1Hr9o";//ifElse
        urls[2] = "https://youtu.be/xgJbuxvgdXY";//nestedif
        urls[3] = "https://youtu.be/ep4ontFhZ4k";//switch
        urls[4] = "https://youtu.be/OXrzHRx0MAY";//loopcontrols
        urls[5] ="https://youtu.be/i-h_RTwzIp4";//whileloop
        urls[6] = "https://youtu.be/4nbofvALfKQ";//forloop
        urls[7] = "https://youtu.be/20zlkN-iHMk";//dowhile
        urls[8] = "https://youtu.be/20zlkN-iHMk";//loopcontrol
        urls[9] = "https://youtu.be/6Bq0ttoCKeM";//break
        urls[10] = "https://youtu.be/JPjra12JrfY";//continue
        btn_if.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_ifElse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_NestedIf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
        btn_Switch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });
        btn_LoopControls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[4]);
                startActivity(intent);
            }
        });
        btn_While.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[5]);
                startActivity(intent);
            }
        });
        btn_For.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[6]);
                startActivity(intent);
            }
        });
        btn_DoWhile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[7]);
                startActivity(intent);
            }
        });
        btn_LoopControlStatement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[8]);
                startActivity(intent);
            }
        });
        btn_Break.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[9]);
                startActivity(intent);
            }
        });
        btn_Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[10]);
                startActivity(intent);
            }
        });
    }
}
