package com.company.CallCenter;

public class Respondent extends Employee {
    public Respondent(CallHandler callHandler){
        super(callHandler);
        rank=Rank.RESPONDENT;
    }
}
