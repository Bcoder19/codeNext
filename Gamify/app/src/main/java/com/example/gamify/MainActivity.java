package com.example.gamify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openRockPaperScissors(View view) {
        Intent intent = new Intent(this,RockPaperScissorsActivity.class);
        startActivity(intent);
    }

    public void openTicTacToe(View view) {
        Intent intent = new Intent(this,TicTacToeActivity.class);
        startActivity(intent);
    }

    public void openNim(View view) {
        Intent intent = new Intent(this,NimActivity.class);
        startActivity(intent);
    }
}
