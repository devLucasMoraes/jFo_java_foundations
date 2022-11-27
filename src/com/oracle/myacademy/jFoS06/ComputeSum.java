package com.oracle.myacademy.jFoS06;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number;
            number = in.nextInt();
        }
        System.out.println(sum);

       

    }
}
