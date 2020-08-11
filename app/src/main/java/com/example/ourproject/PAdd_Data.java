package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class PAdd_Data extends AppCompatActivity {

=======
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PAdd_Data extends AppCompatActivity {

    Button btn1,btn2,btn3;
    ImageButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_add__data);

        btn1 = findViewById(R.id.pbutton1);
        btn2 = findViewById(R.id.pbutton2);
        btn3 = findViewById(R.id.pbutton3);
        img = findViewById(R.id.pimageButton1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PAdd_Data.this,Pdata_packages.class);
                startActivity(i);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PAdd_Data.this,Pfixed_packages.class);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PAdd_Data.this,Pview_my_packages.class);
                startActivity(i);
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PAdd_Data.this,MProfile.class);
                startActivity(i);
            }
        });
    }
}