package com.example.ccetofficial.java;

import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Toolbar;

import com.example.ccetofficial.R;

public class gridview extends BaseAdapter {

    int b[]={R.drawable.a,R.drawable.b,R.drawable.c,
            R.drawable.ccet,R.drawable.map1,R.drawable.vision,R.drawable.contact,R.drawable.campus};
    Context c;
    public gridview(Context c){
        this.c=c;

    }

    @Override
    public int getCount() {
        return b.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView=new ImageView(c);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(500,500));
        imageView.setImageResource(b[position]);
        return imageView;
    }
}
