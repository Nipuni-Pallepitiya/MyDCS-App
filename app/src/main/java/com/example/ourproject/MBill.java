package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MBill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_bill);

        TextView textView = findViewById(R.id.textView17);
        textView.setText("20th Aug 2020 - 19th Sep 2020");

        TextView textView5 = findViewById(R.id.textView30);
        textView5.setText("Rs.xxx/-");


        TextView textView1 = findViewById(R.id.textView21);
        textView1.setText("Rs.xxx/-");

        TextView textView2= findViewById(R.id.textView14);
        textView2.setText("Rs.xxx/-");

        TextView textView3= findViewById(R.id.textView26);
        textView3.setText("Rs.xxx/-");

    }
    public void displayProfile(View view){
        Intent intent = new Intent(this,MProfile.class);
        ImageButton FullName = (ImageButton) findViewById(R.id.imageButton3);
        startActivity(intent);

    }
    public  void MPayButton(View view){
        Intent intent = new Intent(this,CCredit_card.class);
        ImageButton FullName = (ImageButton) findViewById(R.id.imageButton3);
        startActivity(intent);
    }
}