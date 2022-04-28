package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<model> list;
    AdapterCls adapterCls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler1);

        list = new ArrayList<>();

        list.add(new model("Title",R.drawable.ic_launcher_background));
        list.add(new model("Title 1",R.drawable.ic_launcher_background));
        list.add(new model("Title 2",R.drawable.ic_launcher_background));
        list.add(new model("Title 3",R.drawable.ic_launcher_background));
        list.add(new model("Title 4",R.drawable.ic_launcher_background));
        list.add(new model("Title 5",R.drawable.ic_launcher_background));
        list.add(new model("Title 6",R.drawable.ic_launcher_background));
        list.add(new model("Title 7",R.drawable.ic_launcher_background));
        list.add(new model("Title 8",R.drawable.ic_launcher_background));

        adapterCls = new AdapterCls(MainActivity.this,list);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapterCls);
    }
}