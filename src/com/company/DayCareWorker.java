package com.company;

import java.util.ArrayList;

public class DayCareWorker {
    private String Name;
    private float salary;
    private ArrayList<Child> childrenInGroup;



    public DayCareWorker(float startingPay, String name){
        Name =  name;
        salary = startingPay;

    }


    public String getName(){
        return Name;
    }

    public float getSalary(){
        return salary;
    }

    /*public void performanceReview(){

    }

    public boolean addChild(Child newKid){


    }

    public String preformFireDrill(){

    }

    public void removeChild(int daycareID){

    }
*/

}


