package com.oracle.myacademy.jFoS05.exercicio;

import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int currentColor = in.nextInt();
        if(currentColor == 1){
            System.out.println("Next Traffic Light is green");
        } else if (currentColor == 2) {
            System.out.println("Next Traffic Light is yellow");
        } else if (currentColor == 3) {
            System.out.println("Next Traffic Light is red");
        } else {
            System.out.println("Invalid color");
        }
    }

}
