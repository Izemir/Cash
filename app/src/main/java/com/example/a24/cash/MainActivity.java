package com.example.a24.cash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button today;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        today = (Button) findViewById(R.id.button);




        today.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, TodayCash.class);
        startActivity(intent);
    }
}
