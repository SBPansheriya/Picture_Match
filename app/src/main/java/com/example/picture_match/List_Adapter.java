package com.example.picture_match;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class List_Adapter extends BaseAdapter
{
    No_Time_Limit_Activity no_time_limit_activity;
    int[] levelno;
    public List_Adapter(No_Time_Limit_Activity no_time_limit_activity, int[] levelno) {
        this.no_time_limit_activity = no_time_limit_activity;
        this.levelno = levelno;
    }

    @Override
    public int getCount() {
        return levelno.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(no_time_limit_activity).inflate(R.layout.activity_list_item,parent,false);

        TextView textView = convertView.findViewById(R.id.txtview);
        textView.setText("LEVEL "+levelno[position]);
        return convertView;
    }
}