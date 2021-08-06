package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class extras extends AppCompatActivity {
    Button btn_finalize,btn_Generic,btn_collection,btn_ArrayList,btn_hash,btn_Networking;
    String[] urls = new String[6] ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);
        btn_finalize=(Button)findViewById(R.id.FinalizeMethod);
        btn_Generic=(Button)findViewById(R.id.GenericMethods);
        btn_collection=(Button)findViewById(R.id.CollectionFrameworks);
        btn_ArrayList=(Button)findViewById(R.id.ClassArrayList);
        btn_hash=(Button)findViewById(R.id.HashSet);
        btn_Networking=(Button)findViewById(R.id.Networking);
        urls[0]="https://youtu.be/frOMAW-Ynvg";
        urls[1]="https://youtu.be/22AUtQnTZkY";
        urls[2]="https://youtu.be/Nk6HwCfDaS8";
        urls[3]="https://youtu.be/bUJshjrME28";
        urls[4]="https://youtu.be/LdKsP7YpIxU";
        urls[5]="https://youtu.be/5Lm6nB3IsF8";
        btn_finalize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_Generic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[2]);
                startActivity(intent);
            }
        });
        btn_ArrayList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });
        btn_hash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[4]);
                startActivity(intent);
            }
        });
        btn_Networking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[5]);
                startActivity(intent);
            }
        });












    }
}
