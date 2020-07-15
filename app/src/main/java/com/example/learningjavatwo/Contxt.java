package com.example.learningjavatwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Contxt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contxt);
            Button btn = (Button) findViewById(R.id.btn);
            registerForContextMenu(btn);
        }
        @Override
        public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
            super.onCreateContextMenu(menu, v, menuInfo);
            menu.setHeaderTitle("MSG ME");
            menu.add(0, v.getId(), 0, "7015595524");
        /*   menu.add(0, v.getId(), 0, "Search");
            menu.add(0, v.getId(), 0, "Share");
            menu.add(0, v.getId(), 0, "Bookmark");*/
        }
        @Override
        public boolean onContextItemSelected(MenuItem item) {
            Toast.makeText(this, "Selected Item: " +item.getTitle(), Toast.LENGTH_SHORT).show();
            return true;
        }
    }
