package com.imokbox.djcarlin.rollcall04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.content.Intent;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }






}
