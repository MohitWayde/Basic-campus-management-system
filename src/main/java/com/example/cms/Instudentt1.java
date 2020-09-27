package com.example.cms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Instudentt1 extends AppCompatActivity {
        EditText se1,se2,se3,se4;
        Button sv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instudent1);

        se1=(EditText)findViewById(R.id.editText3);
        se2=(EditText)findViewById(R.id.editText4);
        se3=(EditText)findViewById(R.id.editText8);
        se4=(EditText)findViewById(R.id.editText9);


        sv=(Button)findViewById(R.id.button13);

        sv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student s=new Student();
                int r = Integer.parseInt(se1.getText().toString());
                String n = se2.getText().toString();
                String b=se3.getText().toString();
                String m=se4.getText().toString();

                s.setRollno(r);
                s.setName(n);
                s.setBranch(b);
                s.setMks(m);

                MyDbHelper obj = new MyDbHelper(Instudentt1.this, "stud", null, 1);
                obj.addStudent(s);
                Toast.makeText(Instudentt1.this , "Record save successfully", Toast.LENGTH_SHORT).show();
                se1.setText(" ");
                se2.setText(" ");
                se3.setText(" ");
                se4.setText(" ");

                Intent i = new Intent(Instudentt1.this,Studentt.class);
                startActivity(i);

            }
        });







    }
}
