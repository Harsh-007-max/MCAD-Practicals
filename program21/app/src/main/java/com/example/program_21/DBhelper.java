package com.example.program_21;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBhelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "harsh.db";
    SQLiteDatabase db1;
    public DBhelper(Context context){
        super(context,DB_NAME,null,1);
        db1 = getWritableDatabase();
    }
    @Override
    public void onCreate(SQLiteDatabase db1){
        db1.execSQL("create table studentinfo(id text primary key, name text)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db1,int i,int i1){
        db1.execSQL("drop table if exists studentinfo");
        onCreate(db1);
    }
    public void addrecord(String id,String name){
        ContentValues values = new ContentValues();
        values.put("id",id);
        values.put("name",name);
        db1.insert("studentinfo",null,values);
        db1.close();
    }
    public void updaterecord(String id,String name){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("name",name);
        Cursor cursor = db.rawQuery("Select * from studentinfo where id=?",new String[]{id});
        if(cursor.getCount()>0){
            db.update("studentinfo",values,"id=?",new String[]{id});
        }
        db.close();
    }
    public Cursor getdata(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from studentinfo",null);
        return cursor;
    }
    public void deleterecord(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("Select * from studentinfo where id=?",new String[]{id});
        if(cursor.getCount()>0){
            db.delete("studentinfo","id=?",new String[]{id});
        }
        db.close();
    }
}
