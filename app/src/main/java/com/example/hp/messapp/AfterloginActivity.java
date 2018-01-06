package com.example.hp.messapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AfterloginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterlogin);
    }


    public void today_meal(View view){
        Intent i=new Intent(AfterloginActivity.this,AftermealActivity.class);
        startActivity(i);
    }

    public void my_record(View view){
        Intent i=new Intent(AfterloginActivity.this,AfterrecordActivity.class);
        startActivity(i);
    }
    public void total_money(View view){
        Intent i=new Intent(AfterloginActivity.this,Aftertotal_moneyActivity.class);
        startActivity(i);
    }
    public void suggestion(View view){
        Intent i=new Intent(AfterloginActivity.this,After_suggActivity.class);
        startActivity(i);
    }
    public void feedback(View view){
        Intent i=new Intent(AfterloginActivity.this,After_feedbackActivity.class);
        startActivity(i);
    }


}
