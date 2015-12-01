package com.desireekelly.ipe.FizzBuzz;

/**
 * Created by Desiree on 30/11/2015.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        FizzBuzz();

    }

    public static void FizzBuzz() {

        for (int x = 1; x <= 100; x++) {

            if ((x % 3 == 0) && (x % 5 != 0)) {
                System.out.println("Fizz");
            }
            else if ((x % 5 == 0) && (x % 3 != 0)) {
                System.out.println("Buzz");
            }
            else if ((x % 3 == 0) && (x % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(x);
            }
        }
    }
}