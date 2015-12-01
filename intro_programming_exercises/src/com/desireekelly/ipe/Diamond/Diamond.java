package com.desireekelly.ipe.Diamond;

/**
 * Given a number n, print a centred diamond.
 *
 * Created by Desiree Kelly on 1/12/2015.
 */
public class Diamond {

    public static void main(String[] args) {

        int number = 3;

        drawTriangle(number);
        drawReverseTriangle(number);
    }

    public static void drawTriangle(int size){

        //loop through rows
        for(int x = 0; x < size; x++)
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

    public static void drawReverseTriangle(int size){

        //reverse the loop from drawTriangle
        for(int x = size -2; x >= 0; x--)
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