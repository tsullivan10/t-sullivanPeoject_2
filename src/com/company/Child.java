package com.company;

public class Child {
    private int age;
    private boolean siblingInProgram;
    private int yearsOfAttendance = 0;
    private String Name;
    private int daycareID;
    private static int nextID = 1000;



    public Child(String name, boolean siblingPlan, int currentAge, int year){
        Name =  name;
        siblingInProgram = siblingPlan;
        age = currentAge;
        yearsOfAttendance = 0;
        this.daycareID = nextID;
        nextID++;
    }


    public String getName() {
        return Name;
    }

    public int getDaycareID() {
        return daycareID;
    }

    public int getAge(){
        return age;
    }

    public int getYearsOfAttendance(){
        return yearsOfAttendance;
    }

    public boolean getSiblingInProgram(){
        return siblingInProgram;
    }





}
