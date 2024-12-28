package com.example;

public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;  // Number of terms in Fibonacci series
        int first = 0, second = 1;
        
        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print the first two terms of the Fibonacci series
        System.out.print(first + " " + second + " ");

        // Calculate and print the rest of the terms
        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }
    }
}
