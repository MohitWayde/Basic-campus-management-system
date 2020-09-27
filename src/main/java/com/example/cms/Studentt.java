package com.example.cms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Studentt extends AppCompatActivity {
Button pro,gt,up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentt);

        pro=(Button)findViewById(R.id.button10);
        gt=(Button)findViewById(R.id.button11);
        up=(Button)findViewById(R.id.button15);

        pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(Studentt.this,Instudentt1.class);
                startActivity(f);
            }
        });

        gt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(Studentt.this,Instudentt2.class);
                startActivity(g);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h=new Intent(Studentt.this,Instudentt3.class);
                startActivity(h);
            }
        });



    }
}
