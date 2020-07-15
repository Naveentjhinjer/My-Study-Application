package com.example.learningjavatwo.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learningjavatwo.R;

import java.util.ArrayList;

public class ExampleAdapter extends RecyclerView.Adapter<ExampleAdapter.ExampleViewHolder> {
    private ArrayList<ExampleItem> mExampleList;
    public Context context;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView1;
        public TextView mTextView2;
        public RecyclerView childRv;

        public ExampleViewHolder(View itemView) {
            super(itemView);

            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
            childRv = itemView.findViewById(R.id.ChildRv);
        }
    }

    public ExampleAdapter(ArrayList<ExampleItem> exampleList, Context context) {
        this.mExampleList = exampleList;
        this.context = context;

    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_example_item, parent, false);
        return new ExampleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {

        ExampleItem currentItem = mExampleList.get(position);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        holder.childRv.setLayoutManager(layoutManager);
        holder.childRv.setHasFixedSize(true);
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        ArrayList<DataItem> aDataList = new ArrayList<>();
        if (mExampleList.get(position).getText1().equals("Basic Computer Skills")) {
            aDataList.add(new DataItem(R.drawable.word, "Ms Word"));
            aDataList.add(new DataItem(R.drawable.excel, "Ms Excel"));
            aDataList.add(new DataItem(R.drawable.powerpoint, "Ms Powerpoint"));
        }
        if (mExampleList.get(position).getText1().equals("Programming Language")) {
            aDataList.add(new DataItem(R.drawable.c, "C Tutorials"));
            aDataList.add(new DataItem(R.drawable.cplus, "C++ Tutorials"));
            aDataList.add(new DataItem(R.drawable.java, "Java Tutorials"));
            aDataList.add(new DataItem(R.drawable.js, "JavaScript Tutorials"));
            aDataList.add(new DataItem(R.drawable.php, "PHP Tutorials"));
            aDataList.add(new DataItem(R.drawable.python, "Python Tutorials"));
        }
        if (mExampleList.get(position).getText1().equals("Become a Web Developer")) {
            aDataList.add(new DataItem(R.drawable.html, "HTML Tutorials"));
            aDataList.add(new DataItem(R.drawable.css, "CSS Tutorials"));
            aDataList.add(new DataItem(R.drawable.js, "JavaScript Tutorials"));
            aDataList.add(new DataItem(R.drawable.jquery, "JQuery Tutorials"));
        }
        if (mExampleList.get(position).getText1().equals("Become a Android Developer")) {
            aDataList.add(new DataItem(R.drawable.android, "Android Tutorials"));
            aDataList.add(new DataItem(R.drawable.sqlite, "SQLite Tutorials"));
            aDataList.add(new DataItem(R.drawable.json, "Json Tutorials"));
        }

        DataAdapter dataAdapter = new DataAdapter(aDataList, holder.childRv.getContext());
        holder.childRv.setAdapter(dataAdapter);
    }

    @Override
    public int getItemCount() {
        return mExampleList.size();
    }
}