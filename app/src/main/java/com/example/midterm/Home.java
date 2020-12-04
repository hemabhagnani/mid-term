package com.example.midterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.midterm.MyHomeData;
import com.example.midterm.MyHomeDataAdapter;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {

    MyHomeDataAdapter myAdapter;
    private List<MyHomeData> myHomeData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myHomeData = new ArrayList<MyHomeData>();
        myHomeData.add(new MyHomeData("mid terms"));
        myHomeData.add(new MyHomeData("Projects"));
        myHomeData.add(new MyHomeData("Office Works"));
        myAdapter = new MyHomeDataAdapter(myHomeData,this);
        recyclerView.setAdapter(myAdapter);
    }

    public void addNew(View view) {
        EditText editText = findViewById(R.id.editTextTextPersonName);
        String add = editText.getText().toString();
        myHomeData.add(new MyHomeData(add));
        myAdapter.notifyDataSetChanged();

    }
}
