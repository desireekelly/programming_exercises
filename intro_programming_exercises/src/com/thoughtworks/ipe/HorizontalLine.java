package com.thoughtworks.ipe;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Given a number n, prints n asterisks on one line.
 *
 * Created by Desiree Kelly on 30/11/2015.
 */

public class HorizontalLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = -1;

        while(number < 0){

            try{

                System.out.print("Enter a positive integer: ");

                //get number input from console
                number = input.nextInt();
            }
            catch(InputMismatchException e){

                //display error if number is not a positive integer
                System.out.println("Invalid Format");
                input.nextLine();
            }
        }

        //print n number of asterisks on a horizontal line based on console input
        for(int x = 0; x < number; x++){
            System.out.print("*");
        }

        System.out.println("");
    }
}
