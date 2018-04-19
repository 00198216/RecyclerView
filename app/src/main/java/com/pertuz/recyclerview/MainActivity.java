package com.pertuz.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    SeriesAdapter adapter;
    ArrayList<Serie> series;
    LinearLayoutManager lManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        series= new ArrayList<>();

        rv = findViewById(R.id.recycler);
        rv.setHasFixedSize(true);

        lManager= new LinearLayoutManager(this);
        rv.setLayoutManager(lManager);

        prepareSeries();

        adapter= new SeriesAdapter(series,this);
        rv.setAdapter(adapter);
    }

   public void prepareSeries(){

        String TAG= "Mensaje";
        series= new  ArrayList<>();
        series.add(new Serie("Super Smesh Bras","4",R.drawable.smash,"LUCINA MAKES IT PERFECT"));
       series.add(new Serie("Super Smesh Bras 64","1",R.drawable.smash1,"LE CLASSIC"));
       series.add(new Serie("Super Smesh Bras Melee","2",R.drawable.smash2,"HARDCORE"));

   }
}
