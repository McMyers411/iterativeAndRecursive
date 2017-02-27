package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Howdy, please enter your first number");
        int m = input.nextInt();
        System.out.println("Please enter your second number");
        int n = input.nextInt();
        int i = Euclid.iterative(m, n);
        int j = Euclid.recursive(m, n);
        System.out.println("recursive (" + m + ", " + n + ") = " + j );
        System.out.println("iterative (" + m + ", " + n + ") = " + i );

    }
}
