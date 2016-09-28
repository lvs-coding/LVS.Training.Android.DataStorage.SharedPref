package com.lvsandroid.datastoragesharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

           /*
            Simplest data storage => Shared preferences :
                Used far small amount of data, but can store arrays and variables
                Used for custom settings the user can update (main purpose)
         */
        String packageName = getApplicationContext().getPackageName();
        SharedPreferences sharedPreferences = this.getSharedPreferences(packageName, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("username","pedro").apply();

        String userName = sharedPreferences.getString("username","");
        Log.i("Username",userName);
    }
}
