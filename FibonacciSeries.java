package com.logicalproblem;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int sum = 0;
        int firstTerm = 0;
        int secondTerm = 1;

//      how many times do you want to iterate this program.
        Scanner sc = new Scanner(System.in);
        System.out.println("How many times do you want to iterate this program :");
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print(firstTerm + "+" + secondTerm + "=");
            sum = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = sum;
            System.out.println(sum);
        }
    }
}
