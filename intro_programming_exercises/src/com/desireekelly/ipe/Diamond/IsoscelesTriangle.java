package com.desireekelly.ipe.Diamond;

/**
 * Given a number n, print a centred triangle.
 *
 * Created by Desiree Kelly on 1/12/2015.
 */
public class IsoscelesTriangle {

    public static void main(String[] args) {
        drawTriangle(3);
    }

    public static void drawTriangle(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y <= size - x; y++) {
                System.out.print(" ");
            }
            for (int z = 0; z <= 2 * x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}