package com.example.program_6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class mainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.btn1);
        Intent i1 = new Intent(mainActivity.this,secondActivity.class);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(i1);
            }
        });
    }
}
