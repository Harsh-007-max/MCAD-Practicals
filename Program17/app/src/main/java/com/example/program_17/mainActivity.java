package com.example.program_17;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class mainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = findViewById(R.id.listview);
        ArrayList<String> array = new ArrayList<String>() ;
        ArrayAdapter<String> ar = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,array);
        lv.setAdapter(ar);
        array.add("India");
        array.add("Japan");
        array.add("Russia");
        array.add("Ukraine");
        array.add("USA");
    }
}
