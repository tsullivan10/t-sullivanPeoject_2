package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class DayCareFacility {
    private ArrayList<Child> students;
    private ArrayList<DayCareWorker> employees;
    private Child currentlySelectedChild;


    public static void main(String[] args) {

    }

    public void RunDayCare(){

    }

    public void admitChild(Scanner passedInputReader){
        System.out.print("Enter new child's name:");
        var name = passedInputReader.next();
        System.out.print("Enter the child's daycare ID:");
        var ID = passedInputReader.nextInt();


    }
}
