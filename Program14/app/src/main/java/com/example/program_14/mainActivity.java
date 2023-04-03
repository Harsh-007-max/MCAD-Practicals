package com.example.program_14;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class mainActivity extends Activity {
    Button b,b1,b2;
    Intent sign,forgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.login);
        b1 = findViewById(R.id.forgot_password1);
        EditText name = findViewById(R.id.user_name);
        EditText password = findViewById(R.id.user_password);
        sign = new Intent(mainActivity.this,signUp.class);
        forgot = new Intent(mainActivity.this,forgotPassword.class);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(mainActivity.this,welcome.class);
                if(name.getText().toString().equals("Harsh")&& password.getText().toString().equals("Harsh@123")){
                    i.putExtra("name", "Welcome "+ name.getText().toString());
                }
                else{
                    i.putExtra("name","Login Failed");
                }
                startActivity(i);
            }
        });
    }
    public void b1Click(View v){
        startActivity(forgot);
    }
    public void signUpClick(View v){
        startActivity(sign);
    }
}
