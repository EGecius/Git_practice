package com.egecius.git_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
    }
    
}
