package ex34;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
public class App {
    public static void main(String[] args){
        Employee userList = new Employee();
        userList.initializeEmployeeList();
        userList.printEmployeeList();
        String target = userList.selectEmployee();
        userList.removeEmployee(target);
        userList.printEmployeeList();
    }

}
