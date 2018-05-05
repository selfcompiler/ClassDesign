package com.company.CallCenter;

abstract class Employee {
    private Call currentCall=null;
    protected Rank rank;
    public Employee(CallHandler callHandler){

    }
    public void recieveCall(Call call){

    }
    public void callCompleted(){

    }
    public void escalateAndReassign(){

    }
    public void assignNewCall(){

    }
    public boolean isFree(){
        return currentCall==null;
    }
    public Rank getRank(){
        return rank;
    }
}
