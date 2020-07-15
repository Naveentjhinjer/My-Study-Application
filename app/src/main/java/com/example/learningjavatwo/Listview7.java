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

public class Listview7 extends AppCompatActivity {

    ListView lv7;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview7);
        lv7 = findViewById(R.id.list7);
        getSupportActionBar().setTitle("Tutorials");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        String[] name = {"1. Error","2. Exception","3. Multiple Catch Statement","4. Finally","5. Build-in Exception","6. Throwing our own Exception"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text2);
                return view;
            }
        };
        lv7.setAdapter(adapter);
        lv7.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = lv7.getItemAtPosition(position).toString();
                Intent start = new Intent(getApplicationContext(), Pdfview6.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}
