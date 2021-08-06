package com.e.languagehub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class operator extends AppCompatActivity {
    Button btn_Basics, btn_Arithmetic, btn_Relational, btn_Bitwise,btn_Logical, btn_Assignment, btn_Ternary, btn_misc, btn_Condition, btn_Instance, btn_Precedence;
String[] urls = new String[11];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operator);
        btn_Basics=(Button)findViewById(R.id.Basicop);
        btn_Arithmetic=(Button)findViewById(R.id.Arithmeticop);
        btn_Relational=(Button)findViewById(R.id.Relationalop);
        btn_Bitwise=(Button)findViewById(R.id.Bitwiseop);
        btn_Logical=(Button)findViewById(R.id.Logicalop);
        btn_Assignment=(Button)findViewById(R.id.Arithmeticop);
        btn_Ternary=(Button)findViewById(R.id.Ternaryop);
        btn_misc=(Button)findViewById(R.id.Miscop);
        btn_Condition=(Button)findViewById(R.id.Conditionalop);
        btn_Instance=(Button)findViewById(R.id.Instanceop);
        btn_Precedence=(Button)findViewById(R.id.Precedenceop);

        urls[0]="https://youtu.be/8CX4Tdttbqk";//basics
        urls[1]="https://youtu.be/2a164xxWSUo";//arith
        urls[2]="https://youtu.be/j09cDN_dDkI";//relational
        urls[3]="https://youtu.be/qn8uPZLr0hA";//bit
        urls[4]="https://youtu.be/ncSTI702FW4";//logical
        urls[5]="https://youtu.be/9oTCym4O618";//assignment
        urls[6]="https://youtu.be/HgpMOSvIkxg";//ternary
        urls[7]="https://youtu.be/NzeodpLrKow";//misc
        urls[8]="https://youtu.be/EJaAlc_qVdQ";//condition
        urls[9]="https://youtu.be/JPn8vYbSiZk";//Instance
        urls[10]="https://youtu.be/lNb3-8eyv0o";//pre
        btn_Basics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[0]);
                startActivity(intent);
            }
        });
        btn_Arithmetic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[1]);
                startActivity(intent);
            }
        });
        btn_Relational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[3]);
                startActivity(intent);
            }
        });
        btn_Bitwise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[4]);
                startActivity(intent);
            }
        });
        btn_Logical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[5]);
                startActivity(intent);
            }
        });
        btn_Assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[6]);
                startActivity(intent);
            }
        });
        btn_Ternary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[7]);
                startActivity(intent);
            }
        });
        btn_misc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[8]);
                startActivity(intent);
            }
        });
        btn_Instance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[9]);
                startActivity(intent);
            }
        });
        btn_Precedence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),YoutubePage1.class);
                intent.putExtra("Links",urls[10]);
                startActivity(intent);
            }
        });








    }
}
