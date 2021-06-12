package ex25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class Password {
    private static final Scanner input = new Scanner(System.in);
    private String password;
    boolean containsLetters;
    boolean containsNumbers;
    boolean containsSpcChars;

    public void setPassword(){
        System.out.println("Enter your password: ");
        password = input.nextLine();
    }
    public void testSetPassword(String s){
        password = s;
    }

    public String getPassword() {
        return password;
    }

    public void checkLetters(String password){
        char [] chkLetter = password.toCharArray();
        for (char c: chkLetter){
            if(Character.isLetter(c)){
                containsLetters = true;
            }
        }
    }

    public void checkNumbers(String password){
        char [] chkNum = password.toCharArray();
        for(char c: chkNum){
            if(Character.isDigit(c)){
                containsNumbers = true;
            }
        }
    }

    public void checkSpecial(String password){
        char [] chkSpc = password.toCharArray();
        for (char c: chkSpc){
            if(!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)){
                containsSpcChars = true;
            }
        }
    }

    public int passwordValidator(String password){
        int strengthScore;
        checkLetters(password);
        checkNumbers(password);
        checkSpecial(password);
        if(password.length()<8){
            if (containsLetters){
                strengthScore = 2;
            }else{
                strengthScore = 1;
            }
        }else{
            if (containsLetters && containsNumbers && containsSpcChars){
                strengthScore = 4;
            }else{
                if(containsLetters && containsNumbers){
                    strengthScore = 3;
                }else{
                    if (containsLetters){
                        strengthScore = 2;
                    }else {
                        strengthScore = 1;
                    }
                }
            }

        }
        return strengthScore;
    }

    public String printValidation(int strengthScore){
        String classification = switch (strengthScore){
            case 1 -> "very weak";
            case 2 -> "weak";
            case 3 -> "strong";
            case 4 -> "very strong";
            default -> "";
        };
        return String.format("The password '%s' is a %s password.",password, classification);

    }


}
