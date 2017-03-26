package com.example.quoctuan.gridview.adapter;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.quoctuan.gridview.R;

import java.util.List;

public class HinhAdapter extends ArrayAdapter<Integer>{

    Activity context;
    @LayoutRes int resource;
    @NonNull List<Integer> objects;

    public HinhAdapter(@NonNull Activity context, @LayoutRes int resource, @NonNull List<Integer> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.objects=objects;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View row = inflater.inflate(this.resource,null);
        ImageView img= (ImageView) row.findViewById(R.id.imgH1);
        img.setImageResource(this.objects.get(position));
        return row;
    }
}
