package com.desireekelly.ipe.Triangle;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Given a number n, print n lines, each with one more asterisk than the last.
 *
 * Created by Desiree Kelly on 30/11/2015.
 */

public class RightTriangle {

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
        drawTriangle(number);
    }

    public static void drawTriangle(int size) {
        for (int x = 0; x < size; x++) {

            for (int y = 0; y < x + 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}