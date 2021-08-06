package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class javaPackages extends AppCompatActivity {
    Button btn_pacakges,btn_DirectoryStructurePackages;
    String[] urls = new String[2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_packages);
        urls[0] ="https://youtu.be/PlDzyefyAmk";
        urls[1]="https://youtu.be/XplNh_w3oyY";
        btn_pacakges =(Button)findViewById(R.id.Packages);
        btn_DirectoryStructurePackages=(Button)findViewById(R.id.Directory);
        btn_pacakges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_DirectoryStructurePackages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
    }
}
