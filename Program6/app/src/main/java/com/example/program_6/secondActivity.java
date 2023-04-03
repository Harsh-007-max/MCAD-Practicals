package com.example.program_6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
public class secondActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i2 = getIntent();
    }
}
