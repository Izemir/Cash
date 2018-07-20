package com.example.a24.cash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.ArrayList;


public class TodayCash extends AppCompatActivity {

    OneBuy first = new OneBuy(24, "IceCream"),
            second = new OneBuy(144,"Chips"),
            third = new OneBuy(2500,"Fridge");

    public ArrayList<OneBuy> list = new ArrayList<OneBuy>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_cash);

            list.add(first);
            list.add(second);
            list.add(third);






        LinearLayout linLayout = (LinearLayout) findViewById(R.id.linLayout);

        LayoutInflater ltInflater = getLayoutInflater();

        int Summ=0;

        for (int i = 0; i < list.size(); i++) {



            if(i==0){
                Summ=0;
            }

            Summ=+list.get(i).getMoney();

            View item = ltInflater.inflate(R.layout.one_buy, linLayout, false);
            TextView product = (TextView) item.findViewById(R.id.what_buy);
            product.setText(list.get(i).getBuyName());
            TextView price = (TextView) item.findViewById(R.id.price);
            price.setText(list.get(i).getMoneyString());
            Button delete = (Button) item.findViewById(R.id.deleteButton);
            delete.setText("Minus");
            item.getLayoutParams().width = LinearLayout.LayoutParams.MATCH_PARENT;

            linLayout.addView(item);
        }




    }












}
