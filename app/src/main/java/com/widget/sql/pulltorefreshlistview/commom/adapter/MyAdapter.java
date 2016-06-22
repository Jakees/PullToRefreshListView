package com.widget.sql.pulltorefreshlistview.commom.adapter;

/**
 * Created by SQL on 2016/6/22.
 */

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.widget.sql.pulltorefreshlistview.R;
import com.widget.sql.pulltorefreshlistview.commom.listener.ButtonListener;

public class MyAdapter extends BaseAdapter {
    List<String> items;
    Context context;

    public MyAdapter(Context context, List<String> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_layout, null);

        Button button = (Button) view.findViewById(R.id.btn);
        button.setText(items.get(position));
        button.setOnClickListener(new ButtonListener(context, position));


        return view;
    }

}