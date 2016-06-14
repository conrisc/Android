package com.example.dataencryption;

import android.app.Activity;
import android.content.Context;
import android.view.*;
import android.widget.*;

public class RowAdapter extends ArrayAdapter<RowBean>{
	 
    Context context;
    int layoutResourceId;   
    RowBean data[] = null;
 
    public RowAdapter(Context context, int layoutResourceId, RowBean[] data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        RowBeanHolder holder = null;
 
        if(row == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
 
            holder = new RowBeanHolder();
            holder.imgIcon = (ImageView)row.findViewById(R.id.imgIcon);
            holder.txtTitle = (TextView)row.findViewById(R.id.txtTitle);
 
            row.setTag(holder);
        }
        else
        {
            holder = (RowBeanHolder)row.getTag();
        }
 
        RowBean object = data[position];
        holder.txtTitle.setText(object.title);
        holder.imgIcon.setImageBitmap(object.icon);
 
        return row;
    }
 
    static class RowBeanHolder
    {
        ImageView imgIcon;
        TextView txtTitle;
    }
}
