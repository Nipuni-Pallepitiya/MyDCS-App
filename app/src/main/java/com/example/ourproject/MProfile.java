package com.example.ourproject;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static com.example.ourproject.R.*;

public class MProfile extends AppCompatActivity {

    private static final String FULL_NAME = "com.example.ourproject";
    private static final String PHONE_NUMBER = "com.example.ourproject";
    private static final String EMAIL = "com.example.ourproject";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_m_profile);

    }
    //redirect to the Edit profile page
    public void displayMEdit(View view){
        Intent intent = new Intent(this,MEditProfile.class);
        Button Mbtn1 = (Button) findViewById(R.id.button7);
        startActivity(intent);
    }
    //click on delete button
    public void  showAlertDialog1(View v){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Delete Profile");
        alert.setMessage("Do you really want to delete your profile?");
        alert.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MProfile.this, "Delete Successfully", Toast.LENGTH_SHORT).show();
            }
        });
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MProfile.this,"" ,Toast.LENGTH_SHORT).show();
            }
        });
        alert.create().show();
    }




}