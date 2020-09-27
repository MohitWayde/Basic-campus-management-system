package com.example.cms;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class MyDbHelper extends SQLiteOpenHelper {

    public static String dbname ="stud";
    public String tbname = "stu";
    public String rollno = "rollno";
    public String name = "name";
    public String branch = "branch";
    public String mks="mks";

    static int dbversion =1;



    public MyDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, dbname, factory, dbversion);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String query = "create table stu(rollno integer primary key, name varchar(100), branch varchar(10),mks varchar(20));";
        sqLiteDatabase.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String query ="drop table stu";
        sqLiteDatabase.execSQL(query);
        onCreate(sqLiteDatabase);
    }

    public void addStudent(Student s){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(rollno,s.getRollno());
        values.put(name,s.getName());
        values.put(branch,s.getBranch());
        values.put(mks,s.getMks());



        db.insert(tbname,null,values);
        db.close();
    }


    public Student findStudent(int rn){
        SQLiteDatabase db = this.getReadableDatabase();
        String query = "select * from stu where rollno="+rn+";";
        Cursor c = db.rawQuery(query,null);
        Student s = new Student();
        if(c!=null){
            c.moveToNext();
            s.setRollno(c.getInt(0));
            s.setName(c.getString(1));
            s.setBranch(c.getString(2));
            s.setMks(c.getString(3));
            if(s.getRollno()==rn)
            {
                return s;
            }

        }
        else{
            s = null;
        }
        db.close();
        return  s;
    }

    public void deleteStudent(int rn){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(tbname,rollno+"=?",new String[]{String.valueOf(rn)});
        db.close();
    }

    public boolean UpdateStudent(Student s) {

                    SQLiteDatabase db1 = this.getWritableDatabase();
                    ContentValues cv = new ContentValues();
                    cv.put(mks, s.getMks());
                    db1.update(tbname, cv, "rollno=?" , new String[] {String.valueOf(s.getRollno())});
                    db1.close();

        return true;

    }


}
