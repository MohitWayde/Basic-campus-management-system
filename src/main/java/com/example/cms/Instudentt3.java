package com.example.cms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Instudentt3 extends AppCompatActivity {
    EditText uet1,uet2;
    Button ubt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instudentt3);

        uet1=(EditText)findViewById(R.id.editText10);
        uet2=(EditText)findViewById(R.id.editText11);
        ubt=(Button)findViewById(R.id.button16);

        ubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student s =new Student();
                Integer r1 =Integer.parseInt(uet1.getText().toString());
                String m = uet2.getText().toString();
                s.setRollno(r1);
                s.setMks(m);
                MyDbHelper obj1 = new MyDbHelper(Instudentt3.this, "stud", null, 1);
               boolean isUpdate= false;
               if( obj1.UpdateStudent(s) ) {
                   Toast.makeText(Instudentt3.this, "Record updated successfully", Toast.LENGTH_SHORT).show();
               }
               else{
                   Toast.makeText(Instudentt3.this, "Record not updated", Toast.LENGTH_SHORT).show();

               }
               uet1.setText(" ");
               uet2.setText(" ");

               Intent studint=new Intent(Instudentt3.this,MainActivity.class);
               startActivity(studint);
               }
        });





    }
}
