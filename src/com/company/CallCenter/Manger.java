package com.company.CallCenter;

public class Manger extends Employee {
    public Manger(CallHandler callHandler){
        super(callHandler);
        rank=Rank.MANAGER;
    }
}
