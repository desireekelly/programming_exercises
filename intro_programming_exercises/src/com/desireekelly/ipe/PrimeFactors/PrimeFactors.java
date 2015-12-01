package com.desireekelly.ipe.PrimeFactors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Given an integer n will return a list of integers such that the numbers are the factors of n and are arranged in
 * increasing numerical order.
 *
 * Created by Desiree Kelly on 1/12/2015.
 */
public class PrimeFactors {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int number = -1;

        while(number < 0){

            try{

                System.out.print("Enter a positive integer: ");

                //get number input from console
                number = input.nextInt();
            }
            catch(InputMismatchException e){

                //display error if number is not a positive integer
                System.out.println("Invalid Format");
                input.nextLine();
            }
        }

        System.out.println(generate(number));
    }

    public static ArrayList<Integer> generate(int n){

        //ArrayList to hold factors
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //loop through each factor x
        for(int x = 2; x <= n; x++){

            //if x is a factor of n divide
            while(n % x == 0){
                numbers.add(x);
                n = n / x;
            }
        }

        //Sort ArrayList in ascending order
        Collections.sort(numbers);

        return numbers;
    }
}