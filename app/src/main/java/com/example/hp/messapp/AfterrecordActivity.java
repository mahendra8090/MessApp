package com.example.hp.messapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AfterrecordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterrecord);









    }

    public void month_1(View view){
        Intent i=new Intent(AfterrecordActivity.this,display_recordActivity.class);
        startActivity(i);
    }
    public void month_2(View view){
        Intent i=new Intent(AfterrecordActivity.this,display_recordActivity.class);
        startActivity(i);
    }
    public void month_3(View view){
        Intent i=new Intent(AfterrecordActivity.this,display_recordActivity.class);
        startActivity(i);
    }
    public void month_4(View view){
        Intent i=new Intent(AfterrecordActivity.this,display_recordActivity.class);
        startActivity(i);
    }

}
