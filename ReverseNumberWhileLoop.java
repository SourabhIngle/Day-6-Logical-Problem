package com.logicalproblem;

import java.util.Scanner;

public class ReverseNumberWhileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int reverseNumber = 0;

        while (number!=0){
            int remainder = number%10;
            reverseNumber = reverseNumber*10+remainder;
            number = number/10;
        }
        System.out.println("This is the Reverse Number : "+reverseNumber);
    }
}
