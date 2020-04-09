package com.example.msi.horizontalrecycleviewdemo;


import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<MainModel> mainModels;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        Integer[] langLogo = {R.drawable.nambah_produk_home_ps, R.drawable.nambah_produk_home_ps};

        String[] langName = {"halal","read"};

        mainModels = new ArrayList<>();
        for (int i=0;i<langLogo.length;i++){
            MainModel model = new MainModel(langLogo[i],langName[i]);
            mainModels.add(model);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(
                MainActivity.this, LinearLayoutManager.HORIZONTAL,false
        );
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new MainAdapter(MainActivity.this,mainModels);

        recyclerView.setAdapter(mainAdapter
        );
    }
}
