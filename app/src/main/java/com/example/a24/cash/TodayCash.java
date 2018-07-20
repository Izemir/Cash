package com.example.a24.cash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.ArrayList;
import java.util.List;

public class TodayCash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_cash);
    }

    OneBuy first = new OneBuy(24, "IceCream"),
            second = new OneBuy(144,"Chips");

    public ArrayList<OneBuy> list = new ArrayList<OneBuy>();




}
