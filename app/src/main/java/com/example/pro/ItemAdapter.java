package com.example.pro;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    String[] itmes;
    String[] prices;
    String[] descriptions;
    LayoutInflater inflater;

    public ItemAdapter(Context c, String[] i, String[] p, String[] d){
        this.itmes = i;
        this.prices = p;
        this.descriptions = d;
        inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return this.itmes.length;
    }

    @Override
    public Object getItem(int position) {
        return this.itmes[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = this.inflater.inflate(R.layout.listview_detail_object, null);
        TextView itemTextView = (TextView) v.findViewById(R.id.itemTextView);
        TextView priceTextView = (TextView) v.findViewById(R.id.priceTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        itemTextView.setText(this.itmes[position]);
        priceTextView.setText(this.prices[position]);
        descriptionTextView.setText(this.descriptions[position]);
        return v;
    }
}
