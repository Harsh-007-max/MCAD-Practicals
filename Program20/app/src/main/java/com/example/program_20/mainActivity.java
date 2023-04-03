package com.example.program_20;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class mainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = findViewById(R.id.alertbtn);
        Button b2 = findViewById(R.id.custombtnid);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder ad = new AlertDialog.Builder(mainActivity.this);
                ad.setIcon(R.drawable.baseline_brightness_1_24)
                        .setCancelable(true)
                        .setTitle("Default AlertDialog")
                        .setMessage("Are you sure you want to exit AlertDialog?")
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        }).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog d1 = new Dialog(mainActivity.this);
                d1.setContentView(R.layout.custom_dialog_box);
                d1.show();
            }
        });
    }
}
