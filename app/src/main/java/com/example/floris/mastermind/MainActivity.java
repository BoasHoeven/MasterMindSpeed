package com.example.floris.mastermind;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClickStart(View v) {
        if (v.getId() == R.id.button)
        {
           Intent i = new Intent(MainActivity.this, Start.class);
           startActivity(i);
        }
    }
   }
