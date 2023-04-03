package com.example.program_11;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class mainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.btn1);
        EditText et = findViewById(R.id.et1);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(et.getText().toString().equals("Cricket")){
                    Toast.makeText(getApplicationContext(),"Update Password",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Incorrect Answer",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
