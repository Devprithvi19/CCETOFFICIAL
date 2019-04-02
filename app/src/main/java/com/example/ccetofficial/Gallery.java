package com.example.ccetofficial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.ccetofficial.java.gridview;

public class Gallery extends AppCompatActivity {
    GridView g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        g=(GridView)findViewById(R.id.g1);
        gridview gv=new gridview(this);
        g.setAdapter(gv);

    }
}
