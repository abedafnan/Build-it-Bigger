package com.abedafnan.jokes_display_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textView = findViewById(R.id.tv_joke_display);
        String joke;

        Intent intent = getIntent();
        if (intent != null) {
            joke = intent.getStringExtra("joke");
            textView.setText(joke);
        }
    }
}
