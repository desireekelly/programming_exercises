# Programming Exercises

## Running the Java source code
1. Use git clone to pull down the source code
2. Run the source code in IntelliJ/Java.

This repository includes Java solutions for the following Programming Exercises:

##Triangle Exercises

### Easiest exercise ever
Print one asterisk to the console.
Example:

\*

### Draw a horizontal line
Given a number n, print n asterisks on one line.
Example when n=8.

\*\*\*\*\*\*\*\*

### Draw a vertical line
Given a number n, print n lines, each with one asterisk.
Example when n=3.

\*<br />
\*<br />
\*

### Draw a right triangle
Given a number n, print n lines, each with one more asterisk than the last.
Example when n=3.

\*<br />
\*\*<br />
\*\*\*

## Diamond Exercises

### Isosceles Triangle
Given a number n, print a centered triangle.
Example for n=3:

&nbsp;&nbsp;\*<br />
&nbsp;\*\*\*<br />
\*\*\*\*\*

### Diamond
Given a number n, print a centered diamond.
Example for n=3.

&nbsp;&nbsp;\*<br />
&nbsp;\*\*\*<br />
\*\*\*\*\*<br />
&nbsp;\*\*\*<br />
&nbsp;&nbsp;\*

### Diamond with Name
Given a number n, print a centered diamond with your name in place of the middle line. 
Example for n=3:

&nbsp;&nbsp;\*<br />
&nbsp;\*\*\*<br />
Bill<br />
&nbsp;\*\*\*<br />
&nbsp;&nbsp;\*

## FizzBuzz Exercise

FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.

Create a FizzBuzz() method that prints out the numbers 1 through 100.<br />
Instead of numbers divisible by three print "Fizz".<br />
Instead of numbers divisible by five print "Buzz".<br />
Instead of numbers divisible by three and five print "FizzBuzz".

Sample Output:<br />
1<br />
2<br />
Fizz<br />
4<br />
Buzz<br />
Fizz<br />
7<br />
8<br />
Fizz<br />
Buzz<br />
11<br />
Fizz<br />
13<br />
14<br />
FizzBuzz

## Prime Factors Exercise

Write a method generate(int n) that given an integer N will return a list of integers such that the numbers are the factors of N and are arranged in increasing numerical order.

For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.
