package com.example.ccetofficial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import com.example.ccetofficial.java.litadapter;

public class Aboutccet extends AppCompatActivity {
    Toolbar toolbar;
    ImageView imageView;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutccet);
        toolbar=(Toolbar)findViewById(R.id.tb);
        listView=(ListView)findViewById(R.id.lv);
        imageView=(ImageView)findViewById(R.id.iv1);
        toolbar.setTitle("CCET");
        toolbar.setSubtitle("DEGREE WING");
        setSupportActionBar(toolbar);
        litadapter ad=new litadapter(this);
        listView.setAdapter((ListAdapter) ad);
    }

    private void setSupportActionBar(Toolbar toolbar) {

    }

}
