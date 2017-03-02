package com.example.hishamahmed.capitalchargecalculator;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle v) {
        super.onCreate(v);
        setContentView(R.layout.splash);
        final SharedPreferences sh = getSharedPreferences("firstrun",MODE_PRIVATE);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    boolean run = sh.getBoolean("run",false);
                    if(run)
                    {
                        Intent i = new Intent("android.intent.action.SPLASH");
                        startActivity(i);
                    }
                    else{
                        Intent i = new Intent("android.intent.action.PREFERENCE");
                        startActivity(i);
                    }
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}