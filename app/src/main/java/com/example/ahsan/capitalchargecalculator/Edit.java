package com.example.ahsan.capitalchargecalculator;

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
    TextView FundedTV,DCSTV,PERTV,TRTV,DebtSecurityTV,ListedSharesTV,CashTV,UnlistedSharesTV,
            SoverignGuranteeTV,SoverignAAATV,SoverignAAPTV,SoverignAATV,SoverignAAMTV,SoverignApTV,
            SoverignATV,SoverignAMTV,SoverignBBBPTV,SoverignBBBTV,SoverignBBBMTV,SoverignBBPTV,
            SoverignBBTV,SoverignBBMTV,SoverignBPTV,SoverignBTV,SoverignBMTV,SoverignCCCBelowTV,
            SoverignUnratedTV,SoverignUnrated2TV,PSEAAATV,PSEAAPTV,PSEAATV,PSEAAMTV,PSEApTV,
            PSEATV,PSEAMTV,PSEBBBPTV,PSEBBBTV,PSEBBBMTV,PSEBBPTV,
            PSEBBTV,PSEBBMTV,PSEBPTV,PSEBTV,PSEBMTV,PSECCCBelowTV,
            PSEUnratedTV,PSEUnrated2TV,CoporateAAATV,CoporateAAPTV,CoporateAATV,CoporateAAMTV,CoporateApTV,
            CoporateATV,CoporateAMTV,CoporateBBBPTV,CoporateBBBTV,CoporateBBBMTV,CoporateBBPTV,
            CoporateBBTV,CoporateBBMTV,CoporateBPTV,CoporateBTV,CoporateBMTV,CoporateCCCBelowTV,
            CoporateUnratedTV,CoporateUnrated2TV,RetailAAATV,RetailAAPTV,RetailAATV,RetailAAMTV,RetailApTV,
            RetailATV,RetailAMTV,RetailBBBPTV,RetailBBBTV,RetailBBBMTV,RetailBBPTV,
            RetailBBTV,RetailBBMTV,RetailBPTV,RetailBTV,RetailBMTV,RetailCCCBelowTV,
            RetailUnratedTV,RetailUnrated2TV;
    SharedPreferences data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preference);
        configure();
    }
    public void configure(){
        FundedTV = (TextView) findViewById(R.id.FundedTV);
        DCSTV = (TextView) findViewById(R.id.DCSTV);
        PERTV = (TextView) findViewById(R.id.PERTV);
        TRTV = (TextView) findViewById(R.id.TRTV);
        DebtSecurityTV= (TextView) findViewById(R.id.DebtSecuritiesTV);
        ListedSharesTV= (TextView) findViewById(R.id.ListedSharesTV);
        CashTV= (TextView) findViewById(R.id.CashTV);
        UnlistedSharesTV= (TextView) findViewById(R.id.UnlistedSharesTV);
        SoverignGuranteeTV= (TextView) findViewById(R.id.SoverignGauranteeTV);
        SoverignAAATV= (TextView) findViewById(R.id.SoverignAAATV);
        SoverignAAPTV= (TextView) findViewById(R.id.SoverignAAPTV);
        SoverignAATV= (TextView) findViewById(R.id.SoverignAATV);
        SoverignAAMTV= (TextView) findViewById(R.id.SoverignAAMTV);
        SoverignApTV= (TextView) findViewById(R.id.SoverignAPTV);
        SoverignATV= (TextView) findViewById(R.id.SoverignATV);
        SoverignAMTV= (TextView) findViewById(R.id.SoverignAMTV);
        SoverignBBBPTV= (TextView) findViewById(R.id.SoverignBBBPTV);
        SoverignBBBMTV= (TextView) findViewById(R.id.SoverignBBBMTV);
        SoverignBBBTV= (TextView) findViewById(R.id.SoverignBBBTV);
        SoverignBBPTV= (TextView) findViewById(R.id.SoverignBBPTV);
        SoverignBBTV= (TextView) findViewById(R.id.SoverignBBTV);
        SoverignBBMTV= (TextView) findViewById(R.id.SoverignBBMTV);
        SoverignBPTV= (TextView) findViewById(R.id.SoverignBPTV);
        SoverignBTV= (TextView) findViewById(R.id.SoverignBTV);
        SoverignBMTV= (TextView) findViewById(R.id.SoverignBMTV);
        SoverignCCCBelowTV= (TextView) findViewById(R.id.SoverignCCCBelowTV);
        SoverignUnratedTV= (TextView) findViewById(R.id.SoverignUnratedTV);
        SoverignUnrated2TV= (TextView) findViewById(R.id.SoverignUnrated2TV);
        PSEAAATV= (TextView) findViewById(R.id.PSEAAATV);
        PSEAAPTV= (TextView) findViewById(R.id.PSEAAPTV);
        PSEAATV= (TextView) findViewById(R.id.PSEAATV);
        PSEAAMTV= (TextView) findViewById(R.id.PSEAAMTV);
        PSEApTV= (TextView) findViewById(R.id.PSEAPTV);
        PSEATV= (TextView) findViewById(R.id.PSEATV);
        PSEAMTV= (TextView) findViewById(R.id.PSEAMTV);
        PSEBBBPTV= (TextView) findViewById(R.id.PSEBBBPTV);
        PSEBBBMTV= (TextView) findViewById(R.id.PSEBBBMTV);
        PSEBBBTV= (TextView) findViewById(R.id.PSEBBBTV);
        PSEBBPTV= (TextView) findViewById(R.id.PSEBBPTV);
        PSEBBTV= (TextView) findViewById(R.id.PSEBBTV);
        PSEBBMTV= (TextView) findViewById(R.id.PSEBBMTV);
        PSEBPTV= (TextView) findViewById(R.id.PSEBPTV);
        PSEBTV= (TextView) findViewById(R.id.PSEBTV);
        PSEBMTV= (TextView) findViewById(R.id.PSEBMTV);
        PSECCCBelowTV= (TextView) findViewById(R.id.PSECCCBelowTV);
        PSEUnratedTV= (TextView) findViewById(R.id.PSEUnratedTV);
        PSEUnrated2TV= (TextView) findViewById(R.id.PSEUnrated2TV);
        CoporateAAATV= (TextView) findViewById(R.id.CoporateAAATV);
        CoporateAAPTV= (TextView) findViewById(R.id.CoporateAAPTV);
        CoporateAATV= (TextView) findViewById(R.id.CoporateAATV);
        CoporateAAMTV= (TextView) findViewById(R.id.CoporateAAMTV);
        CoporateApTV= (TextView) findViewById(R.id.CoporateAPTV);
        CoporateATV= (TextView) findViewById(R.id.CoporateATV);
        CoporateAMTV= (TextView) findViewById(R.id.CoporateAMTV);
        CoporateBBBPTV= (TextView) findViewById(R.id.CoporateBBBPTV);
        CoporateBBBMTV= (TextView) findViewById(R.id.CoporateBBBMTV);
        CoporateBBBTV= (TextView) findViewById(R.id.CoporateBBBTV);
        CoporateBBPTV= (TextView) findViewById(R.id.CoporateBBPTV);
        CoporateBBTV= (TextView) findViewById(R.id.CoporateBBTV);
        CoporateBBMTV= (TextView) findViewById(R.id.CoporateBBMTV);
        CoporateBPTV= (TextView) findViewById(R.id.CoporateBPTV);
        CoporateBTV= (TextView) findViewById(R.id.CoporateBTV);
        CoporateBMTV= (TextView) findViewById(R.id.CoporateBMTV);
        CoporateCCCBelowTV= (TextView) findViewById(R.id.CoporateCCCBelowTV);
        CoporateUnratedTV= (TextView) findViewById(R.id.CoporateUnratedTV);
        CoporateUnrated2TV= (TextView) findViewById(R.id.CoporateUnrated2TV);
        RetailAAATV= (TextView) findViewById(R.id.RetailAAATV);
        RetailAAPTV= (TextView) findViewById(R.id.RetailAAPTV);
        RetailAATV= (TextView) findViewById(R.id.RetailAATV);
        RetailAAMTV= (TextView) findViewById(R.id.RetailAAMTV);
        RetailApTV= (TextView) findViewById(R.id.RetailAPTV);
        RetailATV= (TextView) findViewById(R.id.RetailATV);
        RetailAMTV= (TextView) findViewById(R.id.RetailAMTV);
        RetailBBBPTV= (TextView) findViewById(R.id.RetailBBBPTV);
        RetailBBBMTV= (TextView) findViewById(R.id.RetailBBBMTV);
        RetailBBBTV= (TextView) findViewById(R.id.RetailBBBTV);
        RetailBBPTV= (TextView) findViewById(R.id.RetailBBPTV);
        RetailBBTV= (TextView) findViewById(R.id.RetailBBTV);
        RetailBBMTV= (TextView) findViewById(R.id.RetailBBMTV);
        RetailBPTV= (TextView) findViewById(R.id.RetailBPTV);
        RetailBTV= (TextView) findViewById(R.id.RetailBTV);
        RetailBMTV= (TextView) findViewById(R.id.RetailBMTV);
        RetailCCCBelowTV= (TextView) findViewById(R.id.RetailCCCBelowTV);
        RetailUnratedTV= (TextView) findViewById(R.id.RetailUnratedTV);
        RetailUnrated2TV= (TextView) findViewById(R.id.RetailUnrated2TV);
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
    protected void onResume() {
        update();
        super.onResume();
    }

    public void edit(){
        Intent intent = new Intent("android.intent.action.PREFERENCE");
        startActivity(intent);
    }
    public void update(){
        FundedTV.setText(data.getString("Funded","100"));
        DCSTV.setText(data.getString("DCS", "100"));
        PERTV.setText(data.getString("PER", "50"));
        TRTV.setText(data.getString("TR","20"));
        DebtSecurityTV.setText(data.getString("DebtSecurity","2"));
        CashTV.setText(data.getString("Cash","0"));
        ListedSharesTV.setText(data.getString("ListedShares", "15"));
        UnlistedSharesTV.setText(data.getString("UnlistedShares", "25"));
        SoverignGuranteeTV.setText(data.getString("SoverignGaurantee", "0"));
        SoverignAAATV.setText(data.getString("SoverignAAA", "0"));
        SoverignAAPTV.setText(data.getString("SoverignAAP", "0"));
        SoverignAATV.setText(data.getString("SoverignAA", "0"));
        SoverignAAMTV.setText(data.getString("SoverignAAM", "0"));
        SoverignApTV.setText(data.getString("SoverignAP", "20"));
        SoverignATV.setText(data.getString("SoverignA", "20"));
        SoverignAMTV.setText(data.getString("SoverignAM", "20"));
        SoverignBBBPTV.setText(data.getString("SoverignBBBP", "50"));
        SoverignBBBTV.setText(data.getString("SoverignBBB", "50"));
        SoverignBBBMTV.setText(data.getString("SoverignBBBM", "50"));
        SoverignBBPTV.setText(data.getString("SoverignBBP", "100"));
        SoverignBBTV.setText(data.getString("SoverignBB", "100"));
        SoverignBBMTV.setText(data.getString("SoverignBBM", "100"));
        SoverignBPTV.setText(data.getString("SoverignBP", "100"));
        SoverignBTV.setText(data.getString("SoverignB", "100"));
        SoverignBMTV.setText(data.getString("SoverignBM", "100"));
        SoverignCCCBelowTV.setText(data.getString("SoverignCCCBelow", "150"));
        SoverignUnratedTV.setText(data.getString("SoverignUnrated", "100"));
        SoverignUnrated2TV.setText(data.getString("SoverignUnrated2", "100"));
        PSEAAATV.setText(data.getString("PSEAAA", "20"));
        PSEAAPTV.setText(data.getString("PSEAAP", "20"));
        PSEAATV.setText(data.getString("PSEAA", "20"));
        PSEAAMTV.setText(data.getString("PSEAAM", "20"));
        PSEApTV.setText(data.getString("PSEAP", "50"));
        PSEATV.setText(data.getString("PSEA", "50"));
        PSEAMTV.setText(data.getString("PSEAM", "50"));
        PSEBBBPTV.setText(data.getString("PSEBBBP", "50"));
        PSEBBBTV.setText(data.getString("PSEBBB", "50"));
        PSEBBBMTV.setText(data.getString("PSEBBBM", "50"));
        PSEBBPTV.setText(data.getString("PSEBBP", "100"));
        PSEBBTV.setText(data.getString("PSEBB", "100"));
        PSEBBMTV.setText(data.getString("PSEBBM", "100"));
        PSEBPTV.setText(data.getString("PSEBP", "100"));
        PSEBTV.setText(data.getString("PSEB", "100"));
        PSEBMTV.setText(data.getString("PSEBM", "100"));
        PSECCCBelowTV.setText(data.getString("PSECCCBelow", "150"));
        PSEUnratedTV.setText(data.getString("PSEUnrated", "50"));
        PSEUnrated2TV.setText(data.getString("PSEUnrated2","50"));
        CoporateAAATV.setText(data.getString("CoporateAAA", "20"));
        CoporateAAPTV.setText(data.getString("CoporateAAP", "20"));
        CoporateAATV.setText(data.getString("CoporateAA", "20"));
        CoporateAAMTV.setText(data.getString("CoporateAAM", "20"));
        CoporateApTV.setText(data.getString("CoporateAP", "50"));
        CoporateATV.setText(data.getString("CoporateA", "50"));
        CoporateAMTV.setText(data.getString("CoporateAM", "50"));
        CoporateBBBPTV.setText(data.getString("CoporateBBBP", "100"));
        CoporateBBBTV.setText(data.getString("CoporateBBB", "100"));
        CoporateBBBMTV.setText(data.getString("CoporateBBBM", "100"));
        CoporateBBPTV.setText(data.getString("CoporateBBP", "100"));
        CoporateBBTV.setText(data.getString("CoporateBB", "100"));
        CoporateBBMTV.setText(data.getString("CoporateBBM", "100"));
        CoporateBPTV.setText(data.getString("CoporateBP", "150"));
        CoporateBTV.setText(data.getString("CoporateB", "150"));
        CoporateBMTV.setText(data.getString("CoporateBM", "150"));
        CoporateCCCBelowTV.setText(data.getString("CoporateCCCBelow", "150"));
        CoporateUnratedTV.setText(data.getString("CoporateUnrated", "100"));
        CoporateUnrated2TV.setText(data.getString("CoporateUnrated2","125"));
        RetailAAATV.setText(data.getString("RetailAAA", "75"));
        RetailAAPTV.setText(data.getString("RetailAAP", "75"));
        RetailAATV.setText(data.getString("RetailAA", "75"));
        RetailAAMTV.setText(data.getString("RetailAAM", "75"));
        RetailApTV.setText(data.getString("RetailAP", "75"));
        RetailATV.setText(data.getString("RetailA", "75"));
        RetailAMTV.setText(data.getString("RetailAM", "75"));
        RetailBBBPTV.setText(data.getString("RetailBBBP", "75"));
        RetailBBBTV.setText(data.getString("RetailBBB", "75"));
        RetailBBBMTV.setText(data.getString("RetailBBBM", "75"));
        RetailBBPTV.setText(data.getString("RetailBBP", "75"));
        RetailBBTV.setText(data.getString("RetailBB", "75"));
        RetailBBMTV.setText(data.getString("RetailBBM", "75"));
        RetailBPTV.setText(data.getString("RetailBP", "75"));
        RetailBTV.setText(data.getString("RetailB", "75"));
        RetailBMTV.setText(data.getString("RetailBM", "75"));
        RetailCCCBelowTV.setText(data.getString("RetailCCCBelow", "75"));
        RetailUnratedTV.setText(data.getString("RetailUnrated", "75"));
        RetailUnrated2TV.setText(data.getString("RetailUnrated2","75"));

    }

}
