package ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Employee {
    private static final Scanner input = new Scanner(System.in);
    ArrayList<String> employeeList = new ArrayList<>(5);
    private int employeeCount;

    public void initializeEmployeeList(){
        employeeList.add(0, "John Smith");
        employeeList.add(1, "Jackie Jackson");
        employeeList.add(2, "Chris Jones");
        employeeList.add(3, "Amanda Cullen");
        employeeList.add(4, "Jeremy Goodwin");

        employeeCount = employeeList.size();
    }


    public void printEmployeeList(){
        System.out.println();
        System.out.println("There are "+employeeCount+" employees:");
        for (int count = 0; count<employeeCount; count++){
            System.out.println(employeeList.get(count));
        }
        System.out.println();
    }

    public String selectEmployee(){
        String removeEmp;
        int search = 0;
        do{
            System.out.println("Enter an employee name to remove: ");
            removeEmp = input.nextLine();
            for(String employee : employeeList){
                if (employee.contains(removeEmp)) {
                    search = 1;
                    break;
                }
            }
            if (search<1){
                System.out.println("Employee name not recognized.");
                System.out.println("Please type the employee name exactly as it appears in the list.");
            }

        }while (search<1);
        return removeEmp;
    }

    public void removeEmployee(String employee){
        employeeList.remove(employee);
        employeeCount--;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }
}
