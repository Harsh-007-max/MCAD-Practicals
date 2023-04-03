package com.example.program_18;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
public class mainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.Spinner);
        String[] countries = {"India","Australia","Japan","America","Ireland"};
        ArrayAdapter<String> ar = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,countries);
        spinner.setAdapter(ar);
    }
}
