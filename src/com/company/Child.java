package com.company;

public class Child {
    private int age;
    private boolean siblingInProgram;
    private int yearsOfAttendance;
    private String Name;
    private int daycareID;
    private static int nextID = 1000;

    public Child(String name, boolean siblingPlan, int currentAge){
        Name = new name();
        siblingInProgram = new siblingPlan();
        age = new currentAge();
        yearsOfAttendance = 0;
        daycareID = nextID;
        nextID++;
    }

    public double calculateBill(){

    }

}
