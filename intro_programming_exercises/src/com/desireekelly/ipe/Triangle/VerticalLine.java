package com.desireekelly.ipe.Triangle;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Given a number n, prints n lines, each with one asterisk.
 *
 * Created by Desiree Kelly on 30/11/2015.
 */
public class VerticalLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = -1;

        while (number < 0) {

            try {

                System.out.print("Enter a positive integer: ");

                //get number input from console
                number = input.nextInt();
            } catch (InputMismatchException e) {

                //display error if number is not a positive integer
                System.out.println("Invalid Format");
                input.nextLine();
            }
        }
        drawVerticalLine(number);
    }
        public static void drawVerticalLine(int size) {
            //print n number of asterisks on a vertical line based on console input
            for (int x = 0; x < size; x++) {
                System.out.println("*");
            }
        }
}
