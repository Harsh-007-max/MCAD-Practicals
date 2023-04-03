package com.example.program_15;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
public class mainActivity extends Activity {
    CheckBox RedCB,GreenCB,BlueCB;
    RadioButton WhiteRB,RedRB,GreenRB,BlueRB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RedCB = findViewById(R.id.RedCheck);
        GreenCB = findViewById(R.id.GreenCheck);
        BlueCB = findViewById(R.id.BlueCheck);
        WhiteRB = findViewById(R.id.WhiteRB);
        RedRB = findViewById(R.id.RedRB);
        GreenRB = findViewById(R.id.GreenRB);
        BlueRB = findViewById(R.id.BlueRB);
        RadioGroup rg = findViewById(R.id.RG1);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.RedRB:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                        RedRB.setTextColor(Color.parseColor("#FFFFFF"));
                        break;
                    case R.id.GreenRB:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
                        GreenCB.setTextColor(Color.parseColor("#FFFFFF"));
                        break;
                    case R.id.BlueRB:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
                        BlueCB.setTextColor(Color.parseColor("#FFFFFF"));
                        break;
                    case R.id.WhiteRB:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
                        WhiteRB.setTextColor(Color.parseColor("#000000"));
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
            BlueCB.setTextColor(Color.parseColor("#000000"));
            GreenCB.setTextColor(Color.parseColor("#000000"));
            RedCB.setTextColor(Color.parseColor("#000000"));
        }else if(RedCB.isChecked()==true && GreenCB.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
            RedCB.setTextColor(Color.parseColor("#FFFFFF"));
            GreenCB.setTextColor(Color.parseColor("#FFFFFF"));
            BlueCB.setTextColor(Color.parseColor("#FFFFFF"));
        }else if(RedCB.isChecked()==true && BlueCB.isChecked()==true){
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
            RedCB.setTextColor(Color.parseColor("#FFFFFF"));
            GreenCB.setTextColor(Color.parseColor("#FFFFFF"));
            BlueCB.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (GreenCB.isChecked() == true && BlueCB.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
            RedCB.setTextColor(Color.parseColor("#FFFFFF"));
            BlueCB.setTextColor(Color.parseColor("#FFFFFF"));
            GreenCB.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (RedCB.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
            RedCB.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (GreenCB.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
            GreenCB.setTextColor(Color.parseColor("#FFFFFF"));
        } else if (BlueCB.isChecked() == true) {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
            BlueCB.setTextColor(Color.parseColor("#FFFFFF"));
        }else{
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
            BlueCB.setTextColor(Color.parseColor("#000000"));
            GreenCB.setTextColor(Color.parseColor("#000000"));
            RedCB.setTextColor(Color.parseColor("#000000"));
        }

    }
}
