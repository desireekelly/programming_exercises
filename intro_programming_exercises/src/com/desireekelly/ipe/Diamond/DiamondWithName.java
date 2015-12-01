package com.desireekelly.ipe.Diamond;

/**
 * Given a number n, print a centred diamond with your name in place of the middle line.
 *
 * Created by Desiree Kelly on 1/12/2015.
 */
public class DiamondWithName {

    public static void main(String[] args) {
        drawDiamond(3, "Desiree");
    }

    public static void drawDiamond(int size, String name) {
        drawTopTriangle(size);
        System.out.println(name);
        Diamond.drawReverseTriangle(size);
    }

    public static void drawTopTriangle(int size) {
        //loop through rows
        for (int x = 0; x < size - 1; x++) {
            //print spaces
            for (int y = 0; y <= size - x; y++) {
                System.out.print(" ");
            }
            //print asterisks
            for (int z = 0; z <= 2 * x; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}