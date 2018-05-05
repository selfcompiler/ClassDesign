package com.company.CallCenter;


public class Call {
    private Rank rank;
    private Caller caller;
    private Employee handler;
    public Call(Caller caller){
        this.caller=caller;
        this.rank=Rank.RESPONDENT;
    }
    public void setHandler(Employee employee)
    {
        this.handler=handler;
    }
    public void reply(String message){

    }
    public Rank getRank(){
        return this.rank;
    }
    public boolean setRank(Rank rank){
        this.rank=rank;
        return true;
    }
    public Rank incerementRank(){
        if(rank.equals(Rank.RESPONDENT))
            rank=Rank.MANAGER;
        else if(rank.equals(Rank.MANAGER))
            rank=Rank.DIRECTOR;
        return rank;
    }

    public void disconnectCall(){

    }

}
