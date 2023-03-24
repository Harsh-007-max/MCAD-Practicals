package com.example.program_13;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class mainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.login);
        EditText name = findViewById(R.id.user_name);
        EditText password = findViewById(R.id.user_password);
        Intent i1 = new Intent(mainActivity.this,welcome.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().equals("Harsh") && password.getText().toString().equals("Harsh@123")){
                    i1.putExtra("name","Welcome "+name.getText().toString());
                }
                else{
                    i1.putExtra("name","Log In Failed");
                }
                startActivity(i1);
            }
        });
    }
}
