package com.desireekelly.ipe.PrimeFactors;

import java.util.ArrayList;

/**
 * Given an integer n will return a list of integers such that the numbers are the factors of n and are arranged in
 * increasing numerical order.
 *
 * Created by Desiree Kelly on 1/12/2015.
 */
public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println(generate(30));
    }

    public static ArrayList<Integer> generate(int n) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int x = 2; x <= n; x++) {
            while (n % x == 0) {
                numbers.add(x);
                n = n / x;
            }
        }
        return numbers;
    }
}