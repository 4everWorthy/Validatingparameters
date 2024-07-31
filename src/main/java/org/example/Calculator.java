package org.example;

public class Calculator {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Parameter must be non-negative.");
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int binomialCoefficient(int n, int k) {
        if (n < 0 || k < 0) {
            throw new IllegalArgumentException("Parameters must be non-negative.");
        }
        if (k > n) {
            throw new IllegalArgumentException("Subset size must not exceed set size.");
        }
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static void main(String[] args) {
        // Testing Person class
        try {
            Person p = new Person("Alice", 25);
            System.out.println("Person created: " + p.getName() + ", age: " + p.getAge());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Person p = new Person("", 25);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Person p = new Person("Alice", 121);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testing Calculator class
        try {
            System.out.println("Factorial of 5: " + Calculator.factorial(5));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Factorial of -1: " + Calculator.factorial(-1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Binomial coefficient (5, 3): " + Calculator.binomialCoefficient(5, 3));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Binomial coefficient (5, 6): " + Calculator.binomialCoefficient(5, 6));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
