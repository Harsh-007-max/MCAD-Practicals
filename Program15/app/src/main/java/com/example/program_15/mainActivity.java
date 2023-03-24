package com.example.program_15;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;

import androidx.annotation.Nullable;

public class mainActivity extends Activity {
    CheckBox RedCB,GreenCB,BlueCB;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RedCB = findViewById(R.id.RedCheck);
        GreenCB = findViewById(R.id.GreenCheck);
        BlueCB = findViewById(R.id.BlueCheck);
        RadioGroup rg = findViewById(R.id.RG1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.RedRB:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                        break;
                    case R.id.GreenRB:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
                        break;
                    case R.id.BlueRB:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
                        break;
                    case R.id.WhiteRB:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                        break;
                    default:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                }
            }
        });
    }
    public void CheckClick(View v){
        if(RedCB.isChecked()==true && GreenCB.isChecked()==true && BlueCB.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
        }else if(RedCB.isChecked()==true && GreenCB.isChecked()==true){
                getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
        }else if(RedCB.isChecked()==true && BlueCB.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
        } else if (GreenCB.isChecked() == true && BlueCB.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
        } else if (RedCB.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
        } else if (GreenCB.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
        } else if (BlueCB.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
        }else{
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));

        }

    }
}
