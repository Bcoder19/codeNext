package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        ArrayList<CategoryItem> listOfAlbums = new ArrayList<>();

        listOfAlbums.add(new CategoryItem("Talk",R.drawable.talk));
        listOfAlbums.add(new CategoryItem("Loud",R.drawable.loud));
        listOfAlbums.add(new CategoryItem("Bad",R.drawable.bad));
        listOfAlbums.add(new CategoryItem("Aladdin Sane",R.drawable.aladdin_sane));

        ListView albumListView = findViewById(R.id.albumsListView);

        CategoryAdapter albumApdater = new CategoryAdapter(this,listOfAlbums);

        albumListView.setAdapter(albumApdater);

    }
}
