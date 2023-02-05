package com.logicalproblem;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("This is the perfect number. Try and check it out : 6,28,496,8128.");
        System.out.println();
        System.out.println("Enter the number you want to check\n" +
                "Whether the number is the Perfect Number or Not : ");
        int number = sc.nextInt();
//      This is the perfect number. Try and check : 6,28,496,8128.
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == number) {
            System.out.println("This is the Perfect Number");
        } else {
            System.out.println("This is not a Perfect Number");
        }
    }
}
