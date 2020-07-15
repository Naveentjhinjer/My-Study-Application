package com.example.learningjavatwo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Listview6 extends AppCompatActivity {

    ListView lv6;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview6);
        lv6 = findViewById(R.id.list6);
        getSupportActionBar().setTitle("Tutorials");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        String[] name = {"1. Creating Thread","2. Life Cycle of Thread", "3. Thread Method","4. Thread Priorities","5. Major Concept of Multithreaded Programming"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text2);
                return view;
            }
        };
        lv6.setAdapter(adapter);
        lv6.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = lv6.getItemAtPosition(position).toString();
                Intent start = new Intent(getApplicationContext(), Pdfview5.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}
