package com.example.program_13;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
public class welcome extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
        Intent i2 = getIntent();
        TextView tv = findViewById(R.id.login_user_name);
        tv.setText(i2.getStringExtra("name").toString());
    }
}
