package ex35;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;


public class Lottery {
    private static final Scanner input = new Scanner(System.in);
    ArrayList<String> nameList = new ArrayList<>();

    public void fillList(){
        String userFill;
        int count = 0;
        do{
            System.out.println("Enter a name: ");
            userFill = input.nextLine();
            nameList.add(count,userFill);
            count++;

        }while(!userFill.isBlank());
        count--;
        nameList.remove(count);

    }

    public void printList(){
        for (int count = 0; count<nameList.size(); count++){
            System.out.println(count+" "+nameList.get(count));
        }
    }

    public String selectWinner(){
        SecureRandom randomNumber = new SecureRandom();
        int winner = randomNumber.nextInt(nameList.size());
        return nameList.get(winner);
    }

    public void testFill(){
        nameList.add(0,"Homer");
        nameList.add(1, "Bart");
        nameList.add(2,"Maggie");
        nameList.add(3,"Lisa");
    }
}
