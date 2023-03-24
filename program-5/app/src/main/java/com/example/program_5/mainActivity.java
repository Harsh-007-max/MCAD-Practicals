package com.example.program_5;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class mainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast t = Toast.makeText(this, "onCreate()",Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    protected  void onStart() {
        super.onStart();
        Toast t = Toast.makeText(this, "onStart()", Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast t = Toast.makeText(this, "onResume()",Toast.LENGTH_SHORT);
        t.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast t = Toast.makeText(this, "onPause()",Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast t = Toast.makeText(this, "onStop()",Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast t = Toast.makeText(this, "onRestart()",Toast.LENGTH_SHORT);
        t.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast t = Toast.makeText(this, "onDestroy()",Toast.LENGTH_SHORT);
        t.show();
    }
}
