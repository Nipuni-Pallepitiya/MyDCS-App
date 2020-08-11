package com.example.ourproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NShare_Main extends AppCompatActivity {


    public static final String EXTRA_MESSAGE = "com.example.ourproject.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.ourproject.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.ourproject.MESSAGE3";
    public static final String EXTRA_MESSAGE4 = "com.example.ourproject.MESSAGE4";
    public static final String EXTRA_MESSAGE5 = "com.example.ourproject.MESSAGE5";


    Button btn;
    TextView dataid;
    TextView phnfrom;
    TextView phnTo;
    TextView amt;
    TextView date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_share__main);


    }


    public void OnClickShareData(View v)
    {

        Intent intent=new Intent(this,NShareDisplay.class);
        Button btn1=(Button)findViewById(R.id.nbutton3);




        btn = findViewById(R.id.nbutton3);
        dataid=findViewById(R.id.NshareData);
        phnfrom=findViewById(R.id.nPhnFrom);
        phnTo=findViewById(R.id.NPhnTo);
        amt=findViewById(R.id.NAmtData);
        date=findViewById(R.id.NDate);



        EditText editText = (EditText) findViewById(R.id.NshareData);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

        EditText editText2 = (EditText) findViewById(R.id.nPhnFrom);
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);

        EditText editText3 = (EditText) findViewById(R.id.NPhnTo);
        String message3 = editText3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);
        startActivity(intent);

        EditText editText4 = (EditText) findViewById(R.id.NAmtData);
        String message4 = editText4.getText().toString();
        intent.putExtra(EXTRA_MESSAGE4, message4);
        startActivity(intent);

        EditText editText5 = (EditText) findViewById(R.id.NDate);
        String message5 = editText5.getText().toString();
        intent.putExtra(EXTRA_MESSAGE5, message5);
        startActivity(intent);

        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.ncustomtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.BOTTOM, 20, 600);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();




    }

    public void NBackClick(View v)
    {
        Intent intent=new Intent(this,NShare_Data.class);
        Button btn1=(Button)findViewById(R.id.NBackMain);
        startActivity(intent);

    }








}