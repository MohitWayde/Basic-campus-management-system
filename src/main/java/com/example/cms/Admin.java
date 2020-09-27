package com.example.cms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin extends AppCompatActivity {
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        e1=findViewById(R.id.editText5);
        b1=findViewById(R.id.button8);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                validate(e1.getText().toString());

            }

        });



    }
    public void validate(String un)
    {
        if(un.equals("2000"))
        {
            Intent d = new Intent(Admin.this, Inadmin1.class);
            startActivity(d);
        }
        else
        {
            Toast.makeText(Admin.this, " invalid credentials", Toast.LENGTH_SHORT).show();
        }
    }
}
