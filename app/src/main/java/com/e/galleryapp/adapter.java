package com.e.galleryapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class adapter extends BaseAdapter {
    Context context;
    List<Integer> image=new ArrayList<>();
    List<String> name=new ArrayList<>();
    LayoutInflater inflater;

    public adapter(Context context, List<Integer> image) {
        this.context = context;
        this.image = image;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return image.size();
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
        View view=inflater.inflate(R.layout.gridlayout,null);
        ImageView img=view.findViewById(R.id.imageView);
        TextView textView=view.findViewById(R.id.textView);
        img.setImageResource(image.get(position));
        textView.setText("image");
        return view;
    }
}
