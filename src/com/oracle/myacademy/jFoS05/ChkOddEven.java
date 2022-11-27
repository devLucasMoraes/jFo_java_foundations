package com.oracle.myacademy.jFoS05;

import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter a number:");
        num = in.nextInt();
        while (num > 10 || num <= 0){
            System.out.println("Digite um numero de 1 a 10");
            num = in.nextInt();
        }
        if(num % 2 == 0){
            System.out.println("O numero é " + num + ", par");
        }else {
            System.out.println("O numero é " + num + ", impar");
        }
        
    }
}
