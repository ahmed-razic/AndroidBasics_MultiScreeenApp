package com.example.android.multiscreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");

        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = findViewById(R.id.rootView);

        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(1));
        rootView.addView(wordView2);

        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(2));
        rootView.addView(wordView3);

        TextView wordView4 = new TextView(this);
        wordView4.setText(words.get(3));
        rootView.addView(wordView4);

        /*Log.v("NumbersActivity", "Word at index 0: " + words.get(0));
        Log.v("NumbersActivity", "Word at index 1: " + words.get(1));
        Log.v("NumbersActivity", "Word at index 2: " + words.get(2));
        Log.v("NumbersActivity", "Word at index 3: " + words.get(3));
        Log.v("NumbersActivity", "Word at index 4: " + words.get(4));
        Log.v("NumbersActivity", "Word at index 5: " + words.get(5));
        Log.v("NumbersActivity", "Word at index 6: " + words.get(6));
        Log.v("NumbersActivity", "Word at index 7: " + words.get(7));
        Log.v("NumbersActivity", "Word at index 8: " + words.get(8));
        Log.v("NumbersActivity", "Word at index 9: " + words.get(9));*/
    }
}