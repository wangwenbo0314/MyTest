package com.example.administrator.mytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruits() {
        for (int i = 0; i< 2;i++){
            Fruit apple = new Fruit("Apple",R.mipmap.ic_launcher);
            fruitList.add(apple);
            Fruit banana = new Fruit("Banana",R.mipmap.ic_launcher);
            fruitList.add(banana);
            Fruit orange = new Fruit("Orange",R.mipmap.ic_launcher);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("Watermelon",R.mipmap.ic_launcher);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("Pear",R.mipmap.ic_launcher);
            fruitList.add(pear);
            Fruit grapr = new Fruit("Grapr",R.mipmap.ic_launcher);
            fruitList.add(grapr);
            Fruit pineapple = new Fruit("Pineapple",R.mipmap.ic_launcher);
            fruitList.add(pineapple);
            Fruit strawbarry = new Fruit("Strawbarry",R.mipmap.ic_launcher);
            fruitList.add(strawbarry);
            Fruit charry = new Fruit("Charry",R.mipmap.ic_launcher);
            fruitList.add(charry);
            Fruit mango = new Fruit("Mango",R.mipmap.ic_launcher);
            fruitList.add(mango);
        }
    }
}
