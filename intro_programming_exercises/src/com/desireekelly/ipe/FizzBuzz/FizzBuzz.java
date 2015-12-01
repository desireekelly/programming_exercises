package com.desireekelly.ipe.FizzBuzz;

/**
 * Print out the numbers 1 to 100.  Instead of numbers divisible by 3, print "Fizz".  Instead of numbers divisible by 5,
 * print "Buzz".  Instead of numbers divisible by 3 and 5, print "FizzBuzz".
 *
 * Created by Desiree Kelly on 1/12/2015.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz();
    }

    public static void fizzBuzz() {
        for (int x = 1; x <= 100; x++) {
            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else if (x % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}