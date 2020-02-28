package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class DayCareWorker {
    private String Name;
    private float salary;
    private ArrayList<Child> childrenInGroup;
    private ArrayList<DayCareFacility> employee;


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

    public void performanceReview(){
        var randGenerator = new Random();
        var number = randGenerator.nextInt(5)+1;
        var poor = 1;
        var below = 2;
        var meets = 3;
        var exceeds = 4;
        var spec = 5;
        for(DayCareFacility name: employee) {
            if (poor == number)
                salary = (float) (salary + (0.01 * salary));
            else if (below == number)
                salary = (float) (salary + (0.01 * salary));
            else if (meets == number)
                salary = (float) (salary + (0.01 * salary));
            else if (exceeds == number)
                salary = (float) (salary + (0.01 * salary));
            else if (spec == number)
                salary = (float) (salary + (0.01 * salary));
        }
    }



    public boolean addChild(Child newKid){

        return false;
    }

    public void preformFireDrill(){


    }

    public void removeChild(int daycareID){

    }


}


