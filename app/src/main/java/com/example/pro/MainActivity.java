package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edit1 = (EditText) findViewById(R.id.number1);
                EditText edit2 = (EditText) findViewById(R.id.number2);
                TextView textView = (TextView) findViewById(R.id.result);

                int number1 = edit1.getText().length()!=0 ? Integer.parseInt(edit1.getText().toString()) : 0;
                int number2 = edit2.getText().length()!=0 ? Integer.parseInt(edit2.getText().toString()) : 0;
                textView.setText(number1+number2+"");
                Intent resultIntent = new Intent(getApplicationContext(), Result.class);
                resultIntent.putExtra("result", number1+number2+"");
                startActivity(resultIntent);
            }
        });

        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uri = "https://google.com";
                Uri webAddress = Uri.parse(uri);
                Intent navInetent = new Intent(Intent.ACTION_VIEW, webAddress);
                if(navInetent.resolveActivity(getPackageManager()) != null){
                    startActivity(navInetent);
                }
            }
        });

        Button listBtn = (Button) findViewById(R.id.listBtn);
        listBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent listIntent = new Intent(getApplicationContext(), List.class);
                startActivity(listIntent);
            }
        });
    }
}
