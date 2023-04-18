package com.example.program_21;
import android.app.Activity;
import android.app.AlertDialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mainActivity extends Activity implements View.OnClickListener{
    Button add,delete,update,show;
    EditText num,name;
    DBhelper dbhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dbhelper = new DBhelper(this);
        add = findViewById(R.id.add);
        delete = findViewById(R.id.delete);
        update = findViewById(R.id.update);
        show = findViewById(R.id.show);
        num = findViewById(R.id.et1);
        name = findViewById(R.id.et2);
        add.setOnClickListener(this);
        delete.setOnClickListener(this);
        update.setOnClickListener(this);
        show.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        if(v.getId() == R.id.add){
            String num1 = num.getText().toString();
            String name1 = name.getText().toString();
            dbhelper.addrecord(num1,name1);
        }else if(v.getId() == R.id.update){
            String num1 = num.getText().toString();
            String name1 = name.getText().toString();
            dbhelper.updaterecord(num1,name1);
        } else if (v.getId()==R.id.delete){
            String num1 = num.getText().toString();
            dbhelper.deleterecord(num1);
        } else if(v.getId() == R.id.show){
            Cursor res = dbhelper.getdata();
            if(res.getCount()==0){
                Toast.makeText(this, "no such data", Toast.LENGTH_SHORT).show();
            }
            StringBuffer buffer = new StringBuffer();
            while(res.moveToNext()){
                buffer.append("id"+res.getString(0)+"\n");
                buffer.append("name"+res.getString(1)+"\n");
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(mainActivity.this);
            builder.setCancelable(true);
            builder.setTitle("Student Info").setMessage(buffer.toString());
            builder.show();
        }
    }
}
