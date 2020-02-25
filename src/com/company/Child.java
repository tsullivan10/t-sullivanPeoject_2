package com.company;

public class Child {
    private int age;
    private boolean siblingInProgram;
    private int yearsOfAttendance;
    private String Name;
    private int daycareID;
    private static int nextID = 1000;


    public Child(String name, boolean siblingPlan, int currentAge){
        Name =  name;
        siblingInProgram = siblingPlan;
        age = currentAge;
        yearsOfAttendance = 0;
        daycareID = nextID;
        nextID++;
    }





}
