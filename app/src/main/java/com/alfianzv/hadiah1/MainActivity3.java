package com.alfianzv.hadiah1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.alfianzv.hadiah1.adaptors.DrinkAdapter;
import com.alfianzv.hadiah1.models.Drink;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    ArrayList<Drink> drinkArrayList = new ArrayList<>();
    RecyclerView rvDrinks;
    DrinkAdapter drinkAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Drink drink1 = new Drink("Drink 1", R.drawable.drink1);
        Drink drink2 = new Drink("Drink 2", R.drawable.drink2);
        Drink drink3 = new Drink("Drink 3", R.drawable.drink3);
        Drink drink4 = new Drink("Drink 4", R.drawable.drink4);

        drinkArrayList.add(drink1);
        drinkArrayList.add(drink2);
        drinkArrayList.add(drink3);
        drinkArrayList.add(drink4);

        drinkAdapter = new DrinkAdapter(this, drinkArrayList);

        rvDrinks = findViewById(R.id.rv_drinks);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rvDrinks.setLayoutManager(linearLayoutManager);
        rvDrinks.setAdapter(drinkAdapter);
    }
}