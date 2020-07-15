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

public class Listview1 extends AppCompatActivity {

    ListView lv1;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview1);
        lv1 = findViewById(R.id.list1);
        getSupportActionBar().setTitle("Tutorials");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        String[] name = {"1. Introduction to Java", "2. Setup for Java", "3. Java Components", "4. Variables and Data Type", "5. Basic Operators", "6. Flow Control"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = lv1.getItemAtPosition(position).toString();
                Intent start = new Intent(getApplicationContext(), Webview1.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}