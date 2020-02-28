package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DayCareFacility {
    private ArrayList<Child> students;
    private ArrayList<DayCareWorker> employees;
    private Child currentlySelectedChild;
    private DayCareWorker currentEmployee;
    private Child currentBill;
    private double balance = 0;
    private ArrayList<Child> accounts;





    public static void main(String[] args) {
        var myDaycare = new DayCareFacility();
        myDaycare.RunDayCare();

    }

    public DayCareFacility() {
        students = new ArrayList<Child>();
        employees = new ArrayList<DayCareWorker>();
    }

    private void printMenu(){
        System.out.println("What do you want to do next:");
        System.out.println("(select the number of the option)");
        System.out.println("[1] Admit Child");
        System.out.println("[2] Hire Employee");
        System.out.println("[3] Take Child out of Program");
        System.out.println("[4] Run Fire Drill");
        System.out.println("[5] End of Year");
        System.out.println("[6] Accounting");
        System.out.println("[7] to Quit");

    }



    public void RunDayCare() {
        var inputReader = new Scanner(System.in);
        while (true) {
            printMenu();
            var input = inputReader.nextInt();
            switch (input) {
                case 0:
                case 1:
                    admitChild(inputReader);
                    break;
                case 2:
                    hireEmployee(inputReader);
                    break;
                case 3:
                    System.out.println("Not ready yet");
                    break;
                case 4:
                    System.out.println("Not ready yet");
                    break;
                case 5:
                    System.out.println("Not ready yet");
                    break;
                case 6:
                    CalculateBill(inputReader);
                    doAccounting();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("That is not an option");
            }
        }
    }



    public void admitChild(Scanner passedInputReader) {
        System.out.print("Enter new child's name:");
        var name = passedInputReader.next();
        System.out.print("Enter the child's daycare ID:");
        var ID = passedInputReader.nextInt();
        currentlySelectedChild = new Child(name, ID);
        students.add(currentlySelectedChild);
        System.out.println("Created new child with name " + currentlySelectedChild.getName() + " and daycare Id of "
                + currentlySelectedChild.getDaycareID());


    }

    public void CalculateBill(Scanner passedInputReader) {
        System.out.println("Please enter child's name: ");
        var name = passedInputReader.next();
        System.out.println("Are there any siblings in the program [Y/N]: ");
        var siblingPlan = passedInputReader.nextBoolean();
        System.out.println("Please enter child's age: ");
        var currentAge = passedInputReader.nextInt();
        System.out.println("Enter how many years this has child attended: ");
        var yearsOfAttendance = passedInputReader.nextInt();
        currentBill = new Child(name, siblingPlan, currentAge, yearsOfAttendance);
        if (currentAge == 1)
            balance = balance + 400;
        else if (currentAge == 2)
            balance = balance + 300;
        else if (currentAge == 3)
            balance = balance + 200;
        else if (currentAge == 4)
            balance = balance + 200;
        else if (currentAge > 4)
            balance = balance + 100;
        if (siblingPlan.equals)
            balance = balance - (0.1 * balance);
        if (yearsOfAttendance < 0)
            balance = balance + (10 * yearsOfAttendance);
        System.out.println("Calculated bill with child " + currentBill.getName() + " age of " + currentBill.getAge() + ", " + currentBill.getYearsOfAttendance() + ", and " /*+
                currentBill.getSiblingInProgram()*/ + " of siblings in program is $" + balance);
    }

    public void doAccounting(){

    }




    public void hireEmployee(Scanner passedInputReader){
        System.out.println("Please enter employee name: ");
        var name = passedInputReader.next();
        System.out.println("Enter employee salary: ");
        var startingPay = passedInputReader.nextFloat();
        currentEmployee = new DayCareWorker(startingPay, name);
        employees.add(currentEmployee);
        System.out.println("New Employee " + currentEmployee.getName() + " will get paid " + currentEmployee.getSalary() + " per hour");

    }


    /*public void RunFireDrill(){
        System.out.println("Preforming fire drill");
        for (String  : employees){

            System.out.println(students);

        }

        }
    }*/




}
