package com.example.hishamahmed.capitalchargecalculator;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Edit extends AppCompatActivity {
    TextView Funded,DCS,PER,TR,DebtSecurity,ListedShares,Cash,UnlistedShares,
            SoverignGurantee,NonCollateral,SoverignAAA,SoverignAAP,SoverignAA,SoverignAAM,SoverignAp,
            SoverignA,SoverignAM,SoverignBBBP,SoverignBBB,SoverignBBBM,SoverignBBP,
            SoverignBB,SoverignBBM,SoverignBP,SoverignB,SoverignBM,SoverignCCCBelow,
            SoverignUnrated,SoverignUnrated2,PSEAAA,PSEAAP,PSEAA,PSEAAM,PSEAp,
            PSEA,PSEAM,PSEBBBP,PSEBBB,PSEBBBM,PSEBBP,
            PSEBB,PSEBBM,PSEBP,PSEB,PSEBM,PSECCCBelow,
            PSEUnrated,PSEUnrated2,CoporateAAA,CoporateAAP,CoporateAA,CoporateAAM,CoporateAp,
            CoporateA,CoporateAM,CoporateBBBP,CoporateBBB,CoporateBBBM,CoporateBBP,
            CoporateBB,CoporateBBM,CoporateBP,CoporateB,CoporateBM,CoporateCCCBelow,
            CoporateUnrated,CoporateUnrated2,RetailAAA,RetailAAP,RetailAA,RetailAAM,RetailAp,
            RetailA,RetailAM,RetailBBBP,RetailBBB,RetailBBBM,RetailBBP,
            RetailBB,RetailBBM,RetailBP,RetailB,RetailBM,RetailCCCBelow,
            RetailUnrated,RetailUnrated2;
    SharedPreferences data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preference);
        configure();
        update();
        SharedPreferences s = getSharedPreferences("firstrun",MODE_PRIVATE);
        boolean run = s.getBoolean("run",false);
        if(!run){
            SharedPreferences.Editor e = s.edit();
            e.putBoolean("run",true);
            e.apply();
            Intent i = new Intent("android.intent.action.SPLASH");
            startActivity(i);
        }
    }
    public void configure(){
        Funded = (TextView) findViewById(R.id.Funded);
        DCS = (TextView) findViewById(R.id.DCS);
        PER = (TextView) findViewById(R.id.PER);
        TR = (TextView) findViewById(R.id.TR);
        DebtSecurity= (TextView) findViewById(R.id.DebtSecurities);
        ListedShares= (TextView) findViewById(R.id.ListedShares);
        Cash= (TextView) findViewById(R.id.Cash);
        UnlistedShares= (TextView) findViewById(R.id.UnlistedShares);
        SoverignGurantee= (TextView) findViewById(R.id.SoverignGaurantee);
        SoverignAAA= (TextView) findViewById(R.id.SoverignAAA);
        SoverignAAP= (TextView) findViewById(R.id.SoverignAAP);
        SoverignAA= (TextView) findViewById(R.id.SoverignAA);
        SoverignAAM= (TextView) findViewById(R.id.SoverignAAM);
        SoverignAp= (TextView) findViewById(R.id.SoverignAP);
        SoverignA= (TextView) findViewById(R.id.SoverignA);
        SoverignAM= (TextView) findViewById(R.id.SoverignAM);
        SoverignBBBP= (TextView) findViewById(R.id.SoverignBBBP);
        SoverignBBBM= (TextView) findViewById(R.id.SoverignBBBM);
        SoverignBBB= (TextView) findViewById(R.id.SoverignBBB);
        SoverignBBP= (TextView) findViewById(R.id.SoverignBBP);
        SoverignBB= (TextView) findViewById(R.id.SoverignBB);
        SoverignBBM= (TextView) findViewById(R.id.SoverignBBM);
        SoverignBP= (TextView) findViewById(R.id.SoverignBP);
        SoverignB= (TextView) findViewById(R.id.SoverignB);
        SoverignBM= (TextView) findViewById(R.id.SoverignBM);
        SoverignCCCBelow= (TextView) findViewById(R.id.SoverignCCCBelow);
        SoverignUnrated= (TextView) findViewById(R.id.SoverignUnrated);
        SoverignUnrated2= (TextView) findViewById(R.id.SoverignUnrated2);
        PSEAAA= (TextView) findViewById(R.id.PSEAAA);
        PSEAAP= (TextView) findViewById(R.id.PSEAAP);
        PSEAA= (TextView) findViewById(R.id.PSEAA);
        PSEAAM= (TextView) findViewById(R.id.PSEAAM);
        PSEAp= (TextView) findViewById(R.id.PSEAP);
        PSEA= (TextView) findViewById(R.id.PSEA);
        PSEAM= (TextView) findViewById(R.id.PSEAM);
        PSEBBBP= (TextView) findViewById(R.id.PSEBBBP);
        PSEBBBM= (TextView) findViewById(R.id.PSEBBBM);
        PSEBBB= (TextView) findViewById(R.id.PSEBBB);
        PSEBBP= (TextView) findViewById(R.id.PSEBBP);
        PSEBB= (TextView) findViewById(R.id.PSEBB);
        PSEBBM= (TextView) findViewById(R.id.PSEBBM);
        PSEBP= (TextView) findViewById(R.id.PSEBP);
        PSEB= (TextView) findViewById(R.id.PSEB);
        PSEBM= (TextView) findViewById(R.id.PSEBM);
        PSECCCBelow= (TextView) findViewById(R.id.PSECCCBelow);
        PSEUnrated= (TextView) findViewById(R.id.PSEUnrated);
        PSEUnrated2= (TextView) findViewById(R.id.PSEUnrated2);
        CoporateAAA= (TextView) findViewById(R.id.CoporateAAA);
        CoporateAAP= (TextView) findViewById(R.id.CoporateAAP);
        CoporateAA= (TextView) findViewById(R.id.CoporateAA);
        CoporateAAM= (TextView) findViewById(R.id.CoporateAAM);
        CoporateAp= (TextView) findViewById(R.id.CoporateAP);
        CoporateA= (TextView) findViewById(R.id.CoporateA);
        CoporateAM= (TextView) findViewById(R.id.CoporateAM);
        CoporateBBBP= (TextView) findViewById(R.id.CoporateBBBP);
        CoporateBBBM= (TextView) findViewById(R.id.CoporateBBBM);
        CoporateBBB= (TextView) findViewById(R.id.CoporateBBB);
        CoporateBBP= (TextView) findViewById(R.id.CoporateBBP);
        CoporateBB= (TextView) findViewById(R.id.CoporateBB);
        CoporateBBM= (TextView) findViewById(R.id.CoporateBBM);
        CoporateBP= (TextView) findViewById(R.id.CoporateBP);
        CoporateB= (TextView) findViewById(R.id.CoporateB);
        CoporateBM= (TextView) findViewById(R.id.CoporateBM);
        CoporateCCCBelow= (TextView) findViewById(R.id.CoporateCCCBelow);
        CoporateUnrated= (TextView) findViewById(R.id.CoporateUnrated);
        CoporateUnrated2= (TextView) findViewById(R.id.CoporateUnrated2);
        RetailAAA= (TextView) findViewById(R.id.RetailAAA);
        RetailAAP= (TextView) findViewById(R.id.RetailAAP);
        RetailAA= (TextView) findViewById(R.id.RetailAA);
        RetailAAM= (TextView) findViewById(R.id.RetailAAM);
        RetailAp= (TextView) findViewById(R.id.RetailAP);
        RetailA= (TextView) findViewById(R.id.RetailA);
        RetailAM= (TextView) findViewById(R.id.RetailAM);
        RetailBBBP= (TextView) findViewById(R.id.RetailBBBP);
        RetailBBBM= (TextView) findViewById(R.id.RetailBBBM);
        RetailBBB= (TextView) findViewById(R.id.RetailBBB);
        RetailBBP= (TextView) findViewById(R.id.RetailBBP);
        RetailBB= (TextView) findViewById(R.id.RetailBB);
        RetailBBM= (TextView) findViewById(R.id.RetailBBM);
        RetailBP= (TextView) findViewById(R.id.RetailBP);
        RetailB= (TextView) findViewById(R.id.RetailB);
        RetailBM= (TextView) findViewById(R.id.RetailBM);
        RetailCCCBelow= (TextView) findViewById(R.id.RetailCCCBelow);
        RetailUnrated= (TextView) findViewById(R.id.RetailUnrated);
        RetailUnrated2= (TextView) findViewById(R.id.RetailUnrated2);
        NonCollateral = (TextView) findViewById(R.id.NonColleteral);
        data = getSharedPreferences("data",MODE_PRIVATE);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.edit:
                edit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    @Override
    protected void onResume() {
        update();
        super.onResume();
    }

    public void edit(){
        Intent intent = new Intent("android.intent.action.PREFERENCE");
        startActivity(intent);
    }
    public void update(){
        Funded.setText(data.getString("Funded","100"));
        DCS.setText(data.getString("DCS", "100"));
        PER.setText(data.getString("PER", "50"));
        TR.setText(data.getString("TR","20"));
        DebtSecurity.setText(data.getString("Debt Securities","5"));
        Cash.setText(data.getString("Cash","0"));
        ListedShares.setText(data.getString("Listed Shares", "23"));
        UnlistedShares.setText(data.getString("Unlisted Shares", "35"));
        SoverignGurantee.setText(data.getString("Soverign Gaurantee", "0"));
        NonCollateral.setText(data.getString("Non Collateral", "100"));
        SoverignAAA.setText(data.getString("SoverignAAA", "0"));
        SoverignAAP.setText(data.getString("SoverignAAP", "0"));
        SoverignAA.setText(data.getString("SoverignAA", "0"));
        SoverignAAM.setText(data.getString("SoverignAAM", "0"));
        SoverignAp.setText(data.getString("SoverignAP", "20"));
        SoverignA.setText(data.getString("SoverignA", "20"));
        SoverignAM.setText(data.getString("SoverignAM", "20"));
        SoverignBBBP.setText(data.getString("SoverignBBBP", "50"));
        SoverignBBB.setText(data.getString("SoverignBBB", "50"));
        SoverignBBBM.setText(data.getString("SoverignBBBM", "50"));
        SoverignBBP.setText(data.getString("SoverignBBP", "100"));
        SoverignBB.setText(data.getString("SoverignBB", "100"));
        SoverignBBM.setText(data.getString("SoverignBBM", "100"));
        SoverignBP.setText(data.getString("SoverignBP", "100"));
        SoverignB.setText(data.getString("SoverignB", "100"));
        SoverignBM.setText(data.getString("SoverignBM", "100"));
        SoverignCCCBelow.setText(data.getString("SoverignCCC Below", "150"));
        SoverignUnrated.setText(data.getString("SoverignUnrated", "100"));
        SoverignUnrated2.setText(data.getString("SoverignUnrated2", "100"));
        PSEAAA.setText(data.getString("PSE/BankAAA", "20"));
        PSEAAP.setText(data.getString("PSE/BankAAP", "20"));
        PSEAA.setText(data.getString("PSE/BankAA", "20"));
        PSEAAM.setText(data.getString("PSE/BankAAM", "20"));
        PSEAp.setText(data.getString("PSE/BankAP", "50"));
        PSEA.setText(data.getString("PSE/BankA", "50"));
        PSEAM.setText(data.getString("PSE/BankAM", "50"));
        PSEBBBP.setText(data.getString("PSE/BankBBBP", "50"));
        PSEBBB.setText(data.getString("PSE/BankBBB", "50"));
        PSEBBBM.setText(data.getString("PSE/BankBBBM", "50"));
        PSEBBP.setText(data.getString("PSE/BankBBP", "100"));
        PSEBB.setText(data.getString("PSE/BankBB", "100"));
        PSEBBM.setText(data.getString("PSE/BankBBM", "100"));
        PSEBP.setText(data.getString("PSE/BankBP", "100"));
        PSEB.setText(data.getString("PSE/BankB", "100"));
        PSEBM.setText(data.getString("PSE/BankBM", "100"));
        PSECCCBelow.setText(data.getString("PSE/BankCCC Below", "150"));
        PSEUnrated.setText(data.getString("PSE/BankUnrated", "50"));
        PSEUnrated2.setText(data.getString("PSE/BankUnrated2","50"));
        CoporateAAA.setText(data.getString("CoporateAAA", "20"));
        CoporateAAP.setText(data.getString("CoporateAAP", "20"));
        CoporateAA.setText(data.getString("CoporateAA", "20"));
        CoporateAAM.setText(data.getString("CoporateAAM", "20"));
        CoporateAp.setText(data.getString("CoporateAP", "50"));
        CoporateA.setText(data.getString("CoporateA", "50"));
        CoporateAM.setText(data.getString("CoporateAM", "50"));
        CoporateBBBP.setText(data.getString("CoporateBBBP", "100"));
        CoporateBBB.setText(data.getString("CoporateBBB", "100"));
        CoporateBBBM.setText(data.getString("CoporateBBBM", "100"));
        CoporateBBP.setText(data.getString("CoporateBBP", "100"));
        CoporateBB.setText(data.getString("CoporateBB", "100"));
        CoporateBBM.setText(data.getString("CoporateBBM", "100"));
        CoporateBP.setText(data.getString("CoporateBP", "150"));
        CoporateB.setText(data.getString("CoporateB", "150"));
        CoporateBM.setText(data.getString("CoporateBM", "150"));
        CoporateCCCBelow.setText(data.getString("CoporateCCC Below", "150"));
        CoporateUnrated.setText(data.getString("CoporateUnrated", "100"));
        CoporateUnrated2.setText(data.getString("CoporateUnrated2","125"));
        RetailAAA.setText(data.getString("RetailAAA", "75"));
        RetailAAP.setText(data.getString("RetailAAP", "75"));
        RetailAA.setText(data.getString("RetailAA", "75"));
        RetailAAM.setText(data.getString("RetailAAM", "75"));
        RetailAp.setText(data.getString("RetailAP", "75"));
        RetailA.setText(data.getString("RetailA", "75"));
        RetailAM.setText(data.getString("RetailAM", "75"));
        RetailBBBP.setText(data.getString("RetailBBBP", "75"));
        RetailBBB.setText(data.getString("RetailBBB", "75"));
        RetailBBBM.setText(data.getString("RetailBBBM", "75"));
        RetailBBP.setText(data.getString("RetailBBP", "75"));
        RetailBB.setText(data.getString("RetailBB", "75"));
        RetailBBM.setText(data.getString("RetailBBM", "75"));
        RetailBP.setText(data.getString("RetailBP", "75"));
        RetailB.setText(data.getString("RetailB", "75"));
        RetailBM.setText(data.getString("RetailBM", "75"));
        RetailCCCBelow.setText(data.getString("RetailCCC Below", "75"));
        RetailUnrated.setText(data.getString("RetailUnrated", "75"));
        RetailUnrated2.setText(data.getString("RetailUnrated2","75"));
    }
}