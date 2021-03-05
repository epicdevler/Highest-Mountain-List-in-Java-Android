package com.epicdevler.highestmountain;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button showMeButton;
    private TextView showTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMeButton = findViewById(R.id.buttonID);
        showTextView = findViewById(R.id.textID);

        final String[] mountains = {"Mount Everest", "Kelimanjaro", "Makulu", "Kamet", "Trivor", "K12", "Ulter", "Mana"};

        showMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                int randNum = rand.nextInt(mountains.length);

                showTextView.setText(mountains[randNum]);
                Toast.makeText(MainActivity.this, mountains[randNum], Toast.LENGTH_SHORT).show();
            }
        });
    }

}