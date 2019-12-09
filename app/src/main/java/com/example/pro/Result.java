package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        if(getIntent().hasExtra("result")){
            TextView textViewresult = findViewById(R.id.result);
            String resut = getIntent().getExtras().getString("result");
            textViewresult.setText(resut);
        }
    }
}
