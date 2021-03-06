package com.example.ahsan.capitalchargecalculator;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Preference extends AppCompatActivity implements View.OnClickListener {
    EditText Funded,DCS,PER,TR,DebtSecurity,ListedShares,Cash,UnlistedShares,
            SoverignGurantee,SoverignAAA,SoverignAAP,SoverignAA,SoverignAAM,SoverignAp,
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
    Button btn;
    SharedPreferences data,dataupdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);
        configure();
        defaultSetting();
        update();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu2, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.defaultbtn:
                defaultcall();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void defaultcall(){
        Funded.setText(data.getString("Funded","100"));
        DCS.setText(data.getString("DCS", "100"));
        PER.setText(data.getString("PER", "50"));
        TR.setText(data.getString("TR","20"));
        DebtSecurity.setText(data.getString("DebtSecurity","2"));
        Cash.setText(data.getString("Cash","0"));
        ListedShares.setText(data.getString("ListedShares", "15"));
        UnlistedShares.setText(data.getString("UnlistedShares", "25"));
        SoverignGurantee.setText(data.getString("SoverignGaurantee", "0"));
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
        SoverignCCCBelow.setText(data.getString("SoverignCCCBelow", "150"));
        SoverignUnrated.setText(data.getString("SoverignUnrated", "100"));
        SoverignUnrated2.setText(data.getString("SoverignUnrated2", "100"));
        PSEAAA.setText(data.getString("PSEAAA", "20"));
        PSEAAP.setText(data.getString("PSEAAP", "20"));
        PSEAA.setText(data.getString("PSEAA", "20"));
        PSEAAM.setText(data.getString("PSEAAM", "20"));
        PSEAp.setText(data.getString("PSEAP", "50"));
        PSEA.setText(data.getString("PSEA", "50"));
        PSEAM.setText(data.getString("PSEAM", "50"));
        PSEBBBP.setText(data.getString("PSEBBBP", "50"));
        PSEBBB.setText(data.getString("PSEBBB", "50"));
        PSEBBBM.setText(data.getString("PSEBBBM", "50"));
        PSEBBP.setText(data.getString("PSEBBP", "100"));
        PSEBB.setText(data.getString("PSEBB", "100"));
        PSEBBM.setText(data.getString("PSEBBM", "100"));
        PSEBP.setText(data.getString("PSEBP", "100"));
        PSEB.setText(data.getString("PSEB", "100"));
        PSEBM.setText(data.getString("PSEBM", "100"));
        PSECCCBelow.setText(data.getString("PSECCCBelow", "150"));
        PSEUnrated.setText(data.getString("PSEUnrated", "50"));
        PSEUnrated2.setText(data.getString("PSEUnrated2","50"));
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
        CoporateCCCBelow.setText(data.getString("CoporateCCCBelow", "150"));
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
        RetailCCCBelow.setText(data.getString("RetailCCCBelow", "75"));
        RetailUnrated.setText(data.getString("RetailUnrated", "75"));
        RetailUnrated2.setText(data.getString("RetailUnrated2", "75"));

    }
    public void configure(){
        Funded = (EditText) findViewById(R.id.Funded);
        DCS = (EditText) findViewById(R.id.DCS);
        PER = (EditText) findViewById(R.id.PER);
        TR = (EditText) findViewById(R.id.TR);
        DebtSecurity= (EditText) findViewById(R.id.DebtSecurities);
        ListedShares= (EditText) findViewById(R.id.ListedShares);
        Cash= (EditText) findViewById(R.id.Cash);
        UnlistedShares= (EditText) findViewById(R.id.UnlistedShares);
        SoverignGurantee= (EditText) findViewById(R.id.SoverignGaurantee);
        SoverignAAA= (EditText) findViewById(R.id.SoverignAAA);
        SoverignAAP= (EditText) findViewById(R.id.SoverignAAP);
        SoverignAA= (EditText) findViewById(R.id.SoverignAA);
        SoverignAAM= (EditText) findViewById(R.id.SoverignAAM);
        SoverignAp= (EditText) findViewById(R.id.SoverignAP);
        SoverignA= (EditText) findViewById(R.id.SoverignA);
        SoverignAM= (EditText) findViewById(R.id.SoverignAM);
        SoverignBBBP= (EditText) findViewById(R.id.SoverignBBBP);
        SoverignBBBM= (EditText) findViewById(R.id.SoverignBBBM);
        SoverignBBB= (EditText) findViewById(R.id.SoverignBBB);
        SoverignBBP= (EditText) findViewById(R.id.SoverignBBP);
        SoverignBB= (EditText) findViewById(R.id.SoverignBB);
        SoverignBBM= (EditText) findViewById(R.id.SoverignBBM);
        SoverignBP= (EditText) findViewById(R.id.SoverignBP);
        SoverignB= (EditText) findViewById(R.id.SoverignB);
        SoverignBM= (EditText) findViewById(R.id.SoverignBM);
        SoverignCCCBelow= (EditText) findViewById(R.id.SoverignCCCBelow);
        SoverignUnrated= (EditText) findViewById(R.id.SoverignUnrated);
        SoverignUnrated2= (EditText) findViewById(R.id.SoverignUnrated2);
        PSEAAA= (EditText) findViewById(R.id.PSEAAA);
        PSEAAP= (EditText) findViewById(R.id.PSEAAP);
        PSEAA= (EditText) findViewById(R.id.PSEAA);
        PSEAAM= (EditText) findViewById(R.id.PSEAAM);
        PSEAp= (EditText) findViewById(R.id.PSEAP);
        PSEA= (EditText) findViewById(R.id.PSEA);
        PSEAM= (EditText) findViewById(R.id.PSEAM);
        PSEBBBP= (EditText) findViewById(R.id.PSEBBBP);
        PSEBBBM= (EditText) findViewById(R.id.PSEBBBM);
        PSEBBB= (EditText) findViewById(R.id.PSEBBB);
        PSEBBP= (EditText) findViewById(R.id.PSEBBP);
        PSEBB= (EditText) findViewById(R.id.PSEBB);
        PSEBBM= (EditText) findViewById(R.id.PSEBBM);
        PSEBP= (EditText) findViewById(R.id.PSEBP);
        PSEB= (EditText) findViewById(R.id.PSEB);
        PSEBM= (EditText) findViewById(R.id.PSEBM);
        PSECCCBelow= (EditText) findViewById(R.id.PSECCCBelow);
        PSEUnrated= (EditText) findViewById(R.id.PSEUnrated);
        PSEUnrated2= (EditText) findViewById(R.id.PSEUnrated2);
        CoporateAAA= (EditText) findViewById(R.id.CoporateAAA);
        CoporateAAP= (EditText) findViewById(R.id.CoporateAAP);
        CoporateAA= (EditText) findViewById(R.id.CoporateAA);
        CoporateAAM= (EditText) findViewById(R.id.CoporateAAM);
        CoporateAp= (EditText) findViewById(R.id.CoporateAP);
        CoporateA= (EditText) findViewById(R.id.CoporateA);
        CoporateAM= (EditText) findViewById(R.id.CoporateAM);
        CoporateBBBP= (EditText) findViewById(R.id.CoporateBBBP);
        CoporateBBBM= (EditText) findViewById(R.id.CoporateBBBM);
        CoporateBBB= (EditText) findViewById(R.id.CoporateBBB);
        CoporateBBP= (EditText) findViewById(R.id.CoporateBBP);
        CoporateBB= (EditText) findViewById(R.id.CoporateBB);
        CoporateBBM= (EditText) findViewById(R.id.CoporateBBM);
        CoporateBP= (EditText) findViewById(R.id.CoporateBP);
        CoporateB= (EditText) findViewById(R.id.CoporateB);
        CoporateBM= (EditText) findViewById(R.id.CoporateBM);
        CoporateCCCBelow= (EditText) findViewById(R.id.CoporateCCCBelow);
        CoporateUnrated= (EditText) findViewById(R.id.CoporateUnrated);
        CoporateUnrated2= (EditText) findViewById(R.id.CoporateUnrated2);
        RetailAAA= (EditText) findViewById(R.id.RetailAAA);
        RetailAAP= (EditText) findViewById(R.id.RetailAAP);
        RetailAA= (EditText) findViewById(R.id.RetailAA);
        RetailAAM= (EditText) findViewById(R.id.RetailAAM);
        RetailAp= (EditText) findViewById(R.id.RetailAP);
        RetailA= (EditText) findViewById(R.id.RetailA);
        RetailAM= (EditText) findViewById(R.id.RetailAM);
        RetailBBBP= (EditText) findViewById(R.id.RetailBBBP);
        RetailBBBM= (EditText) findViewById(R.id.RetailBBBM);
        RetailBBB= (EditText) findViewById(R.id.RetailBBB);
        RetailBBP= (EditText) findViewById(R.id.RetailBBP);
        RetailBB= (EditText) findViewById(R.id.RetailBB);
        RetailBBM= (EditText) findViewById(R.id.RetailBBM);
        RetailBP= (EditText) findViewById(R.id.RetailBP);
        RetailB= (EditText) findViewById(R.id.RetailB);
        RetailBM= (EditText) findViewById(R.id.RetailBM);
        RetailCCCBelow= (EditText) findViewById(R.id.RetailCCCBelow);
        RetailUnrated= (EditText) findViewById(R.id.RetailUnrated);
        RetailUnrated2= (EditText) findViewById(R.id.RetailUnrated2);
        data = getSharedPreferences("default",MODE_PRIVATE);
        dataupdate = getSharedPreferences("data",MODE_PRIVATE);
        btn = (Button) findViewById(R.id.done);
        btn.setOnClickListener(this);
    }
    public void update(){
        Funded.setText(dataupdate.getString("Funded","100"));
        DCS.setText(dataupdate.getString("DCS", "100"));
        PER.setText(dataupdate.getString("PER", "50"));
        TR.setText(dataupdate.getString("TR","20"));
        DebtSecurity.setText(dataupdate.getString("DebtSecurity","2"));
        Cash.setText(dataupdate.getString("Cash","0"));
        ListedShares.setText(dataupdate.getString("ListedShares", "15"));
        UnlistedShares.setText(dataupdate.getString("UnlistedShares", "25"));
        SoverignGurantee.setText(dataupdate.getString("SoverignGaurantee", "0"));
        SoverignAAA.setText(dataupdate.getString("SoverignAAA", "0"));
        SoverignAAP.setText(dataupdate.getString("SoverignAAP", "0"));
        SoverignAA.setText(dataupdate.getString("SoverignAA", "0"));
        SoverignAAM.setText(dataupdate.getString("SoverignAAM", "0"));
        SoverignAp.setText(dataupdate.getString("SoverignAP", "20"));
        SoverignA.setText(dataupdate.getString("SoverignA", "20"));
        SoverignAM.setText(dataupdate.getString("SoverignAM", "20"));
        SoverignBBBP.setText(dataupdate.getString("SoverignBBBP", "50"));
        SoverignBBB.setText(dataupdate.getString("SoverignBBB", "50"));
        SoverignBBBM.setText(dataupdate.getString("SoverignBBBM", "50"));
        SoverignBBP.setText(dataupdate.getString("SoverignBBP", "100"));
        SoverignBB.setText(dataupdate.getString("SoverignBB", "100"));
        SoverignBBM.setText(dataupdate.getString("SoverignBBM", "100"));
        SoverignBP.setText(dataupdate.getString("SoverignBP", "100"));
        SoverignB.setText(dataupdate.getString("SoverignB", "100"));
        SoverignBM.setText(dataupdate.getString("SoverignBM", "100"));
        SoverignCCCBelow.setText(dataupdate.getString("SoverignCCCBelow", "150"));
        SoverignUnrated.setText(dataupdate.getString("SoverignUnrated", "100"));
        SoverignUnrated2.setText(dataupdate.getString("SoverignUnrated2", "100"));
        PSEAAA.setText(dataupdate.getString("PSEAAA", "20"));
        PSEAAP.setText(dataupdate.getString("PSEAAP", "20"));
        PSEAA.setText(dataupdate.getString("PSEAA", "20"));
        PSEAAM.setText(dataupdate.getString("PSEAAM", "20"));
        PSEAp.setText(dataupdate.getString("PSEAP", "50"));
        PSEA.setText(dataupdate.getString("PSEA", "50"));
        PSEAM.setText(dataupdate.getString("PSEAM", "50"));
        PSEBBBP.setText(dataupdate.getString("PSEBBBP", "50"));
        PSEBBB.setText(dataupdate.getString("PSEBBB", "50"));
        PSEBBBM.setText(dataupdate.getString("PSEBBBM", "50"));
        PSEBBP.setText(dataupdate.getString("PSEBBP", "100"));
        PSEBB.setText(dataupdate.getString("PSEBB", "100"));
        PSEBBM.setText(dataupdate.getString("PSEBBM", "100"));
        PSEBP.setText(dataupdate.getString("PSEBP", "100"));
        PSEB.setText(dataupdate.getString("PSEB", "100"));
        PSEBM.setText(dataupdate.getString("PSEBM", "100"));
        PSECCCBelow.setText(dataupdate.getString("PSECCCBelow", "150"));
        PSEUnrated.setText(dataupdate.getString("PSEUnrated", "50"));
        PSEUnrated2.setText(dataupdate.getString("PSEUnrated2","50"));
        CoporateAAA.setText(dataupdate.getString("CoporateAAA", "20"));
        CoporateAAP.setText(dataupdate.getString("CoporateAAP", "20"));
        CoporateAA.setText(dataupdate.getString("CoporateAA", "20"));
        CoporateAAM.setText(dataupdate.getString("CoporateAAM", "20"));
        CoporateAp.setText(dataupdate.getString("CoporateAP", "50"));
        CoporateA.setText(dataupdate.getString("CoporateA", "50"));
        CoporateAM.setText(dataupdate.getString("CoporateAM", "50"));
        CoporateBBBP.setText(dataupdate.getString("CoporateBBBP", "100"));
        CoporateBBB.setText(dataupdate.getString("CoporateBBB", "100"));
        CoporateBBBM.setText(dataupdate.getString("CoporateBBBM", "100"));
        CoporateBBP.setText(dataupdate.getString("CoporateBBP", "100"));
        CoporateBB.setText(dataupdate.getString("CoporateBB", "100"));
        CoporateBBM.setText(dataupdate.getString("CoporateBBM", "100"));
        CoporateBP.setText(dataupdate.getString("CoporateBP", "150"));
        CoporateB.setText(dataupdate.getString("CoporateB", "150"));
        CoporateBM.setText(dataupdate.getString("CoporateBM", "150"));
        CoporateCCCBelow.setText(dataupdate.getString("CoporateCCCBelow", "150"));
        CoporateUnrated.setText(dataupdate.getString("CoporateUnrated", "100"));
        CoporateUnrated2.setText(dataupdate.getString("CoporateUnrated2","125"));
        RetailAAA.setText(dataupdate.getString("RetailAAA", "75"));
        RetailAAP.setText(dataupdate.getString("RetailAAP", "75"));
        RetailAA.setText(dataupdate.getString("RetailAA", "75"));
        RetailAAM.setText(dataupdate.getString("RetailAAM", "75"));
        RetailAp.setText(dataupdate.getString("RetailAP", "75"));
        RetailA.setText(dataupdate.getString("RetailA", "75"));
        RetailAM.setText(dataupdate.getString("RetailAM", "75"));
        RetailBBBP.setText(dataupdate.getString("RetailBBBP", "75"));
        RetailBBB.setText(dataupdate.getString("RetailBBB", "75"));
        RetailBBBM.setText(dataupdate.getString("RetailBBBM", "75"));
        RetailBBP.setText(dataupdate.getString("RetailBBP", "75"));
        RetailBB.setText(dataupdate.getString("RetailBB", "75"));
        RetailBBM.setText(dataupdate.getString("RetailBBM", "75"));
        RetailBP.setText(dataupdate.getString("RetailBP", "75"));
        RetailB.setText(dataupdate.getString("RetailB", "75"));
        RetailBM.setText(dataupdate.getString("RetailBM", "75"));
        RetailCCCBelow.setText(dataupdate.getString("RetailCCCBelow", "75"));
        RetailUnrated.setText(dataupdate.getString("RetailUnrated", "75"));
        RetailUnrated2.setText(dataupdate.getString("RetailUnrated2", "75"));

    }

    public void defaultSetting(){
        SharedPreferences.Editor editor = data.edit();
        editor.putString("Funded","100");
        editor.putString("DCS","100");
        editor.putString("PER","50");
        editor.putString("TR","20");
        editor.putString("DebtSecurity", "2");
        editor.putString("Cash","0");
        editor.putString("ListedShares","15");
        editor.putString("UnlistedShares","25");
        editor.putString("SoverignGurantee","0");
        editor.putString("SoverignAAA","0");
        editor.putString("SoverignAAP","0");
        editor.putString("SoverignAA","0");
        editor.putString("SoverignAAM","0");
        editor.putString("SoverignAP","20");
        editor.putString("SoverignA","20");
        editor.putString("SoverignAM","20");
        editor.putString("SoverignBBBP","50");
        editor.putString("SoverignBBB","50");
        editor.putString("SoverignBBBM","50");
        editor.putString("SoverignBBP","100");
        editor.putString("SoverignBB","100");
        editor.putString("SoverignBBM","100");
        editor.putString("SoverignBP","100");
        editor.putString("SoverignB","100");
        editor.putString("SoverignBM","100");
        editor.putString("SoverignCCCBelow","150");
        editor.putString("SoverignUnrated","100");
        editor.putString("SoverignUnrated2","100");
        editor.putString("RetailAAA","75");
        editor.putString("RetailAAP","75");
        editor.putString("RetailAA","75");
        editor.putString("RetailAAM","75");
        editor.putString("RetailAP","75");
        editor.putString("RetailA","75");
        editor.putString("RetailAM","75");
        editor.putString("RetailBBBP","75");
        editor.putString("RetailBBB","75");
        editor.putString("RetailBBBM","75");
        editor.putString("RetailBBP","75");
        editor.putString("RetailBB","75");
        editor.putString("RetailBBM","75");
        editor.putString("RetailBP","75");
        editor.putString("RetailB","75");
        editor.putString("RetailBM","75");
        editor.putString("RetailCCCBelow","75");
        editor.putString("RetailUnrated","75");
        editor.putString("RetailUnrated2","75");
        editor.putString("PSEAAA","20");
        editor.putString("PSEAAP","20");
        editor.putString("PSEAA","20");
        editor.putString("PSEAAM","20");
        editor.putString("PSEAP","50");
        editor.putString("PSEA","50");
        editor.putString("PSEAM","50");
        editor.putString("PSEBBBP","50");
        editor.putString("PSEBBB","50");
        editor.putString("PSEBBBM","50");
        editor.putString("PSEBBP","100");
        editor.putString("PSEBB","100");
        editor.putString("PSEBBM","100");
        editor.putString("PSEBP","100");
        editor.putString("PSEB","100");
        editor.putString("PSEBM","100");
        editor.putString("PSECCCBelow","150");
        editor.putString("PSEUnrated","100");
        editor.putString("PSEUnrated2","100");
        editor.putString("CoporateAAA","20");
        editor.putString("CoporateAAP","20");
        editor.putString("CoporateAA","20");
        editor.putString("CoporateAAM","20");
        editor.putString("CoporateAP","50");
        editor.putString("CoporateA","50");
        editor.putString("CoporateAM","50");
        editor.putString("CoporateBBBP","100");
        editor.putString("CoporateBBB","100");
        editor.putString("CoporateBBBM","100");
        editor.putString("CoporateBBP","100");
        editor.putString("CoporateBB","100");
        editor.putString("CoporateBBM","100");
        editor.putString("CoporateBP","150");
        editor.putString("CoporateB","150");
        editor.putString("CoporateBM","150");
        editor.putString("CoporateCCCBelow","150");
        editor.putString("CoporateUnrated","100");
        editor.putString("CoporateUnrated2","125");
        editor.commit();
    }
    public void save(){
        SharedPreferences.Editor editor = dataupdate.edit();
        editor.putString("Funded",Funded.getText().toString());
        editor.putString("DCS",DCS.getText().toString());
        editor.putString("PER",PER.getText().toString());
        editor.putString("TR",TR.getText().toString());
        editor.putString("DebtSecurity",DebtSecurity.getText().toString());
        editor.putString("Cash",Cash.getText().toString());
        editor.putString("ListedShares",ListedShares.getText().toString());
        editor.putString("UnlistedShares",UnlistedShares.getText().toString());
        editor.putString("SoverignGurantee",SoverignGurantee.getText().toString());
        editor.putString("SoverignAAA",SoverignAAA.getText().toString());
        editor.putString("SoverignAAP",SoverignAAP.getText().toString());
        editor.putString("SoverignAA",SoverignAA.getText().toString());
        editor.putString("SoverignAAM",SoverignAAM.getText().toString());
        editor.putString("SoverignAP",SoverignAp.getText().toString());
        editor.putString("SoverignA",SoverignA.getText().toString());
        editor.putString("SoverignAM",SoverignAM.getText().toString());
        editor.putString("SoverignBBBP",SoverignBBBP.getText().toString());
        editor.putString("SoverignBBB",SoverignBBB.getText().toString());
        editor.putString("SoverignBBBM",SoverignBBBM.getText().toString());
        editor.putString("SoverignBBP",SoverignBBP.getText().toString());
        editor.putString("SoverignBB",SoverignBB.getText().toString());
        editor.putString("SoverignBBM",SoverignBBM.getText().toString());
        editor.putString("SoverignBP",SoverignBP.getText().toString());
        editor.putString("SoverignB",SoverignB.getText().toString());
        editor.putString("SoverignBM",SoverignBM.getText().toString());
        editor.putString("SoverignCCCBelow",SoverignCCCBelow.getText().toString());
        editor.putString("SoverignUnrated",SoverignUnrated.getText().toString());
        editor.putString("SoverignUnrated2",SoverignUnrated2.getText().toString());
        editor.putString("PSEAAA",PSEAAA.getText().toString());
        editor.putString("PSEAAP",PSEAAP.getText().toString());
        editor.putString("PSEAA",PSEAA.getText().toString());
        editor.putString("PSEAAM",PSEAAM.getText().toString());
        editor.putString("PSEAP",PSEAp.getText().toString());
        editor.putString("PSEA",PSEA.getText().toString());
        editor.putString("PSEAM",PSEAM.getText().toString());
        editor.putString("PSEBBBP",PSEBBBP.getText().toString());
        editor.putString("PSEBBB",PSEBBB.getText().toString());
        editor.putString("PSEBBBM",PSEBBBM.getText().toString());
        editor.putString("PSEBBP",PSEBBP.getText().toString());
        editor.putString("PSEBB",PSEBB.getText().toString());
        editor.putString("PSEBBM",PSEBBM.getText().toString());
        editor.putString("PSEBP",PSEBP.getText().toString());
        editor.putString("PSEB",PSEB.getText().toString());
        editor.putString("PSEBM",PSEBM.getText().toString());
        editor.putString("PSECCCBelow",PSECCCBelow.getText().toString());
        editor.putString("PSEUnrated",PSEUnrated.getText().toString());
        editor.putString("PSEUnrated2",PSEUnrated2.getText().toString());
        editor.putString("CoporateAAA",CoporateAAA.getText().toString());
        editor.putString("CoporateAAP",CoporateAAP.getText().toString());
        editor.putString("CoporateAA",CoporateAA.getText().toString());
        editor.putString("CoporateAAM",CoporateAAM.getText().toString());
        editor.putString("CoporateAP",CoporateAp.getText().toString());
        editor.putString("CoporateA",CoporateA.getText().toString());
        editor.putString("CoporateAM",CoporateAM.getText().toString());
        editor.putString("CoporateBBBP",CoporateBBBP.getText().toString());
        editor.putString("CoporateBBB",CoporateBBB.getText().toString());
        editor.putString("CoporateBBBM",CoporateBBBM.getText().toString());
        editor.putString("CoporateBBP",CoporateBBP.getText().toString());
        editor.putString("CoporateBB",CoporateBB.getText().toString());
        editor.putString("CoporateBBM",CoporateBBM.getText().toString());
        editor.putString("CoporateBP",CoporateBP.getText().toString());
        editor.putString("CoporateB",CoporateB.getText().toString());
        editor.putString("CoporateBM",CoporateBM.getText().toString());
        editor.putString("CoporateCCCBelow",CoporateCCCBelow.getText().toString());
        editor.putString("CoporateUnrated",CoporateUnrated.getText().toString());
        editor.putString("CoporateUnrated2",CoporateUnrated2.getText().toString());
        editor.putString("RetailAAA",RetailAAA.getText().toString());
        editor.putString("RetailAAP",RetailAAP.getText().toString());
        editor.putString("RetailAA",RetailAA.getText().toString());
        editor.putString("RetailAAM",RetailAAM.getText().toString());
        editor.putString("RetailAP",RetailAp.getText().toString());
        editor.putString("RetailA",RetailA.getText().toString());
        editor.putString("RetailAM",RetailAM.getText().toString());
        editor.putString("RetailBBBP",RetailBBBP.getText().toString());
        editor.putString("RetailBBB",RetailBBB.getText().toString());
        editor.putString("RetailBBBM",RetailBBBM.getText().toString());
        editor.putString("RetailBBP",RetailBBP.getText().toString());
        editor.putString("RetailBB",RetailBB.getText().toString());
        editor.putString("RetailBBM",RetailBBM.getText().toString());
        editor.putString("RetailBP",RetailBP.getText().toString());
        editor.putString("RetailB",RetailB.getText().toString());
        editor.putString("RetailBM",RetailBM.getText().toString());
        editor.putString("RetailCCCBelow",RetailCCCBelow.getText().toString());
        editor.putString("RetailUnrated",RetailUnrated.getText().toString());
        editor.putString("RetailUnrated2",RetailUnrated2.getText().toString());
        editor.commit();
    }
    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){
            case R.id.done:
                save();
                finish();
                break;
        }
    }

    @Override
    protected void onStop() {
        save();
        super.onStop();
    }
}


