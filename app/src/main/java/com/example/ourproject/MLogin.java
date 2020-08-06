package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_login);
    }
    public void displaySelectPage(View view){
        Intent intent = new Intent(this,MSelect.class);
        Button btn = (Button) findViewById(R.id.button4);
        startActivity(intent);
    }
    public void displaySignUp(View view){
        Intent intent = new Intent(this,MRegister.class);
        Button btn1 = (Button) findViewById(R.id.button3);
        startActivity(intent);
    }


}