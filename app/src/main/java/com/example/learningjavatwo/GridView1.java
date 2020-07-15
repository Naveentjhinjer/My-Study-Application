package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class GridView1 extends AppCompatActivity {

    GridView gv1;
    String Name[] = {"Introduction to Java", "Class,Object & Methods", "Inheritance", "Interface", "Packages", "Multithread Programming", "Exception handling", "File IO & Collection"};
    public int[] img = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six, R.drawable.seven, R.drawable.eight};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view1);
        gv1 = findViewById(R.id.grid1);
        ArrayList al = new ArrayList();
        for (int i = 0; i < Name.length; i++) {
            HashMap hm = new HashMap<>();//create a hashmap to store the data in key value pair
            hm.put("name", Name[i]);
            hm.put("image", img[i]);
            al.add(hm);
            //add the hashmap into arrayList
        }
        String[] from = {"name", "image"};//string array
        int[] to = {R.id.mytext, R.id.myimg};//int array of views id's
        SimpleAdapter sm = new SimpleAdapter(this, al, R.layout.picture, from, to);
        //SimpleAdapter s=new SimpleAdapter(this,al,R.layout.list_view_items,from,to);//Create object and set the parameters for simpleAdapter
        gv1.setAdapter(sm);//sets the adapter for listView
        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (Name[position] == "Introduction to Java") {
                    Intent intent = new Intent(getApplicationContext(), Listview1.class);
                    startActivity(intent);
                } else if (Name[position] == "Class,Object & Methods") {
                    Intent intent = new Intent(getApplicationContext(), Listview2.class);
                    startActivity(intent);
                } else if (Name[position] == "Inheritance") {
                    Intent intent = new Intent(getApplicationContext(), Listview3.class);
                    startActivity(intent);
                } else if (Name[position] == "Interface") {
                    Intent intent = new Intent(getApplicationContext(), Listview4.class);
                    startActivity(intent);
                } else if (Name[position] == "Packages") {
                    Intent intent = new Intent(getApplicationContext(), Listview5.class);
                    startActivity(intent);
                } else if (Name[position] == "Multithread Programming") {
                    Intent intent = new Intent(getApplicationContext(), Listview6.class);
                    startActivity(intent);
                } else if (Name[position] == "Exception handling") {
                    Intent intent = new Intent(getApplicationContext(), Listview7.class);
                    startActivity(intent);
                } else if (Name[position] == "File IO & Collection") {
                    Intent intent = new Intent(getApplicationContext(), Listview8.class);
                    startActivity(intent);
                }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent intent = new Intent(this, Profile.class);
                this.startActivity(intent);
                break;
            case R.id.item3:
                Intent intent2 = new Intent(this, Contxt.class);
                this.startActivity(intent2);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this, "Selected Item: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }
}


