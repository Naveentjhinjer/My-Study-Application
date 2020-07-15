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

public class Listview2 extends AppCompatActivity {

    ListView lv2;

    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview2);
        lv2 = findViewById(R.id.list2);
        getSupportActionBar().setTitle("Tutorials");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        String[] name = {"1. Object & Class", "2. Access Modifiers", "3. Declaring Member Variables", "4. Methods", "5. Method Overloading", "6. Constructor","7. Garbage Collection","8. This keyword","9. Static Members","10. Nested Classes","11. Java comment line argument"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position,convertView,parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text2);
                return view;
            }
        };
        lv2.setAdapter(adapter);
        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = lv2.getItemAtPosition(position).toString();
                Intent start = new Intent(getApplicationContext(), Pdfviewer.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}
