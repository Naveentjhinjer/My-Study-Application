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

public class Listview4 extends AppCompatActivity {

    ListView lv4;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview4);
        lv4 = findViewById(R.id.list4);
        getSupportActionBar().setTitle("Tutorials");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        String[] name = {"1. Defining Interface", "2. Extending Interface", "3. Implementing Interface", "4. Extending Multiple Interface", "5. Nested Interface"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text2);
                return view;
            }
        };
        lv4.setAdapter(adapter);
        lv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = lv4.getItemAtPosition(position).toString();
                Intent start = new Intent(getApplicationContext(), Pdfview3.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}
