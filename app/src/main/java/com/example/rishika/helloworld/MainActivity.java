package com.example.rishika.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"HELLO WORLD",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {

        Toast.makeText(this,"RESUMED",Toast.LENGTH_LONG).show();
        super.onResume();
    }

     @Override
    protected void onPause() {

        Toast.makeText(this,"PAUSE",Toast.LENGTH_LONG).show();
        super.onPause();
    }

    @Override
    protected void onStop() {

        Toast.makeText(this,"STOP",Toast.LENGTH_LONG).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {


        super.onDestroy();
    }
}
