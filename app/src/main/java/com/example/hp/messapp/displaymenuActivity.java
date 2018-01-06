package com.example.hp.messapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class displaymenuActivity extends AppCompatActivity {
ArrayList<Meal> meal=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaymenu);


        meal.add(new Meal("dal",R.drawable.image11));
        meal.add(new Meal("chawal",R.drawable.image11));
        meal.add(new Meal("roti",R.drawable.image11));
        meal.add(new Meal("chola",R.drawable.image11));
        meal.add(new Meal("fried rise",R.drawable.image11));
        meal.add(new Meal("chiken",R.drawable.image11));
        meal.add(new Meal("dahi",R.drawable.image11));
        MealAdapter itemAdapter= new MealAdapter(this,meal);
        final ListView listview =(ListView)findViewById(R.id.listday_meal);
        listview.setAdapter(itemAdapter);
    }
}
