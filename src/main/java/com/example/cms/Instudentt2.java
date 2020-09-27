package com.example.cms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Instudentt2 extends AppCompatActivity {

    Button sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instudentt2);
        sub=(Button)findViewById(R.id.button14);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Instudentt2.this , "Record save successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
