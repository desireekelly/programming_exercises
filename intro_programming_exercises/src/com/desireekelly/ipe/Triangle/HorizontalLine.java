package com.desireekelly.ipe.Triangle;

/**
 * Given a number n, print n asterisks on one line.
 *
 * Created by Desiree Kelly on 30/11/2015.
 */

public class HorizontalLine {

    public static void main(String[] args) {
        drawHorizontalLine(8);
    }

    public static void drawHorizontalLine(int size) {
        for (int x = 0; x < size; x++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}