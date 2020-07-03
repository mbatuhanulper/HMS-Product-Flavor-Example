package com.dtsetr.flavor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dtsetr.flavor.push.GetTokenHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GetTokenHelper getTokenHelper = new GetTokenHelper();
        getTokenHelper.getToken(this);
    }
}
