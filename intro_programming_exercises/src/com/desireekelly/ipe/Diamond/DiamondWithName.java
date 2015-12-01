package com.desireekelly.ipe.Diamond;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Given a number n, print a centred diamond with your name in place of the middle line.
 *
 * Created by Desiree Kelly on 1/12/2015.
 */
public class DiamondWithName {

    public static void main (String[] args){

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

        drawDiamond(number, "Desiree");
    }

    public static void drawDiamond(int size, String name){

        Diamond diamond = new Diamond();
        drawTopTriangle(size);
        System.out.println(name);
        diamond.drawReverseTriangle(size);

    }

    public static void drawTopTriangle(int size){

        //loop through rows
        for(int x = 0; x < size-1; x++)
        {
            //print spaces
            for(int y = 0; y <= size-x; y++)
            {
                System.out.print(" ");
            }
            //print asterisks
            for(int z = 0 ;z <= 2 * x; z++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}