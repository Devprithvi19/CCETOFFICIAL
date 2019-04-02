package com.example.ccetofficial.java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ccetofficial.R;

public class litadapter extends BaseAdapter{
    int i[]={R.drawable.histry,R.drawable.vision,R.drawable.map1,R.drawable.contact};
    String st[]={"History","Vision and Mission","Campus Map","How To Reach Us"};
    Context c;
    public litadapter(Context c){
        this.c=c;
    }
    @Override
    public int getCount() {
        return i.length;
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
        LayoutInflater layoutInflater=(LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=layoutInflater.inflate(R.layout.holderlist,null);
        ImageView p=(ImageView)convertView.findViewById(R.id.i1);
        TextView t = (TextView)convertView.findViewById(R.id.t1);
        p.setImageResource(i[position]);
        t.setText(st[position]);
        return convertView;
    }
}
