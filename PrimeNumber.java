package com.logicalproblem;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        for (int i = 2; i<number;i++){
            if (number%i ==0){
                count++;
            }
        }

        if (count<2){
            System.out.println("This is the Prime Number");
        }else {
            System.out.println("This is not the Prime Number");
        }
    }
}
