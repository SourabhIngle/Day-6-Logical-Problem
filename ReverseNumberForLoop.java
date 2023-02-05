package com.logicalproblem;

import java.util.Scanner;

public class ReverseNumberForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int reverseNumber = 0;

        for (;number !=0; number=number/10 ){
            int remainder = number%10;
            reverseNumber = reverseNumber*10+remainder;
        }
        System.out.println("This is the Reverse Number : "+reverseNumber);

    }
}
