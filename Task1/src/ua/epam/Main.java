package ua.epam;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int randomValue = random.nextInt(100);
        int maxRange = 100;
        int minRange = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> userInputList = new ArrayList<Integer>();
        System.out.println("Input value in range 0-100");
        int userValue = 0;
        while (true) {
            try {
                userValue = Integer.parseInt(reader.readLine());
                if ((userValue < minRange) || (userValue > maxRange)) {
                    throw new IndexOutOfBoundsException();
                }
                else if(userValue == randomValue) {
                    System.out.println("Congratilation! "+userValue+" is correct answer");
                    break;
                }
                else {
                    for(int listElement : userInputList){
                        if(userValue == listElement) {
                            throw new InvalidParameterException();
                        }
                    }
                    if(userValue < randomValue) {
                        minRange = userValue;
                    }
                    else {
                        maxRange = userValue;
                    }
                    userInputList.add(userValue);
                }
                System.out.println("Sought value in range ["+minRange+" ,"+maxRange+"]");
                System.out.println("Your inputs: "+ userInputList.toString());
            }
            catch (IndexOutOfBoundsException ex) {
                System.out.println("Your input is out of range");
            }
            catch (InvalidParameterException ex) {
                System.out.println("You have entered this value before");
            }
            catch (Exception ex){
                System.out.println("Incorrect input");
            }
        }
    }
}
