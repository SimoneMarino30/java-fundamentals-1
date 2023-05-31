package org.lerssons.java;

// Import
// import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        // Variables
        int Fizz = 3;
        int Buzz = 5;

        for (int i = 1; i <= 100; i++) {
            if (i % Fizz == 0 && i % Buzz == 0) {
                System.out.println("FizzBuzz");
            } else if (i % Fizz == 0) {
                System.out.println("Fizz");
            } else if (i % Buzz == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
