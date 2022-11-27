package com.oracle.myacademy.jFoS06.exercicio;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
       System.out.print("Choose a number: ");
       int number = in.nextInt();
       for (int i = 1; i <= 12; i++){
           System.out.println(number + "X" + i + " = " + (number * i));
       }

    }

}
