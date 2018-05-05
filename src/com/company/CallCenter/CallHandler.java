package com.company.CallCenter;

import sun.awt.geom.AreaOp;

import java.util.List;

public class CallHandler {
    private final int LEVELS=3;
    private final int NUM_RESPONDENTS=10;
    private final int NUM_MANAGERS=4;
    private final int NUM_DIRECTORS=2;
    List< List <Employee>> emloyeesByLevels;
    List< List <Call> > callQueues;
    public CallHandler(){

    }
    public Employee getHandlerForCall(Call call){
        return emloyeesByLevels.get(0).get(0);
    }
    public void dispatchCall(Caller caller){
        Call call=new Call(caller);
        dispatchCall(call);
    }
    public void dispatchCall(Call call){
        Employee employee=getHandlerForCall(call);
        if(employee!=null){
            employee.recieveCall(call);
            call.setHandler(employee);
        }else{
            call.reply("Please wait for free employee to reply");
            int level=0;
            if(call.getRank().toString().equalsIgnoreCase("RESPONDENT"))
                level=0;
            else if(call.getRank().toString().equalsIgnoreCase("MANAGER"))
                level=1;
            else if(call.getRank().toString().equalsIgnoreCase("DIRECTOR"))
                level=2;
            callQueues.get(level).add(call);
        }
    }
    public boolean assignCall(Employee employee){
        return true;
    }
}
