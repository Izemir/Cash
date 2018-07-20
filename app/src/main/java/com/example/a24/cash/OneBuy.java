package com.example.a24.cash;

public class OneBuy {

    int money;
    String buyName;


    public OneBuy(int money,String buyName){
        this.buyName=buyName;
        this.money=money;
    }

    public String getMoneyString() {
        return String.valueOf(money);
    }

    public int getMoney() {
        return money;
    }

    public String getBuyName() {
        return buyName;
    }
}
