package com.example.program_12;
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
        Button b2 = findViewById(R.id.forgot_password);
        Button b3 = findViewById(R.id.signup);
        Intent i1 =  new Intent(mainActivity.this,Welcome.class);
        Intent i2 = new Intent(mainActivity.this,forgotPassword.class);
        Intent i3 = new Intent(mainActivity.this,signUp.class);
        EditText name = findViewById(R.id.user_name);
        EditText password = findViewById(R.id.user_password);
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                if(name.getText().toString().equals("Harsh") && password.getText().toString().equals("Harsh@123")){
                   i1.putExtra("name","Welcome "+name.getText().toString());
                }
                else{
                    i1.putExtra("name","Log In Failed");
                }
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                startActivity(i3);
            }
        });
    }
}
