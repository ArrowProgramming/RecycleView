package com.example.listviewclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView =findViewById(R.id.mobile_list);
        String [] adobe_products =getResources().getStringArray(R.array.adobe_products);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview,adobe_products);
        listView.setAdapter(adapter);
    }
}