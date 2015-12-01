package com.desireekelly.ipe.Triangle;

/**
 * Given a number n, print n lines, each with one asterisk.
 *
 * Created by Desiree Kelly on 30/11/2015.
 */
public class VerticalLine {

    public static void main(String[] args) {
        drawVerticalLine(3);
    }

    public static void drawVerticalLine(int size) {
        for (int x = 0; x < size; x++) {
            System.out.println("*");
        }
    }
}