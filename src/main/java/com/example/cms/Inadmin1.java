package com.example.cms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Inadmin1 extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    TextView te1,te2;
    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inadmin1);

        te1=(TextView)findViewById(R.id.textView8);
        te2=(TextView) findViewById(R.id.textView9);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText6);
        et4=(EditText)findViewById(R.id.editText7);

        bt1=(Button)findViewById(R.id.button4);
        bt2=(Button)findViewById(R.id.button5);
        bt3=(Button)findViewById(R.id.button6);
        bt4=(Button)findViewById(R.id.button7);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int ge1;
                ge1 = Integer.valueOf(et1.getText().toString());

                MyDbHelper obj = new MyDbHelper(Inadmin1.this, "stud", null, 1);
                Student s ;
               try{
                    s = obj.findStudent(ge1);

                if (s != null)
                {
                    String msg = "Roll no:" + s.getRollno() +
                            "\nName :" + s.getName() +
                            "\nbranch.:" + s.getBranch() +
                            "\nmks:" + s.getMks();
                    te1.setText(msg);
                    Toast.makeText(Inadmin1.this, "record found", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(Inadmin1.this, "No record found", Toast.LENGTH_SHORT).show();
                }
            }
                catch (Exception e){Toast.makeText(Inadmin1.this, "No record found", Toast.LENGTH_SHORT).show();}
        }
    });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Inadmin1.this, " prototype.......working on it", Toast.LENGTH_SHORT).show();

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rollno = Integer.valueOf(et3.getText().toString());
                if(rollno==0)
                {
                    Toast.makeText(Inadmin1.this,"enter the record first",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    MyDbHelper obj = new MyDbHelper(Inadmin1.this, "stud", null, 1);
                    obj.deleteStudent(rollno);
                    Toast.makeText(Inadmin1.this, " Record deleted(can be delete null values)", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Inadmin1.this, " prototype.......working on it", Toast.LENGTH_SHORT).show();

            }
        });



    }
}
