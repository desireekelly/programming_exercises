package com.desireekelly.ipe.FizzBuzz;

/**
 * Prints out the numbers 1 to 100.  Instead of numbers divisible by 3, prints "Fizz".  Instead of numbers divisible by 5,
 * prints "Buzz".  Instead of numbers divisible by 3 and 5, prints "FizzBuzz".
 * <p/>
 * Created by Desiree Kelly on 1/12/2015.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz();
    }

    public static void FizzBuzz() {
        //loop through numbers 1 to 100
        for (int x = 1; x <= 100; x++) {
            //if number is divisible by 3 and 5
            if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            //if number is divisible by 3
            else if (x % 3 == 0) {
                System.out.println("Fizz");
            }
            //if number is divisible by 5
            else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(x);
            }
        }
    }
}