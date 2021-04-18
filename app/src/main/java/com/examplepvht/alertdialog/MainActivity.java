package com.examplepvht.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btAlert;
    public static ListView listView;
    public static    ArrayList<String> arrayList;
    public static ArrayAdapter arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         AnhXa();

        btAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialogalert.Add(MainActivity.this);
            }
        });







    }
    private void  AnhXa()
    {
        listView=findViewById(R.id.listviewid);
        btAlert=findViewById(R.id.button);
        arrayList =new ArrayList<String>();
        arrayAdapter =new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

    }
}