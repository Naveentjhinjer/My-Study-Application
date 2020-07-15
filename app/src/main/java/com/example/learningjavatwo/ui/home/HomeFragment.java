package com.example.learningjavatwo.ui.home;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.learningjavatwo.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<ExampleItem> exampleList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        exampleList.add(new ExampleItem("Basic Computer Skills", "Learn Basic at your own pace.Become an expert"));
        exampleList.add(new ExampleItem("Programming Language", "Learn Programming Language at your own pace.Become an expert"));
        exampleList.add(new ExampleItem("Become a Web Developer", "Learn Web development at your own pace.Become an expert"));
        exampleList.add(new ExampleItem("Become a Android Developer", "Learn Android Development at your own pace.Become an expert"));
        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mAdapter = new ExampleAdapter(exampleList,view.getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
        return view;
    }
}
