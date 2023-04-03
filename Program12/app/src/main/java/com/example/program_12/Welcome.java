package com.example.program_12;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class Welcome extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        TextView tv = findViewById(R.id.login_user_name);
        Intent i2 = getIntent();
        tv.setText(i2.getStringExtra("name").toString());
    }
}
