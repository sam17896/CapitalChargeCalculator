package com.example.hishamahmed.capitalchargecalculator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.AdapterView.*;

public class Activity2 extends AppCompatActivity implements OnItemSelectedListener,View.OnClickListener {
    Spinner spin1, spin2, spin3, spin4;
    String type, counterpartytype, coleteraltype, rating,exporueS,coleteralAmountS;
    EditText exporue,coleteralAmount;
    SharedPreferences sp;
    Button bt;
    TextView rw,rwa,cc,imoncar,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        spin1 = (Spinner) findViewById(R.id.type);
        spin2 = (Spinner) findViewById(R.id.counterpartytype);
        spin3 = (Spinner) findViewById(R.id.coleteraltype);
        spin4 = (Spinner) findViewById(R.id.rating);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.Type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin1.setAdapter(adapter);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.CounterpartyType, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin2.setAdapter(adapter);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.ColeteralType, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin3.setAdapter(adapter);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.Rating, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin4.setAdapter(adapter);
        spin1.setOnItemSelectedListener(this);
        spin2.setOnItemSelectedListener(this);
        spin3.setOnItemSelectedListener(this);
        spin4.setOnItemSelectedListener(this);
        exporue = (EditText) findViewById(R.id.exporue);
        coleteralAmount = (EditText) findViewById(R.id.coleteralAmount);
        sp = getSharedPreferences("data",MODE_PRIVATE);
        rw =(TextView) findViewById(R.id.RW);
        rwa=(TextView)findViewById(R.id.RWA);
        cc=(TextView)findViewById(R.id.CapitalCharge);
        b=(TextView) findViewById(R.id.blop);
        imoncar=(TextView)findViewById(R.id.ImpactOnCARBPS);
        bt = (Button) findViewById(R.id.btn);
        bt.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu3, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.vv:
                Intent intent = new Intent("android.intent.action.hisham");
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int ids = parent.getId();
        switch (ids){
            case R.id.type:
                type = parent.getItemAtPosition(position).toString();
                break;
            case R.id.counterpartytype:
                counterpartytype = parent.getItemAtPosition(position).toString();
                break;
            case R.id.coleteraltype:
                coleteraltype = parent.getItemAtPosition(position).toString();
                break;
            case R.id.rating:
                rating = parent.getItemAtPosition(position).toString();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void calculate(){
        exporueS = exporue.getText().toString();
        coleteralAmountS = coleteralAmount.getText().toString();
        if(rating.contains("+")){
            rating = rating.substring(0,rating.length()-1);
            rating = rating + "P";
        }
        if(rating.contains("-")){
            rating = rating.substring(0,rating.length()-1);
            rating = rating + "M";
        }
        double typedouble = (Double.parseDouble(sp.getString(type, "100")))/100;
        double coleteraltypedouble = (Double.parseDouble(sp.getString(coleteraltype, "2")))/100;
        double rwdouble = Double.parseDouble(sp.getString(counterpartytype+rating, "0"));
        double exporuedouble = Double.parseDouble(exporueS);
        double coleteralAmountdouble = Double.parseDouble(coleteralAmountS);
        double rwadouble = Math.max((typedouble*exporuedouble)-(coleteralAmountdouble*(1-coleteraltypedouble)),0) * (rwdouble/100);
        double capitalchargedouble = (rwadouble*10.25)/100;
        double tc = Double.parseDouble(sp.getString("TC","0"));
        double trwa = Double.parseDouble(sp.getString("TRWA", "0"));
        double car = sp.getFloat("CAR", 0);
        double bb = tc/(trwa+rwadouble);
        double impactOnCar = (car - bb)*10000;
        rwdouble=round(rwdouble, 2);
        rwadouble=round(rwadouble, 2);
        capitalchargedouble=round(capitalchargedouble, 2);
        bb=bb*100;
        bb= round(bb,2);
        impactOnCar=round(impactOnCar, 2);
        rw.setText("" + rwdouble+"%");
        rwa.setText(""+rwadouble);
        cc.setText(""+capitalchargedouble);
        b.setText(""+bb+"%");
        imoncar.setText(""+impactOnCar);
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.btn:
                calculate();
                break;
        }
    }
}

