package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.ourproject.R.id.editTextTextPersonName2;
import static com.example.ourproject.R.id.start;
import static com.example.ourproject.R.id.textView8;

public class MRegister extends AppCompatActivity {
    public static final String FULL_NAME = "com.example.ourproject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_register);
    }
    public void displayLogin(View view){
        Intent intent = new Intent(this,MLogin.class);
        Button btn = (Button) findViewById(R.id.button5);
        startActivity(intent);
    }
    public void displaySignUp(View view){
        Intent intent = new Intent(this,MLogin.class);
        Button btn = (Button) findViewById(R.id.button6);
        startActivity(intent);
    }
    public void sendDetails(View view){
        Intent intent = new Intent(this,MProfile.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName2);
        String FullName = editText.getText().toString();
        intent.putExtra(FULL_NAME,FullName);
        startActivity(intent);
    }





}