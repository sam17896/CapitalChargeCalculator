package com.example.hishamahmed.capitalchargecalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Splash extends AppCompatActivity implements View.OnClickListener {
    private TextView display;
    Button comp, advan, clr;
    EditText val1, val2;
    String result="", num1="", num2="";
    public static String LOG_TAG = "MainActivity";
    SharedPreferences data;
    SharedPreferences.Editor sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configure();
    }
    public void configure(){
        comp = (Button) findViewById(R.id.btEq);
        clr = (Button) findViewById(R.id.btClr);
        advan = (Button) findViewById(R.id.btAd);
        val1 = (EditText) findViewById(R.id.capitalIN);
        val2 = (EditText) findViewById(R.id.rwaIN);
        display = (TextView) findViewById(R.id.tvEq);
        comp.setOnClickListener(this);
        clr.setOnClickListener(this);
        advan.setOnClickListener(this);
        data = getSharedPreferences("data", MODE_PRIVATE);
        val1.setText(data.getString("TC","0"));
        val2.setText(data.getString("TRWA", "0"));
        num1= val1.getText().toString();
        num2=val2.getText().toString();
        result += (((Float.valueOf(num1) / Float.valueOf(num2))) * 100) + "%";
        display.setText(result);
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
    public void clear(){
        num1 = "";
        num2 = "";
        result = "";
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btEq: {
                result="";
                num1 = val1.getText().toString();
                num2 = val2.getText().toString();
                if (num1.equals("") || num2.equals(""))
                    try {
                        Toast.makeText(Splash.this, "Please fill all the fields!", Toast.LENGTH_LONG).show();
                    } catch (Exception e) {

                    }
                else if (Float.valueOf(num2) == 0)
                    result = "∞";
                else
                    result += (((Float.valueOf(num1) / Float.valueOf(num2))) * 100) + "%";
                display.setText(result);
                clear();
                break;
            }
            case R.id.btClr: {
                clear();
                display.setText("");
                val1.setText("");
                val2.setText("");
                break;
            }
            case R.id.btAd:{
                result="";
                num1 = val1.getText().toString();
                num2 = val2.getText().toString();
                if (num1.equals("") || num2.equals(""))
                    try {
                        Toast.makeText(Splash.this, "Please fill all the fields!", Toast.LENGTH_LONG).show();
                        break;
                    } catch (Exception e) {

                    }
                else if (Float.valueOf(num2) == 0) {
                    result = "∞";
                    break;
                }
                else
                    result += (((Float.valueOf(num1) / Float.valueOf(num2))) * 100) + "%";
                display.setText(result);
                sp = data.edit();
                sp.putFloat("CAR",(((Float.valueOf(num1) / Float.valueOf(num2)))));
                sp.putString("TC",num1);
                sp.putString("TRWA",num2);
                sp.apply();
                clear();
                Intent i = new Intent("android.intent.action.ACTIVITY2");
                startActivity(i);
                break;
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop()");
    }
}