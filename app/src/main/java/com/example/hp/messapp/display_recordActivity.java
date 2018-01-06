package com.example.hp.messapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class display_recordActivity extends AppCompatActivity {
ArrayList<Record> rec=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_record);

        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));
        rec.add(new Record("1","YES","YES","YES","15"));

        Record_adapter itemAdapter= new Record_adapter(this,rec);
        final ListView listview =(ListView)findViewById(R.id.list_record);
        listview.setAdapter(itemAdapter);




    }
}
