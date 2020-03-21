package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        ArrayList<CategoryItem> listOfArtists = new ArrayList<>();
        listOfArtists.add(new CategoryItem("Khalid",R.drawable.khalid));
        listOfArtists.add(new CategoryItem("Rihanna",R.drawable.rihanna));
        listOfArtists.add(new CategoryItem("Michael Jackson", R.drawable.michael_jackson));
        listOfArtists.add(new CategoryItem("David Bowie", R.drawable.david_bowie));

        ListView artistListView = findViewById(R.id.artistsListView);

        CategoryAdapter artistAdapter = new CategoryAdapter(this,listOfArtists);

        artistListView.setAdapter(artistAdapter);

    }
}
