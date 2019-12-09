package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Resources res = getResources();
        String[] itmes = res.getStringArray(R.array.items);
        String[] prices = res.getStringArray(R.array.prices);
        String[] descriptions = res.getStringArray(R.array.decriptions);

        ListView listView = (ListView) findViewById(R.id.listView);
        ItemAdapter itemAdapter = new ItemAdapter(this, itmes, prices, descriptions);
        listView.setAdapter(itemAdapter);
        //listView.setAdapter(new ArrayAdapter<String>(this, R.layout.list_view_detail, itmes));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent itemDetail = new Intent(getApplicationContext(), ItemDetails.class);
                itemDetail.putExtra("item", position);
                startActivity(itemDetail);
            }
        });
    }
}
