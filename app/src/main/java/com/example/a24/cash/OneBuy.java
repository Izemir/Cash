package com.example.a24.cash;

public class OneBuy {

    int money;
    String buyName;


    public OneBuy(int money,String buyName){
        this.buyName=buyName;
        this.money=money;
    }

    public int getMoney() {
        return money;
    }

    public String getBuyName() {
        return buyName;
    }
}
