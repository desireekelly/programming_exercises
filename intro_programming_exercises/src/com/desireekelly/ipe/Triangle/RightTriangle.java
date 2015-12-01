package com.desireekelly.ipe.Triangle;

/**
 * Given a number n, print n lines, each with one more asterisk than the last.
 *
 * Created by Desiree Kelly on 30/11/2015.
 */

public class RightTriangle {

    public static void main(String[] args) {

        drawTriangle(3);
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