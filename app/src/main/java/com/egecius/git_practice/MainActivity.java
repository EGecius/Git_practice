package com.egecius.git_practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
    }


    void demo() {
        try {
        	throw new RuntimeException("Eg");
        } catch (Exception e) {
        	e.printStackTrace();
        }
        Log.v("Eg:MainActivity:21", "demo added in 'demo_2'");


    }
    
}
