package com.example.admin.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class ConTactAddapter extends ArrayAdapter {

    private Context context;
    private int resource;
    private ArrayList<Contact> objects;
    public ConTactAddapter(@NonNull Context context, int resource, @NonNull ArrayList objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ViewHolder holder;
        if(convertView == null){


        convertView = LayoutInflater.from(context).inflate(R.layout.list_contact,parent,false);
        holder = new ViewHolder();
        holder.hoten = (TextView) convertView.findViewById(R.id.hotenb);
        holder.sodienthoai = (TextView) convertView.findViewById(R.id.sodienthoai);
        convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        Contact contact = objects.get(position);
        holder.hoten.setText(contact.getHoten());
        holder.sodienthoai.setText(contact.getSodt());

        return convertView;
    }

    public class ViewHolder {
        TextView hoten;
        TextView sodienthoai;
    }
}

