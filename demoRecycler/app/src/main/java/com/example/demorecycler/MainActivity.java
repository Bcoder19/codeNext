package com.example.demorecycler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Contact> contacts;
    private ListView list;
    private ContactAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        contacts = new ArrayList<Contact>();
        list = findViewById(R.id.items);
        myAdapter = new ContactAdapter(this,contacts);

        contacts.add(new Contact(R.drawable.ic_launcher_background,"Bob","1111111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"John","1111111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Billy","1111111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Maya","1111111111"));
        contacts.add(new Contact(R.drawable.ic_launcher_background,"Josie","1111111111"));

        list.setAdapter(myAdapter);
    }
}
